package section13._final;

public class SIBT {

    public static final String owner;

    static {
        owner="tim";
        System.out.println("SIBTest static initialization block called");
    }

    public SIBT(){
        System.out.println("SIB constructor called");
    }

    static{
        System.out.println("Second initialization block called");
    }

    public void someMethod(){
        System.out.println("someMethod called");
    }

}
