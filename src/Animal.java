/* Animal.java
 * Final Team Project Version 2
 * Team 4 - Rafael Castillo, Ken Fojas, Michael Nazin
 * 03/20/20
 * This is the animal abstract class
 * 
 */

public abstract class Animal {
	private String name;
	private String age;
	private String gender;
	private String petId;
	private String color;
	private String lifeSpan;
	private boolean isForSale;

	// default constructor - the purpose of the constructor
	// is to initialize the data, assign default values
	// to the fields of the object.
	// The constructor is automatically called when an instance
	// of this class is created.
	// no return type, same name as the class
	public Animal() {
		// TODO Auto-generated constructor stub
		name = "Lucky";
		age = "1 Month";
		gender = "Unknown";
		petId = "12-LU54";
		color = "Mixed";
		lifeSpan = "Unknown";
		isForSale = false;
	}

	// Parameter constructor for the animal class. Sets the Name, age, gender,
	// color, lifespan, and boolean forsale.
	public Animal(String nam, String ag, String gen, String pID, String col, String lspan, boolean forSale) {
		name = nam;
		age = ag;
		gender = gen;
		petId = pID;
		color = col;
		lifeSpan = lspan;
		isForSale = forSale;
	}

	// accessor and mutator methods

	// Set animal name
	public void setName(String value) {
		value = name;
	}

	// Set animal age
	public void setAge(String value) {
		value = age;
	}

	// Set animal gender
	public void setGender(String value) {
		value = gender;
	}

	// Set animal gender
	public void setPetId(String value) {
		value = petId;
	}

	// Set animal color
	public void setColor(String value) {
		value = color;
	}

	// Set animal lifeSpan
	public void setLifeSpan(String value) {
		value = lifeSpan;
	}

	// Set animal if it is available for sale. default is set to false
	public void setIsForSale(boolean value) {
		value = isForSale;
	}

	// Return animal name
	public String getName() {
		return name;
	}

	// Return animal gender
	public String getAge() {
		return age;
	}

	// Return animal gender
	public String getGender() {
		return gender;
	}

	// Return animal gender
	public String getPetId() {
		return petId;
	}

	// Return animal color
	public String getColor() {
		return color;
	}

	// Return animal lifeSpan
	public String getLifeSpan() {
		return lifeSpan;
	}

	// Return if animal is available for sale.
	public boolean getIsForSale() {
		return isForSale;
	}

	public String toString() {
		return name + " " + gender + " " + petId + " " + color + " " + lifeSpan + " "
				+ isForSale;

	}

}
