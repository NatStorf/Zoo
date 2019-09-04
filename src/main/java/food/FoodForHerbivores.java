package food;

public abstract class FoodForHerbivores extends Food {
    public FoodForHerbivores(String name, int value, int count){
        super(name,value,count);
        this.foodType = FoodType.Wheat;
    }
}
