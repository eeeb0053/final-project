package com.example.demo.anl.controller;

import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.anl.domain.Analysis;
import com.example.demo.anl.service.AnalysisServiceImpl;
import com.example.demo.cmm.controller.AbstractController;

@RestController @RequiredArgsConstructor
@RequestMapping("/analysis")
public class AnalysisController extends AbstractController<Analysis>{
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	final AnalysisServiceImpl service;
	
	@Override
	public ResponseEntity<Integer> save(Analysis t) {
		return ResponseEntity.ok(service.save(t));
	}
	@Override
	public ResponseEntity<Integer> delete(Analysis t) {
		return ResponseEntity.ok(service.delete(t));
	}
	@Override
	public ResponseEntity<Integer> count() {
		return ResponseEntity.ok(service.count());
	}
	@Override
	public ResponseEntity<List<Analysis>> findAll() {
		return ResponseEntity.ok(service.findAll());
	}
	@Override
	public ResponseEntity<Analysis> getOne(int id) {
		return ResponseEntity.ok(service.getOne(id));
	}
	@Override
	public ResponseEntity<Optional<Analysis>> findById(int id) {
		return ResponseEntity.ok(service.findById(id));
	}
	@Override
	public ResponseEntity<Boolean> existsById(int id) {
		return ResponseEntity.ok(service.existsById(id));
	}
}
