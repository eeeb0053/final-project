package com.example.demo.exh.repository;

import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import com.example.demo.exh.domain.Exhbn;
import com.querydsl.jpa.impl.JPAQueryFactory;

@Repository
public class ExhbnRepositoryImpl extends QuerydslRepositorySupport implements IExhbnRepository{
	private final JPAQueryFactory qf;
	public ExhbnRepositoryImpl(JPAQueryFactory qf) {
		super(Exhbn.class);
		this.qf = qf;
	}
}