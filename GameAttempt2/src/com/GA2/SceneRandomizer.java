package com.GA2;

import java.util.Random;
import java.util.Scanner;
import com.GA2.player.Player1;
import com.GA2.scenes.AIntro;
import com.GA2.player.Character;


//import java.util.Scanner;

public class SceneRandomizer {
	
		public  int chances(Player1 driver) {
			//returns a random whole number based on characteristics of driver
			Scanner in = new Scanner (System.in);
			AIntro begin = new AIntro();
			Character character = new Character();
			String player = character.welcome(in);
			Random rand = new Random();
			int rando = rand.nextInt((10-0)+ 0 );
			int randoWhole = (int) (rando * player.length());
			int chance = (driver.getCharisma() * driver.getWisdom() * driver.getStrength() * randoWhole) / 4 ;
			
			//System.out.println("***CHANCE***");
			//System.out.println(chance);
			return chance;
		
		}
		public  int random() {
//should return a random whole number between 0-10
			Random rand = new Random();
			int rando = rand.nextInt((10-0)+ 0 );
			int randoWhole = (rando );
			//System.out.println("***randoWhole***");
			//System.out.println(randoWhole);
			return randoWhole;
		}

		
		
		
	
	
		
	


}//class brace
