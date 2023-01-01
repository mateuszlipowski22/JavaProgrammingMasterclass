package section7.compositionChallenge2;

public class SmartKitchen {

    private CoffeeMaker coffeeMaker;
    private DishWasher dishWasher;
    private Refrigerator fridge;

    public SmartKitchen(CoffeeMaker coffeeMaker, DishWasher dishWasher, Refrigerator fridge) {
        this.coffeeMaker = coffeeMaker;
        this.dishWasher = dishWasher;
        this.fridge = fridge;
    }

    public CoffeeMaker getCoffeeMaker() {
        return coffeeMaker;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public Refrigerator getFridge() {
        return fridge;
    }


    public void doKitchenWork(){
        dishWasher.doWashing();
        fridge.orderFood();
        coffeeMaker.brewCoffee();
    }

    public void setKitchenStates(boolean dishwasherFlag, boolean coffeeFlag, boolean fridgeFlag){
        dishWasher.setHasWorkToDo(dishwasherFlag);
        fridge.setHasWorkToDo(fridgeFlag);
        coffeeMaker.setHasWorkToDo(coffeeFlag);
    }

}
