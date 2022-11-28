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

  public void display() {
    System.out.println("Customer:  " + this.name);
    System.out.println("Material:  " + this.material);
    System.out.println("Profit:    " + this.profit);
    System.out.println();
  }
}
