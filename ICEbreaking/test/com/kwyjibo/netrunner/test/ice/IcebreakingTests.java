package com.kwyjibo.netrunner.test.ice;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import util.IceDB;
import util.IcebreakerDB;


public class IcebreakingTests {

	@Test
	public void testIcebreakingCosts() {
				
		assertEquals(3, IcebreakerDB.gordianBlade.costToBreak(IceDB.lotusField));
		
		assertEquals(12, IcebreakerDB.femmeFatale.costToBreak(IceDB.archer));
		
		assertEquals(Integer.MAX_VALUE, IcebreakerDB.mimic.costToBreak(IceDB.archer));
		assertEquals(Integer.MAX_VALUE, IcebreakerDB.mimic.costToBreak(IceDB.hunter));
		
	}
	
	@Test
	public void testBreakAllSubs() {
		
		assertEquals(2, IcebreakerDB.batteringRam.breakAllSubs(1));
		assertEquals(2, IcebreakerDB.batteringRam.breakAllSubs(2));
		assertEquals(4, IcebreakerDB.batteringRam.breakAllSubs(3));
		assertEquals(12, IcebreakerDB.batteringRam.breakAllSubs(11));
		
		assertEquals(1, IcebreakerDB.corroder.breakAllSubs(1));
		assertEquals(2, IcebreakerDB.corroder.breakAllSubs(2));
		assertEquals(3, IcebreakerDB.corroder.breakAllSubs(3));
		assertEquals(11, IcebreakerDB.corroder.breakAllSubs(11));
		
	}
	
	@Test
	public void testBreakerCompatibility() {

		assertEquals(Integer.MAX_VALUE, IcebreakerDB.femmeFatale.costToBreak(IceDB.iceWall));
	}

}
