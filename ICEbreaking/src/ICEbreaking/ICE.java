package ICEbreaking;

public class ICE {
	
	String name;
	int rezCost;
	int strength;
	int subs;

	public ICE(String name, int rezCost, int strength, int subs) {
		this.name = name;
		this.rezCost = rezCost;
		this.strength = strength;
		this.subs = subs;
	}

	public String getName() {
		return name;
	}

	public int getRezCost() {
		return rezCost;
	}

	public int getStrength() {
		return strength;
	}

	public int getSubs() {
		return subs;
	}
}
