import javax.swing.*;
import java.awt.*;

public class LoginView extends JFrame {
    
JTextField txtUser = new JTextField(10);
JPasswordField txtPass = new JPasswordField(10);
JButton btnLogin = new JButton("Login");
JLabel message = new JLabel();
public LoginView() {
setTitle("Login Form");
setLayout(new GridLayout(4, 2));
add(new JLabel("Username:"));
add(txtUser);
add(new JLabel("Password:"));
add(txtPass);
add(btnLogin);
add(message);
setSize(250, 200);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
}
}