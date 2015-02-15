package test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.HashSet;

import org.junit.Test;

import ICEbreaking.ICE;
import ICEbreaking.Icebreaker;

public class ICEbreakingTests {

	@Test
	public void testIcebreakingCosts() {
		ICE lotusField = new ICE("Lotus Field", 5, 4, 1,
				new HashSet<ICE.IceType>(Arrays.asList(ICE.IceType.CODE_GATE)));
		
		Icebreaker test = new Icebreaker("Test", 9, 2, 1, 2, 1,
				new HashSet<ICE.IceType>(Arrays.asList(ICE.IceType.CODE_GATE)));
		assertEquals(2, test.costToBreak(lotusField));
		
		Icebreaker gordianBlade = new Icebreaker("Gordian Blade", 4, 2, 1, 1, 1,
				new HashSet<ICE.IceType>(Arrays.asList(ICE.IceType.CODE_GATE)));
		assertEquals(3, gordianBlade.costToBreak(lotusField));
		
		ICE archer = new ICE("Archer", 4, 6, 4,
				new HashSet<ICE.IceType>(Arrays.asList(ICE.IceType.SENTRY)));
		Icebreaker femmeFatale = new Icebreaker("Femme Fatale", 9, 2, 2, 1, 1,
				new HashSet<ICE.IceType>(Arrays.asList(ICE.IceType.SENTRY)));
		assertEquals(12, femmeFatale.costToBreak(archer));
	}
	
	public void testBreakerCompatibility() {
		ICE aBarrier = new ICE("Archer", 4, 6, 4,
				new HashSet<ICE.IceType>(Arrays.asList(ICE.IceType.BARRIER)));
		Icebreaker aKiller = new Icebreaker("Femme Fatale", 9, 2, 2, 1, 1,
				new HashSet<ICE.IceType>(Arrays.asList(ICE.IceType.SENTRY)));
		assertEquals(Integer.MAX_VALUE, aKiller.costToBreak(aBarrier));
	}

}
