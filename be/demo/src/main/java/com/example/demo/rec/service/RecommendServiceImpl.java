package com.example.demo.rec.service;

import java.util.List;
import java.util.Optional;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import com.example.demo.rec.domain.Recommend;
import com.example.demo.rec.repository.RecommendRepository;
import com.example.demo.cmm.service.AbstractService;

@Service @RequiredArgsConstructor
public class RecommendServiceImpl extends AbstractService<Recommend> implements RecommendService{
	private final RecommendRepository repo;
	
	@Override public int save(Recommend r) { return (repo.save(r) != null) ? 1 : 0;}
	@Override public int delete(Recommend r) { repo.delete(r); return (getOne(r.getRecNum()) == null) ? 1 : 0;}
	@Override public int count() { return (int)repo.count();}
	@Override public List<Recommend> findAll() { return repo.findAll();}
	@Override public Recommend getOne(int id) { return repo.getOne(id);}
	@Override public Optional<Recommend> findById(int id){ return repo.findById(id);}
	@Override public boolean existsById(int id) { return repo.existsById(id);}
}
