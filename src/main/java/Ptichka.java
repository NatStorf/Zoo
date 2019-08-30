public class Ptichka extends Animal {

    int Wings;

    public Ptichka(String name, int hungry) {
        super(name, hungry);
    }

    @Override
    public void areYouHungry() {
        if (hungry >= 0) {
            System.out.println("Птичка сытая! " + hungry);
        } else {
            System.out.println("ЖРАААААТЬ! " + hungry);
        }

    }

    public void areYouHungry(int notUsed) {
        if (hungry >= 0) {
            System.out.println("Птичка сытая! " + hungry);
        } else {
            System.out.println("ЖРАААААТЬ! " + hungry);
        }

    }



}
