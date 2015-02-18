package com.kwyjibo.netrunner.test.ice;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.kwyjibo.netrunner.ice.Ice;
import com.kwyjibo.netrunner.ice.IceType;
import com.kwyjibo.netrunner.ice.Icebreaker;
import com.kwyjibo.netrunner.ice.Rig;

import util.IceDB;

public class RigTest {

	protected List<Ice> iceList = new ArrayList<Ice>();
	protected Rig rig = new Rig();
	
	@Before
	public void setUp() throws Exception {
		iceList.add(new Ice("Lotus Field", 5, 4, 1,
				new HashSet<IceType>(Arrays.asList(IceType.CODE_GATE))));
		iceList.add(new Ice("Archer", 4, 6, 4,
				new HashSet<IceType>(Arrays.asList(IceType.SENTRY))));
		iceList.add(new Ice("Ice Wall", 1, 1, 1,
				new HashSet<IceType>(Arrays.asList(IceType.BARRIER))));
		rig.addBreaker(new Icebreaker("Gordian Blade", 4, 2, 1, 1, 1,
				new HashSet<IceType>(Arrays.asList(IceType.CODE_GATE))));
		rig.addBreaker(new Icebreaker("Femme Fatale", 9, 2, 2, 1, 1,
				new HashSet<IceType>(Arrays.asList(IceType.SENTRY))));
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
