package components;

import computer.Computer;

public class motherBoard extends Computer {
	
	private boolean cord;
	
	public motherBoard(boolean cord) {
		turnOff();
	}
	
	public boolean isConnected() {
		return cord;
	}

	@Override
	public void turnOn() {
		System.out.println("I am the motherboard and I am ON.");

	}

	@Override
	public void turnOff() {
		System.out.println("I am the motherboard and I am OFF.");

	}

}
