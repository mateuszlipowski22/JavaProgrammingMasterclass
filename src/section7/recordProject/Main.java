package section7.recordProject;

public class Main {

    public static void main(String[] args) {

        for (int i = 1; i <=5 ; i++) {
            Student s = new Student("90219"+i,
                    switch (i){
                        case 1 -> "Mary";
                        case 2 -> "Carol";
                        case 3 -> "Tim";
                        case 4 -> "Harry";
                        case 5 -> "Lisa";
                        default -> "Anonimus";
                    },"05/11/1985"
                    ,"Java Masterclass");
            System.out.println(s);

        }


    }

}
