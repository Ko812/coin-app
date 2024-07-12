package com.nusiss.javaspring.rest.entities;

import java.util.List;

public class CoinQuery {
	
	private Double targetAmount;
	
	private List<Double> coinDenominators;

	public CoinQuery(Double targetAmount, List<Double> coinDenominators) {
		super();
		this.targetAmount = targetAmount;
		this.coinDenominators = coinDenominators;
	}

	public Double getTargetAmount() {
		return targetAmount;
	}

	public void setTargetAmount(Double targetAmount) {
		this.targetAmount = targetAmount;
	}

	public List<Double> getCoinDenominators() {
		return coinDenominators;
	}

	public void setCoinDenominators(List<Double> coinDenominators) {
		this.coinDenominators = coinDenominators;
	}

}
