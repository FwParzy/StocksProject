import java.util.Scanner;

public class Tester {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    boolean stop = false;

    while (stop == false) {

      System.out.println("What would you like to test?");
      System.out.println("login, stocks, customer, exit ...");
      String answer = scan.next();


      if (answer.equals("login")) {

        Login user = new Login();
        user.login();

        System.out.println("Sucess!");
        answer = "";

      } else if (answer.equals("stocks")) {

        Stocks inventory[] = new Stocks[256];
        
        // Get user input for different stock
        System.out.println("Please enter the following for your stock purchase: ");
        System.out.print("Stock Material:           ");
        String material = scan.next();

        System.out.print("Stock price bought at:    ");
        double buyPrice = scan.nextDouble();

        System.out.print("Stock quantity bought:    ");
        double qty = scan.nextDouble();

        // Create user inputed stock
        inventory[1] = new Stocks(material, buyPrice, qty);
        inventory[1].display();
        answer = "";

      } else if (answer.equals("customer")) {
        
        Customer customer1 = new Customer();

        Customer customer2 = new Customer();

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a name: ");

        customer1.setName(in.next());

        //System.out.println("Enter a name: ");

        // customer2.setName(in.next());

        System.out.println("Enter a material: ");

        customer1.setMaterial(in.next());

        System.out.println("Enter number of units to purchase: ");

        customer1.setAmount(in.nextDouble());

        System.out.println("Price per unit will be: ");

        customer1.setPrice(in.nextDouble());

        System.out.println("Name: " + customer1.getName() + "  " + "Material: " + customer1.getMaterial() + "  " + "Units to purchase: " + customer1.getAmount() + "  " + "The price in dollars will be: " + customer1.getTotalPrice());

        // System.out.println("Name is: " + customer2.getName());

        answer = "";
      } else if (answer.equals("quit")) {
        stop = true;
      }

    }
  }
}
