package animal;

public class Monkey extends Herbivore{

    int Otlichie;

    public Monkey(String name, int hungry, int notUsed) {
        super(name, hungry);
        Otlichie = notUsed;
    }

//    public void test(Ant ant, int count){
//        ant.value = ant.value * count;
//        count = 10;
//    }

    @Override
    public void areYouHungry() {
        if (hungry >= 0) {
            System.out.println("Обезьянка сытая! " + hungry);
        } else {
            System.out.println("Обезьянка хочет кушать! " + hungry);
        }

    }}
