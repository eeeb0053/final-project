package com.example.demo.exh.domain;

import java.util.Date;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Getter;

@Component @Getter @Lazy
public class ExhbnDTO {
	private long exhbnNum;
	private long hallNum;
    private String exhbnTitle;
    private Date startDate;
    private Date endDate;
    private String exhbnGenre;
    private String exhbnPrice;
    private String exhbnArtist;
    private String exhbnContent;
    private String exhbnImage;
    private String hallLocation;
    
    public ExhbnDTO(Exhbn e) {
    	this.exhbnNum = e.getExhbnNum();
    	// this.hallNum = e.getHall().getHallNum();
    	this.hallLocation = e.getHallLocation();
    	this.exhbnTitle = e.getExhbnTitle();
    	this.startDate = e.getStartDate();
    	this.endDate = e.getEndDate();
    	this.exhbnGenre = e.getExhbnGenre();
    	this.exhbnPrice = e.getExhbnPrice();
    	this.exhbnArtist = e.getExhbnArtist();
    	this.exhbnContent = e.getExhbnContent();
    	this.exhbnImage = e.getExhbnImage();
	}
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