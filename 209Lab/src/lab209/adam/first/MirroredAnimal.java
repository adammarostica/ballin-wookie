package lab209.adam.first;

public class MirroredAnimal extends Animal {
	
	private Animal animal;

	public MirroredAnimal(Animal animal) {
		super();
		this.animal = animal;
	}

	@Override
	public String getSpecies() {
		return "Mirrored " + animal.getSpecies();
	}

	@Override
	public String getSound() {
		//String dnuos = new StringBuilder(animal.getSound()).reverse().toString();
		//return dnuos;
		return new StringBuilder(animal.getSound()).reverse().toString();
	}

}
