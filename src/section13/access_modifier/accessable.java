package section13.access_modifier;

interface accessable { //package private
    int SOME_CONSTANT = 100; //public static final variable
    public void methodA(); //public
    void methodB(); //public
    boolean methodC(); //public
}
