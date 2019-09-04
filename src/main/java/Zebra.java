public class Zebra extends Herbivore {
    public Zebra(String name, int hungry) {
        super(name, hungry);
    }

    @Override
    public void areYouHungry() {
        if (hungry >= 0) {
            System.out.println("Зебра сытая!  " + hungry);
        } else {
            System.out.println("ЖРАААААТЬ! " + hungry);
        }

    }
}
