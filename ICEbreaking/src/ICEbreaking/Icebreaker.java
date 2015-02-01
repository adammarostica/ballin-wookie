package ICEbreaking;

public class Icebreaker {

	protected String name;
	protected int installCost;
	protected int strength;
	protected int pumpValue;
	protected int pumpCost;
	protected int breakCost;
	
	public Icebreaker(String name, int installCost, int strength, int pumpCost, int pumpValue, int breakCost) {
		this.name = name;
		this.installCost = installCost;
		this.strength = strength;
		this.pumpCost = pumpCost;
		this.pumpValue = pumpValue;
		this.breakCost = breakCost;
		}
		
	public String getName() {
		return name;
	}

	public int getInstallCost() {
		return installCost;
	}

	public int getStrength() {
		return strength;
	}

	public int getPumpValue() {
		return pumpValue;
	}

	public int getPumpCost() {
		return pumpCost;
	}
	
	public int getBreakCost() {
		return breakCost;
	}
		
	public int pumpBreaker(int icestr) {
		/*
		int totalPumpCost = 0;
		while (breakerstr < icestr) {
			breakerstr += pumpvalue;
			totalPumpCost += pumpcost;
		}
		return totalPumpCost;
		*/
		int diff = icestr - this.strength;
		int pumps = (int) Math.ceil(diff / this.pumpValue);
		return pumps * this.pumpCost;
	}

	public int costToBreak(ICE ice) {
		int totalBreakCost = 0;
		totalBreakCost += pumpBreaker(ice.getStrength());
		totalBreakCost += (ice.getSubs() * this.breakCost);
		return totalBreakCost;
	}
}
