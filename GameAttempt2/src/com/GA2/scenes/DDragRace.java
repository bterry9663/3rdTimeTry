package com.GA2.scenes;
import java.util.Scanner;
import com.GA2.scenes.CrashandBurn;
import com.GA2.SceneRandomizer;
import com.GA2.player.Player1;
import java.util.ArrayList;
import com.GA2.player.Character;
public class DDragRace {

	
		CrashandBurn badLuck = new CrashandBurn();
		String choice;
		String go;
		int prob;
		
		
	SceneRandomizer ran1 = new SceneRandomizer();
	Character character = new Character();
	
	
public int dragrace(Player1 driver, Player1 friend1, Player1 friend2, Scanner in) {
			 ArrayList<Player1> characters = new ArrayList<Player1>();
		characters=character.startUp2(in);
		friend1 = characters.get(1);
		 friend2 = characters.get(2);
		 driver = characters.get(0);
			//System.out.println(" GAME MASTER: Well " + driver.getName() + " \n this should be fun, choose wisely...");
			//System.out.println(" \n \n \n ");
			
			System.out.println(" ***Hit ENTER to continue*** ");	
			go = in.nextLine();
			
			sceneD(driver, friend1, friend2);
			prob = choicesD(driver, in);
			//System.out.println( "after choices method prob " + prob );
			
			System.out.println(" ***Hit ENTER to continue*** ");	
			go = in.nextLine();
			
			
			return prob;
	}//dragrace brace
		
		public void sceneD(Player1 driver,Player1 friend1, Player1 friend2) {
			System.out.println("   \n "
					+ " After a few weeks of hanging out with the crew, \n "
					+ " they invite you to come out to MIDNIGHT MAYHEM \n "
					+ " They explain that the local drag strip allows any licensed driver \n"
					+ "to come out and run the track for only 10 bucks\n "
					+ " You agree to go this Friday night and meet up with the crew in the parking lot of the \n "
					+ "track, you pull up in your" + driver.getCar() + " and get in the long entrance line. \n "
					+ " the other local crew has challenged some of your friends to race for pinks. \n "
					+ " Jesse puts his dads Jetta up against a guy racing a Honda S2000. \n "
					+ "  When Jesse looses the race, he keeps driving and runs from the deal. \n "
					+ " you reluctantly agree to take his place in a rematch. You get in " + driver.getCar() + "  \n "
					+ "  and are matched up with another vehicle to race.  \n "
					+ " What do you do?");
					  			
			System.out.println(" choice setup: \n  "); 
			
			System.out.println(" A. You play the nice guy: \n"
					 + " you pull up to the line and look over to the other lane and see a \n"
					+ " orange 1970 Dodge Charger with a 01 on the door and some flag on top.");
			
			System.out.println(" B. You play the shy guy: \n");
			System.out.println(" you underplay your car and your skills and are matched up with some "
					+ " weird hippy van with green, blue and orange paint and mystery inc painted on the side.  \n"
					+ "  You look over and see a large great dane stairing back at you. It could be the fumes\n"
					+ " from the 100 octane fuel but you could have sworn you saw him say something...\n");
					
			
			System.out.println( " C. You play the tough guy:  " );
			System.out.println( " \n "
					+ "  Since you mouthed off to the crew, you are paired up with a ominus looking old Chevy Nova\n"
					+ "  it has flat black paint, a skull painted on the hood in white and a mean looking \n"
					+ " rubber duck mounted front and center in the hood. you look over and see a older guy at the wheel. \n"
					+ " he gives you the crazy eyes from behind his scarred face and you decide to focus on the track. \n"); 
				
			
			System.out.println(" \n  ");
			System.out.println(" MAKE A CHOICE \n ");	
			System.out.println(" A, B, or C ?: \n");
		  }	

		
		public int choicesD(Player1 driver, Scanner in) {
			//Scanner in = new Scanner(System.in);
				choice = in.nextLine();
				
				
			while(  !choice.equalsIgnoreCase("a")&& 
					!choice.equalsIgnoreCase("b")&&
					!choice.equalsIgnoreCase("c"))
						{ System.out.println("\"There’s a point at around 7,000 RPM where everything fades. \n"
								+ "	The machine becomes weightless. It just disappears. \n"
								+ "	All that’s left, a body moving through space and time.\" \n"
								+ " But you still need to try again\n");
						  System.out.println(" make a choice \n");	
						  System.out.println(" A, B, or C ?: \n");
				choice = in.nextLine();}
			
				 if (choice.equalsIgnoreCase("a")) { prob = mrNiceAD(driver); }
			else if (choice.equalsIgnoreCase("b")) { prob = mrShyBD(driver); }
			else if (choice.equalsIgnoreCase("c")) { prob = mrTuffCD(driver); }
				 
					//System.out.println( " choices method prob " + prob );

				 return prob;
		}	
		
		public  int mrNiceAD(Player1 driver) {
			CrashandBurn badLuck = new CrashandBurn();

			
			System.out.println("Nice prob");
			//System.out.println(ran1.random());
			//System.out.println(driver.getCharisma());
			prob = ran1.random() * driver.getCharisma();
			System.out.println(prob);
			
			
			if (prob <= 5) {badLuck.crash(driver);return 0;}
			else if (prob > 50) {System.out.println("  \n "
					
					+ "You tell yourself \" " + driver.getName() + ", you and " + driver.getCar()+ " got this.  \n"
					+ " The light goes green, you hit the gas and almost immediately you are flying at "+ driver.getTopspeed()+" down the track\n"
					+ " those Georgia boys don't know what hit'em...YeeHAW that! As you round the finishline you see cop cars.\n"
					+ " You watch in your review mirror as the orange car is pulled over by several police vehicles \n"
					+ "and the driver and passenger are cuffed and taken away. Their orange car is towed to the local impound.\n");}
			else {System.out.println(" \n"
					+ "You tell yourself \" " + driver.getName() + ", you and " + driver.getCar()+ " got this.  \n"
					+ " The light goes green, you hit the gas and almost immediately you are flying at "+ driver.getTopspeed()+" down the track\n"
					+ " however, try as you might, your engine just won't get up enough to nose ahead of the Charger. All of a sudden, you hear\n"
					+ " a melodic horn blast, then a YEE HAAWW, as you look over and see the orange beast mid air, jumping over the center barrier \n"
					+ " your life flashes before you and you wake up in a pond, which is weird because you never saw this pond right next to the track... \n");}
					
			return prob;
		}

		public  int mrShyBD(Player1 driver) {
			CrashandBurn badLuck = new CrashandBurn(); 

			
			System.out.println("Shy prob");
			//System.out.println(ran1.random());
			//System.out.println(driver.getWisdom());
			prob = ran1.random() * driver.getWisdom();
			System.out.println(prob);
				
			
			if (prob <= 5) {badLuck.crash(driver);return 0;}
			else if (prob > 50) {System.out.println("  \n"
					+ " You love dogs and you cannot tell if the dog has his seatbelt on. You lean forward "
					+ " to get a look at the driver and are bewildered to see not a hippy driving, but \n"
					+ " but a clean cut blond guy with a weird necktie, you give him the nod and pull up to the line"
					+ " you wait for the green light and hit the go pedal. \n"
					+ " and almost immediately you are flying at "+ driver.getTopspeed()+" down the track\"\n"
					+ " you smoke the van and wait at the finish line to shake hands and get a better look at the dog\n"
					+ " because, you love dogs. duh. While talking to the driver and petting the dog,\n"
					+ " you find out that they are detectives and are investigating claims of a ghost haunting the track\n"
					+ " it seems they have been on the case for a while and could use your help. You agree and eventually\n"
					+ " you and the Mystery inc crew become friends when you foil the would be ghost to find out that it was really\n"
					+ " old man Smithers in an attempt to drum up more action.\n");}
			else {System.out.println("   \n"
					+ " You think to yourself, that clunky van is no match for your "+driver.getCar()+ " \n"
					+ " but then as you stage on the line, you see the van pull up to the burn out box\n"
					+ " you witness in horror as this jalopy comes alive and does a monstorous FOUR WHEEL STANDING BURNOUT \n"
					+ "  You can't help but notice the huge plume of black soot bellowing from the exhaust pipe \n"
					+ " the driver looks over at you and yells \" SMOK'EM IF YOU GOT'EM!!!\" \n"
					+ " Before you know it, the light has gone green, but all you can see is black smoke."
					+ " you figure it will clear as you travel down the track, however, the thick soot, clogs your intake"
					+ "and your car bucks out of control as you hit the wall at the top of second gear, your oilpan cracks and "
					+ "spews oil all over the track causing a two hour clean-up. This earns you a crowd of BOOOOOs from the stands."
					+ "EVERYONE HATES YOU. And you have to get a Uber home.\n");}
					
			
			return prob;
		}
				
		public  int mrTuffCD(Player1 driver) {
			CrashandBurn badLuck = new CrashandBurn();

			
			System.out.println("Tuff prob");
			//System.out.println(ran1.random());
			//System.out.println(driver.getStrength());
			prob = ran1.random() * driver.getStrength();
			System.out.println(prob);

			if (prob <= 5) {badLuck.crash(driver); return 0;}
			else if (prob > 50) {System.out.println("  \n"
					+ "  You decide it is best not to engage with him as he is obviously not \"all there\".  \n"
					+ "  The light goes green, you hit the gas and fly at " + driver.getTopspeed()+" down the track  \n"
					+ "   you look over and to your surprise, this guy is neck and neck with you. Thats when you  \n"
					+ "  hit the NOS with a 200 shot. You hear your motor scream for mercy, warning lights are going off  \n"
					+ "\" on your dash, but you keep the pedal to the floor and shift into D2. \n"
					+ "\" you win by an inch. And you are ok with this, becuase you know it doesn't matter if you win \n"
					+ "by an inch or a mile, winning is winning! \n");}
			else {System.out.println("   \n"
					+ "  he hollars at you through the window \" This car is DEATH PROOF! Is YOURS? \" \n"
					+ "   he then laughs maniacly, refusing to look away from your direction.\n"
					+ "  He stairs at you, you see the green light and hit the gas, he hit the gas too, but keeps his eyes on you. \n"
					+ "  He is nose to nose with you, suddenly with a glint of \"coo coo\" in his eyes, he jerks the wheel \n"
					+ "  comes over into your lane, and lands ontop of you. The car bursts into flames and you read his name tag as he burns \n"
					+ "   \"STUNTMAN MIKE\" the car screeches to a hault, you scramble out the door and to the safety of the track\n"
					+ "  officials and tell them what you saw.  \n");}
			
			return prob;
			
		}
		


		
		
		
		
		
		
		
		
		
			
		
		
	
}
