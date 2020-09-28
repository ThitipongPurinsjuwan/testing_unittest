package com.unittest.testing;

public class Fahrenheit {
	private double celcius;
	
	public void input(double celcius) {
		this.celcius = celcius;
	}
	
	public double getCelcius() {
		return celcius;
	}
	
	public boolean isBound(double celcius) {
		boolean isResult;
		if (celcius >= -1000 && celcius <= 1000) {
			isResult = true;
		} else {
			isResult = false;
		}
		
		return isResult;
	}
}
