package com.kwyjibo.netrunner.ice;

import java.util.Set;

public class Ice {
	
	// Initializes the various features of Ice.
	// Set<IceType> refers to the class IceType to declare the Ice's different types.
	protected String name;
	protected int rezCost;
	protected int strength;
	protected int subs;
	protected Set<IceType> iceTypes;

	public Ice(String name, int rezCost, int strength, int subs, Set<IceType> iceTypes) {
		this.name = name;
		this.rezCost = rezCost;
		this.strength = strength;
		this.subs = subs;
		this.iceTypes = iceTypes;
	}

	// Allows code to easily return the Ice's name.
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
