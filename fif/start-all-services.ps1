# PowerShell script to start all microservices
Write-Host "Starting microservices..." -ForegroundColor Green

# Start Eureka Server
Write-Host "Starting Eureka Server..." -ForegroundColor Yellow
Start-Process powershell -ArgumentList "-Command", "cd 'e:\allcodes\fif\eureka-server'; mvn spring-boot:run"

# Wait a bit for Eureka to start
Start-Sleep 10

# Start User Service
Write-Host "Starting User Service..." -ForegroundColor Yellow
Start-Process powershell -ArgumentList "-Command", "cd 'e:\allcodes\fif\user-service'; mvn spring-boot:run"

# Start Deal Service
Write-Host "Starting Deal Service..." -ForegroundColor Yellow
Start-Process powershell -ArgumentList "-Command", "cd 'e:\allcodes\fif\deal-service'; mvn spring-boot:run"

# Start Coupon Service
Write-Host "Starting Coupon Service..." -ForegroundColor Yellow
Start-Process powershell -ArgumentList "-Command", "cd 'e:\allcodes\fif\coupon-service'; mvn spring-boot:run"

# Wait for services to register
Start-Sleep 15

# Start API Gateway
Write-Host "Starting API Gateway..." -ForegroundColor Yellow
Start-Process powershell -ArgumentList "-Command", "cd 'e:\allcodes\fif\api-gateway'; mvn spring-boot:run"

Write-Host "All services are starting up. Please wait 2-3 minutes for complete initialization." -ForegroundColor Green
Write-Host "Services will be available at:" -ForegroundColor Cyan
Write-Host "- Eureka Server: http://localhost:8761" -ForegroundColor White
Write-Host "- API Gateway: http://localhost:8080" -ForegroundColor White
Write-Host "- User Service: http://localhost:8081" -ForegroundColor White
Write-Host "- Deal Service: http://localhost:8082" -ForegroundColor White
Write-Host "- Coupon Service: http://localhost:8083" -ForegroundColor White
