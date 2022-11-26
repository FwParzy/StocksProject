import java.util.ArrayList;
import java.util.Scanner;

public class Tester {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    boolean stop = false;

    while (stop == false) {

      System.out.println("What would you like to test?");
      System.out.println("login, stocks, customer, delete, quit ...");
      String answer = scan.next();

      // Inventory initialization
      ArrayList<Stocks> inventory = new ArrayList<Stocks>();
      inventory.add(new Stocks("wood", 10, 11));
      inventory.add(new Stocks("Steel", 10, 11));
      inventory.get(0).display();
      inventory.get(1).display();
      System.out.println(inventory.get(1));

      if (answer.equals("login")) {

        Login user = new Login();
        user.login();

        System.out.println("Sucess!");
        answer = "";

      } else if (answer.equals("stocks")) {

        // Get user input for different stock
        System.out.println("Please enter the following for your stock purchase: ");
        System.out.print("Stock Material:           ");
        String material = scan.next();

        System.out.print("Stock price bought at:    ");
        double buyPrice = scan.nextDouble();

        System.out.print("Stock quantity bought:    ");
        double qty = scan.nextDouble();

        // Create user inputed stock
        inventory.add(new Stocks(material, buyPrice, qty));
        int last = inventory.size() - 1;

        System.out.println("You added this to our inventory");
        inventory.get(last).display();

        for (int i = 0; i < inventory.size(); i++) {
          inventory.get(i).display();
        }
        // display all of the arraylist with numbers beside them TODO
        System.out.println("What do you want to change?");
        int ind = scan.nextInt();

        System.out.println("How many do you actually have");
        qty = scan.nextDouble();

        System.out.println("For How much?");
        double sellPrice = scan.nextDouble();

        inventory.get(ind).sellQty(qty, sellPrice);

        for (int i = 0; i < inventory.size(); i++) {
          inventory.get(i).display();
        }

        answer = "";

      } else if (answer.equals("customer")) {

        Customer customer1 = new Customer();

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a name: ");
        customer1.setName(in.next());

        System.out.println("Enter a material: ");
        customer1.setMaterial(in.next());

        System.out.println("Enter number of units to purchase: ");
        customer1.setAmount(in.nextDouble());

        System.out.println("Price per unit will be: ");
        customer1.setPrice(in.nextDouble());

        System.out.println(
            "Name: "
                + customer1.getName()
                + "  "
                + "Material: "
                + customer1.getMaterial()
                + "  "
                + "Units to purchase: "
                + customer1.getAmount()
                + "  "
                + "The price in dollars will be: "
                + customer1.getTotalPrice());

        answer = "";

      } else if (answer.equals("delete")) {

        System.out.println("what do you want to delete?");
        int deleteIndex = scan.nextInt();
        inventory.remove(deleteIndex);
        System.out.println("The item was deleted");
        answer = "";

      } else if (answer.equals("quit")) {
        stop = true;
      }
    }
  }
}
