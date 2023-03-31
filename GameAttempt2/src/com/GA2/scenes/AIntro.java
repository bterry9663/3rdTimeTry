package com.GA2.scenes;

import java.util.Scanner;

import com.GA2.player.Player1;

public class AIntro {

	public void invitation(Player1 driver, Scanner in) {
		String go;
		System.out.println(" ***Hit ENTER to continue*** ");	
		go = in.nextLine();
		
		//System.out.println( "Hey " + driver.getName() + " this is invitation.");
		System.out.println(" GAME MASTER: \" Well " + driver.getName() + " \n "
				+ "I think you should meet the rest of the crew...");
		System.out.println(" Why don't you come out to the meet-up. ");	
		System.out.println(" Tomorrow, 7pm, at The Coffee Shop.\n"
				+ "I am sure you will get along with all the guys. Mwah ha ha...\" ");	  
		System.out.println(" \n \n \n ");
		
		
		
		
		System.out.println(" ***Hit ENTER to continue*** ");	
		go = in.nextLine();
		
	}//invitation brace
		
		
	

}
