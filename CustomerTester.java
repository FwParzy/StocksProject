import java.util.Scanner;
/**
 *
 * @author CrazyMike's
 */
public class CustomerTester {

  public static void main(String[] args) {
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

  }
}
