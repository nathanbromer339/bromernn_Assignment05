/**
 * This is the "Brain" of the computer, It does everything and is pretty awesome.
 * Author: Nathan Bromer
 * Assignment: 05
 * Due Date: 02-15-2018
 * Class: IT2040C Section: 2 Semester: Spring 2018
 * 
 */
package components;

import computer.Computer;

public class processor extends Computer {

	private double speed;//the speed at which data is read. EX an I7 7700k clocks in at about 4.0ghz
	private String brand;//the only two brands are "intel" or "amd" as of right now, unless someone is hiding something from me.

	public processor(String brand, double speed) {

	}
	
	public String toString() {
		return "Brand: " + this.getBrand() +
				" Speed: " + this.getSpeed() + " Ghz";
	}

	@Override
	public void turnOn() {
		System.out.println("I am the processor and I am ON.");

	}

	@Override
	public void turnOff() {
		System.out.println("I am the processor and I am OFF.");

	}

	/**
	 * This gets the Brand Name.
	 * @return Brand name.
	 */
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	/**
	 * This gets the speed
	 * @return the speed
	 */
	public double getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

}
