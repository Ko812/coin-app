package com.nusiss.javaspring.rest;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.nusiss.javaspring.rest.service.CoinService;

@SpringBootTest
class MinimumCoinApplicationTests {
	
	@Autowired
	private CoinService cs;

	@Test
	void contextLoads() {
	}
	
	@Test
	void testMinimumCoinSolution1() {
		Double target = 7.03;
		List<Double> denominators = new ArrayList<>();
		denominators.add(0.01);
		denominators.add(1.0);
		denominators.add(5.0);
		List<Double> result = cs.getMinimumCoins(target, denominators);

		Assertions.assertArrayEquals(new Double[]{0.01, 0.01, 0.01, 1.0, 1.0, 5.0}, result.toArray());
	}
	
	@Test
	void testMinimumCoinSolution2() {
		Double target = 103.0;
		List<Double> denominators = new ArrayList<>();
		denominators.add(1.0);
		denominators.add(50.0);
		List<Double> result = cs.getMinimumCoins(target, denominators);

		Assertions.assertArrayEquals(new Double[]{1.0, 1.0, 1.0, 50.0, 50.0}, result.toArray());
	}
	
	
	private int countOccurrences(List<Double> deno, Double check) {
		int count = 0;
		for(Double d : deno) {
			if(d.equals(check)) {
				count++;
			}
		}
		return count;
	}

}
