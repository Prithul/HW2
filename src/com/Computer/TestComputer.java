package com.Computer;

/**
 * Write a java program that should have a class name called Computer. Write few static and non-static methods
 * and few static and non-static variables on Computer class. Also create few constructors on Computer class.
 * Write another class called TestComputer where you can create object from Computer class.Now try to use those 
 * methods from Computer class in TestComputer.
 * 
 * @author Papri Barua
 *
 */

public class TestComputer {

	public static void main(String[] args) {
		
		System.out.println("Computer At-A-Glamce!!!  :)");
		System.out.println("........................... \n");
	
		// constructors
		Computer computer1 = new Computer();
		Computer computer2 = new Computer("Father Of Computer");
		
		
		// static & non-static variables
		System.out.println("\nTypes of Computers:\n" + Computer.typesOfComputers);
		System.out.println("List of Hardwares:\n" + computer1.hardwares);
		
		// static & non-static methods
		Computer.software_Types_Examples();
		System.out.println("More Info: \n" + computer1.softwareCompanies());
		
		// another constructor
		Computer myComputer = new Computer("Windows 10 Pro","Intel Core i7-7500 CPU @2.70 GHz", 8, "Samsung 49-inch Ultra-Wide Curved Monitor");

		System.out.println("\nCOOL!!!");
     }

}
