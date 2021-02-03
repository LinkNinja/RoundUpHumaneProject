
/* Birds.java
 
 * 3/17/2020 */


public class Birds extends Exotic {
	private boolean canTalk;
	private String fromRegion;

	// default constructor
	Birds() {

	}

	// parameterized constructor
	Birds(boolean talk, String region, boolean rare, String nam, String ag, String gen, String pID, String col, String lspan, boolean forSale) {
		super(rare ,nam, ag, gen, pID, col, lspan, forSale);
		canTalk = talk;
		fromRegion = region;
	}

	public void setCanTalk(boolean talk) {
		canTalk = talk;
	}

	public void setFromRegion(String reg) {
		fromRegion = reg;
	}

	// accessor methods (getters)
	public boolean getCanTalk() {

		return canTalk;
	}

	public String getFromRegion() {
		return fromRegion;
	}
	
    public String toStringforLabel() {
    	return "<html>Name: " + getName() + "<br>Pet Id: "+ getPetId() + "<br>Rarity: " + getRarity() + "<br>Age: " + getAge() +"<br>:Can I speak? " + getCanTalk()+ "<br>Color: " + getColor() + "<br>Gender/Sex: " + getGender()+ "</html>";
    }
}
