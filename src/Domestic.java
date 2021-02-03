

public abstract class Domestic extends Animal {

	private String breedType;
	private String temperament;

	// Default Constructor
	public Domestic()
	{

	}

	// Parameter constructor
	public Domestic(String breed, String temp, String nam, String ag, String gen, String pID, String col, String lspan, boolean forSale) 
	{
		super(nam, ag, gen, pID, col, lspan, forSale);
		breedType = breed;
		temperament = temp;
	}

	// mutator methods (setters)
	public void setBreedType(String breed) 
	{
		breedType = breed;
	}

	public void setTemperament(String temper) 
	{
		temperament = temper;
	}

	// accessor methods (getters)
	public String getBreedType() 
	{
		return breedType;
	}

	public String getTemperament() 
	{
		return temperament;
	}

}