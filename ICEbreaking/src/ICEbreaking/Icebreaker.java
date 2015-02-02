package ICEbreaking;

import java.util.Set;

public class Icebreaker {

	public enum IcebreakerType {
		FRACTER, DECODER, KILLER
	}
	
	protected String name;
	protected int installCost;
	protected int strength;
	protected int pumpValue;
	protected int pumpCost;
	protected int breakCost;
	protected Set<IcebreakerType> breakerTypes;
	
	public Icebreaker(String name, int installCost, int strength, int pumpCost, int pumpValue, int breakCost, Set<IcebreakerType> breakerTypes) {
		this.name = name;
		this.installCost = installCost;
		this.strength = strength;
		this.pumpCost = pumpCost;
		this.pumpValue = pumpValue;
		this.breakCost = breakCost;
		this.breakerTypes = breakerTypes;
	}
		
	public String getName() {
		return name;
	}

	public int getInstallCost() {
		return installCost;
	}

	public int getStrength() {
		return strength;
	}

	public int getPumpValue() {
		return pumpValue;
	}

	public int getPumpCost() {
		return pumpCost;
	}
	
	public int getBreakCost() {
		return breakCost;
	}
	
	public Set<IcebreakerType> getBreakerTypes() {
		return breakerTypes;
	}
		
	public int pumpBreaker(int icestr) {
		int diff = icestr - this.strength;
		int pumps = (int) Math.ceil(diff / this.pumpValue);
		return pumps * this.pumpCost;
	}

	public int costToBreak(ICE ice) {
		return pumpBreaker(ice.getStrength()) + (ice.getSubs() * this.breakCost);
	}
}
