
/**
 * THis is the Dispatch object, aka the truck
 * @author Ayonna
 */
public class Dispatch {
  // Dispatch variables
  private String status;
  private String date;
  private String d;
  private String r;
  private String location;
  private int scan;
  private String report;

    /**
     * Here we initialize the dispatch object
     * We use N/A here instead of some basic values to encourage the user to change them
     */
    public Dispatch() {
    status = "N/A";
    date = "Date: N/A";
    location = "N/A";
  }

    /**
     * Dispatch overrides
     * @param status if the truck is here or gone
     * @param date d and r are combined here
     * @param location where the truck is
     * @param scan the answer to questions we asked the user
     * @param d date departed
     * @param r date return
     */
    public Dispatch(String status, String date, String location, int scan, String d, String r) {
    this.status = status;
    this.date = date;
    this.location = location;
    this.scan = scan;
    this.d = d;
    this.r = r;
  }

    /**
     * set the trucks status
     * @param status if the truck is here or not
     */
    public void setStatus(String status) {
    this.status = status;
  }

    /**
     *set the truck routes dates
     * @param d departure date
     * @param r return date
     */
    public void setDate(String d, String r) {
    this.d = d;
    this.r = r;
    date = "Departure: " + d + "\nReturn: " + r;
  }

    /**
     * set the truck destination
     * @param location where the truck is going
     */
    public void setLocation(String location) {
    this.location = location;
  }

    /**
     * get user input
     * @param scan the answer to questions we asked the user
     */
    public void scan(int scan) {
    this.scan = scan;
  }

    /**
     * set the truck status all at once
     * @param status status of the truck, here or gone
     * @param date a combination of d and r
     * @param location where the truck is going
     */
    public void setReport(String status, String date, String location) {
    this.status = status;
    this.date = date;
    this.location = location;
  }

    /**
     * get truck status
     * @return status of truck
     */
    public String getStatus() {
    return status;
  }

    /**
     * get truck travel dates
     * @return dates of truck travel
     */
    public String getDate() {
    return date;
  }

    /**
     * get truck location
     * @return location of truck
     */
    public String getLocation() {
    return location;
  }

    /**
     * get user input
     * @return answer of the user
     */
    public int getScan() {
    return scan;
  }

    /**
     * get the report of the truck
     * @return report of the truck
     */
    public String getReport() {
    report = "Status: " + this.status + "\n" + this.date + "\nLocation: " + this.location;
    return report;
  }
}
