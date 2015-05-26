package lab209.adam.first;

public abstract class Animal {
	
	abstract public String getSpecies();	
	abstract public String getSound();
	private static int count = 0;
	
	public Animal() {
		Animal.count++;
		System.out.println("Default constructor being called");
	}
	
	public static int getCount() {
		return count;
	}
	
	@Override
	public final String toString() {
		return this.getSpecies() + " that says " + this.getSound();
	}
	
}
