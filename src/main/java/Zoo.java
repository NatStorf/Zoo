/*

 */

import animal.*;
import cages.*;
import food.*;

public class Zoo {


    public static void feedAnimal(Predator predator, Herbivore herbivore) {
//        food.Banana[] bananas = new food.Banana[20];
//        for (int i = 0; i < bananas.length; i++) {
//            bananas[i] = new food.Banana(food.Banana.name, food.Banana.value);
//        }
//
//        food.Apple apple = new food.Apple();
//        for (int i = 0; i < bananas.length && !animal.eat(bananas[i]); i++) {
//            animal.areYouHungry();
//        }
        //animal.eat(ant);

        while (predator.hungry < 0) {
            Banana banana = new Banana(Banana.name,Banana.value, Banana.count);

            Rabbit rabbit = new Rabbit(Rabbit.name, Rabbit.value, Rabbit.count);

            System.out.println(rabbit.count);
            if (rabbit.count > 0) {
                predator.eat(rabbit);
                rabbit.count--;
                predator.areYouHungry();
            } else {
                System.out.println("Еда кончилась");
                break;
            }
        }
        while (herbivore.hungry < 0) {
            Banana banana = new Banana(Banana.name, Banana.value, Banana.count);
            herbivore.eat(banana);
        }
        //herbivore.areYouHungry();
//        for(food.Banana banana : bananas){
//            if(banana.value == 0){
//                System.out.println("Тут только кожура!");
//            } else {
//                System.out.println("Пиательный банан!");
//            }
//        }
    }
//    public static void feedAnimal(animal.Herbivore herbivore){
//        while(herbivore.hungry<0){
//        food.Banana banana = new food.Banana(food.Banana.name,food.Banana.value);
//        herbivore.eat(banana);
//        }
//        herbivore.areYouHungry();
//    }


    public static void main(String[] args) {
        Monkey bob = new Monkey("Bob", -112, 1);
        Wolf rex = new Wolf("Rex", -105);
        Zebra monty = new Zebra("Monty",-55);
        Zebra pip = new Zebra("Pip",-55);
        Zebra grey = new Zebra("Grey",-55);
        Lynx hana = new Lynx("Hana", -76);
        Wolf zed = new Wolf("Zed", -105);


        feedAnimal(rex, bob);

        System.out.println();
        System.out.println();

        CagesForHerbivores greenCage = new CagesForHerbivores("greenCage", CagesForHerbivores.animalCount, 4) ;
        System.out.println("Создана клетка " + greenCage.name +".\n"+ "Максимальное количество животных - "+ greenCage.maxAnimalCount);
        greenCage.addAnimal(bob);
        greenCage.addAnimal(pip);
        greenCage.addAnimal(monty);
        greenCage.addAnimal(hana);
        System.out.println("Животных в клетке "+greenCage.animalCount);

        System.out.println();
        System.out.println();

        CagesForPredators meatCage = new CagesForPredators("meatCage", CagesForPredators.animalCount, 3);
        System.out.println("Создана клетка " + meatCage.name +".\n"+ "Максимальное количество животных - "+ meatCage.maxAnimalCount);
        meatCage.addAnimal(rex);
        meatCage.addAnimal(zed);
        meatCage.addAnimal(hana);
        meatCage.addAnimal(grey);
        System.out.println("Животных в клетке "+ meatCage.animalCount);
    }

}











