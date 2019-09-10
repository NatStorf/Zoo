package animal;

public class Wolf extends Animal implements Predator {
    public Wolf(String name, int hungry) {
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
