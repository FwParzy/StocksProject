public class Customer {

  private String name;
  private String material;
  private double profit;

  public Customer() {}

  public Customer(String name, String material, double profit) {
    this.name = name;
    this.material = material;
    this.profit = profit;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setMaterial(String material) {
    this.material = material;
  }

  public String getMaterial() {
    return material;
  }

  public void setProfit(double profit) {
    this.profit = profit;
  }

  public double getProfit() {
    return profit;
  }

  public void calculateProfit(double newMoneys) {
    profit = newMoneys + this.profit;
  }

  public void display() {
    System.out.println("Customer:  " + this.name);
    System.out.println("Material:  " + this.material);
    System.out.println("Profit:    " + this.profit);
    System.out.println();
  }
}
