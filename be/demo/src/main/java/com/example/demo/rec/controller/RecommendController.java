package com.example.demo.rec.controller;

import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.rec.domain.Recommend;
import com.example.demo.rec.service.RecommendServiceImpl;
import com.example.demo.cmm.controller.AbstractController;

@RestController @RequiredArgsConstructor
@RequestMapping("/recommends")
public class RecommendController extends AbstractController<Recommend>{
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	final RecommendServiceImpl service;
	
	@Override
	public ResponseEntity<Integer> save(Recommend t) {
		return ResponseEntity.ok(service.save(t));
	}
	@Override
	public ResponseEntity<Integer> delete(Recommend t) {
		return ResponseEntity.ok(service.delete(t));
	}
	@Override
	public ResponseEntity<Integer> count() {
		return ResponseEntity.ok(service.count());
	}
	@Override
	public ResponseEntity<List<Recommend>> findAll() {
		return ResponseEntity.ok(service.findAll());
	}
	@Override
	public ResponseEntity<Recommend> getOne(int id) {
		return ResponseEntity.ok(service.getOne(id));
	}
	@Override
	public ResponseEntity<Optional<Recommend>> findById(int id) {
		return ResponseEntity.ok(service.findById(id));
	}
	@Override
	public ResponseEntity<Boolean> existsById(int id) {
		return ResponseEntity.ok(service.existsById(id));
	}
}