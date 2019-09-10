package food;

public abstract class Food {
    public String foodName;
    public int value;
    public int count;
    public Food(String foodName, int value, int count){
        this.foodName = foodName;
        this.value = value;
        this.count = count;
    }
    public abstract String getFoodType();
    public abstract int getValue();

}
