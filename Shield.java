import java.util.Random;



public class Shield {
	private String ShieldType;
	private int CTB; // Chance to Block
	
	
	public Shield(){
		ShieldType = "Aegis";
		CTB = 50;
		
		
	}
	public Shield(String ShieldType, int CTB){
	    this.ShieldType = ShieldType;
	    this.CTB = CTB;
	    
	  }
	 public void setShieldType(String ShieldType){
		    this.ShieldType = ShieldType;
		  }

		  public String getShieldType(){
		    return ShieldType;
		  }

		  public void setCTB(int CTB){
		    this.CTB = CTB;
		  }

		  public int getCTB(){
		    return CTB;
		  }

		  public int BC(){										//Block Chance for HomeMade Shields
			    Random randomGenerator = new Random();
			    int bg = randomGenerator.nextInt(100);
			    return bg;
		  }
}
