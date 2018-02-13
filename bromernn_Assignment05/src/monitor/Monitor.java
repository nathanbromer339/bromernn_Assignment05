package monitor;

import computer.Computer;

public class Monitor extends Computer {
	
	private boolean button;
	
	public Monitor(boolean button){
		turnOff();
	}
	
	public boolean isOn(){
		return button;
	}

	@Override
	public void turnOn() {
		System.out.println("I am a monitor and I am ON.");

	}

	@Override
	public void turnOff() {
		System.out.println("I am a monitor and I am OFF.");

	}

	public boolean isButton() {
		return button;
	}

	public void setButton(boolean button) {
		this.button = button;
	}

}
