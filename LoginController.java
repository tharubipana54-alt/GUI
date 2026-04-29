import java.awt.event.*;

public class LoginController {
LoginView view;
public LoginController(LoginView v) {
view = v;
view.btnLogin.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
user user = new user(
view.txtUser.getText(),
new String(view.txtPass.getPassword())
);
if (user.validate())
view.message.setText("Login Successful");
else
view.message.setText("Invalid Username or Password");
}
});
}
}