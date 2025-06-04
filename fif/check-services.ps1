# PowerShell script to check microservices health
Write-Host "Checking microservices health..." -ForegroundColor Green

$services = @(
    @{Name="Eureka Server"; Url="http://localhost:8761/actuator/health"; Port=8761},
    @{Name="API Gateway"; Url="http://localhost:8080/actuator/health"; Port=8080},
    @{Name="User Service"; Url="http://localhost:8081/actuator/health"; Port=8081},
    @{Name="Deal Service"; Url="http://localhost:8082/actuator/health"; Port=8082},
    @{Name="Coupon Service"; Url="http://localhost:8083/actuator/health"; Port=8083}
)

foreach ($service in $services) {
    try {
        Write-Host "Checking $($service.Name)..." -ForegroundColor Yellow
        
        # Check if port is listening
        $connection = Test-NetConnection -ComputerName localhost -Port $service.Port -InformationLevel Quiet
        
        if ($connection) {
            try {
                $response = Invoke-RestMethod -Uri $service.Url -Method Get -TimeoutSec 5
                if ($response.status -eq "UP") {
                    Write-Host "✓ $($service.Name) is UP" -ForegroundColor Green
                } else {
                    Write-Host "⚠ $($service.Name) responded but status is: $($response.status)" -ForegroundColor Yellow
                }
            } catch {
                Write-Host "⚠ $($service.Name) is running but health endpoint not accessible" -ForegroundColor Yellow
            }
        } else {
            Write-Host "✗ $($service.Name) is not responding on port $($service.Port)" -ForegroundColor Red
        }
    } catch {
        Write-Host "✗ Error checking $($service.Name): $($_.Exception.Message)" -ForegroundColor Red
    }
}

Write-Host "`nService URLs:" -ForegroundColor Cyan
Write-Host "- Eureka Dashboard: http://localhost:8761" -ForegroundColor White
Write-Host "- API Gateway: http://localhost:8080" -ForegroundColor White
Write-Host "`nTo test the API, import the Postman collection: postman-collection.json" -ForegroundColor Cyan
