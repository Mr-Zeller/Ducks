public class Duck{
  private String name = "";
  private int ID = 0;
  private String occupation = "";

  public Duck(String name, int ID, String occupation){
    this.name = name;
    this.ID = ID;
    this.occupation = occupation;
  }

  public String toString(){
    return "Name: " + name + "\nID: " + ID + "\nOccupation: " + occupation;
  }

  public void changeOccupation(String newOccupation){
    this.occupation = newOccupation;
  }
}
