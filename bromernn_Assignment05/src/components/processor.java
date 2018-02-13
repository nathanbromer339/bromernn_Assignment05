package components;

import computer.Computer;

public class processor extends Computer {
	
	private  boolean socketed;
	
	public processor(boolean socketed) {
		turnOff();
	}
	
	public boolean isSocketed() {
		return socketed;
	}

	@Override
	public void turnOn() {
		System.out.println("I am the processor and I am ON.");

	}

	@Override
	public void turnOff() {
		System.out.println("I am the processor and I am OFF.");

	}
}
