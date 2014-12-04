package com.JavaRefresher.Proxy;

import com.JavaRefresher.State.ATMMachine;
import com.JavaRefresher.State.ATMState;

public class ATMProxy implements GetATMData{

	
	@Override
	public ATMState getATMData() {
		ATMMachine realATMMachine = new ATMMachine();
		return realATMMachine.getATMData();
	}

	@Override
	public int getCashInMachine() {
		ATMMachine realATMMachine = new ATMMachine();
		
		return realATMMachine.getCashInMachine();
	}
	
	
	
}
