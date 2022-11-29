
/**
 * This is what controls what each of our inventory options are
 * @author Isaac
 */
public class Stocks {

  private String material;
  private double buyPrice;
  private double qty;
  private double profit;

    /**
     * This is the default Stock if you don't add any params
     */
    public Stocks() {
    this.material = "Default material";
    this.buyPrice = 20;
    this.qty = 1;
    this.profit = profit - (buyPrice * qty);
  }

    /**
     * Override stock object
     * @param material this is the material in the inventory
     * @param buyPrice this is the price we got the material for profit calculations
     * @param qty this is the amount we have
     */
    public Stocks(String material, double buyPrice, double qty) {
    this.material = material;
    this.buyPrice = buyPrice;
    this.qty = qty;
    this.profit = profit - (buyPrice * qty);
  }

  // Getters

    /**
     * get stock material
     * @return material
     */
  public String getStockMaterial() {
    return this.material;
  }

    /**
     * get the price bought at
     * @return buyPrice
     */
    public double getStockBuyPrice() {
    return this.buyPrice;
  }

    /**
     * get quantity owned
     * @return qty
     */
    public double getStockQty() {
    return this.qty;
  }

    /**
     * get profits made so far
     * @return profit made
     */
    public double getStockProfit() {
    return this.profit;
  }

    /**
     * display everything inside the stocks object
     */
    public void display() {
    System.out.println("Material:  " + this.material);
    System.out.println("Buy Price: " + this.buyPrice);
    System.out.println("Quantity:  " + this.qty);
    System.out.println("Profit:    " + this.profit);
  }

  // Setters

    /**
     * set the material
     * @param material that we have in inventory
     */
  public void setMaterial(String material) {
    this.material = material;
  }

    /**
     * set the buy price
     * @param buyPrice price we bought the material at
     */
    public void setBuyPrice(double buyPrice) {
    this.buyPrice = buyPrice;
  }

    /**
     * set the quantity
     * @param qty amount of material bought
     */
    public void setQty(double qty) {
    this.qty = qty;
  }

    /**
     * set your profits. Don't get caught
     * @param profit profit that we have made
     */
    public void setProfit(double profit) {
    this.profit = profit;
    System.out.println("The IRS is going to come after you");
  }

    /**
     * calculate quantity and profit on a transaction
     * @param qty amount of material we just sold
     * @param sellPrice what er sold the material for
     * Here we are calculating profit
     */
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
