import java.util.ArrayList;

/**
 * Sets up weather inventory is in the front or back of our warehouse
 * @author Ayonna
 */
public class Shifting {
  // Shifting variables

  private String f;
  private String chart;
  private ArrayList<String> materials = new ArrayList<>();

    /**
     * Initialize out "database"
     */
    public Shifting() {
    this.materials.add("wood");
    this.materials.add("steel");
    this.materials.add("concrete");
  }

    /**
     * override shifting object
     * @param f
     * @param chart this is the "database
     * @param materials this is what materials are in out warehouse
     */
    public Shifting(String f, String chart, ArrayList materials) {

    this.f = f;
    this.chart = chart;
    this.materials = materials;
  }

    /**
     * display warehouse front and back of house
     * @return chart, this displays the "database"
     */
    public String chart() {
    int[][] stock = {
      {5, 5},
      {5, 5},
      {5, 5}
    };

    System.out.println("       _Materials__|__Front__|__Back_");
    for (int i = 0; i < stock.length; i++) {
      System.out.printf("%17s", this.materials.get(i));

      for (int j = 0; j < stock[i].length; j++) {
        System.out.print("          " + stock[i][j]);
        System.out.print("      ");
      }
      System.out.println("          ");
    }
    return chart;
  }

    /**
     * Return all of our warehouse inventory
     * @return materials, this is the ArrayList of available inventory to shift
     */
    public ArrayList getMList() {
    ArrayList<String> materials = new ArrayList<>();
    materials.add("wood");
    materials.add("steel");
    materials.add("concrete");

    return materials;
  }
}
