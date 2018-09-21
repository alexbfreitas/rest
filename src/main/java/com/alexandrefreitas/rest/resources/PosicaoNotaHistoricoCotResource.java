package com.alexandrefreitas.rest.resources;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alexandrefreitas.rest.domain.PosicaoNotaHistoricoCot;
import com.alexandrefreitas.rest.services.PosicaoNotaHistoricoCotService;

@RestController
@RequestMapping(value="/cot")

public class PosicaoNotaHistoricoCotResource {

	@Autowired
	private PosicaoNotaHistoricoCotService service;
	
	@RequestMapping(value="/{cdfundo}", method=RequestMethod.GET)	
	public ResponseEntity<List<PosicaoNotaHistoricoCot>> find(@PathVariable String cdfundo) {
		
		List<PosicaoNotaHistoricoCot> obj = service.find(cdfundo);
		
		return ResponseEntity.ok().body(obj);
		
	}
	
	

//	@RequestMapping(value="/periodo", method=RequestMethod.GET)	
//	public ResponseEntity<List<PosicaoNotaHistoricoCot>> findPeriodo(@RequestParam ("cdfundo") String cdfundo,
//			@DateTimeFormat(pattern = "dd-MM-yyyy")
//    		@RequestParam("startDate") Date startDate,
//    		@DateTimeFormat(pattern = "dd-MM-yyyy")
//    		@RequestParam("endDate") Date endDate) {
//		
//		System.out.println("CDFUNDO" + cdfundo + ", " + startDate + ", " + endDate);
//		
//		List<PosicaoNotaHistoricoCot> obj = service.findPeriodo(cdfundo, startDate, endDate);
//		return ResponseEntity.ok().body(obj);
//		
//	}	
	
	@RequestMapping(value="/periodo/{cdfundo}/{startDate}/{endDate}", method=RequestMethod.GET)	
	public ResponseEntity<List<PosicaoNotaHistoricoCot>> findPeriodo(@PathVariable("cdfundo") String cdfundo,
			@DateTimeFormat(pattern = "dd-MM-yyyy") @PathVariable("startDate") Date startDate, @DateTimeFormat(pattern = "dd-MM-yyyy") @PathVariable("endDate") Date endDate) {
		
		System.out.println("CDFUNDO" + cdfundo + ", " + startDate + ", " + endDate);
		
		List<PosicaoNotaHistoricoCot> obj = service.findPeriodo(cdfundo, startDate, endDate);
		return ResponseEntity.ok().body(obj);
		
	}	
	
	

}




	
	
	