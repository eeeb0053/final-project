package com.example.demo.rec.repository;

import com.example.demo.rec.domain.Recommend;
import org.springframework.data.jpa.repository.JpaRepository;

interface RecommendCustomRepository{
	
}
public interface RecommendRepository extends JpaRepository<Recommend, Long>, RecommendCustomRepository {

}
