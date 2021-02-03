/* Exotic.java
 
 * 3/17/2020 */


 public abstract class Exotic extends Animal{
 
     private boolean rarity;
     

     //default constructor
    public Exotic() {
    }    
    
    public Exotic(boolean rare, String nam, String ag, String gen, String pID, String col, String lspan, boolean forSale) {
    	
    	super(nam, ag, gen, pID, col, lspan, forSale);
    	rarity = rare;
    }

        // mutator methods (setters)
    public void setRarity(boolean rare) {
    	rarity = rare;
    }

	// Return if animal is available for sale.
	public boolean getRarity() {
		return rarity;
	}

}
