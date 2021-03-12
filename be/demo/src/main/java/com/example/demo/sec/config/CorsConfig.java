package com.example.demo.sec.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import lombok.RequiredArgsConstructor;
@Configuration @RequiredArgsConstructor
public class CorsConfig implements WebMvcConfigurer {
	private static final String[] EXCLUDE_PATHS = {
			"/api/users/add",
			"/api/users/login",
			"/users/**",
			"/error/**"
	};
	private final JwtInterceptor jwtInterceptor;
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(jwtInterceptor)
		.addPathPatterns("/**")
		.excludePathPatterns(EXCLUDE_PATHS);
	}
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*")
                .allowedMethods("GET", "POST")
                .maxAge(3000);;
    }
}