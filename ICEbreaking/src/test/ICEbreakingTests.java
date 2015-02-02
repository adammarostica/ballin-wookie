package test;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;

import org.junit.Test;

import ICEbreaking.ICE;
import ICEbreaking.Icebreaker;

public class ICEbreakingTests {

	@Test
	public void testIcebreakingCosts() {
		ICE lotusField = new ICE("Lotus Field", 5, 4, 1, new HashSet<ICE.IceType>());
		
		Icebreaker test = new Icebreaker("Test", 9, 2, 1, 2, 1, new HashSet<Icebreaker.IcebreakerType>());
		assertEquals(2, test.costToBreak(lotusField));
		
		Icebreaker gordianBlade = new Icebreaker("Gordian Blade", 4, 2, 1, 1, 1, new HashSet<Icebreaker.IcebreakerType>());
		assertEquals(3, gordianBlade.costToBreak(lotusField));
		
		ICE archer = new ICE("Archer", 4, 6, 4, new HashSet<ICE.IceType>());
		Icebreaker femmeFatale = new Icebreaker("Femme Fatale", 9, 2, 2, 1, 1, new HashSet<Icebreaker.IcebreakerType>());
		assertEquals(12, femmeFatale.costToBreak(archer));
	}

}
