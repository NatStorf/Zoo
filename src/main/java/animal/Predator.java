package animal;

import cages.*;
import food.*;

public abstract class Predator extends Animal {
    public Predator(String name, int hungry) {
        super(name, hungry);
        this.animalType = Type.Predator;
    }

    @Override
    public boolean eat(Food food) {
        if (food.foodType == Food.FoodType.Meat) {
            hungry += food.value;
        } else if (food.foodType == Food.FoodType.Wheat) {
            System.out.println("Хочу Мясо!");
        }
        return hungry < 0;
    }

//    @Override
//    public boolean eat(FoodForHerbivores Food) {
//        System.out.println("Хочу мясо!");
//        return false;
//    }

}
