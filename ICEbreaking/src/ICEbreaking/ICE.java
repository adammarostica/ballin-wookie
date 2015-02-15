package ICEbreaking;

import java.util.Set;

public class ICE {
	
	public enum IceType {
		BARRIER,
		CODE_GATE,
		SENTRY,
		DESTROYER,
		AP,
		MYTHIC,
		GRAIL
	}
	
	protected String name;
	protected int rezCost;
	protected int strength;
	protected int subs;
	protected Set<IceType> iceTypes;

	public ICE(String name, int rezCost, int strength, int subs, Set<IceType> iceTypes) {
		this.name = name;
		this.rezCost = rezCost;
		this.strength = strength;
		this.subs = subs;
		this.iceTypes = iceTypes;
	}

	@Override
	public String toString() {
		return this.name;
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
	
	public Set<IceType> getIceTypes() {
		return iceTypes;
	}
}
