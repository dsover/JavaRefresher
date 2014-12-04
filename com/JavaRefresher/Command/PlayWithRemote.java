package com.JavaRefresher.Command;

public class PlayWithRemote {

	public static void main(String[] args) {

		ElectronicDevice newDevice = TvRemote.getDevice();
		
		TurnTVOn onCommand = new TurnTVOn(newDevice);
		
		DeviceButton onPressed = new DeviceButton(onCommand);
		
		onPressed.press();
		 //-------------------
		TurnTVOff offCommand = new TurnTVOff(newDevice);
		
		onPressed = new DeviceButton(offCommand);
		
		onPressed.press();
		 //-------------------
		TurnTVUp volUpCommand = new TurnTVUp(newDevice);
		
		onPressed = new DeviceButton(volUpCommand);
		
		onPressed.press();
		onPressed.press();
		onPressed.press();
		 //-------------------
		
		
	}

}