package com.JavaRefresher.State;

public class HasCard implements ATMState{

	ATMMachine atmMachine;
	public HasCard(ATMMachine newATMMachine){
		atmMachine = newATMMachine;
	}
	
	@Override
	public void insertCard() {
		System.out.println("Only one Card at a Time ");
		
	}

	@Override
	public void ejectCard() {
		System.out.println("Card Ejected");
		atmMachine.setATMState(atmMachine.getNoCardState());
	}

	@Override
	public void insertPin(int pinEntered) {
		if(pinEntered == 1234){
			System.out.println("Correct PIN");
			atmMachine.correctPinEntered = true;
			atmMachine.setATMState(atmMachine.getHasPin());
		}else {
			System.out.println("Wrong PIN");
			atmMachine.correctPinEntered = false;
			System.out.println("Card Ejected");
			atmMachine.setATMState(atmMachine.getNoCardState());
		}
		
	}

	@Override
	public void requestCash(int cashToWithdraw) {
		System.out.println("Enter PIN First");
		
	}

}
