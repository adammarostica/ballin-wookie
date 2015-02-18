package com.kwyjibo.netrunner.test.ice;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.HashSet;

import org.junit.Test;

import com.kwyjibo.netrunner.ice.Ice;
import com.kwyjibo.netrunner.ice.IceType;
import com.kwyjibo.netrunner.ice.Icebreaker;

public class IcebreakingTests {

	@Test
	public void testIcebreakingCosts() {
		Ice lotusField = new Ice("Lotus Field", 5, 4, 1,
				new HashSet<IceType>(Arrays.asList(IceType.CODE_GATE)));
		
		Icebreaker test = new Icebreaker("Test", 9, 2, 1, 2, 1,
				new HashSet<IceType>(Arrays.asList(IceType.CODE_GATE)));
		assertEquals(2, test.costToBreak(lotusField));
		
		Icebreaker gordianBlade = new Icebreaker("Gordian Blade", 4, 2, 1, 1, 1,
				new HashSet<IceType>(Arrays.asList(IceType.CODE_GATE)));
		assertEquals(3, gordianBlade.costToBreak(lotusField));
		
		Ice archer = new Ice("Archer", 4, 6, 4,
				new HashSet<IceType>(Arrays.asList(IceType.SENTRY)));
		Icebreaker femmeFatale = new Icebreaker("Femme Fatale", 9, 2, 2, 1, 1,
				new HashSet<IceType>(Arrays.asList(IceType.SENTRY)));
		assertEquals(12, femmeFatale.costToBreak(archer));
	}
	
	public void testBreakerCompatibility() {
		Ice aBarrier = new Ice("Archer", 4, 6, 4,
				new HashSet<IceType>(Arrays.asList(IceType.BARRIER)));
		Icebreaker aKiller = new Icebreaker("Femme Fatale", 9, 2, 2, 1, 1,
				new HashSet<IceType>(Arrays.asList(IceType.SENTRY)));
		assertEquals(Integer.MAX_VALUE, aKiller.costToBreak(aBarrier));
	}

}
