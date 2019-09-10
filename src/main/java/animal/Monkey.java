package animal;

public class Monkey extends Animal implements Herbivore {
    public Monkey(String name, int hungry) {
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
