# Microservices Security Testing Guide

## Overview
This guide provides step-by-step instructions for testing the centralized security implementation in the Deals App microservices architecture using Postman.

## Architecture Changes Summary

### Centralized Security Features:
1. **API Gateway JWT Authentication**: All requests are authenticated at the gateway level
2. **Header-based Authentication**: User information is passed to downstream services via headers
3. **Service-to-Service Communication**: Feign clients automatically forward user context
4. **Public Endpoints**: Login and registration are publicly accessible
5. **Protected Endpoints**: All other endpoints require valid JWT tokens

## Setup Instructions

### 1. Start All Services
Make sure all services are running in this order:
```powershell
# Start Eureka Server (Port 8761)
cd e:\allcodes\fif\eureka-server
mvn spring-boot:run

# Start User Service (Port 8081)
cd e:\allcodes\fif\user-service
mvn spring-boot:run

# Start Deal Service (Port 8082)
cd e:\allcodes\fif\deal-service
mvn spring-boot:run

# Start Coupon Service (Port 8083)
cd e:\allcodes\fif\coupon-service
mvn spring-boot:run

# Start API Gateway (Port 8080)
cd e:\allcodes\fif\api-gateway
mvn spring-boot:run
```

### 2. Import Postman Collection
1. Open Postman
2. Click "Import" button
3. Select the file: `e:\allcodes\fif\postman-collection.json`
4. The collection "Deals App Microservices" will be imported

### 3. Set Up Environment
1. Create a new environment in Postman called "Deals App Local"
2. Add the following variables:
   - `base_url`: `http://localhost:8080`
   - `jwt_token`: (will be auto-populated after login)
   - `user_id`: (will be auto-populated after login)

## Step-by-Step Testing Guide

### Phase 1: Authentication Testing

#### Step 1: Register a New User
**Endpoint**: `POST {{base_url}}/api/users/register`
**Body**:
```json
{
  "name": "John Doe",
  "email": "john.doe@example.com",
  "password": "password123"
}
```
**Expected Response**: `200 OK` with message "User registered successfully"

#### Step 2: Login User
**Endpoint**: `POST {{base_url}}/api/users/login`
**Body**:
```json
{
  "email": "john.doe@example.com",
  "password": "password123"
}
```
**Expected Response**: `200 OK` with:
```json
{
  "token": "eyJhbGciOiJIUzI1NiJ9...",
  "userId": 1,
  "name": "John Doe"
}
```
**Note**: The JWT token and user ID will be automatically saved to environment variables.

### Phase 2: User Service Testing

#### Step 3: Get User by ID (Protected)
**Endpoint**: `GET {{base_url}}/api/users/{{user_id}}`
**Headers**: `Authorization: Bearer {{jwt_token}}`
**Expected Response**: `200 OK` with user details

#### Step 4: Validate User (Protected)
**Endpoint**: `GET {{base_url}}/api/users/validate/{{user_id}}`
**Headers**: `Authorization: Bearer {{jwt_token}}`
**Expected Response**: `200 OK` with user entity

### Phase 3: Deal Service Testing

#### Step 5: Get All Deals (Protected)
**Endpoint**: `GET {{base_url}}/api/deals`
**Headers**: `Authorization: Bearer {{jwt_token}}`
**Expected Response**: `200 OK` with list of deals

#### Step 6: Get Deal by ID (Protected)
**Endpoint**: `GET {{base_url}}/api/deals/1`
**Headers**: `Authorization: Bearer {{jwt_token}}`
**Expected Response**: `200 OK` with deal details

#### Step 7: Get Deals by Category (Protected)
**Endpoint**: `GET {{base_url}}/api/deals/category/electronics`
**Headers**: `Authorization: Bearer {{jwt_token}}`
**Expected Response**: `200 OK` with filtered deals

### Phase 4: Coupon Service Testing

#### Step 8: Get All Coupons (Protected)
**Endpoint**: `GET {{base_url}}/api/coupons`
**Headers**: `Authorization: Bearer {{jwt_token}}`
**Expected Response**: `200 OK` with list of active coupons

#### Step 9: Get Available Coupons for User (Protected)
**Endpoint**: `GET {{base_url}}/api/coupons/user/{{user_id}}`
**Headers**: `Authorization: Bearer {{jwt_token}}`
**Expected Response**: `200 OK` with user-specific coupons

#### Step 10: Validate Coupon (Protected)
**Endpoint**: `POST {{base_url}}/api/coupons/validate`
**Headers**: `Authorization: Bearer {{jwt_token}}`
**Body**:
```json
{
  "userId": 1,
  "couponId": 1
}
```
**Expected Response**: `200 OK` with validation result

### Phase 5: Integration Testing

#### Step 11: Calculate Price with Coupon (Protected)
**Endpoint**: `POST {{base_url}}/api/deals/calculate-price`
**Headers**: `Authorization: Bearer {{jwt_token}}`
**Body**:
```json
{
  "userId": 1,
  "dealId": 1,
  "couponId": 1
}
```
**Expected Response**: `200 OK` with price calculation including discount

## Security Testing Scenarios

### Scenario 1: Test Without JWT Token
1. Remove the Authorization header from any protected endpoint
2. **Expected**: `401 Unauthorized`

### Scenario 2: Test with Invalid JWT Token
1. Set Authorization header to: `Bearer invalid_token_here`
2. **Expected**: `401 Unauthorized`

### Scenario 3: Test with Expired JWT Token
1. Use an expired token (wait 24 hours or modify expiration in code)
2. **Expected**: `401 Unauthorized`

### Scenario 4: Test Public Endpoints
1. Try accessing `/api/users/register` and `/api/users/login` without tokens
2. **Expected**: `200 OK` (these should work without authentication)

## Error Handling Test Cases

### Test Case 1: Invalid User Registration
**Request**: Register with existing email
**Expected**: `400 Bad Request` with error message

### Test Case 2: Invalid Login Credentials
**Request**: Login with wrong password
**Expected**: `400 Bad Request`

### Test Case 3: Access Non-existent Resources
**Request**: `GET /api/deals/999` (non-existent deal)
**Expected**: `404 Not Found`

### Test Case 4: Invalid Coupon Usage
**Request**: Use a coupon that's already been used maximum times
**Expected**: `400 Bad Request` with appropriate error message

## Performance Testing

### Load Testing Recommendations:
1. **Concurrent Users**: Test with 10-50 concurrent users
2. **Authentication Load**: Test login endpoint with multiple simultaneous requests
3. **Gateway Performance**: Monitor API Gateway response times under load
4. **Database Connections**: Ensure connection pools are properly configured

## Monitoring and Logging

### Check Application Logs:
1. **API Gateway**: Check for JWT validation logs
2. **User Service**: Monitor authentication and user validation
3. **Deal/Coupon Services**: Verify header-based authentication
4. **Eureka Server**: Ensure all services are properly registered

### Key Metrics to Monitor:
- Response times for each service
- JWT token validation success/failure rates
- Database query performance
- Memory and CPU usage

## Troubleshooting Common Issues

### Issue 1: 401 Unauthorized on All Requests
**Cause**: JWT token not being passed correctly
**Solution**: Verify Authorization header format: `Bearer <token>`

### Issue 2: Services Not Communicating
**Cause**: Eureka registration issues
**Solution**: Check if all services are registered with Eureka at `http://localhost:8761`

### Issue 3: Database Connection Errors
**Cause**: Database not running or incorrect configuration
**Solution**: Verify MySQL is running and connection properties are correct

### Issue 4: Feign Client Failures
**Cause**: Service discovery or network issues
**Solution**: Check service names in Eureka and network connectivity

## Environment-Specific Testing

### Development Environment:
- Use `http://localhost:8080` as base URL
- Ensure all services run on different ports

### Staging/Production Environment:
- Update base URL to actual deployment URL
- Verify HTTPS configuration
- Test with real database connections
- Validate load balancer configuration

## Automated Testing Script

You can also create a Newman (Postman CLI) script to run automated tests:

```bash
# Install Newman
npm install -g newman

# Run the collection
newman run postman-collection.json -e environment.json
```

This completes the comprehensive testing guide for your centralized security implementation.
