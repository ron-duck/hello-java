public class HelloWorld {
    public static void main(String[] args) {
        String secret = "Not a Secret";
            try { 
                javax.crypto.spec.SecretKeySpec keyspec = new javax.crypto.spec.SecretKeySpec(secret.getBytes("UTF-8"), "AES"); 
            }
        catch (Exception e) { 
            System.out.println("Something went wrong."); 
        }
        System.out.println(secret);
    }
}
