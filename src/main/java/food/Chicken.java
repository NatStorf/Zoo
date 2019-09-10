package food;

public class Chicken extends Food implements  FoodForPredators {
    public Chicken(String name, int value, int count){
        super(name, value, count);
    }
    public String getFoodName() {
        return foodName;
    }
    public int getCount() {
        return count;
    }
    public int getValue() {
        return value;
    }
    public String getFoodType() {
        return type;
    }
}