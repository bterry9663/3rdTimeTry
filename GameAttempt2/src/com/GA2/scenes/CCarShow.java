package com.GA2.scenes;
import com.GA2.SceneRandomizer;
import com.GA2.player.Character;
import com.GA2.player.Player1;
import java.util.ArrayList;
import java.util.Scanner;
import com.GA2.scenes.CrashandBurn;
public class CCarShow {

	
		CrashandBurn badLuck = new CrashandBurn();
		String choice;
		String go;
		int prob;
		SceneRandomizer ran1 = new SceneRandomizer();

		Character character = new Character();

		
		/*
		 * SceneRandomizer ran1 = new SceneRandomizer(); Character character = new
		 * Character(); ArrayList<Player1> characters = new ArrayList<Player1>();
		 * characters=character.startUp2(in); Player1 friend1 = characters.get(1);
		 * Player1 friend2 = characters.get(2); Player1 driver = characters.get(0);
		 */
	 
public int carshow(Player1 driver,Player1 friend1, Player1 friend2, Scanner in) {
			ArrayList<Player1> characters = new ArrayList<Player1>();
				characters=character.startUp2(in);
			friend1 = characters.get(1);
	  		friend2 = characters.get(2);
	  		driver = characters.get(0);
			//System.out.println(" GAME MASTER: Well " + driver.getName() + " \n this should be fun, choose wisely...");
			//System.out.println(" \n \n \n ");
			
			System.out.println(" ***Hit ENTER to continue*** ");	
			go = in.nextLine();
			
			sceneC(driver, friend1, friend2);
			prob = choicesC(driver, in);
			//System.out.println( "after choices method prob " + prob );
			
			System.out.println(" ***Hit ENTER to continue*** ");	
			go = in.nextLine();
			
			
			return prob;
	}//carshow brace
		
		public void sceneC(Player1 driver, Player1 friend1, Player1 friend2) {
			System.out.println("  THE CAR SHOW \n "
					+ " A few weeks after the meet up, you are washing the " +driver.getDescription()+ " \n"
							+ " when the phone rings and " + friend1.getName() + " tells you \n "
					+ " about the carshow coming up this weekend.\n "
					+ " He asks if you want to join the groupdrive to the carshow, since it is out of town. \n "
					+ " you respond with \" Sure, man, that sounds cool.\" You make plans to drive down to  \n "
					+ friend2.getName() + "\'s house and then drive over to the group drive meetup spot.  \n "
					+ " The drive is fun and fast paced and you are enjoying being in the leading pack \n "
					+ " Entering the car show grounds " + friend2.getName() + " parks first, and you park next to him. \n "
					+ friend1.getName() +" wants to hit up the swap meet to look for a tail light for his " + friend1.getCar()+ " \n "
					+ " you decide to tag along and see if you can find any parts for your " + driver.getDescription() + "  \n "
					+ "  As you walk through the swap meet, you:  \n ");
				
			
			System.out.println(" A. You play the nice guy: \n"
					+ " You walk up to a vendor that seems to have a few parts for your "+ driver.getDescription()+" you pick up an engine part and ask \n"
					+ " \"Hey buddy, how much are you asking for this?\" " + friend2.getName() + " walks over and tries to help you haggle.  \n");

			
			System.out.println(" B. You play the shy guy: \n");
			System.out.println(" You are approached by someone with a car show official pass, \n"
					+ " He says \" Hey, I saw you pull up in your "+ driver.getDescription()+". You should enter the show and shine.   \n"
					+ " I think you would have a good chance at taking home a win. \"NOPE\" you think to yourself, but "+ friend1.getName() +" walks up behind \n"
					+ " you and chimes in, \" yeah man, you really should. \" You think about it and mutter \" eh, maybe, we'll see  \n");
				
			
			System.out.println( " C. You play the tough guy:  " );
			System.out.println( " You are on a mission, you really want a new turbo kit for your " + driver.getCar() + "\n "
					+ " you scour the swap meet and come across a older gentleman in overalls and a plaid shirt and straw hat. \n"
					+ " The polished garret turbo catches your eye and you strike up a conversation with the gentleman. \n");
				
			
			System.out.println(" \n  ");
			System.out.println(" MAKE A CHOICE \n ");	
			System.out.println(" A, B, or C ?: \n");
		  }	

		
		
		
		
		
		
		
		public int choicesC(Player1 driver, Scanner in) {
			//Scanner in = new Scanner(System.in);
				choice = in.nextLine();
				
				
			while(  !choice.equalsIgnoreCase("a")&& 
					!choice.equalsIgnoreCase("b")&&
					!choice.equalsIgnoreCase("c"))
						{ System.out.println("\"Roads? Where we're going, we don't need roads...\n but you will need to try again.\n");
						 
						
						
						System.out.println(" make a choice \n");	
						  System.out.println(" A, B, or C ?: \n");
				choice = in.nextLine();}
			
				 if (choice.equalsIgnoreCase("a")) { prob = mrNiceAC(driver); }
			else if (choice.equalsIgnoreCase("b")) { prob = mrShyBC(driver); }
			else if (choice.equalsIgnoreCase("c")) { prob = mrTuffCC(driver); }
				 
					//System.out.println( " choices method prob " + prob );

				 return prob;
		}	
		
		public  int mrNiceAC(Player1 driver) {
			CrashandBurn badLuck = new CrashandBurn();

			
			System.out.println("Nice prob");
			//System.out.println(ran1.random());
			//System.out.println(driver.getCharisma());
			prob = ran1.random() * driver.getCharisma();
			System.out.println(prob);
						
			if (prob <= 5) {badLuck.crash(driver);return 0;}
			else if (prob > 40) {System.out.println("  \n "
					+ " The guy says \" eh, gimme a 20, and it's yours, it's already getting hot out here and I am ready to go home.\" \n"
					+ " Knowing that this part is one that you need, and one that would cost $175 new, you decide to take the deal. \n"
					+ " As you are happily walking back to your car, one of the car show judges, walks up to you and hands you a plaque for \n"
					+ " \"Best Parking Lot Wheels\" and says \"CONGRATS, you have the cleanest wheels in the parking lot of the car show\" \n"
					+ "  \"SAWEEEET!!! TODAY IS A WIN FOR " + driver.getName() +". \n");}
			else {System.out.println(" \n"
					+ "  The guy says \" eh, gimme a 100 bucks, and it's yours, it's already getting hot out here and I am ready to go home.\"\n"
					+ "\" NOICE\" as you go happily home with your new $100 turbo kit, you are quite pleased with yourself... until  \n"
					+ " you installed the kit, and only after the big bang, realized it was a fake from ebay motors and it has just blown up \n"
					+ " and murdered your engine, your intake manifold blows through the hood and comes back and almost hits you in the head. \n");}
			return prob;
		}

		public  int mrShyBC(Player1 driver) {
			CrashandBurn badLuck = new CrashandBurn(); 

			
			System.out.println("Shy prob");
			//System.out.println(ran1.random());
			//System.out.println(driver.getWisdom());
			prob = ran1.random() * driver.getWisdom();
			System.out.println(prob);
				
			
			if (prob <= 5) {badLuck.crash(driver);return 0;}
			else if (prob > 40) {System.out.println("  \n"
					+ " You think to yourself, \"you know, it is time for me to try to step out of my comfort zone,\n"
					+ " I think I will take them up on the offer to enter the show.\" \n"
					+ " You run back and find the official and get the entrance pass, run back get the car and park it\n"
					+ " in the show. Sure enough, you win first prize and take home $1000 in AutoZone giftcards. \n");}
			else {System.out.println("   \n"
					+ " You think to yourself, \"you know, it is time for me to try to step out of my comfort zone,\n"
					+ " I think I will take them up on the offer to enter the show.\" \n"
					+ " As you are pulling up to the show entrance, you realize you have dropped your pass outside the car where it was parked. \n"
					+ " You pull up, explain to the guard the situation, and he says, go ahead and pull through, then run back and get the pass.\n"
					+ " You do as he suggests, and run back to the spot you were previously in, however, you cannot find the pass. \n"
					+ " Frustrated and sweaty, you run back to the guard, only to realize, they must have switched out, and the new guard does not know you.\n"
					+ " You have unfortunately, left your wallet and phone in the car. You are now locked out of the show, with no phone, no wallet and no friends.\n"
					+ " You plead with the guard to let you in, but he calls the cops and they take you away.\n"
					+ " You are forced to call your wife from jail and ask her to come pick you up, and bring the other set of car keys. Not a fun night!\n");}
			
			return prob;
		}
				
		public  int mrTuffCC(Player1 driver) {
			CrashandBurn badLuck = new CrashandBurn();

			
			System.out.println("Tuff prob");
			//System.out.println(ran1.random());
			//System.out.println(driver.getStrength());
			prob = ran1.random() * driver.getStrength();
			System.out.println(prob);

			if (prob <= 5) {badLuck.crash(driver); return 0;}
			else if (prob > 40) {System.out.println("  \n"
					+ " As the conversation progresses, you find out that he is a HUGE Volkswage enthusiast and has rebuilt is minibus,   \n"
					+ "  and is only missing the front emblem, which is near impossible to find.  \n"
					+ "  you happen to have just the same emblem in the trunk of your car. You offer to trade the turbo for the emblem.  \n"
					+ "  The old man happlily accepts the deal. You both walk away thinking that you got the best deal.  \n");}
				
			else {System.out.println("   \n"
					+ " As the conversation progresses, you find out that he is a HUGE Volkswage enthusiast and has rebuilt is minibus,   \n"
					+ "  and is only missing the front emblem, which is near impossible to find.  \n"
					+ "  you happen to have just the same emblem in the trunk of your car. You offer to trade the turbo for the emblem.  \n"
					+ "  The old man happlily accepts the deal. You both walk away thinking that you got the best deal.  \n"
					+ "  unfortunately, you failed to realize that the old man was suffering from dementia and he happened to be \n. "
					+ "  the grandfather of the president of the local Hell's Angels chapter. \n"
					+ "  You happily trot back to the car with your new turbo kit blissfuly ignorant of your mistake. \n"
					+ "  you go back to the car show to enjoy the rest of the day with your friends. \n"
					+ "  At the end of the day, upon walking back to the car, you see smoke coming from the direction where you parked. \n"
					+ "  A group of \'HA\' have surrounded your " + driver.getDescription() + " and they  \n"
					+ "  thought it was fair to use your car as a bonfire in retaliation for taking advantage of their patriarc."
					+ "  Your friends have deserted you and left you to fend for yourself. \n");}
			
			return prob;
			
		}
		
		
}
