import java.util.Scanner;

public class Game{
	

  private static Character setupCharacter(String mvh){
	Scanner input = new Scanner(System.in);
    System.out.println(mvh);
    String namn = input.nextLine();
    System.out.println("Skill?");
    int skill = input.nextInt();
    System.out.println("Skydd?");
    int skydd = input.nextInt();
    Weapon vapen = setupWeapon();
    Shield skold = setupShield();
    return new Character(namn, skill, skydd, vapen, skold);
  }

  private static Weapon setupWeapon(){
	Scanner input = new Scanner(System.in);
    System.out.println("Vill du ha ett longsword?");
    String svar = input.nextLine();
    if(svar.equalsIgnoreCase("ja"))
      return new Weapon();
    System.out.println("Vilket vapen vill du ha?");
    String typ = input.nextLine();
    System.out.println("Vad är minimiskadan på det vapnet?");
    int minskada = input.nextInt();
    System.out.println("Och maxskadan?");
    int maxskada = input.nextInt();
    return new Weapon(typ, minskada, maxskada);
  }

  private static Shield setupShield(){
		Scanner input = new Scanner(System.in);
	    System.out.println("Vill du ha en sköld?");
	    String svar = input.nextLine();
	    if(svar.equalsIgnoreCase("ja"))
	    return new Shield();
	    System.out.println("Vilket Sköld vill du ha?");
	    String Sht = input.nextLine();
	    System.out.println("Vilken Area har Skölden (Kvadrat Cenimeter)?");
	    int CTB = input.nextInt();
	    return new Shield(Sht, CTB);
	  }
  private static boolean fajt(Character a, Character b){
    int dam = a.hit(b);
    b.setHp(b.getHp()-dam);
    if(b.getHp() < 1){
      b.dies();
      System.out.println(a.getName() + " har krossat " + b.getName());
      System.out.println("Det verkar som om " + a.getWeapon().getType() + " är ett överlägset vapen och " + a.getShield().getShieldType() + " är ett överlägset Sköld.");
      return false;
    }
    return true;
  }

  public static void main(String[] args){
    System.out.println("Välkommen till aftonens huvudattraktion");
    Character a = setupCharacter("I vänster ringhörna ser vi?");
    Character b = setupCharacter("och i höger har vi?");
    boolean mer = true;
    while(mer){
      mer = fajt(a, b);
      if(mer)
        mer = fajt(b, a);
    }
  }
}

