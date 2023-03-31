package com.GA2.player;

import com.GA2.player.Player1;

import java.util.ArrayList;
import java.util.Scanner;

public class Character {
//AKA user service
	
	private Player1[] character;
	private int numCharacters;
	//public String wannaGame;
	public String name;
	public String go;
	public Character() {

		this.character = new Player1[10];
			this.character[ 0 ] = new Player1
				("Marvin", "space ship", 10, 10, 10, 300, " space ship ...", "backstory...etc...");
			this.character[ 1 ] = new Player1
				("Jim Douglas", "Herbie", 8, 5, 5, 115, "\'63 VW Bug ...", "backstory...etc...");
		
			this.character[ 2 ] = new Player1
				("Cole Trickle", "#46 City Chevrolet", 9, 4, 7, 200, "\'90 Chevy Lumina Stock Car ...", "backstory...etc...");
		
			this.character[ 3 ] = new Player1
				("Dr.Hudson", "The Fabulous Hudson Hornet", 6 , 9, 5 , 112, "\'51 Hudson Hornet ...", "backstory...etc...");

			this.character[ 4 ] = new Player1
				("Garth Algar", "Mirth Mobile", 7, 4 , 5, 101, "\'76 AMC Pacer ...", "backstory...etc...");

			this.character[ 5 ]  = new Player1 
				("JakeKesey", "The Wraith", 8, 5, 10, 195, "\'81 Dodge M4S ...", "backstory...etc...");

			this.character[ 6 ] = new Player1
				("Marty McFly", "THE DeLorean", 8, 5 , 7, 88, "\'81 DMC DeLorean Time Machine ...", "backstory...etc...");

			this.character[ 7 ]  = new Player1 
				("Memphis Raines", "Eleanor", 8 , 6 , 8 , 172, "\'67 Shelby GT500 Mustang ...", "backstory...etc...");
			this.character[ 8 ] = new Player1
				("TheStig", "GT2RS", 10, 10, 10, 211, "Porsche 911 GT2RS", "backstory...etc...");
			this.numCharacters = 9;
	}
	
	public String welcome(Scanner in) {
		System.out.println("GAME MASTER: What's your name? : " );
		name = in.nextLine();
		
		
		System.out.println("Ok, " + name + ", Do you want to play a game?  : (yes or no)" );
		String wannaGame = in.nextLine();
		
		while(!wannaGame.equalsIgnoreCase ("yes")&&
			  !wannaGame.equalsIgnoreCase ("no")) {System.out.println("Rear View Mirrors, \n We'll getcha some, and I'll teacha,\n try again:");}
		
		
		if (wannaGame.equalsIgnoreCase("yes")) {System.out.println("Sweet, Let's ride!"); }//startUp2(in);
		else  {System.out.println("That's too bad, buckle up, your playing anyways");  }//startUp2(in);
		return name;
}
	
	public ArrayList<Player1> startUp2(Scanner in) {
				
			System.out.println("  Welcome to Fast and Famous \n ");
			System.out.println(" a game for car guys (and gals too). \n ");
			System.out.println(" Play on Playa \n ");

			//boolean cont = false;
			Player1 driver = null;
			Player1 friend1 = null;
			Player1 friend2 = null;
			
			System.out.println(" Pick your driver: \n \n");
			System.out.println(" 1.) Jim Douglas" );
			System.out.println(" 2.) Cole Trickle");
			System.out.println(" 3.) Doc Hudson");
			System.out.println(" 4.) Garth Algar");
			System.out.println(" 5.) Jake Kesey");
			System.out.println(" 6.) Marty McFly");
			System.out.println(" 7.) Memphis Raines");
			
			int choice = getIntFromUser(in); 
		
			//choice = Integer.parseInt(in.nextLine().trim());
			
			
			
		
			
			while(!(choice == 0) &&
					!(choice == 1) &&
					!(choice == 2) &&
					!(choice == 3) &&
					!(choice == 4) &&
					!(choice == 5) &&
					!(choice == 6) &&
					!(choice == 7) &&
					!(choice == 8) 	)				
					 					{System.out.println("Find another way home pizza boy... try again.");
					 					 System.out.println(" Pick a number of the driver above:  "); 
					 					 choice = getIntFromUser(in); }
			 
			driver = character[choice]; 
			System.out.println("Ok, " + driver.getName() + " Let's ride!");
			
			System.out.println(" Here are your driver stats: \n \n");
			stats(driver, in);
				
		
		int crew1;		
		if (choice == 0) { crew1 = ++choice;}
		else if (choice == 8) { crew1 = --choice;}
		else { crew1 = (++choice);}
		
		friend1 = character[crew1];
		//System.out.println(friend1.getName() + "= friend1");
	
			
		  int crew2;
		  if (choice == 0) { crew2 = 2 ;} 
		  else if (choice == 1) { crew2 = 3 ;} 
		  else if (choice == 2) { crew2 = 4;} 
		  else if (choice == 3) { crew2 = 5;} 
		  else if (choice == 4) { crew2 = 6;} 
		  else if (choice == 5) { crew2 = 7;} 
		  else if (choice == 6) { crew2 = 8;} 
		  else if (choice == 7) { crew2 = 0;} 
		  else   { crew2 = 1;} 
		
		  
		  friend2 = character[crew2]; 
		  //System.out.println(friend2.getName() +"= friend2");
		  ArrayList<Player1> characters107 = new ArrayList<>();
			characters107.add(driver);
			characters107.add(friend1);
			characters107.add(friend2);
			
			
			return characters107;
		}//startup2
	
	
	private static int getIntFromUser(Scanner in) {
	    int choiceInt = 0;
	    while (true) {try {System.out.println("Enter an integer: ");choiceInt = in.nextInt();break;}
	     catch (Exception ex) {	in.next();System.out.println(" try again ");
	     }//catch action brace	
	     }//try brace
	    return choiceInt;						
	    }//getIntFromUser brace						
	    						
	        
	public void stats(Player1 driver, Scanner in ) {
		//String go;
		
		System.out.println("NAME   		" + driver.getName());
		System.out.println("CAR   		" + driver.getCar());
		System.out.println("CHARISMA  	" + driver.getCharisma());
		System.out.println("WISDOM  	" + driver.getWisdom());
		System.out.println("STRENGTH  	" + driver.getStrength());
		System.out.println("TOPSPEED	" + driver.getTopspeed());
		System.out.println("DESCRIPTION	" + driver.getDescription());
		
		//System.out.println("\n \n  ***Hit ENTER to continue*** \n \n ");
		
		go = in.nextLine();
		
	}
	
	
	
	
		
	}//class brace
	
	
	
	

