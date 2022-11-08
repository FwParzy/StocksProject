import java.util.Scanner;

public class Tester {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    System.out.println("What would you like to test?");
    System.out.println("login, stocks, ...");
    String answer = scan.next();
    
    if (answer.equals("login")) {
    Login user = new Login();
    user.login();

    System.out.println("Sucess!");
    answer = "";
    } else if (answer.equals("stocks")) {
      // Autogenerate stock
      Stocks facebook = new Stocks();
      System.out.println(facebook.getStock());

      // Get user input for different stock
      System.out.println("Please enter the following for your stock purchase: ");
      System.out.println("Stock Name:         ");
      String name = scan.next();
      System.out.println("Stock Abbreviation: ");
      String abbr = scan.next();
      System.out.println("Stock Buy Price:    ");
      double buyPrice = scan.nextInt();
      System.out.println("Quantity Bought:    ");
      double qty = scan.nextInt();
      // Create user inputed stock
      Stocks foo = new Stocks(name, abbr, buyPrice, qty);
      System.out.println(foo.getStock());

    }
  }
}
