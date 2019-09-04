package food;

public abstract class Food {
    public enum FoodType{
        None,Meat,Wheat
    }
    public FoodType foodType;
    public String name;
    public int value;
    public int count;

    public Food(String name, int value, int count){
        this.name = name;
        this.value = value;
        this.count = count;
        this.foodType = FoodType.None;
    }
}
