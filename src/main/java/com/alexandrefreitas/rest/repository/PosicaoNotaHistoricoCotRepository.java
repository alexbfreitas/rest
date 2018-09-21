package com.alexandrefreitas.rest.repository;


import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alexandrefreitas.rest.domain.PosicaoNotaHistoricoCot;

@Repository
public interface PosicaoNotaHistoricoCotRepository extends JpaRepository<PosicaoNotaHistoricoCot, Long>{

	List<PosicaoNotaHistoricoCot> findByCdfundoAndPosicaodtBetween(String cdfundo, Date startDate, Date endDate);
	List<PosicaoNotaHistoricoCot> findByCdfundo(String cdfundo);
	
	
}