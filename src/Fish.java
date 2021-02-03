/* cats.java
 
 * 3/17/2020 */

public class Fish extends Exotic {

	private boolean freshWaterFish;
	private double fishLength;

	// default constructor
	Fish() {

	}

	Fish(boolean fresh, double length, boolean rare, String nam, String ag, String gen, String pID, String col,
			String lspan, boolean forSale) {
		super(rare, nam, ag, gen, pID, col, lspan, forSale);
		freshWaterFish = fresh;
		fishLength = length;

	}

	// mutator methods (setters)
	public void setFreshWaterFish(boolean freshType) {
		freshWaterFish = freshType;
	}

	public void setLength(double len) {
		fishLength = len;
	}

	// accessor methods (getters)
	public boolean getFreshWaterFish() {

		return freshWaterFish;
	}

	public double getLength() {
		return fishLength;
	}
	
    public String toStringforLabel() {
    	return "<html>Name: " + getName() + "<br>Pet Id: "+ getPetId() + "<br>Fresh Water: " + getFreshWaterFish() + "<br>Age: " + getAge()+ "<br>Color: " + getColor() + "<br>Gender/Sex: " + getGender()+ "</html>";
    }

}
