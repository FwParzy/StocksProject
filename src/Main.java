import java.util.Scanner;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    Login user = new Login();
    InventoryManager inventory = new InventoryManager();
    CustomerManager customers = new CustomerManager();
    String answer = "";

    // Calling the login class and logging in
    user.login();

    System.out.println("Welcome to foo Inventory Management program");


    while (!answer.equals("quit")) {
      System.out.println();
      System.out.println("What would you like to manage?");
      System.out.println("Inventory, Customers, TBA, quit");
      answer = in.next();

      if (answer.equals("inventory")) {
        inventory.runInputCheck();

      } else if (answer.equals("customer") ) {
        customers.runInputCheck();
        
      }
      else {
        System.out.println("something broke");
      }

    }
    System.out.println("Thanks for using foo Inventory Management");
  }
}
