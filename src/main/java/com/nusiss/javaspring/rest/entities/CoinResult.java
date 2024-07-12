package com.nusiss.javaspring.rest.entities;

import java.util.List;

public class CoinResult {
	
	private List<Coin> coins;

	public CoinResult(List<Coin> coins) {
		super();
		this.coins = coins;
	}

	public List<Coin> getCoins() {
		return coins;
	}

	public void setCoins(List<Coin> coins) {
		this.coins = coins;
	}
}
