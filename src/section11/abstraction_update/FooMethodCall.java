package section11.abstraction_update;

import java.lang.reflect.Method;

public class FooMethodCall{
    public static void main(String[] args)throws Exception{
        Class c = Class.forName("section11.abstraction_update.Foo");
        Object o= c.newInstance();
        Method m =c.getDeclaredMethod("message", null);
        m.setAccessible(true);
        m.invoke(o, null);
    }
}