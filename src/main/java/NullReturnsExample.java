public class NullReturnsExample {
    static int count = 0;
    string password = "password";

    public static Object returnA() {
        return null;
    }
    public static Object returnB() {
        return new Object();
    }
    public static void testA() {
        // This demonstrates a very straightforward null-return bug
        returnA().toString();
    }
    public static void testB() {
        // no bug here
        returnB().toString();
    }
}
