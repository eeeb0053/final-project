package com.example.demo.hal.domain;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component @Data @Lazy
public class HallDTO {
	private int hallNum;
    private String hallName;
    private String hallLocation;
    private String hallTime;
    private String hallClosed;
    private String hallPnumber;
    private String hallInfo;
    private String hallImage;
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