package com.example.demo.uss.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.example.demo.anl.domain.Analysis;
import com.example.demo.bkg.domain.Booking;
import com.example.demo.rev.domain.Review;

import lombok.Data;
import lombok.Getter;


@Entity @Data @Table(name = "users")
public class User {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_num") private long userNum;
	@Column private String username;
	@Column private String password;
	@Column private String name;
	@Column private String email;
	@Column private String gender;
	@Column private String birthday;
	@Column(name = "phone_number") private String phoneNumber;
	@Column(name = "prefer_genre") private String preferGenre;
	
	@OneToMany(mappedBy = "user")
	private List<Analysis> analysisList = new ArrayList<>();
	
	@OneToMany(mappedBy = "user")
	private List<Booking> bookingList = new ArrayList<>();
	
	@OneToMany(mappedBy = "user")
	private List<Review> reviewList = new ArrayList<>();

}
