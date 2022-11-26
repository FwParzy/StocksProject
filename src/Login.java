import java.util.Scanner;

public class Login {

  public void login() {
    Scanner scan = new Scanner(System.in);

    // This is the login prompt
    System.out.println("Please enter in your username: ");
    String userName = scan.next();
    System.out.println("Please enter in your password: ");
    String pass = scan.next();

    // Here we check to see if login credentials are correct
    if (userName.equals("admin") && pass.equals("123")) {
      System.out.println("Logged In!");
    } else {
      System.out.println("Error!");
      System.exit(0);
    }
  }
}
