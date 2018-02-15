/**
 * This is the testing class
 * Author: Nathan Bromer
 * Assignment: 05
 * Due Date: 02-15-2018
 * Class: IT2040C Section: 2 Semester: Spring 2018
 * 
 */
package main;

import java.util.ArrayList;
import java.util.Arrays;

import components.graphicsCard;
import components.motherBoard;
import components.processor;
import components.ram;
import computer.Computer;
import monitor.Monitor;

public class Main {

	public static void main(String[] args) {
		
		//This is a typical computer with 2 monitors, 2 graphics cards, and the multitude of other components.
		ArrayList<Computer> myComputer = new ArrayList<Computer>();// Array List
		myComputer.add(new Monitor("Acer", "1920x1080", 20, 144));
		myComputer.add(new Monitor("Acer", "1920x1080", 24, 60));
		myComputer.add(new motherBoard("This is a MotherBoard", "ATX", 32, false, 6));
		myComputer.add(new graphicsCard("GTX 1080", 8, 13));
		myComputer.add(new graphicsCard("GTX 1080", 8, 13));
		myComputer.add(new processor("Intel", 4.2));
		myComputer.add(new ram("Corsair", 32, 2333, 4));
		
		for (Computer c : myComputer) {
			c.turnOn();//Turns on the components and displays them being on
			System.out.println(c);//Prints each line of the array list.
			System.out.println();//This prints a blank line for just clarity sake.

		}
	
	}

}
