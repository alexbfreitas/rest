package com.alexandrefreitas.rest.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alexandrefreitas.rest.domain.PosicaoNotaHistoricoCot;
import com.alexandrefreitas.rest.repository.PosicaoNotaHistoricoCotRepository;
import com.alexandrefreitas.rest.services.exceptions.ObjectNotFoundException;

@Service
public class PosicaoNotaHistoricoCotService {

	@Autowired
	private PosicaoNotaHistoricoCotRepository repo;
	

	public List<PosicaoNotaHistoricoCot> find(String cdfundo) {
		
		List<PosicaoNotaHistoricoCot> obj = repo.findByCdfundo(cdfundo);
		
		if (obj.size() == 0) {
			throw new ObjectNotFoundException (
					"Objeto Não Encontrado! Id: " + cdfundo + ", Tipo: " + PosicaoNotaHistoricoCot.class.getName());
		}
		
		else {
			return obj;
		}
			
	}	
	
	public List<PosicaoNotaHistoricoCot> findPeriodo(String cdfundo, Date startDate, Date endDate) {
		
		List<PosicaoNotaHistoricoCot> obj = repo.findByCdfundoAndPosicaodtBetween(cdfundo, startDate, endDate);
		
		if (obj.size() == 0) {
			throw new ObjectNotFoundException (
					"Objeto Não Encontrado! Id: " + cdfundo + ", Tipo: " + PosicaoNotaHistoricoCot.class.getName());
		}
		
		else {
			return obj;
		}
			
	}	

}
