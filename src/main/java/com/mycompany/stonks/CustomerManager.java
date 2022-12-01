import java.util.ArrayList;
import java.util.Scanner;

/**
 * this manages the customer object and directs the user to actions
 * @author Elijah
 * @author Tye
 * @author Isaac
 */
public class CustomerManager {

  Scanner in = new Scanner(System.in);
  ArrayList<Customer> customers = new ArrayList<Customer>();

    /**
     *Setup the initial customer "database"
     */
    public CustomerManager() {
    customers.add(new Customer("bob", "wood", 520));
    customers.add(new Customer("zaxbys", "Stone", 230));
  }

    /**
     * Display all the customers in the Customers ArrayList
     */
    public void displayCustomers() {
    System.out.println();
    for (int i = 0; i < customers.size(); i++) {
      System.out.println("ID:             " + i);
      // customers.get(i).display();
      System.out.println("Customer name:  " + customers.get(i).getName());
    }
  }

    /**
     * Add a customer to the ArrayList
     */
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

    /**
     *Edit a customer that the user chooses
     */
    public void editCustomer() {
    char y;
    int ind;
    displayCustomers();
    System.out.println("Enter the CustomerID You would like to edit");
    ind = in.nextInt();
    customers.get(ind).display();
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

    /**
     *Update our profits made off of the customer
     */
    public void updateCustomer() {
    int ind;
    double newMoneys;
    displayCustomers();
    System.out.println("Enter the CustomerID you would like to update profits on");
    ind = in.nextInt();
    System.out.println("How much money did they just spend?");
    newMoneys = in.nextDouble();
    System.out.println("Adding " + newMoneys + " to their total money spent with us");
    customers.get(ind).calculateProfit(newMoneys);
    System.out.println("Their new total is: " + customers.get(ind).getProfit());
  }

  /*
   * get the receipt fot a specific customer
   */
  public void getReceipt() {
    int ind;
    displayCustomers();
    System.out.println("Enter the CustomerID you would like to get a receipt for.");
    ind = in.nextInt();
    // complex receipt shit
    customers.get(ind).display();
  }

    /**
     * This is where we direct the user to where they want to go
     */
    public void runInputCheck() {
    System.out.println("What would you like to do with your Customers?");
    String input = "";

    while (!input.equals("back")) {
      System.out.println("display, add, edit, update, receipt, back");
      input = in.next();
      if (input.equals("display")) {
        displayCustomers();
      } else if (input.equals("add")) {
        addCustomer();
      } else if (input.equals("edit")) {
        editCustomer();
      } else if (input.equals("update")) {
        updateCustomer();
      } else if (input.equals("receipt")) {
        getReceipt();
      }
    }
  }
}
