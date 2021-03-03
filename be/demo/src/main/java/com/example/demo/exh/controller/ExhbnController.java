package com.example.demo.exh.controller;

import java.util.List;
import java.util.Optional;

import com.example.demo.exh.domain.Exhbn;
import com.example.demo.exh.service.ExhbnServiceImpl;
import com.example.demo.cmm.controller.AbstractController;

import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController @RequiredArgsConstructor
@RequestMapping("/exhbns")
public class ExhbnController extends AbstractController<Exhbn>{
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	final ExhbnServiceImpl service;
	
	@Override
	public ResponseEntity<Integer> save(Exhbn t) {
		return ResponseEntity.ok(service.save(t));
	}
	@Override
	public ResponseEntity<Integer> delete(Exhbn t) {
		return ResponseEntity.ok(service.delete(t));
	}
	@Override
	public ResponseEntity<Integer> count() {
		return ResponseEntity.ok(service.count());
	}
	@Override
	public ResponseEntity<List<Exhbn>> findAll() {
		return ResponseEntity.ok(service.findAll());
	}
	@Override
	public ResponseEntity<Exhbn> getOne(int id) {
		return ResponseEntity.ok(service.getOne(id));
	}
	@Override
	public ResponseEntity<Optional<Exhbn>> findById(int id) {
		return ResponseEntity.ok(service.findById(id));
	}
	@Override
	public ResponseEntity<Boolean> existsById(int id) {
		return ResponseEntity.ok(service.existsById(id));
	}
}