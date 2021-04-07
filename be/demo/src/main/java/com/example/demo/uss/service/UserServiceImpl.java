package com.example.demo.uss.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import com.example.demo.uss.domain.User;
import com.example.demo.uss.domain.UserDTO;
import com.example.demo.uss.repository.UserRepository;
import com.example.demo.cmm.service.AbstractService;

@Service @RequiredArgsConstructor
public class UserServiceImpl extends AbstractService<User>{
	private final UserRepository repo;
	
	@Override public long save(User u) { return (repo.save(u) != null) ? 1 : 0;}
	@Override public long delete(User u) { repo.delete(u); return (getOne(u.getUserNum()) == null) ? 1 : 0;}
	@Override public long count() { return (long)repo.count();}
	@Override public List<User> findAll() { return repo.findAll();}
	@Override public User getOne(long id) { return repo.getOne(id);}
	@Override public Optional<User> findById(long id){ return repo.findById(id);}
	@Override public boolean existsById(long id) { return repo.existsById(id);}
	
}
