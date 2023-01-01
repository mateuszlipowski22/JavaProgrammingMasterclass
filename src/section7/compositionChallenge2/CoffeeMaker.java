package section7.compositionChallenge2;

public class CoffeeMaker {

    private boolean hasWorkToDo;

    public CoffeeMaker() {
        this.hasWorkToDo=false;
    }

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffee(){
        if(hasWorkToDo==true){
            System.out.println("Brew coffee is done");
            hasWorkToDo=false;
        };
    }
}
