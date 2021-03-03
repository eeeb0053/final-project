package com.example.demo.rev.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.rev.domain.Review;

interface IReviewRepository{
	
}

public interface ReviewRepository extends JpaRepository<Review, Integer>, IReviewRepository {
    public void update(Review review);
}
