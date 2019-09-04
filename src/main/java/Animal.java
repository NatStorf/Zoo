public abstract class Animal {
    protected int hungry;
    public final String name;


//    public Animal(String name) {
//        this.name = name;
//        hungry = -60;
//    }
//
//    public Animal(int hungry, String name) {
//        this.hungry = hungry;
//        this.name = name;
//    }

    public Animal( String name, int hungry) {
        this.hungry = hungry;
        this.name = name;
    }


    public abstract boolean eat(FoodForPredators Food);
    public abstract boolean eat(FoodForHerbivores Food);

    //public abstract boolean eat(Ant ant);

    public void areYouHungry() {
        if (hungry >= 0) {
            System.out.println("Животное сытое! " + hungry);
        } else {
            System.out.println("ЖРАААААТЬ! " + hungry);
        }

    }
}
