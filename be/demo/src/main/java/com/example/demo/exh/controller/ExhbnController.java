package com.example.demo.exh.controller;

import java.util.List;
import java.util.Optional;

import com.example.demo.cmm.controller.AbstractController;
import com.example.demo.exh.domain.Exhbn;
import com.example.demo.exh.domain.ExhbnDTO;
import com.example.demo.exh.service.ExhbnServiceImpl;
import com.example.demo.hal.domain.Hall;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController 
@RequiredArgsConstructor 
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/exhbns")
public class ExhbnController extends AbstractController<Exhbn> {
	final ExhbnServiceImpl service;
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@PostMapping("")
	public ResponseEntity<Long> save(@RequestBody Exhbn t) {
		return ResponseEntity.ok(service.save(t));
	}
	
	@PutMapping("/{exhbnNum}")
	public ResponseEntity<Long> update(@RequestBody Exhbn t, @PathVariable long exhbnNum) {
		logger.info("수정 정보: "+t.toString());
		Exhbn e = service.getOne(exhbnNum);
		if(!(t.getExhbnTitle().equals(e.getExhbnTitle()) || t.getExhbnTitle().equals(""))) {
			e.setExhbnTitle(t.getExhbnTitle());
		}
		if(!(t.getStartDate().equals(e.getStartDate()) || t.getStartDate().equals(""))) {
			e.setStartDate(t.getStartDate());
		}
		if(!(t.getEndDate().equals(e.getEndDate()) || t.getEndDate().equals(""))) {
			e.setEndDate(t.getEndDate());
		}
		if(!(t.getExhbnGenre().equals(e.getExhbnGenre()) || t.getExhbnGenre().equals(""))) {
			e.setExhbnGenre(t.getExhbnGenre());
		}
		if(!(t.getExhbnPrice().equals(e.getExhbnPrice()) || t.getExhbnPrice().equals(""))) {
			e.setExhbnPrice(t.getExhbnPrice());
		}
		if(!(t.getExhbnArtist().equals(e.getExhbnArtist()) || t.getExhbnArtist().equals(""))) {
			e.setExhbnArtist(t.getExhbnArtist());
		}
		if(!(t.getExhbnContent().equals(e.getExhbnContent()) || t.getExhbnContent().equals(""))) {
			e.setExhbnContent(t.getExhbnContent());
		}
		if(!(t.getExhbnImage().equals(e.getExhbnImage()) || t.getExhbnImage().equals(""))) {
			e.setExhbnImage(t.getExhbnImage());
		}
		if(!(t.getHallLocation().equals(e.getHallLocation()) || t.getHallLocation().equals(""))) {
			e.setHallLocation(t.getHallLocation());
		}
		return ResponseEntity.ok(service.save(t));
	}
	
	@DeleteMapping("")
	public ResponseEntity<Long> delete(@RequestBody Exhbn t) {
		return ResponseEntity.ok(service.delete(t));
	}

	@GetMapping("/count")
	public ResponseEntity<Long> count() {
		return ResponseEntity.ok(service.count());
	}

	@GetMapping("/one/{id}")
	public ResponseEntity<Exhbn> getOne(@PathVariable long id) {
		return ResponseEntity.ok(service.getOne(id));
	}

	@GetMapping("/find/{id}")
	public ResponseEntity<Optional<Exhbn>> findById(@PathVariable long id) {
		return ResponseEntity.ok(service.findById(id));
	}

	@GetMapping("/exists/{id}")
	public ResponseEntity<Boolean> existsById(@PathVariable long id) {
		return ResponseEntity.ok(service.existsById(id));
	}

	@GetMapping("")
	public ResponseEntity<List<Exhbn>> findAll() {
		return ResponseEntity.ok(service.findAll());
	}

	@GetMapping("/search/{exhbnTitle}")
	public ResponseEntity<List<Exhbn>> searchTitle(@PathVariable String exhbnTitle){
		return ResponseEntity.ok(service.searchTitle(exhbnTitle));
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Exhbn>> sortList(){
		return ResponseEntity.ok(service.sortList());
	}
	
	@GetMapping("/now")
	public ResponseEntity<List<Exhbn>> nowInExhbn(){
		return ResponseEntity.ok(service.nowInExhbn());
	}
	
	@GetMapping("/top10")
	public ResponseEntity<List<ExhbnDTO>> top10(){
		return ResponseEntity.ok(service.top10());
	}
}