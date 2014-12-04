package com.JavaRefresher.ChainOfResponsibility;

public class DivideNumbers implements Chain {
	private Chain nextInChain;

	@Override
	public void setNextChain(Chain nextChain) {
		this.nextInChain = nextChain;

	}

	@Override
	public void calculate(Numbers request) {
		if (request.getCalcWanted() == "div") {
			System.out.println(request.getNumber1() + " / "
					+ request.getNumber2() + " = "
					+ (request.getNumber1() / request.getNumber2()) 
					+ "\n");
		} else {
			nextInChain.calculate(request);
		}

	}

}
