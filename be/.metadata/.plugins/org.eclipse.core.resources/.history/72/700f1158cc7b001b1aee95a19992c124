package com.example.demo.uss.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.example.demo.anl.domain.Analysis;
import com.example.demo.bkg.domain.Booking;
import com.example.demo.rev.domain.Review;


@Entity
public class User {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)  
	@Column(name = "user_num") private int userNum;
	@Column private String userid;
	@Column private String password;
	@Column private String username;
	@Column private String email;
	@Column private String gender;
	@Column private String birthday;
	@Column(name = "phone_number") private String phoneNumber;
	@Column private String admin;
	@Column(name = "prefer_genre") private String preferGenre;
	
	@OneToMany(mappedBy = "user")
	private List<Analysis> analysisList = new ArrayList<>();
	
	@OneToMany(mappedBy = "user")
	private List<Booking> bookingList = new ArrayList<>();
	
	@OneToMany(mappedBy = "user")
	private List<Review> reviewList = new ArrayList<>();
}
