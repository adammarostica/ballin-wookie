package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import util.IceDB;
import ICEbreaking.ICE;
import ICEbreaking.Icebreaker;
import ICEbreaking.Rig;

public class RigTest {

	protected List<ICE> iceList = new ArrayList<ICE>();
	protected Rig rig = new Rig();
	
	@Before
	public void setUp() throws Exception {
		iceList.add(new ICE("Lotus Field", 5, 4, 1,
				new HashSet<ICE.IceType>(Arrays.asList(ICE.IceType.CODE_GATE))));
		iceList.add(new ICE("Archer", 4, 6, 4,
				new HashSet<ICE.IceType>(Arrays.asList(ICE.IceType.SENTRY))));
		iceList.add(new ICE("Ice Wall", 1, 1, 1,
				new HashSet<ICE.IceType>(Arrays.asList(ICE.IceType.BARRIER))));
		rig.addBreaker(new Icebreaker("Gordian Blade", 4, 2, 1, 1, 1,
				new HashSet<ICE.IceType>(Arrays.asList(ICE.IceType.CODE_GATE))));
		rig.addBreaker(new Icebreaker("Femme Fatale", 9, 2, 2, 1, 1,
				new HashSet<ICE.IceType>(Arrays.asList(ICE.IceType.SENTRY))));
	}

	@Test
	public void testCheapest() {
		assertEquals(3, this.rig.getCostToBreak(this.iceList.get(0)));
	}
	
	@Test
	public void testCheapestUnbreakable() {
		assertEquals(Integer.MAX_VALUE, this.rig.getCostToBreak(this.iceList.get(2)));
	}

	@Test
	public void testMap() {
		System.out.println(this.rig.buildIceMap(IceDB.getAll()));
	}
}
