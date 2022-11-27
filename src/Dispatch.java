public class Dispatch {
  // Dispatch variables
  private String status;
  private String date;
  private String d;
  private String r;
  private String location;
  private int scan;
  private String report;

  public Dispatch() {
    status = "N/A";
    date = "Date: N/A";
    location = "N/A";
  }

  public Dispatch(String status, String date, String location, int scan, String d, String r) {
    this.status = status;
    this.date = date;
    this.location = location;
    this.scan = scan;
    this.d = d;
    this.r = r;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public void setDate(String d, String r) {
    this.d = d;
    this.r = r;
    date = "Departure: " + d + "\nReturn: " + r;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public void scan(int scan) {
    this.scan = scan;
  }

  public void setReport(String status, String date, String location) {
    this.status = status;
    this.date = date;
    this.location = location;
  }

  public String getStatus() {
    return status;
  }

  public String getDate() {
    return date;
  }

  public String getLocation() {
    return location;
  }

  public int getScan() {
    return scan;
  }

  public String getReport() {
    report = "Status: " + this.status + "\n" + this.date + "\nLocation: " + this.location;
    return report;
  }
}
