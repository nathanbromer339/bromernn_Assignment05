/**
 * This is the class for the thing we use to even see what the computer is even doing.
 * Author: Nathan Bromer
 * Assignment: 05
 * Due Date: 02-15-2018
 * Class: IT2040C Section: 2 Semester: Spring 2018
 * 
 */
package monitor;

import computer.Computer;

public class Monitor extends Computer {

	private int monitorSize;//kind of like how big a tv is ,but you know, for a monitor.
	private String brand;//More of the brand thing
	private int refreshRate;//This is a complex thing to explain so if your interested look up "refresh rate in computer monitors" it is also in TV as well
	private String resolution;//This is stuff like 1080p, or 1080i, or whatever it renders things in

	public Monitor(String brand, String resolution, int monitorSize, int refreshRate) {

	}
	
	public String toString() {
		return "Brand: " + this.getBrand() +
				" Monitor Size: " + this.getMonitorSize() + " in." +
				" Resolution: " + this.getResolution() +
				" Refresh Rate: " + this.getRefreshRate() + " htz";
	}

	@Override
	public void turnOn() {
		System.out.println("I am a monitor and I am ON.");

	}

	@Override
	public void turnOff() {
		System.out.println("I am a monitor and I am OFF.");

	}

	/**
	 * This gets the size of monitor. Oh know, we just got through this in the other class not again.
	 * @return monitor size
	 */
	public int getMonitorSize() {
		return monitorSize;
	}

	public void setMonitorSize(int monitorSize) {
		this.monitorSize = monitorSize;
	}

	/**
	 * This gets, what is it again? Oh yeah, the thing I kept assigning in like 4 other classes the brand name of the monitor
	 * It seems like everything has a brand name. Huh, weird.
	 * @return The Brand Name(again.)
	 */
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	/**
	 * This gets that complex thing I was talking about.
	 * @return complex thing(refresh rate)
	 */
	public int getRefreshRate() {
		return refreshRate;
	}

	public void setRefreshRate(int refreshRate) {
		this.refreshRate = refreshRate;
	}

	/**
	 * This gets the resolution
	 * @return resolution
	 */
	public String getResolution() {
		return resolution;
	}

	public void setResolution(String resolution) {
		this.resolution = resolution;
	}

}
