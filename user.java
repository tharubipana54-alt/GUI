
import java.awt.*;

public class user {

private String username;
private String password;
public user(String u, String p) {
username = u;
password = p;
}
public boolean validate() {
return username.equals("admin") && password.equals("1234");
}
}