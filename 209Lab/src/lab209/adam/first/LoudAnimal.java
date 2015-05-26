package lab209.adam.first;

public class LoudAnimal extends Animal {

	private Animal animal;
	
	public LoudAnimal(Animal animal) {
		super();
		this.animal = animal;
	}

	@Override
	public String getSpecies() {
		return "Loud " + animal.getSpecies();
	}

	@Override
	public String getSound() {
		return animal.getSound().toUpperCase();
	}

}
