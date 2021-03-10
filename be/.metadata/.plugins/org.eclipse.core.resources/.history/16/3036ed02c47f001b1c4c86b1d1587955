package com.example.demo.anl.service;


import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.anl.domain.Analysis;
import com.example.demo.anl.repository.AnalysisRepository;
import com.example.demo.cmm.service.AbstractService;


@Service @RequiredArgsConstructor
public class AnalysisServiceImpl extends AbstractService<Analysis> implements AnalysisService{
	private final AnalysisRepository repo;
	
	@Override public int save(Analysis h) { return (repo.save(h) != null) ? 1 : 0;}
	@Override public int delete(Analysis h) { repo.delete(h); return (getOne(h.getAnalNum()) == null) ? 1 : 0;}
	@Override public int count() { return (int)repo.count();}
	@Override public List<Analysis> findAll() { return repo.findAll();}
	@Override public Analysis getOne(int id) { return repo.getOne(id);}
	@Override public Optional<Analysis> findById(int id){ return repo.findById(id);}
	@Override public boolean existsById(int id) { return repo.existsById(id);}
}