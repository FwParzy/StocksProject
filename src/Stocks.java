public class Stocks {

  private String material;
  private double buyPrice;
  private double qty;
  private double profit;

  public Stocks() {
    this.material = "Default material";
    this.buyPrice = 20;
    this.qty = 1;
    this.profit = profit - (buyPrice * qty);
  }

  public Stocks(String material, double buyPrice, double qty) {
    this.material = material;
    this.buyPrice = buyPrice;
    this.qty = qty;
    this.profit = profit - (buyPrice * qty);
  }

  // Getters
  public String getStockMaterial() {
    return this.material;
  }

  public double getStockBuyPrice() {
    return this.buyPrice;
  }

  public double getStockQty() {
    return this.qty;
  }

  public double getStockProfit() {
    return this.profit;
  }

  public void display() {
    System.out.println("Material:  " + this.material);
    System.out.println("Buy Price: " + this.buyPrice);
    System.out.println("Quantity:  " + this.qty);
    System.out.println("Profit:    " + this.profit);
  }

  // Setters
  public void setMaterial(String material) {
    this.material = material;
  }

  public void setBuyPrice(double buyPrice) {
    this.buyPrice = buyPrice;
  }

  public void setQty(double qty) {
    this.qty = qty;
  }

  public void setProfit(double profit) {
    this.profit = profit;
    System.out.println("The IRS is going to come after you");
  }

  public void sellQty(double qty, double sellPrice) {
    // Calculate profits
    // Old quantity
    double temp = this.qty;
    // New quantity just passed into method
    double soldQty = qty;
    // Calculate the quantity remaining
    this.qty = temp - soldQty;
    // If remaining quantity greater than or = to 0
    if (this.qty >= 0) {
      this.profit = this.profit + (soldQty * sellPrice);
      System.out.println("You have this much profit so far: " + profit);
    } else {
      System.out.println("You cant do that. Please dont try to sell more than you own");
    }
  }
}
