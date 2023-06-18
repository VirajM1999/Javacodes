package com.app.fruits;

public class Mango extends Fruit {

	public Mango( String color, double weight, String name, boolean fresh ) {
		super(color, weight, name,fresh);
	}
	
	public String taste() {
		return "sweet";
		
	}
	
	public void pulp()
       {
		System.out.println( "Mango creating pulp");
		}
}
