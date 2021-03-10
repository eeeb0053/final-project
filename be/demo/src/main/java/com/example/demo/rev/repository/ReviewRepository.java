package com.example.demo.rev.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.rev.domain.Review;
import com.example.demo.rev.domain.ReviewDTO;

interface ReviewCustomRepository{
	public List<ReviewDTO> findByUserNum(long UserNum);
}

public interface ReviewRepository extends JpaRepository<Review, Long>, ReviewCustomRepository {
	
}
