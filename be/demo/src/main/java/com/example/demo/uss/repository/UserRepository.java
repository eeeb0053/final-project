package com.example.demo.uss.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.uss.domain.User;

interface UserCustomRepository{
	
}
public interface UserRepository extends JpaRepository<User, Long>, UserCustomRepository {

}
