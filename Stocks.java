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

  // Getters
  public double getStock() {
    return this.name;
    return this.abbr;
    return this.buyPrice;
    return this.qty;
    return this.profit;
  }
  public double getStockName() {
    return this.name;
  }
  public double getStockAbbr() {
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
  public void setQty(String qty) {
    // Ask for selling qty
    // Ask for selling buyPrice
    // Calculate profits
    double temp = this.qty;
    this.qty = qty;
    double sum = this.temp - qty;
    if (sum >= 0) {
      profit = (sum * buyPrice);
    } else {
      System.out.println("setQty Err: 0");
    }
  }
}
