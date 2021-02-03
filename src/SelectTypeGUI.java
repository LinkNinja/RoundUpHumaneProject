import javax.swing.*;


import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class SelectTypeGUI extends JFrame {

	
	SelectDomesticAnimal selectDomestic;
	SelectExoticAnimal selectExotic;
	
	
	// Panel to hold bUTTONS buttons
	private JPanel pnlDomesticRadioButtons;
	private JPanel pnlExoticRadioButtons;
	private JPanel pnlNavigation;

//	AudioClip ac = getAudioClip();
//	ac.play();   //play once
//	ac.stop();   //stop playing
//	ac.loop();   //play continuously
//	
	private ButtonGroup grpRdoAnimals; // This will group the domestic Radio Buttons

	//radio buttons for dogs and cats
	JRadioButton rdoDogs = new JRadioButton ("Dogs"); // If Dog is selected bring up dogs page
	JRadioButton rdoCats = new JRadioButton ("Cats"); // If Cat is selected bring up dogs page
	JRadioButton rdoBirds = new JRadioButton ("Birds"); // If Bird is selected bring up dogs page
	JRadioButton rdoFish = new JRadioButton ("Fish"); // If Fish is selected bring up dogs page
	JRadioButton rdoReptiles = new JRadioButton ("Reptiles"); // If Reptile is selected bring up dogs page
	
	private JButton btnNext = new JButton ("Next"); // This button will move the page to the next screen.
	private JButton btnClose = new JButton("Close"); // This button will close the application.

	
	
	
	
	// Constructor for the Window.
	public SelectTypeGUI() {
		// Call super class and assign Title to window
		super("What kind of Animal?");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		// Set the size of SelectTypeGUI
		setSize(700, 800);
		setContentPane(new JLabel(new ImageIcon(("bg.jpg"))));
		setLayout(new GridLayout(5, 0));
		
		JPanel pnlDomestic = new JPanel();
		JPanel pnlExotic = new JPanel();
		
		
		//labels for the sections
		JLabel lblDomestic= new JLabel("Domestic Animals", SwingConstants.CENTER);
		
		lblDomestic.setBounds(50, 50, 100, 30);
		lblDomestic.setFont(new Font("Serif", Font.BOLD, 25));
		lblDomestic.setForeground(Color.BLACK);
		lblDomestic.setOpaque(false);
	 
		
		JLabel lblExotic= new JLabel("Exotic Animals", SwingConstants.CENTER);
		lblExotic.setFont(new Font("Serif", Font.BOLD, 25));
		lblExotic.setForeground(Color.BLACK);
		lblExotic.setOpaque(false);
		
		//Group the Radio buttons
		grpRdoAnimals = new ButtonGroup();
		grpRdoAnimals.add(rdoDogs);
		grpRdoAnimals.add(rdoCats);
		grpRdoAnimals.add(rdoBirds);
		grpRdoAnimals.add(rdoFish);
		grpRdoAnimals.add(rdoReptiles);

		rdoDogs.setOpaque(false);
		rdoCats.setOpaque(false);
		rdoBirds.setOpaque(false);
		rdoFish.setOpaque(false);
		rdoReptiles.setOpaque(false);
		

		//Build the panel methods added
		buildDomesticPanel();
		buildExoticPanel();
		buildNavigationPanel();
		

		//Add the labels to the title domestic panel
		pnlDomestic.add(lblDomestic);
		pnlDomestic.setOpaque(false);
		//Add the labels to the exotic panel title
		pnlExotic.add(lblExotic);
		pnlExotic.setOpaque(false);
		
		pnlNavigation.setOpaque(false);
		
		btnNext.setOpaque(false);
		btnClose.setOpaque(false);


		//Add labals
		add(pnlDomestic);
		add(pnlDomesticRadioButtons);
		
		add(pnlExotic);
		add(pnlExoticRadioButtons);
		add(pnlNavigation);
				
		// set visible
		setVisible(true);
		
	}
	
	// buildPanel method
	public void buildDomesticPanel() {
		// Create panel (container to hold objects)
		pnlDomesticRadioButtons = new JPanel();
		pnlDomesticRadioButtons.setLayout(new GridLayout (2,4));

		// Set background color
		pnlDomesticRadioButtons.setBackground(Color.yellow);

		// Set foreground color (text color on labels)
		pnlDomesticRadioButtons.setForeground(Color.BLUE);
		
		JLabel dog = new JLabel(new ImageIcon("dogs.png"));
	    JLabel cat = new JLabel(new ImageIcon("cats.png"));
	    
	    rdoDogs.setHorizontalAlignment(SwingConstants.CENTER);
	    rdoCats.setHorizontalAlignment(SwingConstants.CENTER);
	    
		//add objects to the panel
	    pnlDomesticRadioButtons.add(dog);
	    pnlDomesticRadioButtons.add(cat);
	    
	    pnlDomesticRadioButtons.add(rdoDogs);
		pnlDomesticRadioButtons.add(rdoCats);
	
		
	}

	public void buildExoticPanel() {
		// Create panel (container to hold objects)
		pnlExoticRadioButtons = new JPanel();
		pnlExoticRadioButtons.setLayout(new GridLayout (2,3));
		

		// Set background color
		pnlExoticRadioButtons.setBackground(Color.blue);
		
		// Set foreground color (text color on labels)
		pnlExoticRadioButtons.setForeground(Color.YELLOW);
		
		JLabel birds = new JLabel(new ImageIcon("birds.png"));
	    JLabel fish = new JLabel(new ImageIcon("fish.png"));
	    JLabel reptiles = new JLabel(new ImageIcon("reptiles.png"));
	    
	    rdoBirds.setHorizontalAlignment(SwingConstants.CENTER);
	    rdoFish.setHorizontalAlignment(SwingConstants.CENTER);
	    rdoReptiles.setHorizontalAlignment(SwingConstants.CENTER);
	    
		//add objects to the panel
		pnlExoticRadioButtons.add(birds);
		pnlExoticRadioButtons.add(fish);
	    pnlExoticRadioButtons.add(reptiles);
	    
		pnlExoticRadioButtons.add(rdoBirds);
		pnlExoticRadioButtons.add(rdoFish);
		pnlExoticRadioButtons.add(rdoReptiles);
		
		
		
		
	}
	
	
	private class btnCloseListener implements ActionListener {

		// must override the method actionPerformed
		public void actionPerformed(ActionEvent e) {
			dispose(); // this will close out the application
		}

	}
	

	
private class btnNextListener implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			if(rdoDogs.isSelected())
			{
				
				selectDomestic = new SelectDomesticAnimal();
				selectDomestic.createDogListings();
				setVisible(false);
			}
			else if (rdoCats.isSelected())
			{
				
				selectDomestic = new SelectDomesticAnimal();
				selectDomestic.createCatListings();
				setVisible(false);
			}
			else if(rdoBirds.isSelected())
			{
				
				selectExotic = new SelectExoticAnimal();
				selectExotic.createBirdListings();
				setVisible(false);
				
			}
			else if(rdoFish.isSelected())
			{
				selectExotic = new SelectExoticAnimal();
				selectExotic.createFishListings();
				setVisible(false);
			}
			else if(rdoReptiles.isSelected())
			{
				JOptionPane.showMessageDialog(null, "Ssssnakes Coming Ssssoon!");
			}
			
		}

	}

	public void buildNavigationPanel() {
		// Create panel (container to hold objects)
		pnlNavigation = new JPanel();
		
		// Panel to hold the close button
		JPanel pnlClose = new JPanel();
		
		// Panel to hold the next button
		JPanel pnlNext = new JPanel();
		
		//Set this panels Layout
		pnlNavigation.setLayout(new GridLayout (2,1));
		
		// Set background color
		
		//Add the listeners to the buttons to control what happens
		btnNext.addActionListener(new btnNextListener());
		btnClose.addActionListener(new btnCloseListener());
		
		pnlClose.add(btnClose);
		pnlNext.add(btnNext);
		
		//Add the next button panel
		pnlNavigation.add(pnlNext);
		//add the close button panel
		pnlNavigation.add(pnlClose);

		
	}

	public static void main(String[] args) {
		// declare an instance of borderExample
		SelectTypeGUI tesing = new SelectTypeGUI();

	}
}
