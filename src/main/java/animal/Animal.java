package animal;
import food.*;

public abstract class Animal {
    public int hungry;
    public String animalName;

    public Animal(String animalName, int hungry) {
        this.hungry = hungry;
        this.animalName = animalName;
    }

    public abstract String getAnimalType();
    public abstract int getHungry();

    public void areYouHungry() {
        if (hungry >= 0) {
            System.out.println(animalName + " сытый");
        } else {
            System.out.println(animalName + " хочет кушать " + hungry);
        }
    }



    public void eat(Food food) throws EatException {
        if(getAnimalType().equals(Predator.type)){
            if (food.getFoodType().equals(FoodForPredators.type)) {
                hungry += food.getValue();
                System.out.println(animalName + " съел одного " + food.foodName);
            } else{
                throw new EatException();
            }
        }else {
            if (food.getFoodType().equals(FoodForHerbivores.type)) {
                hungry += food.getValue();
                System.out.println(animalName + " съел одного " + food.foodName);
            } else{
                throw new EatException();
            }
        }
    }
//    public void eat(Food food) {
//        if (getAnimalType().equals(Predator.type)) {
//            if (food.getFoodType().equals(FoodForPredators.type)) {
//                hungry += food.getValue();
//                System.out.println(animalName + " съел одного " + food.foodName);
//            } else if (food.getFoodType().equals(FoodForHerbivores.type)) {
//                System.out.println(food.foodName + " мне не подходит");
//            }
//        }else {
//            if (food.getFoodType().equals(FoodForHerbivores.type)) {
//                hungry += food.getValue();
//                System.out.println(animalName + " съел один " + food.foodName);
//            } else if (food.getFoodType().equals(FoodForPredators.type)) {
//                System.out.println(food.foodName + " мне не подходит");
//            }
//        }
//
//    }
}
