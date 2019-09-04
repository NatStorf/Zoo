package animal;

import food.*;
import cages.*;

public abstract class Herbivore extends Animal {

    public Herbivore(String name, int hungry) {
        super(name, hungry);
        this.animalType = Type.Herbivore;
    }

    @Override
    public boolean eat(Food food) {
        if (food.foodType == Food.FoodType.Wheat) {
            hungry += food.value;
        } else if (food.foodType == Food.FoodType.Meat) {
            System.out.println("Хочу фруктов!");
        }
        return hungry < 0;
    }
//    @Override
//    public boolean eat(FoodForPredators Food) {
//        System.out.println("Хочу фруктов!");
//        return hungry <0;
//    }


}
