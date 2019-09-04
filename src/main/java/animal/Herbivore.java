package animal;
import food.*;
import cages.*;

public abstract class Herbivore extends Animal{

   public Herbivore(String name, int hungry) {
       super(name, hungry);
   }

    @Override
    public boolean eat(FoodForHerbivores Food) {
        hungry += Food.value;
        return hungry<0;
    }
    @Override
    public boolean eat(FoodForPredators Food) {
        System.out.println("Хочу фруктов!");
        return hungry <0;
    }



}
