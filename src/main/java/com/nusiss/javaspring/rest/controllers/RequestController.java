package com.nusiss.javaspring.rest.controllers;

import java.net.http.HttpRequest;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nusiss.javaspring.rest.entities.Coin;
import com.nusiss.javaspring.rest.entities.CoinQuery;
import com.nusiss.javaspring.rest.entities.CoinResult;
import com.nusiss.javaspring.rest.service.CoinService;


@RestController
@RequestMapping("/api")
@CrossOrigin
public class RequestController {
	
	@Autowired
	private CoinService cs;
	
	

	@PostMapping("/findMinimumCoins")
	public ResponseEntity<CoinResult> findMinimumCoins(CoinQuery query){
		List<Double> result = cs.getMinimumCoins(query.getTargetAmount(), query.getCoinDenominators());
		return new ResponseEntity<CoinResult>(
				new CoinResult(
					result
					.stream()
					.map(d -> new Coin(d))
					.toList()
					), 
				HttpStatus.OK);
	}
	
}
