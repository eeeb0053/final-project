package com.example.demo.bkg.service;

import java.util.List;

import com.example.demo.bkg.domain.Booking;

public interface BookingService {
	public int update(String bookName, String bookEmail, String bookPnumber, int bookNum);
	public List<Booking> findByBookNum(int bookNum);
}
