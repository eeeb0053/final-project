package com.example.demo.hal.service;

import java.util.List;

import com.example.demo.hal.domain.Hall;

public interface HallService {
	public List<Hall> findByHallLocation(String location);
	public List<Hall> findByHallNameAndHallLocation(String name, String location);
	public long update (String hallClosed, long hallNum);
}
