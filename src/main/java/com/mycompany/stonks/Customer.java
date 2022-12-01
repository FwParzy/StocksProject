/**
 * The customer object
 * @author Michael
 * @author Isaac
 */
public class Customer {

  private String name;
  private String material;
  private double profit;

  /** Empty Customer object */
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

  /** displays what we have on the customer */
  public void display() {
    System.out.println("|      Receipt      |");
    System.out.println("Customer:  " + this.name);
    System.out.println("Material:  " + this.material);
    System.out.println("Total:     " + this.profit);
    System.out.println();
  }
}
