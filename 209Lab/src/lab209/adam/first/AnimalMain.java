package lab209.adam.first;

import java.util.*;

/* Use this class to try out your solutions for CCPS209 lab 1. */

public class AnimalMain {

    public static void main(String[] args) {
        List<Animal> al = new ArrayList<Animal>();
        al.add(new Cat());
        al.add(new Horse());
        al.add(new Chicken());
        al.add(new LoudAnimal(new Cat()));
        al.add(new LoudAnimal(new Horse()));
        al.add(new LoudAnimal(new Chicken()));
        al.add(new MirroredAnimal(new LoudAnimal(new Cat())));
        System.out.println(Animal.getCount() + " animal objects have been created.");
        System.out.println("The following animals are in the list:");
        for(Animal a: al) {
            System.out.println(a);
        }
    }
    
}