// fin

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    Login user = new Login();
    InventoryManager inventory = new InventoryManager();
    CustomerManager customers = new CustomerManager();
    String answer = "";

    System.out.println("\nHi, I am your Digital Inventory Virtual Assistant!");
    System.out.println("You can call me Diva. Who are you?\n");

    // Calling the login class and logging in
    user.login();

    System.out.println("\nHello, Admin. Welcome to The Foo Inventory Management Program!");

    while (!answer.equals("0")) {
      System.out.println("\nWhat would you like to manage?");
      System.out.println(" Your options are: ");
      System.out.println("  1: Inventory \n  2: Customers \n  3: Dispatch \n  4: Shift \n  0: Quit");
      answer = in.next();

      if (answer.equals("1")) {
        inventory.runInputCheck();
      } else if (answer.equals("2")) {
        customers.runInputCheck();
      } else if (answer.equals("3")) {
        DispatchTester.main(args);
      } else if (answer.equals("4")) {
        ShiftingTester.main(args);
      }
    }

    System.out.println("\nThanks for using Foo Inventory Management");
  }
}