package com.app.tester;
import com.app.fruits.*;
import java.util.Scanner;

import com.app.fruits.Fruit;


public class FruitBasket {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter number of fruits to be entered");
	int size = sc.nextInt();
	int counter =0;
	Fruit [] fruits = new Fruit [size];
	boolean exit = false;
	
	
	while(!exit) {
		System.out.println("Enter proper options");
		System.out.println("1. Add Mango ");
		System.out.println("2. Add Orange ");
		System.out.println("3. Add Apple ");
		System.out.println("4. Display all fruits ");
		System.out.println("5. Display details of fresh fruits ");
		System.out.println("6. Stale fruits ");
		System.out.println("7. Mark all sour fruits as stale ");
		System.out.println("8. Get fruit functionality ");
		System.out.println("0. Exit ");
		int a = sc.nextInt();
		
		switch(a) {
		case 1 : if(counter < size) {
			fruits[counter] = new Mango ("Red", 0.25, "Mango", true);
			counter++;	
				}
			else
				System.out.println("Basket Full");
			break;
		
		case 2 : if(counter < size) {
				fruits[counter] = new Orange ("Orange", 0.20, "Orange", true);
				counter++;
				}
				else
						System.out.println("Basket Full");
				break;
				
		case 3 :  if(counter < size) {
				fruits[counter] = new Apple ("Red", 0.30, "Apple", true);
				counter++;
				}
				else
						System.out.println("Basket Full");
				break;
		
		case 4 :
			for( Fruit i :  fruits )
			{
				if (i != null)
				{
				System.out.println(i.getName());
				}
				}
			break;
			
		case 5 : System.out.println("Display basket");
			for( Fruit i :  fruits )
			{
				if (i != null)
				{
					System.out.println(i);
				}
				}
			break;
			
		case 6 : System.out.println("Enter the fruit index to mark as stale");
			
			int j = sc.nextInt();
			Fruit f= fruits[j];
			if (j <= counter) {
				f.setFresh(false);
			}else
				System.out.println("Index out of range");
			break;
			
		case 7 : 
				for( Fruit i : fruits) {
					if(i.taste().contains("sour")){
					i.setFresh(false);
				}
				}
			break;
			
		case 8 : for(Fruit i: fruits) 
			if( i instanceof Apple) {
			((Apple)i).jam();
			}
			else if( i instanceof Mango) {
				((Mango)i).pulp();
			}
			else if( i instanceof Orange) {
				((Orange)i).juice();
			}
		break;
		
		case 0 : exit = true;
	}
		
}
}
}