// fin

import java.util.Scanner;

/**
 * Basic login class
 * @author Isaac
 */
public class Login {

    /**
     *Very simple "login" method
     * Basically ask for some strings to match
     */
    public void login() {
    Scanner scan = new Scanner(System.in);

    // This is the login prompt
    System.out.println("\n Please enter in your username: ");
    String userName = scan.next();
    System.out.println("\n Please enter in your password: ");
    String pass = scan.next();

    // Here we check to see if login credentials are correct
    if (userName.equals("admin") && pass.equals("123")) {
      System.out.println("\n Logged In!");
    } else {
      System.out.println("\n Error!");
      System.exit(0);
    }
  }
}
