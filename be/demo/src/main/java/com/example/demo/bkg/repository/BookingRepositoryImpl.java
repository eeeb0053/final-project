package com.example.demo.bkg.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import com.example.demo.bkg.domain.Booking;

@Repository
public class BookingRepositoryImpl extends QuerydslRepositorySupport implements IBookingRepository{
	//private final JPAQueryFactory qf;
	private final EntityManager em;
	public BookingRepositoryImpl(EntityManager em) {
		super(Booking.class);
		//this.qf = qf;
		this.em = em;
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Booking> findByBookNum(int bookNum) {
		return em.createQuery("select b from booking b where b.book_num like :bookNum")
				.setParameter("bookNum", bookNum).getResultList();
	}
}
