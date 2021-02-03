import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeScreen extends JFrame {
	
	
	//Create variable for the Select type gui window.
	SelectTypeGUI selectGUI;
	

	
	private JLabel roundUpAnimalShelter = new JLabel("Round Up Animal Shelter", SwingConstants.CENTER);
	private JButton btnBrowse = new JButton("Meet your New Best Friend!");
	private JButton btnExit = new JButton("Exit");

	// constructor
	HomeScreen() {
		// call super class constructor to assign a string to the title bar
		super("YeeHaw!");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// set size of the window
		setSize(700, 700);
		setContentPane(new JLabel(new ImageIcon(("background.jpeg"))));
		// set Layout for the frame to BorderLayout
		setLayout(new GridLayout(4, 1));
		

		JPanel pnlClose = new JPanel();

		JPanel pnlBrowse = new JPanel();
		pnlBrowse.setOpaque(false);

		pnlClose.setOpaque(false);

		pnlClose.add(btnExit);

		pnlBrowse.add(btnBrowse);

		roundUpAnimalShelter.setFont(new Font("Serif", Font.CENTER_BASELINE, 22));

		// add action for Exit button
		
		btnExit.addActionListener(new btnCloseListener());
		
		btnBrowse.addActionListener(new btnBrowseListener());
		
		// add the panels to the frame
		this.add(roundUpAnimalShelter);
		//this.add(imagePanel);
		this.add(pnlBrowse);
		this.add(pnlClose);

		// set visible
		this.setVisible(true);
		
	}

	// write action listener for the Exit button
	private class btnCloseListener implements ActionListener {

		// must override the method actionPerformed
		public void actionPerformed(ActionEvent e) {
			dispose(); // this will close out the application
		}

	}

	// Action listener for the Calculate total button
	private class btnBrowseListener implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			selectGUI = new SelectTypeGUI();
			setVisible(false);
			
		}

	}

	public static void main(String[] args) {
		// declare an instance of borderExample
		HomeScreen myWindow = new HomeScreen();

	}

}
