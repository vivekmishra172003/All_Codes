package com.dealsapp.deal.config;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.util.ArrayList;

public class HeaderAuthenticationFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
        
        String userEmail = request.getHeader("X-User-Email");
        String userId = request.getHeader("X-User-Id");
        
        if (userEmail != null && userId != null) {
            // Create authentication object with user information
            UsernamePasswordAuthenticationToken authentication = 
                new UsernamePasswordAuthenticationToken(userEmail, null, new ArrayList<>());
            
            // Add user ID as details
            authentication.setDetails(userId);
            
            SecurityContextHolder.getContext().setAuthentication(authentication);
        }
        
        filterChain.doFilter(request, response);
    }
}
