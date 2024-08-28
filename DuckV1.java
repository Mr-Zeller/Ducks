//Unit 2
//Default Constructor Example


public class DuckV1{
  private String name = "";
  private int id = 0;
  private String occupation = "";

  public String toString(){
    return "Name: " + name + "\nID: " + id + "\nOccupation: " + occupation;
  }

  public void changeOccupation(String newOccupation){
    this.occupation = newOccupation;
  }
}
