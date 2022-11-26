import java.util.Scanner;

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
      System.out.println("Inventory, Customers, Dispatch, Shift, quit");
      answer = in.next();

      if (answer.equals("Inventory")) {
        inventory.runInputCheck();

      } else if (answer.equals("Customer")) {
        customers.runInputCheck();

      } else if (answer.equals("Dispatch")) {
        DispatchTester.main(args);

      } else if (answer.equals("Shift")) {
        ShiftingTester.main(args);

      } else {
        System.out.println("something broke");
      }
    }
    System.out.println("Thanks for using foo Inventory Management");
  }
}
