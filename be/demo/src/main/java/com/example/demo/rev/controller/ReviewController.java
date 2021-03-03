package com.example.demo.rev.controller;

import java.util.List;
import java.util.Optional;

import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.rev.domain.Review;
import com.example.demo.rev.service.ReviewServiceImpl;
import com.example.demo.cmm.controller.AbstractController;

@RestController
@RequestMapping("/reviews") @RequiredArgsConstructor
public class ReviewController extends AbstractController<Review>{
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	final ReviewServiceImpl service;
	
	@Override
	public ResponseEntity<Integer> save(Review t) {
		return ResponseEntity.ok(service.save(t));
	}
	@Override
	public ResponseEntity<Integer> delete(Review t) {
		return ResponseEntity.ok(service.delete(t));
	}
	@Override
	public ResponseEntity<Integer> count() {
		return ResponseEntity.ok(service.count());
	}
	@Override
	public ResponseEntity<List<Review>> findAll() {
		return ResponseEntity.ok(service.findAll());
	}
	@Override
	public ResponseEntity<Review> getOne(int id) {
		return ResponseEntity.ok(service.getOne(id));
	}
	@Override
	public ResponseEntity<Optional<Review>> findById(int id) {
		return ResponseEntity.ok(service.findById(id));
	}
	@Override
	public ResponseEntity<Boolean> existsById(int id) {
		return ResponseEntity.ok(service.existsById(id));
	}
}