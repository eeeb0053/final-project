package com.example.demo.hal.repository;

import com.example.demo.hal.domain.Hall;

import java.util.List;

import javax.persistence.EntityManager;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

@Repository
public class HallRepositoryImpl extends QuerydslRepositorySupport implements IHallRepository{
	//private final JPAQueryFactory qf;
	private final EntityManager em;
	public HallRepositoryImpl(EntityManager em) {
		super(Hall.class);
		//this.qf = qf;
		this.em = em;
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Hall> findByHallLocation(String location) {
		return em.createQuery("select h from Hall h where h.hall_location like :hallLocation")
				.setParameter("hallLocation", location).getResultList();
	}
}
