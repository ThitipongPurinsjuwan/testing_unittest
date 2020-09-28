package com.unittest.testing;

public class Fahrenheit {
	private double celcius;
	private double fahrenheit;
	
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
	
	
//-------------------------------------	calculate //
	public void tranfromFahrenheit() {
		this.fahrenheit = this.celcius*9/5 + 32;
	}
	
	public double getFahrenheit() {
		return this.fahrenheit;
	}
	
	public String toString() {
//		tranfromFahrenheit();
		return Math.round(getCelcius())+" Celcius = "+Math.round(getFahrenheit())+" Fahrenhiet";
	}
	
	public String messageError() {
		return Math.round(getCelcius())+" out of range";
	}
}
