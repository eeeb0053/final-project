package com.example.demo.rec.repository;

import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import com.example.demo.rec.domain.Recommend;

@Repository
public class RecommendRepositoryImpl extends QuerydslRepositorySupport implements RecommendCustomRepository{
	//private final JPAQueryFactory qf;
	public RecommendRepositoryImpl() {
		super(Recommend.class);
		//this.qf = qf;
	}
}
