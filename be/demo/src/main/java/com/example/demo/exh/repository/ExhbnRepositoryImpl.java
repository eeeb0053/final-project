package com.example.demo.exh.repository;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import static com.example.demo.exh.domain.QExhbn.exhbn;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import com.example.demo.exh.domain.Exhbn;
import com.fasterxml.jackson.databind.util.ArrayBuilders.BooleanBuilder;
import com.querydsl.jpa.impl.JPAQueryFactory;
import com.querydsl.jpa.impl.JPAQuery;
import com.querydsl.jpa.impl.JPAUpdateClause;
import com.querydsl.core.types.dsl.Expressions;
import com.querydsl.jpa.impl.JPADeleteClause;
import com.querydsl.core.types.dsl.DateTimePath.*;


@Repository
public class ExhbnRepositoryImpl extends QuerydslRepositorySupport implements ExhbnCustomRepository{
	private final JPAQueryFactory qf;
	private final EntityManager em;
	public ExhbnRepositoryImpl(EntityManager em, JPAQueryFactory qf) {
		super(Exhbn.class);
		this.em = em;
		this.qf = qf;
	}
	
	@Override
	public List<Exhbn> searchTitle(String exhbnTitle) {
		//return em.createQuery("select exh from Exhbn exh where exh.exhbnTitle like CONCAT('%',:title,'%')")
		//		.setParameter("title", exhbnTitle).getResultList();
		return qf.selectFrom(exhbn).where(exhbn.exhbnTitle.contains(exhbnTitle)).fetch();
	}
	
	@Override
	public List<Exhbn> sortList(){
		return qf.selectFrom(exhbn).orderBy(exhbn.startDate.desc()).fetch();
	}
	
	@Override
	public List<Exhbn> nowInExhbn(){
		//SimpleDateFormat now = new SimpleDateFormat("yyyy-MM-dd");
		Date nowDate = new Date();
		return qf.selectFrom(exhbn).where(exhbn.startDate.before(nowDate), exhbn.endDate.after(nowDate)).fetch();
	}

}