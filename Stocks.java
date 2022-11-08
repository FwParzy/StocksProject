public class Stocks {

  private String name;
  private String abbr;
  private double buyPrice;
  private double qty;
  private double profit;

  public Stocks() {
    this.name = "Default Stock";
    this.abbr = "DFS";
    this.buyPrice = 20;
    this.qty = 1;
    this.profit = profit - (buyPrice * qty);
  }

  public Stocks(String name, String abbr, double buyPrice, double qty) {
    this.name = name;
    this.abbr = abbr;
    this.buyPrice = buyPrice;
    this.qty = qty;
    this.profit = profit - (buyPrice * qty);
  }

    String a = Double.toString(this.buyPrice);
    String b = Double.toString(this.qty);
    String c = Double.toString(this.profit);
  // Getters
  // TODO FIX THIS BECAUSE ITS BROKEN
  public String getStock() {
    return this.name;
    return this.abbr;
    return this.a;
    return this.b;
    return this.c;
  }
  public String getStockName() {
    return this.name;
  }
  public String getStockAbbr() {
    return this.abbr;
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
