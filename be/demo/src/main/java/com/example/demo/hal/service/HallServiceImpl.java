package com.example.demo.hal.service;

import com.example.demo.cmm.service.AbstractService;
import com.example.demo.hal.domain.Hall;
import com.example.demo.hal.repository.HallRepository;

import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;


@Service @RequiredArgsConstructor
public class HallServiceImpl extends AbstractService<Hall> implements HallService{
	private final HallRepository repo;
	
	@Override public long save(Hall h) { return (repo.save(h) != null) ? 1 : 0;}
	@Override public long delete(Hall h) { repo.delete(h); return (getOne(h.getHallNum()) == null) ? 1 : 0;}
	@Override public long count() { return (long)repo.count();}
	@Override public List<Hall> findAll() { return repo.findAll();}
	@Override public Hall getOne(long id) { return repo.getOne(id);}
	@Override public Optional<Hall> findById(long id){ return repo.findById(id);}
	@Override public boolean existsById(long id) { return repo.existsById(id);}
	@Override public List<Hall> findByHallNameAndHallLocation(String name, String location) { 
		return repo.findByHallNameAndHallLocation(name, location);}
	@Override public List<Hall> findByHallLocation(String location) { return repo.findByHallLocation(location);}
	@Override public long update(String hallClosed, long hallNum) { return repo.update(hallClosed, hallNum);}
}
