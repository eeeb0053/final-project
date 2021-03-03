package com.example.demo.bkg.domain;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component @Data @Lazy
public class BookingDTO {
	private int bookNum;
	private int exhbnNum;
	private int userNum;
	private String bookDate;
	private String totalPrice;
	private String bookName;
	private String bookEmail;
	private String bookPnumber;
}
