/**
 * This is where all of the best stuff connects to give you all the sweet power you need.
 * Author: Nathan Bromer
 * Assignment: 05
 * Due Date: 02-15-2018
 * Class: IT2040C Section: 2 Semester: Spring 2018
 * 
 */
package components;

import computer.Computer;

public class motherBoard extends Computer {

	private String formFactor;//This is the type of mother board it is. You know, stuff like "ATX" and "ATX-mini". Seriously, look it up 
	private String motherBoardName;//This is just what its called
	private int ammountOfRAM;//how much overall RAM capacity it can hold. EX a typical mother board for average use has a max of 64gb
	private boolean onBoardVideo;//This is, if your motherboard supports on board video. but it is also dependant on the processor
	private int numberOfSATAPorts;//Stuff your dvd drives(yes people still use those, I have had to install a lot of those) and Storage connect to

	public motherBoard(String motherBoardName, 
			String formFactor, 
			int ammountOfRAM, 
			boolean onBoardVideo, 
			int numberOfSATAPorts) {

	}
	
	public String toString() {
		return "Motherboard Name: " + this.getMotherBoardName() + 
				" Form Factor: " + this.getFormFactor() + 
				" Max ammount of RAM: " + this.getAmmountOfRAM() + " GB" +
				" On Board Video? " + this.getOnBoardVideo() +
				" Number of SATA's: " + this.getNumberOfSATAPorts();
	}

	@Override
	public void turnOn() {
		System.out.println("I am the motherboard and I am ON.");

	}

	@Override
	public void turnOff() {
		System.out.println("I am the motherboard and I am OFF.");

	}
	
	/**
	 * This gets the form factor of the mother board
	 * @return mother board form factor
	 */
	public String getFormFactor() {
		return formFactor;
	}

	public void setFormFactor(String formFactor) {
		this.formFactor = formFactor;
	}
	
	/**
	 * This gets MAX ammount of RAM it supports
	 * @return MAX ammount
	 */
	public int getAmmountOfRAM() {
		return ammountOfRAM;
	}

	public void setAmmountOfRAM(int ammountOfRAM) {
		this.ammountOfRAM = ammountOfRAM;
	}
	
	/**
	 * This gets the support for on board video whether it being "true" or "false"
	 * @return if it supports it or not
	 */
	public boolean getOnBoardVideo() {
		return onBoardVideo;
	}

	public void setOnBoardVideo(boolean onBoardVideo) {
		this.onBoardVideo = onBoardVideo;
	}
	
	/**
	 * This gets the MAX ammount of SATA ports on the mother board. Seriously, they will put these things anywhere
	 * @return MAX ammount of SATA ports
	 */
	public int getNumberOfSATAPorts() {
		return numberOfSATAPorts;
	}

	public void setNumberOfSATAPorts(int numberOfSATAPorts) {
		this.numberOfSATAPorts = numberOfSATAPorts;
	}

	/**
	 * The boring name companies use to get you to buy their over-priced mother board(am I spelling the right or is it motherboard?)
	 * @return the mother board name
	 */
	public String getMotherBoardName() {
		return motherBoardName;
	}


	public void setMotherBoardName(String motherBoardName) {
		this.motherBoardName = motherBoardName;
	}


}
