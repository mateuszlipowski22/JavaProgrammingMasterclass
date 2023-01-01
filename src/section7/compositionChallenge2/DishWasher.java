package section7.compositionChallenge2;

public class DishWasher {

    private boolean hasWorkToDo;

    public DishWasher() {
        this.hasWorkToDo=false;
    }

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doWashing(){
        if(hasWorkToDo==true){
            System.out.println("Washing is done");
            hasWorkToDo=false;
        };
    }

}
