package com.kwyjibo.netrunner.ice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Rig {
	
	/* Each Rig is a list of Icebreakers which will be compared,
	 * as a whole, to the library of Ice. */
	protected List<Icebreaker> breakers;
	
	public Rig() {
		this.breakers = new ArrayList<Icebreaker>();
	}
	
	/* Adds an Icebreaker to the rig.
	 * @params Icebreaker object */
	public void addBreaker(Icebreaker ib) {
		this.breakers.add(ib);
	}
	
	/* Tests a rig against a piece of Ice,
	 * then returns an integer indicating the cheapest cost to
	 * break that piece of Ice with the given rig.
	 * @params Ice object */
	public int getCostToBreak(Ice ice) {
		int cheapestCost = Integer.MAX_VALUE;
		for (Icebreaker ib : this.breakers) {
			if (ib.canBreak(ice)) {
				int cost = ib.costToBreak(ice);
				if (cost < cheapestCost) {
					cheapestCost = cost;
				}
			}	
		}	
		return cheapestCost; 
	}
	
	/* Tests a Rig against a list of Ice,
	 * then returns a Map detailing the lowest cost to break
	 * each Ice in the list. If a Rig is unable to break
	 * a piece of Ice, the cost is set to MAX_VALUE.
	 */
	public Map<Ice, Integer> buildIceMap(List<Ice> iceList) {
		Map<Ice, Integer> iceMap = new HashMap<Ice, Integer>();
		
		for (Ice ice : iceList) {
			int cost = this.getCostToBreak(ice);
			iceMap.put(ice, cost);
		}
		
		return iceMap;
	}
	
	public int totalCostToBreak(List<Ice> iceList) {
		
		int total = 0;
		
		for (Ice ice : iceList) {
			if (this.getCostToBreak(ice) > 100) {
				continue;
			}
			else {
				total += this.getCostToBreak(ice);
			}
		}
		
		return total;
	}

	public int numUnbreakables(List<Ice> iceList) {
		
		int count = 0;
		
		for (Ice ice : iceList) {
			if (this.getCostToBreak(ice) > 100) {
				count++;
			}
		}
		
		return count;
	}
	
	public List<Ice> listUnbreakables(List<Ice> iceList) {
		
		List<Ice> unbroken = new ArrayList<Ice>();
		
		for (Ice ice : iceList) {
			if (this.getCostToBreak(ice) > 100) {
				unbroken.add(ice);
			}
		}
		return unbroken;	
	}
	
	public int totalInstallCost() {
		int sum = 0;
		
		for (Icebreaker ib : this.breakers) {
			sum += ib.getInstallCost();
		}
		
		return sum;
	}
	
}


