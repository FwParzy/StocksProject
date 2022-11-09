public class Stocks {

  private String company;
  private String material;
  private double buyPrice;
  private double qty;
  private double profit;

  public Stocks() {
    this.company = "Default Company";
    this.material = "Default material";
    this.buyPrice = 20;
    this.qty = 1;
    this.profit = profit - (buyPrice * qty);
  }

  public Stocks(String company, String material, double buyPrice, double qty) {
    this.company = company;
    this.material = material;
    this.buyPrice = buyPrice;
    this.qty = qty;
    this.profit = profit - (buyPrice * qty);
  }

  // Getters
  public String getStockCompany() {
    return this.company;
  }
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

  // Set Qty and get profits
  // TODO THIS IS A WORK IN PROGRESS AND SUBJECT TO CHANGE
  public void setQty(double qty, double sellPrice) {
    // Calculate profits
    // Old quantity
    double temp = this.qty;
    double soldQty = qty;
    // Calculate the new ammount
    this.qty = temp - soldQty;
    if (this.qty >= 0) {
      this.profit = (this.qty * sellPrice) - (this.qty * buyPrice);
      System.out.println("You have this much profit so far: " + profit);
    } else {
      System.out.println("setQty Err: 0");
      System.exit(0);
    }
  }
}
