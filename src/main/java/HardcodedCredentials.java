import java.io.*;
import java.sql.*;
import javax.crypto.spec.SecretKeySpec;

public class HardcodedCredentials {
    public static Connection getCon(String url) throws SQLException {
        return DriverManager.getConnection(url,
            /*username*/ "leroy",
            /*password*/ "jenkins");
    }
    public static SecretKeySpec getKeySpec() throws UnsupportedEncodingException {
        String secret = "It's a secret to everybody.";
        SecretKeySpec keyspec = new SecretKeySpec(secret.getBytes("UTF-8"), "MD5");
        return(keyspec);
    }
}
