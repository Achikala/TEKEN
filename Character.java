import java.util.*;

public class Character{
  private String name;
  private int hp;
  private int skill;
  private int protection;
  private Weapon weapon;
  private Shield Shield;

  public Character(String name, int skill, int protection, Weapon weapon, Shield Shield){
    this.hp = 100;
    this.name = name;
    this.skill = skill;
    this.protection = protection;
    this.weapon = weapon;
    this.Shield= Shield;
  }

  public int hit(Character annan){
    Random randomGenerator = new Random();
    int bonk = randomGenerator.nextInt(100);
int bk = Shield.getCTB();
  if(bk > bonk){
  	 System.out.println(name + " Blockade ");
  	 return 0;
  	 }
    if(bonk < skill){
    	int tjoff = weapon.damage() - annan.getProtection();
      if(tjoff > 0){
System.out.println(name + " träffade och gav " + tjoff + " i skada");
        return tjoff;
      }
    }
    System.out.println(name + " missade");
    return 0;
}

  public void dies(){
    System.out.println("Aaaaaargh!");
  }

  public String getName(){
    return name;
  }

  public void setHp(int hp){
    this.hp = hp;
  }

  public int getHp(){
    return hp;
  }

  public int getProtection(){
    return protection;
  }

  public Weapon getWeapon(){
    return weapon;
  }
  public Shield getShield(){
	    return Shield;
 }
}
