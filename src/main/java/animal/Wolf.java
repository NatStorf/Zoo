package animal;

public  class Wolf extends Predator{

    public Wolf(String name, int hungry) {
        super(name, hungry);
    }

    @Override
    public void areYouHungry() {
        if (hungry >= 0) {
            System.out.println("Волк сытый! " + hungry);
        } else {
            System.out.println("Волк хочет кушать! " + hungry);
        }

    }

//    public void areYouHungry(int notUsed) {
//        if (hungry >= 0) {
//            System.out.println("Птичка сытая! " + hungry);
//        } else {
//            System.out.println("ЖРАААААТЬ! " + hungry);
//        }
//
//    }



}
