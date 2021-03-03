package com.example.demo.rev.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.example.demo.exh.domain.Exhbn;
import com.example.demo.uss.domain.User;

@Entity
public class Review {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)  
	@Column(name = "review_num") private int reviewNum;
	@Column(name = "review_title") private String reviewTitle;
	@Column(name = "review_content") private String reviewContent;
	@Column(name = "reg_date") private String regDate;
	@Column private String score;
	
	@ManyToOne
	@JoinColumn(name = "user_num")
	private User user;
	
	@ManyToOne
	@JoinColumn(name = "exhbn_num")
	private Exhbn exhbn;
}

/*
create table boards(
   board_num int primary key auto_increment,
   title varchar(30),
   content varchar(300),
   date varchar(20),
   id varchar(20)
   );*/