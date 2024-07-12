package com.nusiss.javaspring.rest.service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

import com.nusiss.javaspring.rest.entities.CoinQuery;

@Service
public class CoinService {
	
	public List<Double> getMinimumCoins(Double target, List<Double> denominators){
		List<Double> result = new ArrayList<Double>();
		
		// sort denominators in descending order
		Collections.sort(denominators, (c1, c2) -> c2 > c1 ? 1 : c2.equals(c1) ? 0 : -1);
		
		for(Double d : denominators) {
			// Greedy algorithm gives the minimum here because
			// each smaller coin is less than or equal to half
			// of the next bigger coin
			while(target >= d) {
				result.add(d);
				target -= d;
				target = rounding(target, 2);
			}
		}
		Collections.sort(result);
		return result;
	}
	
	
	private double rounding(double val, int place) {
		if(place < 0) throw new IllegalArgumentException();
		
		BigDecimal bd = new BigDecimal(Double.toString(val));
		bd = bd.setScale(place, RoundingMode.HALF_UP);
		return bd.doubleValue();
		
	}

}
