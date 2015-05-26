package com.kwyjibo.netrunner.test.ice;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.kwyjibo.netrunner.ice.Ice;
import com.kwyjibo.netrunner.ice.Rig;

import util.IceDB;
import util.IcebreakerDB;

public class RigTest {

	protected List<Ice> iceList = new ArrayList<Ice>();
	protected Rig rig = new Rig();
	
	@Before
	public void setUp() throws Exception {
		iceList.add(IceDB.lotusField);
		iceList.add(IceDB.archer);
		iceList.add(IceDB.iceWall);
		rig.addBreaker(IcebreakerDB.gordianBlade);
		rig.addBreaker(IcebreakerDB.mimic);
		rig.addBreaker(IcebreakerDB.corroder);
	}

	@Test
	public void testCheapest() {
		assertEquals(3, this.rig.getCostToBreak(this.iceList.get(0)));
	}
	
	@Test
	public void testCheapestUnbreakable() {
		assertEquals(Integer.MAX_VALUE, this.rig.getCostToBreak(this.iceList.get(1)));
	}

	@Test
	public void testMap() {
		System.out.println(this.rig.buildIceMap(IceDB.getAll()));
	}
	
	@Test
	public void testTotalCostAndNumUnbreakables() {
		System.out.println("There are " + this.rig.numUnbreakables(IceDB.getAll()) + " ICE that can not be broken with this rig.");
		System.out.println("The total cost to break each ICE (that can be broken) once with this rig is " + this.rig.totalCostToBreak(IceDB.getAll()) + " credits."); 
	}
	
	@Test
	public void testTotalInstallCost() {
		assertEquals(9, rig.totalInstallCost());
	}
	
}	