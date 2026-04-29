public class MVCTest {
public static void main(String[] args) {
LoginView view = new LoginView();
new LoginController(view);
}
}