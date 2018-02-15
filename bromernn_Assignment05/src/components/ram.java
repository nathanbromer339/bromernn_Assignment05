/**
 * This is that volitile storage in the computer.
 * Author: Nathan Bromer
 * Assignment: 05
 * Due Date: 02-15-2018
 * Class: IT2040C Section: 2 Semester: Spring 2018
 * 
 */
package components;

import computer.Computer;

public class ram extends Computer {

	private int speed;//measured in MT/s
	private String brand;//There are a lot of brand names for this stuff
	private int size;//measured in GB
	private int numberOfSticks;//This is just a basic calculation of the number of sticks
	

	public ram(String brand, int size, int speed, int numberOfSticks) {

	}
	
	public String toString() {
		return "Brand: " + this.getBrand() + 
				" Size: " + this.getSize() + " GB" +
				" Speed: " + this.getSpeed() + " Ghz" +
				" Number of Sticks: " + this.getNumberOfSticks();
	}

	@Override
	public void turnOn() {
		System.out.println("I am RAM and I am connected.");

	}

	@Override
	public void turnOff() {
		System.out.println("I am RAM and I am not connected.");

	}

	/**
	 * This gets the speed of the RAM
	 * @return
	 */
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	/**
	 * This gets the multitude of Brand names
	 * @return Brand names
	 */
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	/**
	 * This gets the size(in GB)
	 * @return the size
	 */
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	/**
	 * This gets the BASIC number of sticks. no insane calculations for this.
	 * @return number of sticks
	 */
	public int getNumberOfSticks() {
		return numberOfSticks;
	}

	public void setNumberOfSticks(int numberOfSticks) {
		this.numberOfSticks = numberOfSticks;
	}

}
