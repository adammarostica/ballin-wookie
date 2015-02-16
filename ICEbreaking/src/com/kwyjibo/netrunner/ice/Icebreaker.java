package com.kwyjibo.netrunner.ice;

import java.util.Set;

public class Icebreaker {
	
	protected String name;
	protected int installCost;
	protected int strength;
	protected int pumpValue;
	protected int pumpCost;
	protected int breakCost;
	protected Set<IceType> breaks;
	
	public Icebreaker(String name, int installCost, int strength, int pumpCost, int pumpValue, int breakCost, Set<IceType> breaks) {
		this.name = name;
		this.installCost = installCost;
		this.strength = strength;
		this.pumpCost = pumpCost;
		this.pumpValue = pumpValue;
		this.breakCost = breakCost;
		this.breaks = breaks;
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
		
	public int pumpBreaker(int icestr) {
		int diff = icestr - this.strength;
		int pumps = (int) Math.ceil(diff / this.pumpValue);
		return pumps * this.pumpCost;
	}

	public int costToBreak(Ice ice) {
		if (!this.canBreak(ice)) {
			return Integer.MAX_VALUE;
		}
		return pumpBreaker(ice.getStrength()) + (ice.getSubs() * this.breakCost);
	}
	
	protected boolean canBreak(Ice ice) {
		for (IceType t : this.breaks) {
			if (ice.getIceTypes().contains(t)) {
				return true;
			}	
		}
		return false;
	}
}
