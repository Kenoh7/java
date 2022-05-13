package com.kenoh.zookeeper;

public class Bat extends Mammal {
	public Bat() {
		super();
		this.energyLevel = 300;
	}

//	Methods
	public void fly() {
		this.energyLevel -= 50;
		System.out.println("Bat has took off flying. Energy Level: " + this.energyLevel);
	}
	
	public void eatHumans() {
		this.energyLevel +=25;
		System.out.println("Bat has ate the towns people! Energy Level: " + this.energyLevel);
	}
	public void attackTown() {
		this.energyLevel -=100;
		System.out.println("Bat has destroyed a town!! Energy Level: " + this.energyLevel);
	}
}
