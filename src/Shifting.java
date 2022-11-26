import java.util.ArrayList;

public class Shifting {
  // Shifting variables

  private String f;
  private String chart;
  private ArrayList<String> materials = new ArrayList<>();

  public Shifting() {
    this.materials = materials;

    this.materials.add("wood");
    this.materials.add("steel");
    this.materials.add("concrete");
  }

  public Shifting(String f, String chart, ArrayList materials) {

    this.f = f;
    this.chart = chart;
    this.materials = materials;
  }

  public String chart() {
    this.materials = materials;
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

  public ArrayList getMList() {
    ArrayList<String> materials = new ArrayList<>();
    materials.add("wood");
    materials.add("steel");
    materials.add("concrete");

    return materials;
  }
}
