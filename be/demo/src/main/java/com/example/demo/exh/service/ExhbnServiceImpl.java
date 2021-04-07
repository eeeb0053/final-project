package com.example.demo.exh.service;

import com.example.demo.cmm.service.AbstractService;
import com.example.demo.exh.domain.Exhbn;
import com.example.demo.exh.domain.ExhbnDTO;
import com.example.demo.exh.repository.ExhbnRepository;

import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

@Service @RequiredArgsConstructor
public class ExhbnServiceImpl extends AbstractService<Exhbn> implements ExhbnService {
	private final ExhbnRepository exhbnrepository;
	
	@Override public long save(Exhbn e) { return (exhbnrepository.save(e) != null) ? 1 : 0;}
	@Override public long delete(Exhbn e) { exhbnrepository.delete(e); return(getOne(e.getExhbnNum()) == null) ? 1 : 0;}
	@Override public long count() { return exhbnrepository.count();}
	@Override public Exhbn getOne(long id) { return exhbnrepository.getOne(id);}
	@Override public Optional<Exhbn> findById(long id) { return exhbnrepository.findById(id);}
	@Override public boolean existsById(long id) { return exhbnrepository.existsById(id);}
	@Override public List<Exhbn> findAll() { return exhbnrepository.findAll();}
    @Override public long update(String exhbnTitle, String startDate, String endDate, String exhbnGenre, String exhbnPrice, 
    		String exhbnArtist, String exhbnContent, String exhbnImage, String hallLocation, long exhbnNum) { 
		return exhbnrepository.update(exhbnTitle, startDate, endDate, exhbnGenre, exhbnPrice, 
								exhbnArtist, exhbnContent, exhbnImage, hallLocation, exhbnNum);}
    public List<Exhbn> searchTitle(String exhbnTitle){ return exhbnrepository.searchTitle(exhbnTitle);}
    public List<Exhbn> sortList(){ return exhbnrepository.sortList();}
    public List<Exhbn> nowInExhbn(){ return exhbnrepository.nowInExhbn();}
    public List<ExhbnDTO> top10(){ 
    	return exhbnrepository.findAll().stream().map(i -> new ExhbnDTO(i)).limit(100).collect(Collectors.toList());
    	}
   
}