package lab209.adam.first;

public class Chicken extends Animal {

	public Chicken() {
		super();
		System.out.println("Chicken constructor");
	}

	@Override
	public String getSpecies() {
		return "chicken";
	}

	@Override
	public String getSound() {
		return "cock-a-caw";
	}

}
