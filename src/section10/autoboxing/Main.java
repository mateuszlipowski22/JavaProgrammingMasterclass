package section10.autoboxing;

public class Main {

    public static void main(String[] args) {

        Integer boxedInt = Integer.valueOf(15); // preffered by unnecesairy
        Integer deprecatedBoxing = new Integer(15); // deprected sinced JDK 9
        int unboxedInt = boxedInt.intValue(); // unnecessary

        // Automatic
        Integer autoBoxed = 15;
        int autoUnboxed =  autoBoxed;
        System.out.println(autoBoxed.getClass().getName());
//        System.out.println(autoUnboxed.getClass().getName());


        Double resultBoxed = getLiteralDoublePrimitive();
        double resultUnboxed = getDouble();

    }

    private static Double getDouble(){
        return Double.valueOf(100.00);
    }

    private static double getLiteralDoublePrimitive(){
        return 100.0;
    }
}
