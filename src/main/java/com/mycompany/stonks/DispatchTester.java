import java.util.Scanner;

/**
 * This controls the dispatch truck
 * @author Ayonna
 */
public class DispatchTester {
    
    /**
     * control the dispatch truck via user input
     * @param args user input
     */
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    Dispatch menu = new Dispatch();
    String date1;
    String date2;
    String where;

    do {
      // Dispatch Menu
      System.out.println(
          """
                                                    Dispatch Menu

              1.Truck Status   |   2.Date   |   3.Location   |   4. View Report   |   5. Exit Dispatch Menu

              Choose an area to update:
              """);

      menu.scan(in.nextInt());

      // Truck status
      if (menu.getScan() == 1) {
        System.out.println(
            """
                                  Truck Status

                1. Here        2. Gone       3. Exit Dispatch Menu""");

        menu.scan(in.nextInt());
        if (menu.getScan() > 3 | menu.getScan() < 1) {
          System.out.println("Error: Invalid Option\n(Enter 1, 2 or 3)");
          menu.scan(in.nextInt());
        } else if (menu.getScan() == 1) {
          menu.setStatus("Here");
        } else if (menu.getScan() == 2) {
          menu.setStatus("Gone");
        } else if (menu.getScan() == 3) {
          menu.setStatus("Status: Not updated");
          break;
        } else {
          break;
        }

        // Date
      } else if (menu.getScan() == 2) {
        System.out.println(" Update Date ");

        System.out.println("Enter departure date(MM/DD/YY):");
        date1 = in.next();

        System.out.println("Enter return date(MM/DD/YY):");
        date2 = in.next();
        menu.setDate(date1, date2);

      }
      // Location
      else if (menu.getScan() == 3) {
        System.out.println("Enter Location:");
        in.nextLine();
        where = in.nextLine();
        menu.setLocation(where);
      }
      // Report
      else if (menu.getScan() == 4) {
        System.out.println("View Report\n" + menu.getReport());
      }
    } while (menu.getScan() != 5 && menu.getScan() >= 1);

    System.out.println("System Closed");
  }
}
