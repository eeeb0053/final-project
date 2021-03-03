package com.example.demo.hal.repository;

import com.example.demo.hal.domain.Hall;
import org.springframework.data.jpa.repository.JpaRepository;

interface IHallRepository{
	
}
public interface HallRepository extends JpaRepository<Hall, Integer>, IHallRepository {
	
}
