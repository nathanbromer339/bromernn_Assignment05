package components;

import computer.Computer;

public class graphicsCard extends Computer {

	private boolean set;
	
	public graphicsCard(boolean set) {
		return;
	}
	
	public boolean isSet() {
		return set;
	}

	@Override
	public void turnOn() {
		System.out.println("I am the graphics card and I am ON.");

	}

	@Override
	public void turnOff() {
		System.out.println("I am the graphics card and I am OFF.");

	}
}
