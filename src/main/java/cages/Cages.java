package cages;


import animal.Herbivore;
import animal.Predator;

public abstract class Cages {
    public static String name;
    public static int animalCount;
    public static int maxAnimalCount;
    public static int n = 10;

    public Cages(String name, int animalCount, int maxAnimalCount) {
        this.animalCount = animalCount;
        this.maxAnimalCount = maxAnimalCount;
        this.name = name;
    }
    public abstract void addAnimal(Predator predator);
    public abstract void addAnimal(Herbivore herbivore);





}
