package section11.interfaces;

public class MobilePhone implements ITelephone{

    private int myNumber;
    private boolean isRinging;
    private boolean isOn;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        this.isOn=true;
        System.out.println("Mobile phone powered up");
    }

    @Override
    public void dial(int phoneNumber) {
        if(isOn){
            System.out.println("Now ringing " + phoneNumber + " mobile phone");
        }else{
            System.out.println("Phone is switched off");
        }
    }

    @Override
    public void answer() {
        if(isRinging){
            System.out.println("Answering deskphone");
            isRinging=false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber==myNumber && isOn){
            isRinging=true;
            System.out.println("Melody ring");
        }else{
            isRinging=false;
            System.out.println("Mobile phone is off or wrong number");
        };
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }

}
