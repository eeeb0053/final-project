package com.example.demo.rec.repository;

import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import com.example.demo.rec.domain.Recommend;
import com.querydsl.jpa.impl.JPAQueryFactory;

@Repository
public class RecommendRepositoryImpl extends QuerydslRepositorySupport implements IRecommendRepository{
	private final JPAQueryFactory qf;
	public RecommendRepositoryImpl(JPAQueryFactory qf) {
		super(Recommend.class);
		this.qf = qf;
	}
}
