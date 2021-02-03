/* cats.java
 
 * 3/17/2020 */


 public class Cats extends Domestic{
 
     private Double weight;
     private String mood;

     //default constructor
     Cats() 
     {
    	 
     }    
     Cats(Double weigh, String mod, String breed, String temp, String nam, String ag, String gen, String pID, String col, String lspan, boolean forSale)
     {
    	 super(breed, temp, nam, ag, gen, pID, col, lspan, forSale);
    	 weight = weigh;
    	 mood = mod;
     }
     

        // mutator methods (setters)
    public void setWeight(Double weigh) {
    	weight = weigh;
    }

    public void setMood(String catMood) {
    	mood = catMood;
    }

    // accessor methods (getters)
    public Double getWeight() {
    	
        return weight;
    }

    public String getMood() {
        return mood;
    }
    
    public String toStringForLabel()
    {
    	return "<html>Name: " + getName() + "<br>Pet Id: "+ getPetId() + "<br>Breed: " + getBreedType() + "<br>Age: " + getAge() + "<br>Color: " + getColor() + "<br>Gender/Sex: " + getGender()+ "</html>";

    }
    
    public String toString() {
		return getName() + " " + getGender() + " " + getPetId() + " " + getColor() + " " + getLifeSpan() + " "
				+ getIsForSale();

	}


}
