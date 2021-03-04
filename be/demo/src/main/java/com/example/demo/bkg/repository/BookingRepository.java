package com.example.demo.bkg.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.bkg.domain.Booking;

interface IBookingRepository{
	public List<Booking> findByBookNum(int bookNum);
}
public interface BookingRepository extends JpaRepository<Booking, Integer>, IBookingRepository{
	@Query(value="update booking b set b.book_name = :bookName, b.book_email = :bookEmail, b.book_pnumber =:bookPnumber"
			+ " where b.book_num = :bookNum", nativeQuery = true)
	public int update(@Param("bookName") String bookName,
						@Param("bookEmail") String bookEmail, @Param("bookPnumber") String bookPnumber,
						@Param("bookNum") int bookNum);
}
