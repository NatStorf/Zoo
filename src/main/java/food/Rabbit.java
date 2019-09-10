package food;

public class Rabbit extends Food implements  FoodForPredators {
    public Rabbit(String name, int value, int count){
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