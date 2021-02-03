/* dogs.java
 
 * 3/17/2020 */


 public class Dogs extends Domestic{
 
     private double size;
     private String trainability;

     //default constructor
     Dogs() 
     {
    	 
     }    
     
     Dogs(double siz, String train,String breed, String temp, String nam, String ag, String gen, String pID, String col, String lspan, boolean forSale)
     {
    	super(breed, temp, nam, ag, gen, pID, col, lspan, forSale);
    	size = siz;
    	trainability = train;
     }
    

        // mutator methods (setters)
    public void setSize(double siz) {
        size = siz;
    }

    public void setTrainability(String train) {
    	trainability = train;
    }

    // accessor methods (getters)
    public double getSize() {
        return size;
    }

    public String getTrainability() {
        return trainability;
    }
    
    
    
    public String toStringforLabel() {
    	return "<html>Name: " + getName() + "<br>Pet Id: "+ getPetId() + "<br>Breed: " + getBreedType() + "<br>Age: " + getAge() +"<br>Weight Lbs: " + getSize()+ "<br>Color: " + getColor() + "<br>Gender/Sex: " + getGender()+ "</html>";
    }
    
    
    //to string should be in every class.
	public String toString() {
		return getName() + " " + getGender() + " " + getPetId() + " " + getColor() + " " + getLifeSpan() + " "
				+ getIsForSale();

	}

}

 