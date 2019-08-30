public class Monkey extends Animal{

    int Otlichie;

    public Monkey(String name, int hungry, int notUsed) {
        super(name, hungry);
        Otlichie = notUsed;
    }

    public void test(Ant ant, int count){
        ant.value = ant.value * count;
        count = 10;
    }

    @Override
    public void areYouHungry() {
        super.areYouHungry();
    }
}
