import java.util.*;

public class Weapon{
  private String type;
  private int mindamage;
  private int maxdamage;

  public Weapon(){
    type = "longsword";
    mindamage = 4;
    maxdamage = 12;
  }

  public Weapon(String type, int mindamage, int maxdamage){
    this.type = type;
    this.mindamage = mindamage;
    this.maxdamage = maxdamage;
  }

  public void setType(String type){
    this.type = type;
  }

  public String getType(){
    return type;
  }

  public void setMindamage(int mindamage){
    this.mindamage = mindamage;
  }

  public int getMindamage(){
    return mindamage;
  }

  public void setMaxdamage(int maxdamage){
    this.maxdamage = maxdamage;
  }

  public int getMaxdamage(){
    return maxdamage;
  }

  public int damage(){
    Random randomGenerator = new Random();
    int dg = randomGenerator.nextInt(maxdamage - (mindamage - 1));
    int dam = mindamage + dg;
    return dam;
  }
}
