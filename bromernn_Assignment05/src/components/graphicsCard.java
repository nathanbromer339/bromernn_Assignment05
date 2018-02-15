/**
 * This is the bread and butter of seeing things on you powerful computer 
 * Author: Nathan Bromer
 * Assignment: 05
 * Due Date: 02-15-2018
 * Class: IT2040C Section: 2 Semester: Spring 2018
 * 
 */
package components;

import computer.Computer;

public class graphicsCard extends Computer {

	private String name;//this is the graphics card name
	private int size;//this is how big it is in GB
	private int length;//this is how long it sits when installed
	

	public graphicsCard(String name, int size, int length) {	
	}
	
	public String toString() {
		return "Graphics Card Name: " + this.getName() + 
				" Size: " + this.getSize() + " GB " + 
				" Length: " + this.getLength() + " in.";
		
	}
	
	//the overrides from the power interface
	@Override
	public void turnOn() {
		System.out.println("I am the graphics card and I am ON.");
	}

	@Override
	public void turnOff() {
		System.out.println("I am the graphics card and I am OFF.");
	}
	
	/**
	 * gets the brand name of the graphics card
	 * @return brand name
	 */
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * This gets the size of the graphics card in GB. No pun here move along
	 * @return graphics card size. Seriously no pun stop being so gross.
	 */
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	/**
	 * This is the graphics card's length. Alright now you're just being wierd
	 * @return graphics card length in inches. No just no.
	 */
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

}
