package com.example.demo.hal.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.hal.domain.Hall;
import com.example.demo.hal.service.HallServiceImpl;
import com.example.demo.cmm.controller.AbstractController;

import lombok.RequiredArgsConstructor;

@RestController @RequiredArgsConstructor @CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/halls")
public class HallController extends AbstractController<Hall>{
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	final HallServiceImpl service;
	
	@PostMapping("/save")
	public ResponseEntity<Integer> save(@RequestBody Hall t) {
		return ResponseEntity.ok(service.save(t));
	}
	@DeleteMapping("/delete")
	public ResponseEntity<Integer> delete(@RequestBody Hall t) {
		return ResponseEntity.ok(service.delete(t));
	}
	@GetMapping("/count")
	public ResponseEntity<Integer> count() {
		return ResponseEntity.ok(service.count());
	}
	@GetMapping("/all")
	public ResponseEntity<List<Hall>> findAll() {
		return ResponseEntity.ok(service.findAll());
	}
	@GetMapping("/one/{id}")
	public ResponseEntity<Hall> getOne(@PathVariable int id) {
		return ResponseEntity.ok(service.getOne(id));
	}
	@GetMapping("/find/{id}")
	public ResponseEntity<Optional<Hall>> findById(@PathVariable int id) {
		return ResponseEntity.ok(service.findById(id));
	}
	@GetMapping("/exists/{id}")
	public ResponseEntity<Boolean> existsById(@PathVariable int id) {
		return ResponseEntity.ok(service.existsById(id));
	}
	@GetMapping("find/{name}/{location}")
	public ResponseEntity<List<Hall>> findByNameAndLocation(@PathVariable String name, String location) {
		return ResponseEntity.ok(service.findByHallNameAndHallLocation(name, location));
	}
	@GetMapping("/find/{location}")
	public ResponseEntity<List<Hall>> findByHallLocation(@PathVariable String location) {
		return ResponseEntity.ok(service.findByHallLocation(location));
	}
}
