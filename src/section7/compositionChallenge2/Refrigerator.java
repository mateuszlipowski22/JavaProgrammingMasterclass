package section7.compositionChallenge2;

public class Refrigerator {

    private boolean hasWorkToDo;

    public Refrigerator() {
        this.hasWorkToDo=false;
    }

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood(){
        if(hasWorkToDo==true){
            System.out.println("Food is ordered");
            hasWorkToDo=false;
        };
    }

}
