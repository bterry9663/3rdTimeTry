package com.GA2.player;

public class Player1 {
	//AKA Buyer
	//Character properties on a (int)scale of 1 to 10
	
		private  String name;
		private  String car;
		private  int charisma; //determines like-ability, or being able to get others to do what you want
		private  int wisdom; //self explanatory, determines probability of wise choices & outcome
		private  int strength; //self explanatory, determines probability of physical moves
		private  int topspeed; //based on vehicle top speed IRL as determined by google.com
		private  String description;
		private  String backStory;
		
		
		//this would be my constructor 
		public Player1(String name, String car, int charisma, int wisdom, int strength, int topspeed, String description,String backStory) 
		{
			this.name = name;
			this.car = car;
			this.charisma = charisma;
			this.wisdom = wisdom;
			this.strength = strength;
			this.topspeed = topspeed;
			this.description = description;
			this.backStory = backStory;
		}

		public void stats() {
			System.out.println("NAME   " + name);
			System.out.println("CAR   " + car);
			System.out.println("CHARISMA   " + charisma);
			System.out.println("WISDOM   " + wisdom);
			System.out.println("STRENGTH   " + strength);
			System.out.println("TOPSPEED   " + topspeed);
			System.out.println("DESCRIPTION   " + description);
			System.out.println(backStory);
			
		}
		

		
		
		
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
			
		public String getCar() {
			return this.car;
		}
		public void setCar(String car) {
			this.car = car;
		}
		
		public int getCharisma() {
			return this.charisma;
		}
		public void setCharisma(int charisma) {
			this.charisma = charisma;
		}
		
		public int getWisdom() {
			return this.wisdom;
		}
		public void setWisdom(int wisdom) {
			this.wisdom = wisdom;
		}
		
		public int getStrength() {
			return this.strength;
		}
		public void setStrength(int strength) {
			this.strength = strength;
		}
		
		public int getTopspeed() {
			return topspeed;
		}
		public void setTopspeed(int topspeed) {
			this.topspeed = topspeed;
		}
		
		public String getDescription() {
			return this.description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		
		public String getBackStory() {
			return this.backStory;
		}
		public void setBackStory(String backStory) {
			this.backStory = backStory;
		}

		
		
		
		
		
		
	}

