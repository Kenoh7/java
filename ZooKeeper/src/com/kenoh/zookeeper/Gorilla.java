package com.kenoh.zookeeper;

public class Gorilla extends Mammal {
	public Gorilla() {
		super();
	}
	
//	Methods
	public void throwSomething() {
		this.energyLevel -=5;
		System.out.println("Gorilla threw something. Energy Level: "+this.energyLevel);
	}
	public void eatBananas() {
		this.energyLevel +=10;
		System.out.println("Gorilla ate a banana. Energy level: " + this.energyLevel);
	}
	public void climb() {
		this.energyLevel -=10;
		System.out.println("Gorilla climbed a tree. Energy Level:" + this.energyLevel);
	}
}
