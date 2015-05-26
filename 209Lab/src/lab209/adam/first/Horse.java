package lab209.adam.first;

public class Horse extends Animal {

	public Horse() {
		super();
		System.out.println("Horse constructor");
	}

	@Override
	public String getSpecies() {
		return "horse";
	}

	@Override
	public String getSound() {
		return "neigh";
	}

}
