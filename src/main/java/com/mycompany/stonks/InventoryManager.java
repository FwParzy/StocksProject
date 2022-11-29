import java.util.ArrayList;
import java.util.Scanner;

/**
 * Let the user manage inventory
 * @author Isaac
 */
public class InventoryManager {

  Scanner in = new Scanner(System.in);
  ArrayList<Stocks> inventory = new ArrayList<Stocks>();

    /**
     * Initial "database" of stock inventory
     */
    public InventoryManager() {
    inventory.add(new Stocks("wood", 10, 11));
    inventory.add(new Stocks("Steel", 17, 11));
    inventory.add(new Stocks("Stone", 15, 11));
    inventory.add(new Stocks("Rebar", 12, 11));
  }

    /**
     * Loop that displays index number and its associated inventory
     */
    public void displayInventory() {
    for (int i = 0; i < inventory.size(); i++) {
      System.out.println("\n" + i);
      inventory.get(i).display();
    }
  }

    /**
     * Method to add a new stock to inventory
     */
    public void addInventory() {
    System.out.println("\nPlease enter the following for your stock purchase: ");
    System.out.print("\nStock Material:           ");
    String material = in.next();

    System.out.print("\nStock price bought at:    ");
    double buyPrice = in.nextDouble();

    System.out.print("\nStock quantity bought:    ");
    double qty = in.nextDouble();

    // Create user inputed stock
    inventory.add(new Stocks(material, buyPrice, qty));
    int last = inventory.size() - 1;

    System.out.println("\nYou added this to our inventory");
    inventory.get(last).display();
  }

    /**
     *Method to sell some stock and calculate profit
     */
    public void sellInventory() {
    displayInventory();
    System.out.println("What do you want to sell?");
    int ind = in.nextInt();

    System.out.println("\nHow many did you sell?");
    double qty = in.nextDouble();

    System.out.println("\nHow much did you sell for?");
    double sellPrice = in.nextDouble();

    inventory.get(ind).sellQty(qty, sellPrice);
    inventory.get(ind).display();
  }

    /**
     * This is what controls the Inventory Manager
     * It's a loop that will direct the user to what they want to do
     */
    public void runInputCheck() {
    System.out.println("\nWhat would you like to do with your Inventory?");
    String input = "";

    while (!input.equals("back")) {
      System.out.println("\ndisplay, add, sell, back\n");
      input = in.next();
      if (input.equals("display")) {
        displayInventory();
      } else if (input.equals("add")) {
        addInventory();
      } else if (input.equals("sell")) {
        sellInventory();
      }
    }
  }
}
