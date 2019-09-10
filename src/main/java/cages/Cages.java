package cages;


import animal.Animal;
import animal.Herbivore;
import animal.Predator;

public abstract class Cages {
    public static String name;
    public  int animalCount =0;
    public static int maxAnimalCount;
    public static int n = 10;


    public Cages(String name, int maxAnimalCount) {
      //  this.animalCount = animalCount;
        Cages.maxAnimalCount = maxAnimalCount;
        Cages.name = name;
    }



    public abstract void addAnimal(Animal animal);
    //public abstract void addAnimal(Herbivore herbivore);





}
