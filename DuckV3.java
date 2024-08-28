//Unit 2
//Overloaded Constructor example
//Void methods without parameters example
//Void methods with parameters example

public class DuckV3{
  private String name = "";
  private int id = 0;
  private String occupation = "";
  private boolean hungry = true;
  private int distance = 0;

  public DuckV3(){
    this.name = "default duck";
    this.id = 999;
    this.occupation = "unemployed";
    System.out.println("I'm in the default constructor!");
  }

  public DuckV3(String name, int id, String occupation){
    this.name = name;
    this.id = id;
    System.out.println("I'm in the \"name\" and \"ID\" and \"occupation\" constructor!");
  }

  public void feed(){
    this.hungry = false;
    System.out.println(this.name + " appreciates your generosity!");
  }

  public void produceWaste(){
    this.hungry = true;
    System.out.println(this.name + " feels much better, albeit hungry.");
  }

  public boolean isHungry(){
    return this.hungry;
  }

  public void setName(String name){
    String temp = this.name;
    this.name = name;
    System.out.println(temp + " shall now be known as " + this.name + "!");
  }

  public String getName(){
    return this.name;
  }

  public void setOccupation(String occupation){
    String temp = this.occupation;
    this.occupation = occupation;
    System.out.println(this.name + " has switched occupations from " + temp + " to " + this.occupation + "!");
  }

  public String getOccupation(){
    return this.occupation;
  }

  public int getID(){
    return this.id;
  }

  public void setNameAndOccupation(String name, String occupation){
    this.setName(name);
    this.setOccupation(occupation);
    System.out.println("Wow! What an exciting time to be " + this.name + "?!");
  }

  public String toString(){
    return "Name: " + name + "\nID: " + id + "\nOccupation: " + occupation;
  }

  public void swim(){
    this.distance += 1;
  }

  public void swim(int distance){
    this.distance += distance;
  }

  public int locateDuck(){
    return this.distance;
  }
}
