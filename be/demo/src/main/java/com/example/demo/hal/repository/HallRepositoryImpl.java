package com.example.demo.hal.repository;

import com.example.demo.hal.domain.Hall;
import com.querydsl.jpa.impl.JPAQueryFactory;

import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

@Repository
public class HallRepositoryImpl extends QuerydslRepositorySupport implements IHallRepository{
	private final JPAQueryFactory qf;
	public HallRepositoryImpl(JPAQueryFactory qf) {
		super(Hall.class);
		this.qf = qf;
	}
}
