package com.example.demo.sec.util;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;

public class AuthTokenProvider {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	 
	@Value("${auth.jwtSecret}")
    private String jwtSecret;
	@Value("${auth.jwtExpirationMs}")
	private int jwtExpirationMs;
	

	public Long getUserNumFromJWT(String token) {
		// TODO Auto-generated method stub
		return null;
	}
	public boolean validateToken(String token) {
		// TODO Auto-generated method stub
		return false;
	}
	public String generateToken(Authentication auth) {
		return null;
	}
}