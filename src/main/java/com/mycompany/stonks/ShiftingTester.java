import java.util.Scanner;

/**
 * Manages the shifting object ( warehouse )
 * @author Ayonna
 */
public class ShiftingTester {

    /**
     * Lets the user make warehouse changes
     * @param args
     */
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Shifting f2b = new Shifting();
    Shifting b2f = new Shifting();
    Shifting list = new Shifting();
    String exit = "n";

    int[][] stock = {
        { 5, 5 },
        { 5, 5 },
        { 5, 5 }
    };

    while (exit.equals("n")) {
      // show chart
      System.out.println("        Materials          Front            Back");
      for (int i = 0; i < stock.length; i++) {
        System.out.printf("%17s", list.getMList().get(i));

        for (int j = 0; j < stock[i].length; j++) {
          System.out.print("          " + stock[i][j]);
          System.out.print("      ");
        }
        System.out.println("          ");
      }
      // moving inventory
      System.out.println("\nUpdate front or back inventory?\n(1)Front    (2)Back\n ");
      int input = in.nextInt();
      // front inventory
      if (input == 1) {
        System.out.println(
            "Front Inventory \n 1: Wood \n  2: Steel \n 3: Concrete \n Choose stock type: ");
        int m = in.nextInt();
        if (m == 1) {
          System.out.println(
              """
                  Wood
                  Amount moved to front:
                  """);
          int n = in.nextInt();
          if (n > stock[0][1]) {
            System.out.println("!Not Available!\n");
          } else if (n == 0) {
            System.out.println("Move canceled\n");

          } else {
            // front wood
            stock[0][0] += n;
            // back wood
            stock[0][1] = (stock[0][1]) - n;
          }
        } else if (m == 2) {
          System.out.println("""
              Steel
              Amount moved to front: \n""");
          int n = in.nextInt();
          if (n > stock[1][1]) {
            System.out.println("!Not Available!\n");
          } else if (n == 0) {
            System.out.println("Move canceled\n");

          } else {
            // front steel
            stock[1][0] += n;
            // back steel
            stock[1][1] = (stock[1][1]) - n;
          }
        } else if (m == 3) {
          System.out.println(
              """
                  Concrete
                  Amount moved to front:
                  """);
          int n = in.nextInt();
          if (n > stock[2][1]) {
            System.out.println("!Not Available!\n");
          } else if (n == 0) {
            System.out.println("Move canceled\n");

          } else {
            // front concrete
            stock[2][0] += n;
            // back concrete
            stock[2][1] = (stock[2][1]) - n;
          }
        }
      }
      // -------------------back inventory -------------------
      else if (input == 2) {
        System.out.println(
            """
                Back Inventory
                (1)Wood (2)Steel (3)Concrete
                Choose stock type:
                """);
        int mat = in.nextInt();
        if (mat == 1) {
          System.out.println(
              """
                  Wood
                  Amount moved to back:
                  """);
          int n = in.nextInt();
          if (n > stock[0][0]) {
            System.out.println("!Not Available!\n");
          } else if (n == 0) {
            System.out.println("Move canceled\n");

          } else {
            // front wood
            stock[0][1] += n;
            // back wood
            stock[0][0] = (stock[0][0]) - n;
          }
        } else if (mat == 2) {
          System.out.println(
              """
                  Steel
                  Amount moved to back:
                  """);
          int n = in.nextInt();
          if (n > stock[1][0]) {
            System.out.println("!Not Available!\n");
          } else if (n == 0) {
            System.out.println("Move canceled\n");

          } else {
            // front steel
            stock[1][1] += n;
            // back steel
            stock[1][0] = (stock[1][0]) - n;
          }
        } else if (mat == 3) {
          System.out.println(
              """
                  Concrete
                  Amount moved to back:
                  """);
          int n = in.nextInt();
          if (n > stock[2][0]) {
            System.out.println("!Not Available!\n");
          } else if (n == 0) {
            System.out.println("Move canceled\n");

          } else {
            // front concrete
            stock[2][0] += n;
            // back concrete
            stock[2][1] = (stock[2][1]) - n;
          }
        }
      }
      // show chart
      System.out.println("        Materials          Front            Back");
      for (int i = 0; i < stock.length; i++) {
        System.out.printf("%17s", list.getMList().get(i));

        for (int j = 0; j < stock[i].length; j++) {
          System.out.print("          " + stock[i][j]);
          System.out.print("      ");
        }
        System.out.println("          ");
      }
      // end of program exit
      System.out.println("\nLeaving? (y) \"yes\"    (n) \"no\"");
      if (in.next().equals("y")) {
        exit = "y";
      } else {
        System.out.print(" ");
      }
    }
  }
}
