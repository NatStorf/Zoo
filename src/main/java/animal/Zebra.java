package animal;

public class Zebra extends Animal implements Herbivore {
    public Zebra(String name, int hungry) {
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
