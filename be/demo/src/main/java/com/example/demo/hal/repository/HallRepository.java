package com.example.demo.hal.repository;

import com.example.demo.hal.domain.Hall;
import com.example.demo.hal.domain.HallDTO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

interface IHallRepository{
	public List<Hall> findByLocation(String location);
}
public interface HallRepository extends JpaRepository<Hall, Integer>, IHallRepository {
	@Query("update hall set hall_closed = :#{#hall.hallClosed}, "
			+ "hall_info = :#{#hall.hallInfo}, hall_image = :#{#hall.hallImage} "
			+ "where hall_num = :#{#hall.hallNum}")
	public int update(@Param("hall") Hall t);
	public List<Hall> findByNameAndLocation(String hallName, String hallLocation);
}
