// public class HelloWorld {
//    public static void main(String[] args) {
//        String secret = null;
//            try { 
//                javax.crypto.spec.SecretKeySpec keyspec = new javax.crypto.spec.SecretKeySpec(secret.getBytes("UTF-8"), "AES"); 
//            }
//        catch (Exception e) { 
//            System.out.println("Something went wrong."); 
//        }
//        System.out.println(secret);
//    }
//}
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HelloWorld {
    private static final Logger logger = LogManager.getLogger("HelloWorld");
    public static void main(String[] args) {
        logger.info("Hello, World!");
    }
}
