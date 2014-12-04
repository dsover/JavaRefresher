package com.JavaRefresher.State;

public class HasPin implements ATMState {

	ATMMachine atmMachine;
	public HasPin(ATMMachine newAtmMachine){
		atmMachine = newAtmMachine;
	}
	
	@Override
	public void insertCard() {
		System.out.println("Only one Card at a Time ");
	}

	@Override
	public void ejectCard() {
		System.out.println("Card Ejected ");
		atmMachine.setATMState(atmMachine.getNoCardState());
	}

	@Override
	public void insertPin(int pinEntered) {
		System.out.println("You Already Entered a PIN");
	}

	@Override
	public void requestCash(int cashToWithdraw) {
		if(cashToWithdraw > atmMachine.cashInMachine){
			System.out.println("The ATM does not have enough funds");
			System.out.println("Card Ejected ");
			atmMachine.setATMState(atmMachine.getNoCardState());
		}else {
			System.out.println(cashToWithdraw +" has been withdrawn from the machine");
			atmMachine.setCashInMachine((atmMachine.cashInMachine - cashToWithdraw));

			System.out.println("Card Ejected ");
			atmMachine.setATMState(atmMachine.getNoCardState());
			
			if(atmMachine.cashInMachine <= 0){
				System.out.println("System has been emptied");
				atmMachine.setATMState(atmMachine.getNoCashState());
			}
		}
	}

}
