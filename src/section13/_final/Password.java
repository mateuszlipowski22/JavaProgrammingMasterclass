package section13._final;

public class Password {

    private static final int key = 324324234;
    private final int encryptedPassword;

    public Password(int password) {
        this.encryptedPassword = encrypt(password);
    }

    private int encrypt(int password){
        return  password^key;
    }

    public void storePassword(){
        System.out.println("Saving password as "+ this.encryptedPassword);
    }

    public boolean letMeIn(int password){
        if(encrypt(password)==this.encryptedPassword){
            System.out.println("Welcome");
            return true;
        }else {
            System.out.println("Nope, you cannot come in");
            return false;
        }
    }
}
