package lab209.adam.first;

public class Cat extends Animal {
	
	public Cat() {
		super();
		System.out.println("Cat constructor");
	}

	@Override
	public String getSpecies() {
		return "cat";
	}

	@Override
	public String getSound() {
		return "meow";
	}

}
