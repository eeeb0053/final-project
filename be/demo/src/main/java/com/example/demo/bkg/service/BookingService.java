package com.example.demo.bkg.service;

import java.util.List;

import com.example.demo.bkg.domain.Booking;

public interface BookingService {
	public long update(String bookName, String bookEmail, String bookPnumber, long bookNum);
	public List<Booking> findByBookNum(long bookNum);
}
