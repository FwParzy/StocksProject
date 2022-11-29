
/**
 * The customer object
 * @author Michael
 * @author Isaac
 */
public class Customer {

  private String name;
  private String material;
  private double profit;

    /**
     * Empty Customer object
     */
    public Customer() {}

    /**
     * Override object
     * @param name the name of the customer
     * @param material the material the customer bought
     * @param profit the profits we have made off of the customer
     */ 
    public Customer(String name, String material, double profit) {
    this.name = name;
    this.material = material;
    this.profit = profit;
  }

    /**
     * Set the customers name
     * @param name set customer name
     */
    public void setName(String name) {
    this.name = name;
  }

    /**
     * get the customers name
     * @return customer name
     */
    public String getName() {
    return name;
  }

    /**
     * set the material the customer bought
     * @param material set material bought
     */
    public void setMaterial(String material) {
    this.material = material;
  }

    /**
     * get the material the customer bought
     * @return material bought
     */
    public String getMaterial() {
    return material;
  }

    /**
     * set the profit made off of the customer
     * @param profit set profits made off of customer
     */
    public void setProfit(double profit) {
    this.profit = profit;
  }

    /**
     * get the profit made off of the customer
     * @return profits made off of customer
     */
    public double getProfit() {
    return profit;
  }

    /**
     * calculate the profit made off of the customer
     * @param newMoneys The money that the customer just payed us
     */
    public void calculateProfit(double newMoneys) {
    profit = newMoneys + this.profit;
  }

    /**
     * get the receipt for the customer
     * @param name of the customer
     * @param material that the customer bought
     * @param totalPrice that the customer has spent
     * @param amount - quantity of material bought
     * @param price the material was bought at
     */
    public void getReceipt(
      String name, String material, double totalPrice, double amount, double price) {
    System.out.println("----------------------");
    System.out.println("|Receipt|");
    System.out.println("Name: " + name);
    System.out.println("Materials     Quantity     Profit");
    // System.out.printf(material + "%14s %12.2f \n", amount, price);
    System.out.println("Total: " + totalPrice);
    System.out.println("----------------------");
  }

    /**
     * displays what we have on the customer
     */
    public void display() {
    System.out.println("Customer:  " + this.name);
    System.out.println("Material:  " + this.material);
    System.out.println("Profit:    " + this.profit);
    System.out.println();
  }
}
