package tasks.Inheritence.Restaurant;

public class Server extends Employee {

  public Server(String name, String title, String employeeID, double hourlyRate, boolean fullTime){
      setInfo(name, title, employeeID, hourlyRate, fullTime);
  }

  public void takeOrder(){
      System.out.println(name+" is taking an order");
  }
  public void cleaningTable(){
      System.out.println(name+" is cleaning a tables");
  }
}
