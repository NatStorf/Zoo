package animal;

public class Lynx extends Animal implements Predator {
    public Lynx(String name, int hungry) {
        super(name, hungry);
    }
    public String getAnimalName() {
        return animalName;
    }
    public int getHungry() {
        return hungry;
    }
    public String getAnimalType() {
        return type;
    }
}
