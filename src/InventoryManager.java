import java.util.Scanner;
import java.util.ArrayList;

public class InventoryManager {
 
    Scanner in = new Scanner(System.in);
    ArrayList<Stocks> inventory = new ArrayList<Stocks>();
  

  public InventoryManager() {
    inventory.add(new Stocks("wood", 10, 11));
    inventory.add(new Stocks("Steel", 17, 11));
    inventory.add(new Stocks("Stone", 15, 11));
    inventory.add(new Stocks("Rebar", 12, 11));
  }

  public void displayInventory() {
    for (int i=0; i<inventory.size(); i++) {
      System.out.println(i);
      inventory.get(i).display();
    }
  }

  public void addInventory() {
    System.out.println("Please enter the following for your stock purchase: ");
    System.out.print("Stock Material:           ");
    String material = in.next();

    System.out.print("Stock price bought at:    ");
    double buyPrice = in.nextDouble();

    System.out.print("Stock quantity bought:    ");
    double qty = in.nextDouble();

    // Create user inputed stock
    inventory.add(new Stocks(material, buyPrice, qty));
    int last = inventory.size() - 1;

    System.out.println("You added this to our inventory");
    inventory.get(last).display();
  }

  public void sellInventory() {
    System.out.println("What do you want to sell?");
    int ind = in.nextInt();

    System.out.println("How many did you sell?");
    double qty = in.nextDouble();

    System.out.println("How much did you sell for?");
    double sellPrice = in.nextDouble();

    inventory.get(ind).sellQty(qty, sellPrice);
  }


  public void runInputCheck() {
    System.out.println("What would you like to do with your Inventory?");
    String input = "";

    while (!input.equals("back")) {
    System.out.println("display, add, sell, back");
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
