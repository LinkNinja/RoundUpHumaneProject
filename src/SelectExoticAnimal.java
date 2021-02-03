import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;



public class SelectExoticAnimal extends JFrame {
    
	SelectTypeGUI backToSelect;
	AnimalDetails selectedAnimal;
	public Fish fishArray[] = new Fish[9];
    public Birds birdsArray[] = new Birds[9];

    
    // Panel to hold bUTTONS buttons
	private JPanel pnlFilter;
	private JPanel pnlNavigation;
	private JPanel pnlBirdsListing;
	private JPanel pnlFishListing;
	
	
	
	private JButton btnBack = new JButton ("Back");; // This button will move the page to the next screen.
	private JButton btnClose = new JButton("Close"); // This button will close the application.
	private JComboBox cmboxPetList = new JComboBox();
	

	
	private JButton imgFish0;
	private JButton imgFish1; 
	private JButton imgFish2; 
	private JButton imgFish3; 
	private JButton imgFish4; 
	private JButton imgFish5; 
	private JButton imgFish6; 
	private JButton imgFish7; 
	private JButton imgFish8;;
	
	
	private JButton imgBird0;
	private JButton imgBird1; 
	private JButton imgBird2; 
	private JButton imgBird3; 
	private JButton imgBird4; 
	private JButton imgBird5; 
	private JButton imgBird6; 
	private JButton imgBird7; 
	private JButton imgBird8;

	

	// Constructor for the Window.
	public SelectExoticAnimal() {
		// Call super class and assign Title to window
				super("Who will you Take home today?");
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				// Set the size of SelectTypeGUI
				setSize(1600, 1000);
				
				buildFilterPanel();
				
				this.add(pnlFilter, BorderLayout.WEST);
				// pnlbirdsListing.setVisible(false);
				// set visible
				setVisible(true);
				
	}
	
	

	
	public void buildFilterPanel()
	{
		//Create the text side panel
		pnlFilter = new JPanel();
		
		//Set the color to red of the west panel
		//pnlFilter.setBackground(Color.red);

		//Create the Bird listing 
	
		
		//Create labels for text titles
		JLabel lblBreed= new JLabel("Region",SwingConstants.CENTER );
		JLabel lblAge= new JLabel("Age", SwingConstants.CENTER);
		JLabel lblColor= new JLabel("Color", SwingConstants.CENTER);
		JLabel lblSex= new JLabel("Sex", SwingConstants.CENTER);
		
		
		//Create the text fields
		JTextField txtRegion = new JTextField("Western Alaska",10);
		JTextField txtAge = new JTextField("5 Months",10);
		JTextField txtColor = new JTextField("Yellow",10);
		JTextField txtSex = new JTextField("Male",10);
		//Create Button
		JButton btnFilter = new JButton("Filter");
		//Set the grid layout for the west border
		pnlFilter.setLayout(new GridLayout(25,1));
		
		String[] petStrings = { "Bird", "Fish"};
		
		//cmboxPetList= new JComboBox(petStrings);
		
		//Add text fields and labels to the panels
		pnlFilter.add(cmboxPetList);
		pnlFilter.add(lblBreed);
		pnlFilter.add(txtRegion);
		pnlFilter.add(lblAge);
		pnlFilter.add(txtAge);
		pnlFilter.add(lblColor);
		pnlFilter.add(txtColor);
		pnlFilter.add(lblSex);
		pnlFilter.add(txtSex);
		
		
		btnBack.addActionListener(new btnBackListener());
		btnClose.addActionListener(new btnCloseListener());
		//btnFilter.addActionListener(new btnFilterListener());
		//txtBreed.addActionListener(new btnFilterListener());
		
		//Add the button to the west panel.
		pnlFilter.add(btnFilter);
		
		pnlFilter.add(btnBack);
		pnlFilter.add(btnClose);
	}
	
	
	
	public void createBirdListings() {

		pnlBirdsListing = new JPanel();
		
		pnlBirdsListing.setLayout(new GridLayout (3,3));
	
		
		
		// Instantiating animal array will not give you access to all the getters and
		// setters. Use Domestic sub class to create array of
		// domestic cats and domestic Birds.

		// Create an array of 3 Birds.
		
        
		
    	imgBird0 = new JButton(new ImageIcon("animals/bird0.jpg"));
		imgBird1 = new JButton(new ImageIcon("animals/bird1.jpg"));
		imgBird2 = new JButton(new ImageIcon("animals/bird2.jpg"));
		imgBird3 = new JButton(new ImageIcon("animals/bird3.jpg"));
		imgBird4 = new JButton(new ImageIcon("animals/bird4.jpg"));
		imgBird5 = new JButton(new ImageIcon("animals/bird5.jpg"));
		imgBird6 = new JButton(new ImageIcon("animals/bird6.jpg"));
		imgBird7 = new JButton(new ImageIcon("animals/bird7.jpg"));
		imgBird8 = new JButton(new ImageIcon("animals/bird8.jpg"));
    	
		birdsArray[0] = new Birds(true, "Western Alaska", false, "Paulie", "6 Months", "Male", "PS-062610","yellow","10 Years",true);
		birdsArray[1] = new Birds(true, "Western Alaska", false, "Paulie", "6 Months", "Male", "PS-062611","yellow","10 Years",true);
		birdsArray[2] = new Birds(true, "Western Alaska", false, "Paulie", "6 Months", "Male", "PS-062612","yellow","10 Years",true);
		birdsArray[3] = new Birds(true, "Piedmont", true, "CoCo", "3 Months", "Female", "PS-062613","green","10 Years",true);
		birdsArray[4] = new Birds(true, "Piedmont", true, "CoCo", "3 Months", "Female", "PS-062614","green","10 Years",true);
		birdsArray[5] = new Birds(true, "Piedmont", true, "CoCo", "3 Months", "Female", "PS-062615","green","10 Years",true);
		birdsArray[6] = new Birds(true, "Islas Marias", false, "Kiwi", "4 Months", "Male", "PS-062616","sheen","10 Years",true);
		birdsArray[7] = new Birds(true, "Islas Marias", false, "Kiwi", "4 Months", "Male", "PS-062617","sheen","10 Years",true);
		birdsArray[8] = new Birds(true, "Islas Marias", false, "Kiwi", "4 Months", "Male", "PS-062618","sheen","10 Years",true);

		

		JLabel birds0 = new JLabel(birdsArray[0].toStringforLabel());
		JLabel birds1 = new JLabel(birdsArray[1].toStringforLabel());
		JLabel birds2 = new JLabel(birdsArray[2].toStringforLabel());
		JLabel birds3 = new JLabel(birdsArray[3].toStringforLabel());
		JLabel birds4 = new JLabel(birdsArray[4].toStringforLabel());
		JLabel birds5 = new JLabel(birdsArray[5].toStringforLabel());
		JLabel birds6 = new JLabel(birdsArray[6].toStringforLabel());
		JLabel birds7 = new JLabel(birdsArray[7].toStringforLabel());
		JLabel birds8 = new JLabel(birdsArray[8].toStringforLabel());
		
		imgBird0.setHorizontalAlignment(SwingConstants.CENTER);
		imgBird1.setHorizontalAlignment(SwingConstants.CENTER);
		imgBird2.setHorizontalAlignment(SwingConstants.CENTER);
		imgBird3.setHorizontalAlignment(SwingConstants.CENTER);
		imgBird4.setHorizontalAlignment(SwingConstants.CENTER);
		imgBird5.setHorizontalAlignment(SwingConstants.CENTER);
		imgBird6.setHorizontalAlignment(SwingConstants.CENTER);
		imgBird7.setHorizontalAlignment(SwingConstants.CENTER);
		imgBird8.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		
		
		imgBird0.addActionListener(new btnSelectDomesticListener());
		imgBird1.addActionListener(new btnSelectDomesticListener());
		imgBird2.addActionListener(new btnSelectDomesticListener());
		imgBird3.addActionListener(new btnSelectDomesticListener());
		imgBird4.addActionListener(new btnSelectDomesticListener());
		imgBird5.addActionListener(new btnSelectDomesticListener());
		imgBird6.addActionListener(new btnSelectDomesticListener());
		imgBird7.addActionListener(new btnSelectDomesticListener());
		imgBird8.addActionListener(new btnSelectDomesticListener());
		
		pnlBirdsListing.add(imgBird0);
		pnlBirdsListing.add(birds0);
		pnlBirdsListing.add(imgBird1);
		pnlBirdsListing.add(birds1);
		pnlBirdsListing.add(imgBird2);
		pnlBirdsListing.add(birds2);
		pnlBirdsListing.add(imgBird3);
		pnlBirdsListing.add(birds3);
		pnlBirdsListing.add(imgBird4);
		pnlBirdsListing.add(birds4);
		pnlBirdsListing.add(imgBird5);
		pnlBirdsListing.add(birds5);
		pnlBirdsListing.add(imgBird6);
		pnlBirdsListing.add(birds6);
		pnlBirdsListing.add(imgBird7);
		pnlBirdsListing.add(birds7);
		pnlBirdsListing.add(imgBird8);
		pnlBirdsListing.add(birds8);
		add(pnlBirdsListing);
		
	}
    public void createFishListings() {

		pnlFishListing = new JPanel();
		
		pnlFishListing.setLayout(new GridLayout (3,3));
		
		
		// Instantiating animal array will not give you access to all the getters and
		// setters. Use Domestic sub class to create array of
		// domestic cats and domestic Birds.

		// Create an array of 3 Birds.
    	imgFish0 = new JButton(new ImageIcon("animals/fish0.jpg"));
		imgFish1 = new JButton(new ImageIcon("animals/fish1.jpg"));
		imgFish2 = new JButton(new ImageIcon("animals/fish2.jpg"));
		imgFish3 = new JButton(new ImageIcon("animals/fish3.jpg"));
		imgFish4 = new JButton(new ImageIcon("animals/fish4.jpg"));
		imgFish5 = new JButton(new ImageIcon("animals/fish5.jpg"));
		imgFish6 = new JButton(new ImageIcon("animals/fish6.jpg"));
		imgFish7 = new JButton(new ImageIcon("animals/fish7.jpg"));
		imgFish8 = new JButton(new ImageIcon("animals/fish8.jpg"));
		
		fishArray[0] = new Fish(true, 2.5 , true, "Nemo", "7 months", "Male", "PS-062601","yellow","5 Years",true);
		fishArray[1] = new Fish(true, 2.5 , true, "Nemo", "7 months", "Male", "PS-062602","yellow","5 Years",true);
		fishArray[2] = new Fish(true, 2.5 , true, "Nemo", "7 months", "Male", "PS-062603","yellow","5 Years",true);
		fishArray[3] = new Fish(true, 1.5 , false, "Dory", "8 months", "Female", "PS-062604","yellow","10 Years",true);
		fishArray[4] = new Fish(true, 1.5 , false, "Dory", "8 months", "Female", "PS-062605","yellow","10 Years",true);
		fishArray[5] = new Fish(true, 1.5 , false, "Dory", "8 months", "Female", "PS-062606","yellow","10 Years",true);
		fishArray[6] = new Fish(true, 3.4 , true, "Marlin", "6 months", "Male", "PS-062607","yellow","7 Years",true);
		fishArray[7] = new Fish(true, 3.4 , true, "Marlin", "6 months", "Male", "PS-062608","yellow","7 Years",true);
		fishArray[8] = new Fish(true, 3.4 , true, "Marlin", "6 months", "Male", "PS-062609","yellow","7 Years",true);

  
		JLabel fish0 = new JLabel(fishArray[0].toStringforLabel());
		JLabel fish1 = new JLabel(fishArray[1].toStringforLabel());
		JLabel fish2 = new JLabel(fishArray[2].toStringforLabel());
		JLabel fish3 = new JLabel(fishArray[3].toStringforLabel());
		JLabel fish4 = new JLabel(fishArray[4].toStringforLabel());
		JLabel fish5 = new JLabel(fishArray[5].toStringforLabel());
		JLabel fish6 = new JLabel(fishArray[6].toStringforLabel());
		JLabel fish7 = new JLabel(fishArray[7].toStringforLabel());
		JLabel fish8 = new JLabel(fishArray[8].toStringforLabel());
		
		fish0.setHorizontalAlignment(SwingConstants.CENTER);
		fish1.setHorizontalAlignment(SwingConstants.CENTER);
		fish2.setHorizontalAlignment(SwingConstants.CENTER);
		fish3.setHorizontalAlignment(SwingConstants.CENTER);
		fish4.setHorizontalAlignment(SwingConstants.CENTER);
		fish5.setHorizontalAlignment(SwingConstants.CENTER);
		fish6.setHorizontalAlignment(SwingConstants.CENTER);
		fish7.setHorizontalAlignment(SwingConstants.CENTER);
		fish8.setHorizontalAlignment(SwingConstants.CENTER);
		
		pnlFishListing.add(imgFish0);
		pnlFishListing.add(fish0);
		pnlFishListing.add(imgFish1);
		pnlFishListing.add(fish1);
		pnlFishListing.add(imgFish2);
		pnlFishListing.add(fish2);
		pnlFishListing.add(imgFish3);
		pnlFishListing.add(fish3);
		pnlFishListing.add(imgFish4);
		pnlFishListing.add(fish4);
		pnlFishListing.add(imgFish5);
		pnlFishListing.add(fish5);
		pnlFishListing.add(imgFish6);
		pnlFishListing.add(fish6);
		pnlFishListing.add(imgFish7);
		pnlFishListing.add(fish7);
		pnlFishListing.add(imgFish8);
		pnlFishListing.add(fish8);
		
		add(pnlFishListing);
		
		
		
	}
    
   
    
	// Action listener for the Calculate total button
	private class btnBackListener implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			backToSelect = new SelectTypeGUI();
			setVisible(false);
			
		}

	}
	
	private class btnCloseListener implements ActionListener {

		// must override the method actionPerformed
		public void actionPerformed(ActionEvent e) {
			dispose(); // this will close out the application
		}

	}


	private class btnSelectDomesticListener implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {

			selectedAnimal = new AnimalDetails();
			setVisible(false);
			
		}

	}
	
	
	
	public static void main(String[] args) {

		SelectExoticAnimal testing = new SelectExoticAnimal();

	}

	


}




