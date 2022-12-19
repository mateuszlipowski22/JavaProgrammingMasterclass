package section4;

public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.print("Hello Mateusz");

        boolean isAlien = false;
        if(isAlien==false){
            System.out.print("It is not an Alien");
            System.out.print("And I am scared of aliens");
        }

        int topScore = 80;

        if(topScore > 100){
            System.out.print("You got the hight score");
        }

        int secondTopScore = 60;
        if((topScore>secondTopScore) && (topScore<100)){
            System.out.println("Greater than second top score ande less then 100");
        }

        if ((topScore>90) || (secondTopScore<=90)){
            System.out.println("Either or both conditions are true");
        }

        int newValue=50;
        if(newValue==50){
            System.out.println("This is true");
        }

        boolean isCar = true;

        if(!isCar){
            System.out.println("This in not supposed to happen");
        }

        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar=="Volkswagen" ? false : true;

        if(isDomestic){
            System.out.println("This car is domestic to out country");
        }

        String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";
        System.out.println(s);

        double firstNumber = 20.00d;
        double secondNumber = 80.00d;

        double result = (firstNumber+secondNumber)*100.00d;

        double reminder = result%40.00d;

        boolean isZero= reminder == 0.00;

        System.out.println(isZero);

        if(!isZero){
            System.out.println("Got some reminder");
        }

    }
}
