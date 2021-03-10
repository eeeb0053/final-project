package com.example.demo.hal.repository;

import com.example.demo.hal.domain.Hall;
import com.example.demo.hal.domain.HallDTO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

interface IHallRepository{
	public List<Hall> findByHallLocation(String location);
}
public interface HallRepository extends JpaRepository<Hall, Integer>, IHallRepository {
	@Query(value="update hall h set h.hall_closed = :hallClosed "
			+ " where h.hall_num = :hallNum", nativeQuery = true)
	public int update(@Param("hallClosed") String hallClosed,
						@Param("hallNum") int hallNum);
	public List<Hall> findByHallNameAndHallLocation(String hallName, String hallLocation);
}
