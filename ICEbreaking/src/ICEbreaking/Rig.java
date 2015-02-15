package ICEbreaking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Rig {
	
	protected List<Icebreaker> breakers;
	
	public Rig() {
		this.breakers = new ArrayList<Icebreaker>();
	}
	
	public void addBreaker(Icebreaker ib) {
		this.breakers.add(ib);
	}
	
	public int getCostToBreak(ICE ice) {
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
	
	public Map<ICE, Integer> buildIceMap(List<ICE> iceList) {
		Map<ICE, Integer> iceMap = new HashMap<ICE, Integer>();
		
		for (ICE ice : iceList) {
			int cost = this.getCostToBreak(ice);
			iceMap.put(ice, cost);
		}
		
		return iceMap;
	}
	
}


