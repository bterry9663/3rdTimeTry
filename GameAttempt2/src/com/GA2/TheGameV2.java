package com.GA2;
	import java.util.ArrayList;
//import from other classes, 
import java.util.Scanner;
import com.GA2.player.Character;
import com.GA2.player.Player1;
import com.GA2.scenes.AIntro;
import com.GA2.scenes.BMeetUp;	
import com.GA2.scenes.CCarShow;
import com.GA2.scenes.DDragRace;
import com.GA2.scenes.CrashandBurn;
public class TheGameV2 {

public static void main(String[] args) {
	int prob;
	
	String enter;
	Scanner in = new Scanner (System.in);
	AIntro begin = new AIntro();
	BMeetUp meetUp = new BMeetUp();
	//CCarShow carShow = new CCarShow();
	//DDragRace dragRace = new DDragRace();
	Character character = new Character();
	CrashandBurn badLuck = new CrashandBurn();

	
	
	//character.characters.get();
	
	String player = character.welcome(in);
	//Player1 driver = character.startUp2(in);

	  ArrayList<Player1> characters = new ArrayList<Player1>();
		characters=character.startUp2(in);
	Player1 friend1 = characters.get(1);
	Player1 friend2 = characters.get(2);
	Player1 driver = characters.get(0);
	
	System.out.println(friend1.getName());
		begin.invitation(driver, in); // invitation from intro
		prob = meetUp.meetUp(driver, in);
			System.out.println( "after meetup method in main prob  " + prob );
	//TheGameV2 game = new TheGameV2();
			nextLevel(prob, driver ,friend1, friend2, in);
	
	
		System.out.println("The End!");
		
		
		
		//in.close();
	}//main
public static int nextLevel(int prob, Player1 driver, Player1 friend1, Player1 friend2, Scanner in) {
	
	//String enter;
	CCarShow carShow = new CCarShow();
	DDragRace dragRace = new DDragRace();
	CrashandBurn badLuck = new CrashandBurn();
	//Scanner in = new Scanner (System.in);
		
	if (prob < 5) {badLuck.crash(driver); return 0;}
	else if (prob > 40) {carShow.carshow(driver, friend1, friend2, in  );return prob;}
	else { dragRace.dragrace(driver, friend1, friend2, in );return prob;}
}//nextLevel

	
	
}//class
