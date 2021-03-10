package com.example.demo.uss.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.uss.domain.User;

interface UserCustomRepository{
	
}
public interface UserRepository extends JpaRepository<User, Long>, UserCustomRepository {
	public Optional<User> findByEmail(String email);
    public Optional<User> findByUseridOrEmail(String userid, String email);
    public List<User> findByUserNumIn(List<Long> userNums);
    public Optional<User> findByUserid(String userid);
    public Boolean existsByUserid(String userid);
    public Boolean existsByEmail(String email);
}
