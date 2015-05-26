package com.kwyjibo.netrunner.ice;

import java.util.Set;

public class Icebreaker {
	
	/* Initializes the various features of an Icebreaker.
	 * Set<IceType> refers to the class IceType to declare the
	 * which Ice types an Icebreaker can break. */
	protected String name;
	protected int installCost;
	protected int strength;
	protected int pumpCost;
	protected int pumpValue;
	protected int breakCost;
	protected int breakValue;
	protected boolean fixedStr;
	protected Set<IceType> breakerTypes;
	
	/*
	 * Initializes standard Icebreaker (8 params)
	 */
	public Icebreaker(String name, int installCost, int strength, int pumpCost, int pumpValue, int breakCost, int breakValue, Set<IceType> breakerTypes) {
		this.name = name;
		this.installCost = installCost;
		this.strength = strength;
		this.pumpCost = pumpCost;
		this.pumpValue = pumpValue;
		this.breakCost = breakCost;
		this.breakValue = breakValue;
		this.breakerTypes = breakerTypes;
	}	
	/*
	 * Initializes fixed strength icebreakers (7 params)
	 */
	public Icebreaker(String name, int installCost, int strength, int breakCost, int breakValue, boolean fixedStr, Set<IceType> breakerTypes) {
		this.name = name;
		this.installCost = installCost;
		this.strength = strength;
		this.breakCost = breakCost;
		this.breakValue = breakValue;
		this.fixedStr = fixedStr;
		this.breakerTypes = breakerTypes;
	}
	
	// Allows code to easily return the Icebreaker's name.
	public String toString() {
		return name;
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
	
	public int getBreakValue() {
		return breakValue;
	}
	
	public boolean getFixedStr() {
		return fixedStr;
	}
	
	public Set<IceType> getBreakerTypes() {
		return breakerTypes;
	}
	
	/* Determines the number of credits required to pump
	 * the Icebreaker to match/exceed an Ice's strength.
	 * @params Integer equal to Ice's strength */
	public int pumpBreaker(int icestr) {		
			
		if (this.strength >= icestr) {
			return 0;
		}
		
		int diff = icestr - this.strength;
		int pumps = (int) Math.ceil(diff / this.pumpValue);
		return pumps * this.pumpCost;
	}
	
	/*
	 * Determines the number of credits required to break
	 * all subroutines on a given piece of Ice. Does not
	 * take strength into account (assumes strength is sufficient).
	 * @params Integer equal to number of Ice's subroutines
	 */
	public int breakAllSubs(int numSubs) {
		
		int numBreaks = 0;
		
		while (numSubs > 0) {
		  numBreaks++;
		  numSubs -= this.breakValue;
		}
		
		return numBreaks * breakCost;
	}

	/* Uses pumpBreaker() to determine the total number of
	 * credits (pump + break subs) to completely break a piece
	 * of Ice. Returns MAX_VALUE if the Icebreaker and Ice
	 * do not share an IceType.
	 * @params An Ice object */
	public int costToBreak(Ice ice) {
		
		if (this.canBreak(ice)) {
			return pumpBreaker(ice.getStrength()) + breakAllSubs(ice.getSubs());
		}
		else {
			return Integer.MAX_VALUE;
		}
		
	}
	
	/* Returns true if the Icebreaker and Ice share an IceType.
	 * @params An Ice object. */
	protected boolean canBreak(Ice ice) {
		
		if (this.fixedStr && this.strength < ice.getStrength()) {
			return false;
		}
		
		if (breakerTypes.contains(IceType.AI)) {
		  return true;
		}
				
		for (IceType t : this.breakerTypes) {
			if (ice.getIceTypes().contains(t)) {
				return true;
			}	
		}
		return false;
	}
}
