package test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.HashSet;

import org.junit.Test;

import ICEbreaking.ICE;
import ICEbreaking.Icebreaker;
import ICEbreaking.UnbreakableException;

public class ICEbreakingTests {

	@Test
	public void testIcebreakingCosts() throws UnbreakableException {
		ICE lotusField = new ICE("Lotus Field", 5, 4, 1,
				new HashSet<ICE.IceType>(Arrays.asList(ICE.IceType.CODE_GATE)));
		
		Icebreaker test = new Icebreaker("Test", 9, 2, 1, 2, 1,
				new HashSet<Icebreaker.IcebreakerType>(Arrays.asList(Icebreaker.IcebreakerType.DECODER)));
		assertEquals(2, test.costToBreak(lotusField));
		
		Icebreaker gordianBlade = new Icebreaker("Gordian Blade", 4, 2, 1, 1, 1,
				new HashSet<Icebreaker.IcebreakerType>(Arrays.asList(Icebreaker.IcebreakerType.DECODER)));
		assertEquals(3, gordianBlade.costToBreak(lotusField));
		
		ICE archer = new ICE("Archer", 4, 6, 4,
				new HashSet<ICE.IceType>(Arrays.asList(ICE.IceType.SENTRY)));
		Icebreaker femmeFatale = new Icebreaker("Femme Fatale", 9, 2, 2, 1, 1,
				new HashSet<Icebreaker.IcebreakerType>(Arrays.asList(Icebreaker.IcebreakerType.KILLER)));
		assertEquals(12, femmeFatale.costToBreak(archer));
	}
	
	@Test(expected = UnbreakableException.class)
	public void testBreakerCompatibility() throws UnbreakableException {
		ICE aBarrier = new ICE("Archer", 4, 6, 4,
				new HashSet<ICE.IceType>(Arrays.asList(ICE.IceType.BARRIER)));
		Icebreaker aKiller = new Icebreaker("Femme Fatale", 9, 2, 2, 1, 1,
				new HashSet<Icebreaker.IcebreakerType>(Arrays.asList(Icebreaker.IcebreakerType.KILLER)));
		aKiller.costToBreak(aBarrier);
	}

}
