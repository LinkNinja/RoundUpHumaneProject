import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class SelectDomesticAnimal extends JFrame implements ActionListener {
	
	
	SelectTypeGUI backToSelect;
	AnimalDetails selectedAnimal;
	
	public Dogs dogArray[] = new Dogs[9];
	public Cats catArray[] = new Cats[9];
	
	
	// Panel to hold bUTTONS buttons
	private JPanel pnlFilter;
	
	//panels to hold the dog and cat listings
	private JPanel pnlDogListing;
	private JPanel pnlCatListing;
	
	//Variables for dog buttons
	private JButton imgDog0;
	private JButton imgDog1; 
	private JButton imgDog2; 
	private JButton imgDog3; 
	private JButton imgDog4; 
	private JButton imgDog5; 
	private JButton imgDog6; 
	private JButton imgDog7; 
	private JButton imgDog8;
	
	//Variable for cat buttons
	private JButton imgCat0;
	private JButton imgCat1; 
	private JButton imgCat2; 
	private JButton imgCat3; 
	private JButton imgCat4; 
	private JButton imgCat5; 
	private JButton imgCat6; 
	private JButton imgCat7; 
	private JButton imgCat8;
	
	
	
	//Labels for the filter panel
	public JLabel lblName;
	public JLabel lblBreed;
	public JLabel lblColor;
	public JLabel lblAge;
	public JLabel lblSex;
	public JLabel lblSize;

	
	//Look into making these a drop down list instead of a text field
	//prevents user error and makes it easier to find animals.
	JTextField txtBreed = new JTextField("Beagle",10);
	JTextField txtAge = new JTextField("5 Months",10);
	JTextField txtSize = new JTextField("25",10);
	JTextField txtColor = new JTextField("Brown",10);
	JTextField txtSex = new JTextField("Male",10);
	
	private JButton btnBack = new JButton ("Back");; // This button will move the page to the next screen.
	
	private JButton btnClose = new JButton("Close"); // This button will close the application.
	

	String[] selection = {"Cats" ,"Dogs"};
	private JComboBox cmboxPetList = new JComboBox(selection);
	

	// Constructor for the Window.
	public SelectDomesticAnimal() {
		// Call super class and assign Title to window
				super("Who will you Take home today?");

				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				// Set the size of SelectTypeGUI
				setSize(1600, 1000);
				//this.setLayout(new BorderLayout());

				buildFilterPanel();
				
				this.add(pnlFilter, BorderLayout.WEST);
				
				// set visible
				setVisible(true);
				
	}
	
	

	
	public void buildFilterPanel()
	{
		//Create the text side panel
		pnlFilter = new JPanel();
		JPanel btns = new JPanel();
		
		btns.setLayout(new GridLayout(1,2));
		
		//Spanel


		//Create the dog listing 
		//Create labels for text titles
		JLabel lblBreed= new JLabel("Breed",SwingConstants.CENTER );
		JLabel lblAge= new JLabel("Age", SwingConstants.CENTER);
		JLabel lblSize= new JLabel("Weight lbs <", SwingConstants.CENTER);
		JLabel lblColor= new JLabel("Color", SwingConstants.CENTER);
		JLabel lblSex= new JLabel("Sex", SwingConstants.CENTER);

		
		//Create Button
		JButton btnFilter = new JButton("Filter");
		//Set the grid layout for the west border
		pnlFilter.setLayout(new GridLayout(25,1));
		
		String[] petStrings = { "Dog", "Cat"};
		
			
	
		//Add text fields and labels to the panels
		pnlFilter.add(cmboxPetList);
		pnlFilter.add(lblBreed);
		pnlFilter.add(txtBreed);
		pnlFilter.add(lblAge);
		pnlFilter.add(txtAge);
		pnlFilter.add(lblSize);
		pnlFilter.add(txtSize);
		pnlFilter.add(lblColor);
		pnlFilter.add(txtColor);
		pnlFilter.add(lblSex);
		pnlFilter.add(txtSex);
		
		
		// add events to action listener
		btnBack.addActionListener(new btnBackListener());
		btnClose.addActionListener(new btnCloseListener());
		btnFilter.addActionListener(new btnFilterListener());
		txtBreed.addActionListener(new btnFilterListener());
		
		//Add the button to the west panel.
		pnlFilter.add(btnFilter);
		btns.add(btnBack);
		btns.add(btnClose);
		//pnlFilter.add(btnBack);
		pnlFilter.add(btns);
		//pnlFilter.add(btns);
		
	}
	
	
	
	public void createDogListings() {

		
		pnlDogListing = new JPanel();
		//Grid layouts tried
		//6,3
		pnlDogListing.setLayout(new GridLayout (3,3));
		
		// Instantiating animal array will not give you access to all the getters and
		// setters. Use Domestic sub class to create array of
		// domestic cats and domestic dogs.

		// Create an array of 3 dogs.
		
		
		createDogs();

		//dogArray[0].toString();
		
		JLabel dog0 = new JLabel(dogArray[0].toStringforLabel()); 
		JLabel dog1 = new JLabel(dogArray[1].toStringforLabel());
		JLabel dog2 = new JLabel(dogArray[2].toStringforLabel());
		JLabel dog3 = new JLabel(dogArray[3].toStringforLabel());
		JLabel dog4 = new JLabel(dogArray[4].toStringforLabel());
		JLabel dog5 = new JLabel(dogArray[5].toStringforLabel());
		JLabel dog6 = new JLabel(dogArray[6].toStringforLabel());
		JLabel dog7 = new JLabel(dogArray[7].toStringforLabel());
		JLabel dog8 = new JLabel(dogArray[8].toStringforLabel());
		
		
		
		lblBreed = new JLabel(dogArray[0].getBreedType());
		lblColor = new JLabel(dogArray[0].getColor());
		lblAge = new JLabel(dogArray[0].getAge());
		lblSex = new JLabel(dogArray[0].getGender());
		//lblSize = new JLabel(dogArray[0].getSize());
		
		
		imgDog0.setHorizontalAlignment(SwingConstants.CENTER);
		imgDog1.setHorizontalAlignment(SwingConstants.CENTER);
		imgDog2.setHorizontalAlignment(SwingConstants.CENTER);
		imgDog4.setHorizontalAlignment(SwingConstants.CENTER);
		imgDog5.setHorizontalAlignment(SwingConstants.CENTER);
		imgDog6.setHorizontalAlignment(SwingConstants.CENTER);
		imgDog7.setHorizontalAlignment(SwingConstants.CENTER);
		imgDog8.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		dog0.setHorizontalAlignment(SwingConstants.CENTER);
		dog1.setHorizontalAlignment(SwingConstants.CENTER);
		dog2.setHorizontalAlignment(SwingConstants.CENTER);
		dog3.setHorizontalAlignment(SwingConstants.CENTER);
		dog4.setHorizontalAlignment(SwingConstants.CENTER);
		dog5.setHorizontalAlignment(SwingConstants.CENTER);
		dog6.setHorizontalAlignment(SwingConstants.CENTER);
		dog7.setHorizontalAlignment(SwingConstants.CENTER);
		dog8.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		
		imgDog0.addActionListener(new btnSelectDomesticListener());
		imgDog1.addActionListener(new btnSelectDomesticListener());
		imgDog2.addActionListener(new btnSelectDomesticListener());
		imgDog3.addActionListener(new btnSelectDomesticListener());
		imgDog4.addActionListener(new btnSelectDomesticListener());
		imgDog5.addActionListener(new btnSelectDomesticListener());
		imgDog6.addActionListener(new btnSelectDomesticListener());
		imgDog7.addActionListener(new btnSelectDomesticListener());
		imgDog8.addActionListener(new btnSelectDomesticListener());
	
		
		
		pnlDogListing.add(imgDog0);
		pnlDogListing.add(dog0);
		
		pnlDogListing.add(imgDog1);
		pnlDogListing.add(dog1);
		pnlDogListing.add(imgDog2);
		pnlDogListing.add(dog2);
		pnlDogListing.add(imgDog3);
		pnlDogListing.add(dog3);
		pnlDogListing.add(imgDog4);
		pnlDogListing.add(dog4);
		pnlDogListing.add(imgDog5);
		pnlDogListing.add(dog5);
		pnlDogListing.add(imgDog6);
		pnlDogListing.add(dog6);
		pnlDogListing.add(imgDog7);
		pnlDogListing.add(dog7);
		pnlDogListing.add(imgDog8);
		pnlDogListing.add(dog8);
		
		add(pnlDogListing);
	}
	
	
	public void createCatListings() {

		pnlCatListing = new JPanel();
		pnlCatListing.setLayout(new GridLayout (3,3));
		JLabel []cat9 = new JLabel[9];
		// Instantiating animal array will not give you access to all the getters and
		// setters. Use Domestic sub class to create array of
		// domestic cats and domestic dogs.
		// Create an array of 3 dogs.
		createCats();
		//cmboxPetList = new JComboBox(dogArray);
		add(pnlCatListing);

		JLabel cat0 = new JLabel(catArray[0].toStringForLabel());
		JLabel cat1 = new JLabel(catArray[1].toStringForLabel());
		JLabel cat2 = new JLabel(catArray[2].toStringForLabel());
		JLabel cat3 = new JLabel(catArray[3].toStringForLabel());
		JLabel cat4 = new JLabel(catArray[4].toStringForLabel());
		JLabel cat5 = new JLabel(catArray[5].toStringForLabel());
		JLabel cat6 = new JLabel(catArray[6].toStringForLabel());
		JLabel cat7 = new JLabel(catArray[7].toStringForLabel());
		JLabel cat8 = new JLabel(catArray[8].toStringForLabel());

		cat0.setHorizontalAlignment(SwingConstants.CENTER);
		cat1.setHorizontalAlignment(SwingConstants.CENTER);
		cat2.setHorizontalAlignment(SwingConstants.CENTER);
		cat3.setHorizontalAlignment(SwingConstants.CENTER);
		cat4.setHorizontalAlignment(SwingConstants.CENTER);
		cat5.setHorizontalAlignment(SwingConstants.CENTER);
		cat6.setHorizontalAlignment(SwingConstants.CENTER);
		cat7.setHorizontalAlignment(SwingConstants.CENTER);
		cat8.setHorizontalAlignment(SwingConstants.CENTER);
		
		pnlCatListing.add(imgCat0);
		pnlCatListing.add(cat0);
		pnlCatListing.add(imgCat1);
		pnlCatListing.add(cat1);
		pnlCatListing.add(imgCat2);
		pnlCatListing.add(cat2);
		pnlCatListing.add(imgCat3);
		pnlCatListing.add(cat3);
		pnlCatListing.add(imgCat4);
		pnlCatListing.add(cat4);
		pnlCatListing.add(imgCat5);
		pnlCatListing.add(cat5);
		pnlCatListing.add(imgCat6);
		pnlCatListing.add(cat6);
		pnlCatListing.add(imgCat7);
		pnlCatListing.add(cat7);
		pnlCatListing.add(imgCat8);
		pnlCatListing.add(cat8);
		
		
	}
	
	public void createDogs()
	{
		imgDog0 = new JButton(new ImageIcon("animals/cowboy.jpg"));
		imgDog1 = new JButton(new ImageIcon("animals/dog1.jpg"));
		imgDog2 = new JButton(new ImageIcon("animals/dog2.jpg"));
		imgDog3 = new JButton(new ImageIcon("animals/dog3.jpg"));
		imgDog4 = new JButton(new ImageIcon("animals/dog4.jpg"));
		imgDog5 = new JButton(new ImageIcon("animals/dog5.jpg"));
		imgDog6 = new JButton(new ImageIcon("animals/dog6.jpg"));
		imgDog7 = new JButton(new ImageIcon("animals/dog7.jpg"));
		imgDog8 = new JButton(new ImageIcon("animals/dog8.jpg"));
		
	
		dogArray[0] = new Dogs(25, "Easy", "Beagle", "Energetic", "Cowboy", "5 Years", "Male", "P-062689",
				"Blonde", "15 Years", true);
		dogArray[1] = new Dogs(45, "Medium", "Labrador", "Energetic", "Ginger", "12 Months", "Female", "P-081590",
				"White", "15 Years", true);
		dogArray[2] = new Dogs(10, "Easy", "Pomeranian", "Calm", "Puffy", "2 Years", "Male", "P-101375",
				"Black", "15 Years", true);
		dogArray[3] = new Dogs(25, "Easy", "Mastiff", "Energetic", "Rambo", "6 Months", "Male", "P-048225",
				"Black", "15 Years", true);
		dogArray[4] = new Dogs(45, "Medium", "Poodle", "Energetic", "Lucky", "12 Months", "Female", "P-809108",
				"Brown", "15 Years", true);
		dogArray[5] = new Dogs(10, "Easy", "Rottweiler", "Calm", "Brutus", "2 Years", "Male", "P-724513",
				"Black", "15 Years", true);
		dogArray[6] = new Dogs(25, "Easy", "Hound", "Energetic", "Old Yeller", "6 Months", "Male", "P-097154",
				"Brown/Black", "15 Years", true);
		dogArray[7] = new Dogs(45, "Medium", "Terrier", "Energetic", "Shady", "12 Months", "Female", "P-543985",
				"Blonde", "15 Years", true);
		dogArray[8] = new Dogs(10, "Easy", "Poodle", "Calm", "Puffy", "2 Years", "Male", "P-8473842",
				"Brown", "15 Years", true);
		
	}
	
	public void createCats()
	{
		
		
		imgCat0 = new JButton(new ImageIcon("animals/cat0.jpg"));
		imgCat1 = new JButton(new ImageIcon("animals/cat1.jpg"));
		imgCat2 = new JButton(new ImageIcon("animals/cat2.jpg"));
		imgCat3 = new JButton(new ImageIcon("animals/cat3.jpg"));
		imgCat4 = new JButton(new ImageIcon("animals/cat4.jpg"));
		imgCat5 = new JButton(new ImageIcon("animals/cat5.jpg"));
		imgCat6 = new JButton(new ImageIcon("animals/cat6.jpg"));
		imgCat7 = new JButton(new ImageIcon("animals/cat7.jpg"));
		imgCat8 = new JButton(new ImageIcon("animals/cat8.jpg"));

	    // Cats(Double weigh, String mod, String breed, String temp, String nam, String ag, String gen, String pID, String col, String lspan, boolean forSale)
	     
		catArray[0] = new Cats(25.00, "Calm", "Siamese", "Energetic", "Odin", "6 Months", "Male", "P-062689",
				"Brown/Black", "15 Years", true);
		catArray[1] = new Cats(25.00, "Calm", "Siamese", "Energetic", "Shadow", "6 Months", "Male", "P-062689",
				"Brown/Black", "15 Years", true);
		catArray[2] = new Cats(10.00, "Easy", "Hairless", "Calm", "SifU", "2 Years", "Male", "P-2222222",
				"White", "15 Years", true);
		catArray[3] = new Cats(25.00, "Calm", "Siamese", "Energetic", "Max", "6 Months", "Male", "P-062689",
				"Brown/Black", "15 Years", true);
		catArray[4] = new Cats(25.00, "Calm", "Siamese", "Energetic", "Tigger", "6 Months", "Male", "P-062689",
				"Brown/Black", "15 Years", true);
		catArray[5] = new Cats(10.00, "Easy", "Hairless", "Calm", "Oscar", "2 Years", "Male", "P-2222222",
				"White", "15 Years", true);
		catArray[6] = new Cats(25.00, "Calm", "Siamese", "Energetic", "Simba", "6 Months", "Male", "P-062689",
				"Brown/Black", "15 Years", true);
		catArray[7] = new Cats(25.00, "Calm", "Siamese", "Energetic", "Puss", "6 Months", "Male", "P-062689",
				"Brown/Black", "15 Years", true);
		catArray[8] = new Cats(10.00, "Easy", "Hairless", "Calm", "Kitty Mcgee", "2 Years", "Male", "P-2222222",
				"White", "15 Years", true);
	}
	

	
	// Action listener for the Calculate total button
	private class btnBackListener implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			backToSelect = new SelectTypeGUI();
			setVisible(false);
			
		}

	}
	
	

	
	// Action listener for the Calculate total button
	private class btnSelectDomesticListener implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {


				
			selectedAnimal = new AnimalDetails();
		
				
			setVisible(false);
		
			
			
		}

	}
	
	private class btnCloseListener implements ActionListener {

		// must override the method actionPerformed
		public void actionPerformed(ActionEvent e) {
			dispose(); // this will close out the application
		}

	}

	
	private class btnFilterListener implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
		
			for(int i=0; i< dogArray.length; i++)
			{
				String breed = dogArray[i].getBreedType();
				if (breed == txtBreed.toString())
				{
					//remove dogs[i].getName() from panel.
					//remove(dog0);
					pnlDogListing.remove(imgDog0);
					
					System.out.println("Loop Worked");
				}
				System.out.println("Loop Failed");
			
				imgDog1.setIcon(null);
				imgDog2.setIcon(null);
				imgDog3.setIcon(null);
				imgDog4.setIcon(null);
				imgDog5.setIcon(null);
				imgDog6.setIcon(null);
				imgDog7.setIcon(null);
				imgDog8.setIcon(null);
				

			}
			
			
		}

	}
	
	
	
	public static void main(String[] args) {

		SelectDomesticAnimal testing = new SelectDomesticAnimal();

	}




	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	


}
