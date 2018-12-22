package com.Computer;

public class Computer {
	
	String s;
	String os;
	String processor;
	int ram;
	String monitor;
	
	// static variable
	static String typesOfComputers = "Based on uses--\n" + 
			"• Analog computer\n" + 
			"• Digital computer\n" + 
			"• Hybrid computer\n" + 
			"Based on sizes--\n" + 
			"• Smartphone\n" + 
			"• Microcomputer\n" + 
			"• Workstation\n" + 
			"• Personal computer\n" + 
			"• Laptop\n" + 
			"• Minicomputer\n" + 
			"• Mainframe computer\n" + 
			"• Supercomputer\n" + 
			"• Tablet computer\n";
	
	// Non-Static variable
	String hardwares = "• MotherBoard\n" + 
			"• Central Processing Unit (CPU)\n" + 
			"• Random Access Memory (RAM)\n" + 
			"• Power Supply\n" + 
			"• Video Card\n" + 
			"• Hard Drive (HDD)\n" + 
			"• Solid-State Drive (SSD)\n" + 
			"• Optical Drive (e.g. BD/DVD/CD drive)\n" + 
			"• Card Reader (SD/SDHC, CF, etc.)\n" + 
			"• Monitor\n" + 
			"• Keyboard\n" + 
			"• Mouse\n" + 
			"• Battery Backup (UPS)\n" + 
			"• Flash Drive\n" + 
			"• Printer\n" + 
			"• Speakers\n" + 
			"• External Hard Drive\n" + 
			"• Pen Tablet\n" + 
			"• Sound Card\n" + 
			"• Network Interface Card (NIC)\n" + 
			"• Expansion Card (Firewire, USB, etc.)\n" + 
			"• Hard Drive Controller Card\n" + 
			"• Analog Modem\n" + 
			"• Scanner\n" + 
			"• Projector\n" + 
			"• Floppy Disk Drive\n" + 
			"• Joystick\n";
	
	// constructors
	public Computer() {
		
		System.out.println("What is a computer?\n"+ "A computer is a device that can be instructed to carry out sequences of arithmetic or logical operations automatically via computer programming. \n");
	}
	
	public Computer(String s) {
		
		this.s = s;
		System.out.println( s + ": Charles Babbage" + "\nAn English mechanical engineer and polymath, originated the concept of a programmable computer, conceptualized and invented the first mechanical computer in the early 19th century. ");
	}
	
	public Computer(String os, String processor, int ram, String monitor) {
		
		this.os = os;
		this.processor = processor;
		this.ram = ram;
		this.monitor = monitor;
		
		System.out.println("\nLet's take a look @ my PC:\n" + "OS: " + this.os +"\n"+ "Processor: " + this.processor +"\n"+ "RAM: " + this.ram + "GB" + "\n" + "Monitor: " + this.monitor);
	}
	
	// static method
	public static void software_Types_Examples() {
		
		String str = "# Antivirus: AVG, Housecall, McAfee, and Norton\n" + 
				"# Audio/Music program: iTunes and WinAmp\n" + 
				"# Database: Access, MySQL, and SQL\n" + 
				"# Device drivers: Computer drivers\n" + 
				"# E-mail: Outlook and Thunderbird\n" + 
				"# Game: Madden NFL Football, Quake, and World of Warcraft\n" + 
				"# Internet browser: Firefox, Google Chrome, and Internet Explorer\n" + 
				"# Movie player: VLC and Windows Media Player\n" + 
				"# Operating system: Android, iOS, Linux, macOS, and Windows\n" + 
				"# Photo/Graphics program: Adobe Photoshop and CorelDRAW\n" + 
				"# Presentation: PowerPoint\n";
		
		System.out.println("Types of Softwares and Exmaples:\n" + str );
	}
	
	// Non-static method
	public String softwareCompanies() {
		
		String x = "https://en.wikipedia.org/wiki/List_of_the_largest_software_companies"; 
		return x;
	}

}
