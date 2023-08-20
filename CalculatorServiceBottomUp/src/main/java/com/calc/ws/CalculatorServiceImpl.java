package com.calc.ws;

import javax.jws.WebService;

@WebService(endpointInterface= "ICalculator")
public class CalculatorServiceImpl implements ICalculator {

	@Override
	public double add(int x, int y) {
		// TODO Auto-generated method stub
		return x+y;
	}

}
