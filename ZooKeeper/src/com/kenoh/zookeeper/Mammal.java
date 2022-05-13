package com.kenoh.zookeeper;

public class Mammal {
//	Attributes
	protected int energyLevel;


//	Constructor
	public Mammal() {
	this.energyLevel = 100;
}

//  Getter
	public int getEnergyLevel() {
		return energyLevel;
	}
	
//	Setter
	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
//	Method
	public void displayEnergy() {
		System.out.println("Your Energy Level is: " + energyLevel);
	}
}
