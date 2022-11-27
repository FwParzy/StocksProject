import java.util.ArrayList;
import java.util.Scanner;

public class CustomerManager {

  Scanner in = new Scanner(System.in);
  ArrayList<Customer> customers = new ArrayList<Customer>();

  public CustomerManager() {
    customers.add(new Customer("bob", "wood", 5, 20));
    customers.add(new Customer("zaxbys", "Stone", 2, 30));
  }

  public void displayCustomers() {
    System.out.println();
    for (int i = 0; i < customers.size(); i++) {
      System.out.println(i);
      customers.get(i).display();
    }
  }

  public void addCustomer() {
    System.out.println("Please enter your customer info :");

    System.out.print("Customer Name:            ");
    String name = in.next();

    System.out.print("Stock Material:           ");
    String material = in.next();

    System.out.print("Stock price bought at:    ");
    double buyPrice = in.nextDouble();

    System.out.print("Stock quantity bought:    ");
    double qty = in.nextDouble();

    // Create user inputed customer
    customers.add(new Customer(name, material, qty, buyPrice));
    int last = customers.size() - 1;

    System.out.println("You added this customer to our 'database'");
    customers.get(last).display();
  }

  public void runInputCheck() {
    System.out.println("What would you like to do with your Customers?");
    String input = "";

    while (!input.equals("back")) {
      System.out.println("display, add, back");
      input = in.next();
      if (input.equals("display")) {
        displayCustomers();
      } else if (input.equals("add")) {
        addCustomer();
      }
    }
  }
}
