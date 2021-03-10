package com.example.demo.anl.repository;

import com.example.demo.anl.domain.Analysis;
import org.springframework.data.jpa.repository.JpaRepository;

interface AnalysisCustomRepository{
	
}

public interface AnalysisRepository extends JpaRepository<Analysis, Long>, AnalysisCustomRepository {

}
