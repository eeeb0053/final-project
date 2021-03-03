package com.example.demo.uss.domain;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component @Data @Lazy
public class UserDTO {
	private int userNum;
	private String userid;
	private String password;
	private String username;
	private String email;
	private String gender;
	private String birthday;
	private String phoneNumber;
	private String admin;
	private String preferGenre;
}
