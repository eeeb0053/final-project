package com.example.demo.hal.service;

import java.util.List;

import com.example.demo.hal.domain.Hall;

public interface HallService {
	public List<Hall> findByNameAndLocation(String name, String location);
}
