package com.GA2.scenes;
import com.GA2.SceneRandomizer;
import java.util.Scanner;
import com.GA2.player.Player1;



public class BMeetUp {
	CrashandBurn badLuck = new CrashandBurn();
	String choice;
	String go;
	int prob;
	
	
SceneRandomizer ran1 = new SceneRandomizer();
	
	public int meetUp(Player1 driver, Scanner in) {
		
		System.out.println(" GAME MASTER: Well " + driver.getName() + " \n"
				+ "this should be fun, choose wisely...");
		System.out.println(" \n \n \n ");
		
		System.out.println(" ***Hit ENTER to continue*** ");	
		go = in.nextLine();
		
		scene(driver);
		prob = choices(driver, in);
		System.out.println( "after choices method prob " + prob );
		
		System.out.println(" ***Hit ENTER to continue*** ");	
		go = in.nextLine();
		
		
		return prob;
}//meetUp brace
	
	public void scene(Player1 driver) {
		System.out.println(" you drive up to the little coffee shop \n "
				+ "where you see a group of modified cars parked in the parking lot. \n "
				+ "Some of the cars have their hoods up with a group of people gathered round, \n "
				+ "others have the trunk open with people gathered round, \n "
				+ "you hear the combination of revving engines and the thumping bass of stereo systems.  \n "
				+ "you pull your " + driver.getCar() + " up and park in a parking spot \n "
				+ " a few spots down from the last one in the line of cars. \n "
				+ " You start to get nervous as you realize everyone has \n "
				+ " stopped what they were doing and all eyes are  \n "
				+ "now on you and " + driver.getCar() + " . You take a deep breath, and tell yourself, \n "
				+ "  This could be good, you are new in town and need to make some friends.  \n "
				+ "As you reach to turn off the engine, you see a few guys walking over to you.  \n "
				+ " \" Well here goes nothing.\"   \n  ");  
		
		System.out.println(" As the guys approach your car, you step out and greet them: \n  "); 
		
		System.out.println(" A. You play the nice guy: \n"
				+ " \"Hey fellas, I’m new in town and a co-worker suggested I check out this car meet up. \n"
				+ " You guys have some nice rides. I’m " + driver.getName() + " .  \n"
				+ "You guys mind if I hang out for a bit?\" \n"); 
		
		System.out.println(" B. You play the shy guy: \n");
		System.out.println(" You notice that one of the guys is rather large and has tattoos \n"
				+ " up and down both arms, he looks rough, \n"
				+ "\"NOPE\" you tell yourself, maybe next time, \n"
				+ " you slide back into your seat and go to crank the engine. \n"
				+ " You are intimidated by both the size of the big guy and the level of their cars. \n"
				+ " You think to yourself, they obviously know a lot more than me \n"
				+ " and they don’t exactly look friendly and inviting. \n" );
		
		System.out.println( " C. You play the tough guy:  " );
		
		System.out.println( " You put on your best poker face,\n "
				+ " clear your throat and in a calm low voice, you give them a \n"
				+ " “What’s up?” and a head nod. \n"
				+ "\" You guys know where the races are tonight? \n"
				+ " I heard there is someone in this town that can give me a challenge. \n"
				+ " Any of you race or you guys just driving show queens? \" \n" ); 
		System.out.println(" \n  ");
		System.out.println(" MAKE A CHOICE \n ");	
		System.out.println(" A, B, or C ?: \n");
	  }	

	public int choices(Player1 driver, Scanner in) {
		//Scanner in = new Scanner(System.in);
			choice = in.nextLine();
			
			
		while(  !choice.equalsIgnoreCase("a")&& 
				!choice.equalsIgnoreCase("b")&&
				!choice.equalsIgnoreCase("c"))
					{ System.out.println("\"He did WHAT in his cup?\"... try again.\n");
					  System.out.println(" make a choice \n");	
					  System.out.println(" A, B, or C ?: \n");
			choice = in.nextLine();}
		
			 if (choice.equalsIgnoreCase("a")) { prob = mrNiceA(driver); }
		else if (choice.equalsIgnoreCase("b")) { prob = mrShyB(driver); }
		else if (choice.equalsIgnoreCase("c")) { prob = mrTuffC(driver); }
			 
				System.out.println( " choices method prob " + prob );

			 return prob;
	}	
	
	public  int mrNiceA(Player1 driver) {
		CrashandBurn badLuck = new CrashandBurn();

		
		System.out.println("Nice prob");
		//System.out.println(ran1.random());
		//System.out.println(driver.getCharisma());
		prob = ran1.random() * driver.getCharisma();
		System.out.println(prob);
		
		
		if (prob <= 5) {badLuck.crash(driver);return 0;}
		else if (prob > 30) {System.out.println(" You notice the scowl on many of their faces, turn friendly \n "
				+ "and they motion you to come over. As you walk up, you look over at the row of cars,  \n"
				+ "as you pass them, you begin to notice some of the detail workmanship.  \n"
				+ "you walk up to the group and offer your hand, hey, you guys got some nice cars.  \n"
				+ "One of the bigger guys in the group reaches out and gives you a hardy handshake,  \n"
				+ "\"Welcome to town, and welcome to the meet up, glad you came out, your ride looks pretty clean too. \"  \n");}
		else {System.out.println(" as the group walks up to you and your car, they begin to surround you. One little guy steps up from the circle, \n"
				+ "and gives some weird squirelly face and asks \"What do you want? Huh? you a cop? You got beef with us?\" You throw your hands up and take a step back,  \n"
				+ "\" I was just trying to find a group of car guys to hang out with, I don't mean any trouble man.\"  \n"
				+ "It is tense for a minute, then you start to see various scowls turn to smirks, you nervously laugh,  \n"
				+ "hopeing they are just messing around. \" Nah man we are just kidding, you scared? ha ha ha ... \n"
				+ " Another of the guys offers \" Hey man, feel free to hangout and talk cars, go get a coffee and we will introduce you to everybody when you get back.\"   \n");}
		return prob;
	}

	public  int mrShyB(Player1 driver) {
		CrashandBurn badLuck = new CrashandBurn(); 

		
		System.out.println("Shy prob");
		//System.out.println(ran1.random());
		//System.out.println(driver.getWisdom());
		prob = ran1.random() * driver.getWisdom();
		System.out.println(prob);
			
		
		if (prob <= 5) {badLuck.crash(driver);return 0;}
		else if (prob > 30) {System.out.println(" as you go to pull out of the parking spot, \n"
				+ "you realize that now is the time. You turn the car off, step out and offer a friendly \n"
				+ "hey how goes it. Their stern demenor turns friendly and they wave at you to come over. \n"
				+ "You walk over and they compliment your choice of ride.\n"
				+ "you realize that they were just trying to figure out who you were \n"
				+ "because they did not recognize you. The big guy is actually really nice and welcomes \n"
				+ "you to town and offers to buy you a coffee. \n");}
		else {System.out.println("  as you go to pull out of the parking spot, you stall out, \n"
				+ "and the car clunks and jerks to a stop.\n"
				+ "Now you really have everyone's attention. \n"
				+ "You get out and pop the hood and start looking at the engine.\n"
				+ " A group of those rough looking guys \n"
				+ "walks over and asks if you are good, you mutter a yeah, \n"
				+ "I just got through rebuilding the motor and tranny and still adjusting the shift linkage. \n"
				+ "several of them nod in acknowledgement and a few of them ask if you need any help.\n");}
		
		return prob;
	}
			
	public  int mrTuffC(Player1 driver) {
		CrashandBurn badLuck = new CrashandBurn();

		
		System.out.println("Tuff prob");
		//System.out.println(ran1.random());
		//System.out.println(driver.getStrength());
		prob = ran1.random() * driver.getStrength();
		System.out.println(prob);

		if (prob <= 5) {badLuck.crash(driver); return 0;}
		else if (prob > 30) {System.out.println(" You look out and see serious faces mixed in with bewilderment. A few ignore you and \n"
				+ "continue their conversation, several guys walk over to you, you give them another nod, as they walk around your car \n"
				+ "looking to see if you are serious. As they gather around the front, waiting to see if you are going to pop the hood, \n"
				+ " one of them says, \" Let's see what you got.\" as you pop the hood, you see them nod in approval. Ok, is this yours he asks \n"
				+ " you quickly return with \" Well, I am standing next to it. \" They all chuckle, He replies with  \n"
				+ "\" It's not how you stand by your car, it's how you race your car. We will see what you got Friday night... \n"
				+ "If you show up at the track.\"  \n");}
		else {System.out.println("  You immediately realize the error of your ways and begin to contemplate your life choices \n"
				+ "as you witness every member of the group pull out a weapon as if they were on the scene of West Side Story \n. "
				+ " you throw your hands up and flash your best non confrontational smile in hopes they will believe you  \n"
				+ "were just kidding. As they aproach you, several of them with guns, you contemplate running. \n"
				+ " you say a quick prayer to get out of this situation. One of the guys steps up and presses  \n"
				+ "the muzzle of his gun to your temple, \" Say you're sorry\" is all he says, you quickly apologize profusely.  \n"
				+ " He pulls the trigger and you feel something cold and wet run down your face. You open your eyes to realize everyone  \n"
				+ "is bent over laughing as he continues squirting his water gun at you with a big smile on his face.\n");}
		
		return prob;
		
	}
	
	
}
