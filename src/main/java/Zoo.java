/*

 */

public class Zoo {

    static int Cages;

    public static void feedAnimal(Animal animal){
        Banana[] bananas = new Banana[20];
        for (int i = 0; i < bananas.length; i++) {
            bananas[i] = new Banana();
        }

        Ant ant = new Ant();
        for (int i = 0; i < bananas.length && !animal.eat(bananas[i]); i++) {
            animal.areYouHungry();
        }
        animal.eat(ant);
        animal.areYouHungry();

        for(Banana banana : bananas){
            if(banana.value == 0){
                System.out.println("Тут только кожура!");
            } else {
                System.out.println("Пиательный банан!");
            }
        }
    }


    public static void main(String[] args) {
        Monkey bob = new Monkey("Bob", -100, 1);
        Ptichka charlie = new Ptichka("charlie", -100);
        feedAnimal(bob);
        feedAnimal(charlie);


    }

}











