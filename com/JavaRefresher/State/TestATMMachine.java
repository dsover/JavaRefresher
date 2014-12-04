package com.JavaRefresher.State;
import com.JavaRefresher.Proxy.*;
public class TestATMMachine {

	public static void main(String[] args) {

		ATMMachine atmMachine = new ATMMachine();
		
		atmMachine.insertCard();
		atmMachine.ejectCard();
		atmMachine.insertCard();
		atmMachine.insertPin(12342);
		atmMachine.insertCard();
		atmMachine.insertPin(1234);
		//atmMachine.requestCash(1999);
		//atmMachine.setCashInMachine(atmMachine.cashInMachine+2000);
		
		GetATMData realATMMachine = new ATMMachine();
		GetATMData atmProxy = new ATMProxy();
		
		System.out.println("\nCurrent ATM State " + realATMMachine.getATMData());
		System.out.println("\nCurrent Amount of cash in the Machine " + atmProxy.getCashInMachine());
	}

}
