package com.example.demo.anl.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.example.demo.exh.domain.Exhbn;
import com.example.demo.rec.domain.Recommend;
import com.example.demo.uss.domain.User;

@Entity
public class Analysis {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)  
	@Column(name = "anal_num") private int analNum;
	
	@ManyToOne
	@JoinColumn(name = "user_num")
	private User user;
	
	@ManyToOne
	@JoinColumn(name = "exhbn_num")
	private Exhbn exhbn;
	
	@OneToMany(mappedBy = "analysis")
	private List<Recommend> recommendList = new ArrayList<>();
}
/*
create table shows(
   show_num int primary key auto_increment,
   title varchar(30),
   period varchar(30),
   time varchar(20),
   venue varchar(20),
   admission varchar(20),
   price varchar(100),
   host varchar(20),
   management varchar(20),
   inquiry varchar(20)
   );
   poster_image varchar(100)*/