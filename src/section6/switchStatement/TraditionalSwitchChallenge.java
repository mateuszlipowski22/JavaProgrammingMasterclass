package section6.switchStatement;

public class TraditionalSwitchChallenge {

    public static void main(String[] args) {
        System.out.println("getNATOAlphabet('a') = " + getNATOAlphabet('a'));
    }

    public static String getNATOAlphabet(char letter){
        switch (letter){
            case 'a':
                return "Alpha";
            case 'b':
                return "Barker";
            case 'c':
                return "Charlie";
            case 'd':
                return "Dog";
            case 'e':
                return "Easy";
            default:
                return letter + " not found";
        }
    }
}
