package com.example.demo.rev.service;

import java.util.List;
import java.util.Optional;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import com.example.demo.rev.domain.Review;
import com.example.demo.rev.repository.ReviewRepository;
import com.example.demo.cmm.service.AbstractService;

@Service @RequiredArgsConstructor
public class ReviewServiceImpl extends AbstractService<Review> implements ReviewService{
	private final ReviewRepository repo;
	
	@Override public int save(Review r) { return (repo.save(r) != null) ? 1 : 0;}
	@Override public int delete(Review r) { repo.delete(r); return (getOne(r.getReviewNum()) == null) ? 1 : 0;}
	@Override public int count() { return (int)repo.count();}
	@Override public List<Review> findAll() { return repo.findAll();}
	@Override public Review getOne(int id) { return repo.getOne(id);}
	@Override public Optional<Review> findById(int id){ return repo.findById(id);}
	@Override public boolean existsById(int id) { return repo.existsById(id);}
}
