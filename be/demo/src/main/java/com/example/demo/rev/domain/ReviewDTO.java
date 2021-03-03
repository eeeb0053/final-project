package com.example.demo.rev.domain;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;


import lombok.Data;

@Component @Data @Lazy
public class ReviewDTO {
	private int reviewNum;
	private int exhbnNum;
	private int userNum;
	private String reviewTitle;
	private String reviewContent;
	private String regDate;
	private String score;
}
/*
create table boards(
   board_num int primary key auto_increment,
   title varchar(30),
   content varchar(300),
   date varchar(20),
   id varchar(20)
   );*/