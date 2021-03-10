package com.example.demo.uss.service;

import java.util.List;
import java.util.Optional;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import com.example.demo.uss.domain.User;
import com.example.demo.uss.repository.UserRepository;
import com.example.demo.cmm.service.AbstractService;

@Service @RequiredArgsConstructor
public class UserServiceImpl extends AbstractService<User> implements UserService{
	private final UserRepository repo;
	
	@Override public int save(User u) { return (repo.save(u) != null) ? 1 : 0;}
	@Override public int delete(User u) { repo.delete(u); return (getOne(u.getUserNum()) == null) ? 1 : 0;}
	@Override public int count() { return (int)repo.count();}
	@Override public List<User> findAll() { return repo.findAll();}
	@Override public User getOne(int id) { return repo.getOne(id);}
	@Override public Optional<User> findById(int id){ return repo.findById(id);}
	@Override public boolean existsById(int id) { return repo.existsById(id);}
}
