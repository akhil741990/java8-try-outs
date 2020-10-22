package com.soul.java8.newinterface;

public interface Warrior {
	default void attack(){
		System.out.println("Warrior attacks");
	}
}
