package animal;
import cages.*;
import food.*;
public abstract class  Predator extends Animal{
    public Predator(String name, int hungry) {
        super(name, hungry);
        this.animalType= Type.Predator;
    }

    @Override
    public boolean eat(FoodForPredators Food) {
        hungry += Food.value;
        return hungry < 0;
    }

    @Override
    public boolean eat(FoodForHerbivores Food) {
        System.out.println("Хочу мясо!");
        return false;
    }

}
