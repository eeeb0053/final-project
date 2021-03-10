package com.example.demo.bkg.service;

import java.util.List;
import java.util.Optional;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import com.example.demo.bkg.domain.Booking;
import com.example.demo.bkg.repository.BookingRepository;
import com.example.demo.cmm.service.AbstractService;

@Service @RequiredArgsConstructor
public class BookingServiceImpl extends AbstractService<Booking> implements BookingService{
	private final BookingRepository repo;
	
	@Override public int save(Booking b) { return (repo.save(b) != null) ?  1 : 0;}
	@Override public int delete(Booking b) { repo.delete(b); return (getOne(b.getBookNum()) == null) ? 1 : 0;}
	@Override public int count() { return (int)repo.count();}
	@Override public List<Booking> findAll() { return repo.findAll();}
	@Override public Booking getOne(int id) { return repo.getOne(id);}
	@Override public Optional<Booking> findById(int id){ return repo.findById(id);}
	@Override public boolean existsById(int id) { return repo.existsById(id);}
	@Override public int update(String bookName, String bookEmail, String bookPnumber, int bookNum) { 
		return repo.update(bookName, bookEmail, bookPnumber, bookNum);}
	@Override public List<Booking> findByBookNum(int bookNum) { return repo.findByBookNum(bookNum);}
}
