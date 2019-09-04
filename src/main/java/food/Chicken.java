package food;

public  class Chicken extends FoodForPredators {
    public static int count = 2;
    public static String name = "DeadChicken";
    public static int value = 30;

    public Chicken(String name, int value,int count) {
        super(name, value, count);
    }
}