package cages;

import animal.*;

public  class CagesForHerbivores extends Cages{
    public int animalCount =0;
    public CagesForHerbivores(String name,  int maxAnimalCount) {
        super(name, maxAnimalCount);
    }


    @Override
    public void addAnimal(Animal animal) {
        if(animal.animalType == Animal.Type.Herbivore) {
            if (this.animalCount < this.maxAnimalCount) {
                this.animalCount++;
                System.out.println("Животное " + animal.name + " добавлено в клетку. Всего животных - " + this.animalCount);
            } else {
                System.out.println("Некуда класть");
            }
        }else if(animal.animalType == Animal.Type.Predator){
            System.out.println("Хищника нельзя отправлять в клетку к травоядным!");
        }
    }

//    @Override
//    public void addAnimal(Predator predator){
//        System.out.println("Хищника нельзя отправлять в клетку к травойдным!");
//    }

}
