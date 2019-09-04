/*

 */

public class Zoo {

    static int Cages;

    public static void feedAnimal(Predator predator, Herbivore herbivore) {
//        Banana[] bananas = new Banana[20];
//        for (int i = 0; i < bananas.length; i++) {
//            bananas[i] = new Banana(Banana.name, Banana.value);
//        }
//
//        Apple apple = new Apple();
//        for (int i = 0; i < bananas.length && !animal.eat(bananas[i]); i++) {
//            animal.areYouHungry();
//        }
        //animal.eat(ant);

        while (predator.hungry < 0) {
            Banana banana = new Banana(Banana.name,Banana.value, Banana.count);

            Rabbit rabbit = new Rabbit(Rabbit.name, Rabbit.value, Rabbit.count);

            System.out.println(rabbit.count);
            if (rabbit.count > 0) {
                predator.eat(rabbit);
                rabbit.count--;
                predator.areYouHungry();
            } else {
                System.out.println("Еда кончилась");
                break;
            }
        }
        //predator.areYouHungry();
        while (herbivore.hungry < 0) {
            Banana banana = new Banana(Banana.name, Banana.value, Banana.count);
            herbivore.eat(banana);
        }
        //herbivore.areYouHungry();
//        for(Banana banana : bananas){
//            if(banana.value == 0){
//                System.out.println("Тут только кожура!");
//            } else {
//                System.out.println("Пиательный банан!");
//            }
//        }
    }
//    public static void feedAnimal(Herbivore herbivore){
//        while(herbivore.hungry<0){
//        Banana banana = new Banana(Banana.name,Banana.value);
//        herbivore.eat(banana);
//        }
//        herbivore.areYouHungry();
//    }


    public static void main(String[] args) {
        Monkey bob = new Monkey("Bob", -112, 1);
        Wolf charlie = new Wolf("charlie", -105);
        feedAnimal(charlie, bob);


    }

}











