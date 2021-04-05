package com.example.demo.exh.repository;

import java.util.List;

import javax.persistence.EntityManager;
import static com.example.demo.exh.domain.QExhbn.exhbn;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import com.example.demo.exh.domain.Exhbn;
import com.querydsl.jpa.impl.JPAQueryFactory;

@Repository
public class ExhbnRepositoryImpl extends QuerydslRepositorySupport implements ExhbnCustomRepository{
	private final JPAQueryFactory qf;
	private final EntityManager em;
	public ExhbnRepositoryImpl(EntityManager em, JPAQueryFactory qf) {
		super(Exhbn.class);
		this.em = em;
		this.qf = qf;
	}
	
	@SuppressWarnings("unchecked") @Override
	public List<Exhbn> search(String exhbnTitle) {
		System.out.println(em.createQuery("select exh from Exhbn exh where exh.exhbnTitle like CONCAT('%',:title,'%')").setParameter("title", exhbnTitle).getResultList());
		return em.createQuery("select exh from Exhbn exh where exh.exhbnTitle like CONCAT('%',:title,'%')")
				.setParameter("title", exhbnTitle).getResultList();
		// return qf.selectFrom(exhbn).where(exhbn.exhbnTitle.contains(exhbnTitle)).fetch();
	}
}