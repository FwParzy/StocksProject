import java.util.ArrayList;
import java.util.Scanner;

public class CustomerManager {

  Scanner in = new Scanner(System.in);
  ArrayList<Customer> customers = new ArrayList<Customer>();

  public CustomerManager() {
    customers.add(new Customer("bob", "wood", 520));
    customers.add(new Customer("zaxbys", "Stone", 230));
  }

  public void displayCustomers() {
    System.out.println();
    for (int i = 0; i < customers.size(); i++) {
      System.out.println("ID:        " + i);
      customers.get(i).display();
    }
  }

  public void addCustomer() {
    System.out.println("Please enter your customer info :");

    System.out.print("Customer Name:                   ");
    String name = in.next();

    System.out.print("Stock Material:                  ");
    String material = in.next();

    System.out.print("Profit made off the customer:    ");
    double profit = in.nextDouble();

    // Create user inputed customer
    customers.add(new Customer(name, material, profit));
    int last = customers.size() - 1;

    System.out.println("You added this customer to our 'database'");
    customers.get(last).display();
  }

  public void editCustomer() {
    char y;
    int ind;
    displayCustomers();
    System.out.println("Enter the CustomerID You would like to edit");
    ind = in.nextInt();
    System.out.println("Edit Customer Name? y/n");
    y = in.next().charAt(0);
    if (y == 'y') {
      String name = in.next();
      customers.get(ind).setName(name);
    }
    System.out.println("Edit Customer Material Bought? y/n");
    y = in.next().charAt(0);
    if (y == 'y') {
      String material = in.next();
      customers.get(ind).setMaterial(material);
    }
    System.out.println("Edit profits made off of the customer? y/n");
    y = in.next().charAt(0);
    if (y == 'y') {
      double profit = in.nextDouble();
      customers.get(ind).setProfit(profit);
    }
    System.out.println("Here are your changes");
    customers.get(ind).display();
  }

  public void updateCustomer() {
    int ind;
    double newMoneys;
    displayCustomers();
    System.out.println("Enter the CustomerID You would like to update profits on");
    ind = in.nextInt();
    System.out.println("How much money did they just spend?");
    newMoneys = in.nextDouble();
    System.out.println("Adding " + newMoneys + " to their total money spent with us");
    customers.get(ind).calculateProfit(newMoneys);
    System.out.println("Their new total is: " + customers.get(ind).getProfit());
  }

  public void runInputCheck() {
    System.out.println("What would you like to do with your Customers?");
    String input = "";

    while (!input.equals("back")) {
      System.out.println("display, add, edit, update, back");
      input = in.next();
      if (input.equals("display")) {
        displayCustomers();
      } else if (input.equals("add")) {
        addCustomer();
      } else if (input.equals("edit")) {
        editCustomer();
      } else if (input.equals("update")) {
        updateCustomer();
      }
    }
  }
}
