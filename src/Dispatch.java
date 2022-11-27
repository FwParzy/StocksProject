public class Dispatch {
  // Dispatch variables
  private String status;
  private String date;
  private String location;
  private String objective;
  private int scan;
  private String report;

  public Dispatch() {
    status = "status not updated";
    date = "N/A";
    location = "N/A";
    objective = "Location: " + this.location + "\nDate: " + this.date;
    report = "" + status + "\n" + objective + "";
  }

  public Dispatch(String status, String date, String location, String objective, int scan) {
    this.status = status;
    this.date = date;
    this.location = location;
    this.objective = objective;
    this.scan = scan;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public void setObjective(String location, String date) {
    this.location = location;
    this.date = date;
  }

  public void scan(int scan) {
    this.scan = scan;
  }

  public String getStatus() {

    return status;
  }

  public String getObjective() {

    return objective;
  }

  public int getScan() {
    return scan;
  }

  public String getReport() {

    return report;
  }
}
