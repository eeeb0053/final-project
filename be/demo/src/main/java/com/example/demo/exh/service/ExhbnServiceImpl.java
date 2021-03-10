package com.example.demo.exh.service;

import com.example.demo.cmm.service.AbstractService;
import com.example.demo.exh.domain.Exhbn;
import com.example.demo.exh.repository.ExhbnRepository;

import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service @RequiredArgsConstructor
public class ExhbnServiceImpl extends AbstractService<Exhbn> implements ExhbnService{
	private final ExhbnRepository repo;
	
	@Override public long save(Exhbn h) { return (repo.save(h) != null) ? 1 : 0;}
	@Override public long delete(Exhbn h) { repo.delete(h); return (getOne(h.getExhbnNum()) == null) ? 1 : 0;}
	@Override public long count() { return (long)repo.count();}
	@Override public List<Exhbn> findAll() { return repo.findAll();}
	@Override public Exhbn getOne(long id) { return repo.getOne(id);}
	@Override public Optional<Exhbn> findById(long id){ return repo.findById(id);}
	@Override public boolean existsById(long id) { return repo.existsById(id);}
}