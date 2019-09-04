package cages;

import animal.*;

public  class CagesForHerbivores extends Cages{
    public CagesForHerbivores(String name, int animalCount, int maxAnimalCount) {
        super(name,animalCount, maxAnimalCount);
    }

    @Override
    public void addAnimal(Herbivore herbivore) {
        if (CagesForHerbivores.animalCount < CagesForHerbivores.maxAnimalCount) {
            CagesForHerbivores.animalCount++;
            System.out.println("Животное " + Herbivore.name+" добавлено в клетку. Всего животных - " + CagesForHerbivores.animalCount);
        } else {
            System.out.println("Некуда класть");
        }
    }
    @Override
    public void addAnimal(Predator predator){
        System.out.println("Хищника нельзя отправлять в клетку к травойдным!");
    }

}
