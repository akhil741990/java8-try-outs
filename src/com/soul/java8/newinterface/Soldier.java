package com.soul.java8.newinterface;

public interface Soldier {
	default void attack(){
		System.out.println("Soldier attacks");
	}
	public static void printName(){
		System.out.println(Soldier.class.getCanonicalName());
	}
}
