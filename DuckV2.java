//Unit 2
//Overloaded Constructor example
//Void methods without parameters example
//Void methods with parameters example

public class DuckV2{
  private String name = "";
  private int id = 0;
  private String occupation = "";
  private boolean hungry = true;

  public DuckV2(String name){
    this.name = name;
    System.out.println("I'm in the \"name\" constructor!");
  }

  public DuckV2(String name, int id){
    this.name = name;
    this.id = id;
    System.out.println("I'm in the \"name\" and \"ID\" constructor!");
  }

  public DuckV2(String name, int id, String occupation){
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

  public void setName(String name){
    String temp = this.name;
    this.name = name;
    System.out.println(temp + " shall now be known as " + this.name + "!");
  }

  public void setOccupation(String occupation){
    String temp = this.occupation;
    this.occupation = occupation;
    System.out.println(this.name + " has switched occupations from " + temp + " to " + this.occupation + "!");
  }

  public void setNameAndOccupation(String name, String occupation){
    this.setName(name);
    this.setOccupation(occupation);
    System.out.println("Wow! What an exciting time to be " + this.name + "?!");
  }
}
