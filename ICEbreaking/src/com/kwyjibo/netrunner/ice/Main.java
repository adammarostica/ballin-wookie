package com.kwyjibo.netrunner.ice;

import java.util.List;
import util.IceDB;
import util.IcebreakerDB;

public class Main {

	public static void main(String[] args) {
		
		List<Ice> iceDB = IceDB.getAll();
		
		// Beginning of Test 1
		System.out.println("Welcome to ICE Analyzer v0.1. There are " + iceDB.size() + " pieces of ICE in the database.");
		
		Rig testRig1 = new Rig();
		testRig1.addBreaker(IcebreakerDB.ninja);
		testRig1.addBreaker(IcebreakerDB.gordianBlade);
		testRig1.addBreaker(IcebreakerDB.batteringRam);
		
		System.out.println();
		System.out.println("The total install cost of your rig is: " + testRig1.totalInstallCost() + " credits.");
		System.out.println();
		
		int unbreakable1 = testRig1.numUnbreakables(iceDB);
		List<Ice> unbroken1 = testRig1.listUnbreakables(iceDB);
		
		if (unbreakable1 > 0) {
			System.out.println("Your rig failed to break " + unbreakable1 + " of the " + iceDB.size() + " pieces of ICE in the database.");
			System.out.println("They are the following: " + unbroken1);
		}
		
		else {
			System.out.println("Congratulations! Your rig is able to break every piece of ICE in the database.");
		}
		
		System.out.println();
		System.out.println("The total cost to break each piece of ICE once (not counting those which you were unable to break (if any) is: " + testRig1.totalCostToBreak(iceDB)  + " credits."); 
		
		System.out.println();
		System.out.println("Thank you for using ICE Analyzer.");
		System.out.println(".............................................................................................");
		System.out.println();
		
		// Beginning of Test 2
		System.out.println("Welcome to ICE Analyzer v0.1. There are " + iceDB.size() + " pieces of ICE in the database.");
		
		Rig testRig2 = new Rig();
		testRig2.addBreaker(IcebreakerDB.mimic);
		testRig2.addBreaker(IcebreakerDB.yog);
		testRig2.addBreaker(IcebreakerDB.corroder);
		
		System.out.println();
		System.out.println("The total install cost of your rig is: " + testRig2.totalInstallCost() + " credits.");
		System.out.println();
		
		int unbreakable2 = testRig2.numUnbreakables(iceDB);
		List<Ice> unbroken2 = testRig2.listUnbreakables(iceDB);
		
		if (unbreakable2 > 0) {
			System.out.println("Your rig failed to break " + unbreakable2 + " of the " + iceDB.size() + " pieces of ICE in the database.");
			System.out.println("They are the following: " + unbroken2);
			System.out.println("If you choose to use this rig, we strongly recommend adding Datasuckers.");
		}
		
		else {
			System.out.println("Congratulations! Your rig is able to break every piece of ICE in the database.");
		}
		
		System.out.println();
		System.out.println("The total cost to break each piece of ICE once (not counting those which you were unable to break (if any) is: " + testRig2.totalCostToBreak(iceDB)  + " credits."); 
		
		System.out.println();
		System.out.println("Thank you for using ICE Analyzer.");
		System.out.println(".............................................................................................");
		System.out.println();

		// Beginning of Test 3
		System.out.println("Welcome to ICE Analyzer v0.1. There are " + iceDB.size() + " pieces of ICE in the database.");
		
		Rig testRig3 = new Rig();
		testRig3.addBreaker(IcebreakerDB.crypsis);
		
		System.out.println();
		System.out.println("The total install cost of your rig is: " + testRig3.totalInstallCost() + " credits.");
		System.out.println();
		
		int unbreakable3 = testRig3.numUnbreakables(iceDB);
		List<Ice> unbroken3 = testRig3.listUnbreakables(iceDB);
		
		if (unbreakable3 > 0) {
			System.out.println("Your rig failed to break " + unbreakable3 + " of the " + iceDB.size() + " pieces of ICE in the database.");
			System.out.println("They are the following: " + unbroken3);
		}
		
		else {
			System.out.println("Congratulations! Your rig is able to break every piece of ICE in the database.");
		}
		
		System.out.println();
		System.out.println("The total cost to break each piece of ICE once (not counting those which you were unable to break (if any) is: " + testRig3.totalCostToBreak(iceDB)  + " credits."); 
		
		System.out.println();
		System.out.println("Thank you for using ICE Analyzer.");
		System.out.println(".............................................................................................");
		System.out.println();
	}

}
