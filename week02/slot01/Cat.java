package week02.slot01;

public class Cat {

	int moodLevel;
	int hungerLevel;
	public String name;
	
	public Cat(String catName, int catMood, int catHunger) {
		moodLevel = catMood;
		if(moodLevel < 0) {
			moodLevel = 0;
		}
		if(moodLevel > 100) {
			moodLevel = 100;
		}
		hungerLevel = catHunger;
		if(hungerLevel < 0) {
			hungerLevel = 0;
		}
		if(hungerLevel > 100) {
			hungerLevel = 100;
		}
		name = catName;
	}
	
	public String play(int minutes) {
		if(minutes < 0) {
			return name + " cannot go back in time.";
		}
		moodLevel = moodLevel + minutes;
		hungerLevel = hungerLevel - minutes;
		if(moodLevel > 100) {
			moodLevel = 100;
		}
		if(hungerLevel < 0) {
			hungerLevel = 0;
		}
		return name + " is playing. Mood increase, Hunger decrease.";
	}
	
//	public String feed() {
//		
//	}
//	
//	public String jealous() {
//		
//	}
	
}
