package com.dealsapp.user.dto;

public class LoginResponse {
    private String token;
    private Long userId;
    private String name;

    // Constructors
    public LoginResponse() {}

    public LoginResponse(String token, Long userId, String name) {
        this.token = token;
        this.userId = userId;
        this.name = name;
    }

    // Getters and Setters
    public String getToken() { return token; }
    public void setToken(String token) { this.token = token; }
    
    public Long getUserId() { return userId; }
    public void setUserId(Long userId) { this.userId = userId; }
    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}