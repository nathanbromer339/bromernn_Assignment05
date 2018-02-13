package components;

import computer.Computer;

public class ram extends Computer {
	
	private boolean slotted;
	
	public ram(boolean slotted) {
		return;
	}
	
	public boolean snappedIn() {
		return slotted;
	}

	@Override
	public void turnOn() {
		System.out.println("I am RAM and I am connected.");

	}

	@Override
	public void turnOff() {
		System.out.println("I am RAM and I am not connected.");

	}

	public boolean isSlotted() {
		return slotted;
	}

	public void setSlotted(boolean slotted) {
		this.slotted = slotted;
	}
}
