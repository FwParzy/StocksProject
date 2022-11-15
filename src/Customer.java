public class Customer {

  private String name;

  private double amount;

  private String material;

  private double price;

  private double totalPrice;

  public Customer() {

  }

  public Customer(String name, String material) {
    this.material = material;
    this.name = name;

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

  public Customer(double amount, double price) {

    this.amount = amount;
    this.price = price;

  }

  public void setAmount(double amount) {

    this.amount = amount;

  }

  public double getAmount() {

    return amount;

  }

  public void setPrice(double price) {

    this.price = price;

  }

  public double getPrice() {

    return price;
  }

  public double getTotalPrice() {

    return price * amount;
  }
}
