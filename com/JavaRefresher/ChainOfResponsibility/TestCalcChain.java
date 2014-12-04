package com.JavaRefresher.ChainOfResponsibility;

import java.util.Vector;

public class TestCalcChain {
	public static void main(String[] args){
		Chain chainCalc1 = new AddNumbers();
		Chain chainCalc2 = new SubtractNumbers();
		Chain chainCalc3 = new MultNumbers();
		Chain chainCalc4 = new DivideNumbers();
		
		chainCalc1.setNextChain(chainCalc2);
		chainCalc2.setNextChain(chainCalc3);
		chainCalc3.setNextChain(chainCalc4);
		
		
		Vector<Numbers> v = new Vector();
		
		Numbers request = new Numbers(4,3,"add");
		v.add(request);
		Numbers request2 = new Numbers(3,2,"sub");
		v.add(request2);
		Numbers request3 = new Numbers(5,2,"mult");
		v.add(request3);
		Numbers request4 = new Numbers(3,2,"div");
		v.add(request4);
		
		for(Numbers num : v){
			chainCalc1.calculate(num);
		}
		
				
	}
}
