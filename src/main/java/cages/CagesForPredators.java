package cages;

import animal.Animal;
import animal.Herbivore;
import animal.Predator;

public  class CagesForPredators extends Cages {
    public CagesForPredators(String name, int animalCount, int maxAnimalCount) {
        super(name, animalCount, maxAnimalCount);
    }

    @Override
    public void addAnimal(Predator predator) {
        if (CagesForPredators.animalCount < CagesForPredators.maxAnimalCount) {
            CagesForPredators.animalCount++;
            System.out.println("Животное " + Predator.name+" добавлено в клетку. Всего животных - " + CagesForPredators.animalCount);
        } else {
            System.out.println("Некуда класть");
        }
    }
    @Override
    public void addAnimal(Herbivore herbivore) {
        System.out.println("Травоядного животного нельзя класть в клетку с хищником!");
    }

}