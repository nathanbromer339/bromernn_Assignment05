package main;

import java.util.ArrayList;
import components.graphicsCard;
import components.motherBoard;
import components.processor;
import components.ram;
import computer.Computer;
import monitor.Monitor;

public class Main {

	public static void main(String[] args) {

		ArrayList<Computer> myComputer = new ArrayList<Computer>();
		myComputer.add(new Monitor(false));
		myComputer.add(new motherBoard());
		myComputer.add(new graphicsCard());
		myComputer.add(new processor());
		myComputer.add(new ram());
		for (Computer c : myComputer) {
			c.turnOn();
		}
	

	}

}
