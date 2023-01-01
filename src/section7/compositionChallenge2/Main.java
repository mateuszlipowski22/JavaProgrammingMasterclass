package section7.compositionChallenge2;

public class Main {

    public static void main(String[] args) {

        SmartKitchen smartKitchen = new SmartKitchen(new CoffeeMaker(), new DishWasher(), new Refrigerator());

        smartKitchen.setKitchenStates(true,true,false);
        smartKitchen.doKitchenWork();

        System.out.println();
        smartKitchen.getCoffeeMaker().setHasWorkToDo(true);
        smartKitchen.getCoffeeMaker().brewCoffee();
        smartKitchen.getDishWasher().setHasWorkToDo(true);
        smartKitchen.getDishWasher().doWashing();
        smartKitchen.getFridge().setHasWorkToDo(true);
        smartKitchen.getFridge().orderFood();

    }

}
