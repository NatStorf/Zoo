package cages;

import animal.Animal;
import animal.Herbivore;
import animal.Predator;

public  class CagesForPredators extends Cages {
    public CagesForPredators(String name, int maxAnimalCount) {
        super(name,  maxAnimalCount);
    }


    public void addAnimal(Animal animal) {
        if(animal.animalType == Animal.Type.Predator) {
            if (this.animalCount < this.maxAnimalCount) {
                this.animalCount++;
                System.out.println("Животное " + animal.name + " добавлено в клетку. Всего животных - " + this.animalCount);
            } else {
                System.out.println("Некуда класть");
            }
        }else if(animal.animalType == Animal.Type.Herbivore){
            System.out.println("Травоядного животного нельзя класть в клетку с хищником!");
        }
    }

//    @Override
//    public void addAnimal(Predator predator) {
//        if (CagesForPredators.animalCount < CagesForPredators.maxAnimalCount) {
//            CagesForPredators.animalCount++;
//            System.out.println("Животное " + Predator.name+" добавлено в клетку. Всего животных - " + CagesForPredators.animalCount);
//        } else {
//            System.out.println("Некуда класть");
//        }
//    }
//    @Override
//    public void addAnimal(Herbivore herbivore) {
//        System.out.println("Травоядного животного нельзя класть в клетку с хищником!");
//    }

}