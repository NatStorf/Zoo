import animal.*;
import cages.*;
import food.*;

public class Zoo {

    public static void feedAnimal(Animal animal, Food food) throws EatException {
        System.out.println("Кормим " + animal.animalName + "\'a " + food.foodName);
        while (animal.hungry < 0) {
            System.out.println(food.foodName +" осталось: "+food.count);
            if (food.count > 0) {
                animal.eat(food);
                food.count--;
                animal.areYouHungry();
            } else {
                System.out.println("Еда кончилась");
                break;
            }
        }
    }

    public static void main(String[] args) {
        Monkey bob = new Monkey("Bob", -112);
        Wolf rex = new Wolf("Rex", -105);
        Zebra monty = new Zebra("Monty",-55);
        Zebra pip = new Zebra("Pip",-55);
        Zebra grey = new Zebra("Grey",-55);
        Lynx hana = new Lynx("Hana", -76);
        Wolf zed = new Wolf("Zed", -105);
        Monkey rob = new Monkey("Rob",-100);
        Lynx pepe = new Lynx("Pepe", -20);

        Banana banana = new Banana("bananas",10,3);
        Rabbit rabbit = new Rabbit("rabbits", 25, 2);
        Chicken chicken = new Chicken("chicken",30,4);

        try {
            feedAnimal(rex,banana);
        } catch (EatException e) {
            e.printStackTrace();
        }
        System.out.println();

        try {
            feedAnimal(rex,rabbit);
        } catch (EatException e) {
            e.printStackTrace();
        }
        System.out.println();

        try {
            feedAnimal(bob,chicken);
        } catch (EatException e) {
            e.printStackTrace();
        }
        System.out.println();

        System.out.println();
        System.out.println();

        CagesForHerbivores greenCage = new CagesForHerbivores("greenCage", 4) ;
        System.out.println("Создана клетка " + Cages.name +".\n"+ "Максимальное количество животных - "+ Cages.maxAnimalCount);
        greenCage.addAnimal(bob);
        greenCage.addAnimal(pip);
        greenCage.addAnimal(monty);
        greenCage.addAnimal(hana);
        greenCage.addAnimal(rob);

        System.out.println("Животных в клетке "+greenCage.animalCount);

        System.out.println();
        System.out.println();

        CagesForPredators meatCage = new CagesForPredators("meatCage", 3);

        System.out.println("Создана клетка " + Cages.name +".\n"+ "Максимальное количество животных - "+ Cages.maxAnimalCount);
        meatCage.addAnimal(rex);
        meatCage.addAnimal(zed);
        meatCage.addAnimal(hana);
        meatCage.addAnimal(grey);
        meatCage.addAnimal(pepe);
        System.out.println("Животных в клетке "+ meatCage.animalCount);
    }
}











