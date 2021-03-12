package com.example.demo.sec.domain;

import java.io.Serializable;

import org.springframework.stereotype.Component;

import lombok.Data;
@Component @Data 
public class JwtResponse implements Serializable {

    private static final long serialVersionUID = -8091879091924046844L;
   // private final String jwttoken;
    private String jwttoken;
    
    public JwtResponse() {
    }

    public JwtResponse(String jwttoken) {
        this.jwttoken = jwttoken;
    }

    public String getToken() {
        return this.jwttoken;
    }
}