package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ICEbreaking.ICE;
import ICEbreaking.Icebreaker;

public class ICEbreakingTests {

	@Test
	public void testIcebreakingCostsLotusField() {
		ICE lotusField = new ICE("Lotus Field", 5, 4, 1);
		Icebreaker test = new Icebreaker("Test", 9, 2, 1, 2, 1);
		assertEquals(2, test.costToBreak(lotusField));
	}

}
