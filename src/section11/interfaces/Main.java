package section11.interfaces;

public class Main {

    public static void main(String[] args) {

        ITelephone timsPhone;
        timsPhone = new DeskPhone(123);

        timsPhone.powerOn();
        timsPhone.callPhone(123);
        timsPhone.answer();
    }

}
