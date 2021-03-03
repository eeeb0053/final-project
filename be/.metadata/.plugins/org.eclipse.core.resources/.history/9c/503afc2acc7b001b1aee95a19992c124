package com.example.demo.rec.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.example.demo.anl.domain.Analysis;

@Entity
public class Recommend {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)  
	@Column(name = "rec_num") private int recNum;
	
	@ManyToOne
	@JoinColumn(name = "anal_num")
	private Analysis analysis;
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