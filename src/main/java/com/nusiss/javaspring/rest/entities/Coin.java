package com.nusiss.javaspring.rest.entities;

import java.util.Random;

public class Coin {
	
	private Double val;
	
	private String key;

	public Coin(Double val) {
		super();
		this.val = val;
		this.key = genKey();
	}

	public Coin() {
		super();
	}

	public Double getVal() {
		return val;
	}

	public void setVal(Double val) {
		this.val = val;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}
	
	private final String alphaString = "abcdefghijklmnopqrstuvwxyz1234567890";
	
	private String genKey() {
		String key = "";
		Random rand = new Random();
		for(int i = 0; i < 29; i++) {
			key += alphaString.charAt(rand.nextInt(alphaString.length()));
		}
		return key;
	}
}
