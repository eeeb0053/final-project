package com.example.demo.bkg.controller;

import java.util.List;
import java.util.Optional;

import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bkg.domain.Booking;
import com.example.demo.bkg.service.BookingServiceImpl;
import com.example.demo.cmm.controller.AbstractController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController @RequiredArgsConstructor
@RequestMapping("/bookings")
public class BookingController extends AbstractController<Booking>{
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	final BookingServiceImpl service;
	
	@Override
	public ResponseEntity<Integer> save(Booking t) {
		return ResponseEntity.ok(service.save(t));
	}
	@Override
	public ResponseEntity<Integer> delete(Booking t) {
		return ResponseEntity.ok(service.delete(t));
	}
	@Override
	public ResponseEntity<Integer> count() {
		return ResponseEntity.ok(service.count());
	}
	@Override
	public ResponseEntity<List<Booking>> findAll() {
		return ResponseEntity.ok(service.findAll());
	}
	@Override
	public ResponseEntity<Booking> getOne(int id) {
		return ResponseEntity.ok(service.getOne(id));
	}
	@Override
	public ResponseEntity<Optional<Booking>> findById(int id) {
		return ResponseEntity.ok(service.findById(id));
	}
	@Override
	public ResponseEntity<Boolean> existsById(int id) {
		return ResponseEntity.ok(service.existsById(id));
	}
  
}
