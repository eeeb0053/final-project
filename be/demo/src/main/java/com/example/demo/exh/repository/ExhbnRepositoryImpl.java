package com.example.demo.exh.repository;

import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import com.example.demo.exh.domain.Exhbn;

@Repository
public class ExhbnRepositoryImpl extends QuerydslRepositorySupport implements ExhbnCustomRepository{
	//private final JPAQueryFactory qf;
	public ExhbnRepositoryImpl() {
		super(Exhbn.class);
		//this.qf = qf;
	}
}