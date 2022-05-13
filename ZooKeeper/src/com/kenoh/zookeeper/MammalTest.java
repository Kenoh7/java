package com.kenoh.zookeeper;

public class MammalTest {

	public static void main(String[] args) {
		Gorilla gorilla1 = new Gorilla();
		Bat bat1 = new Bat();
		
//		Gorilla actions
		gorilla1.throwSomething();
		gorilla1.throwSomething();
		gorilla1.throwSomething();
		gorilla1.eatBananas();
		gorilla1.eatBananas();
		gorilla1.climb();
		gorilla1.displayEnergy();
		
//		Bat.actions
		bat1.attackTown();
		bat1.attackTown();
		bat1.attackTown();
		bat1.eatHumans();
		bat1.eatHumans();
		bat1.fly();
		bat1.fly();
		bat1.displayEnergy();
	}
}
