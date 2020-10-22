package com.soul.java8.newinterface;

public class King implements Soldier, Warrior {

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		Warrior.super.attack();
		System.out.print("==== Then King attacks ===\n");
		printName();
	}
	public static void printName(){
		System.out.println(King.class.getCanonicalName());
		Soldier.printName();
	}
	public static void main(String args[]){
		Soldier s = new King();
		s.attack();
		Soldier s1 =new Soldier() {
		};
		s1.attack();
	}

}
