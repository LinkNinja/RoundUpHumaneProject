import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;









public class AnimalDetails extends JFrame{
	
	SelectTypeGUI backToSelect;
	
	Dogs dogArray[] = new Dogs[9];
	
	private JLabel lblName;
	private JLabel lblBreed;
	private JLabel lblColor;
	private JLabel lblAge;
	private JLabel lblSex;
	private JLabel lblSize;
	
	private JPanel pnlSouth;
	private JPanel pnlButton;
	
	JLabel imgDog1 = new JLabel(new ImageIcon("animals/cowboy.jpg"));
	
	private JTextField txtAbout;
	
	private JButton btnAdopt= new JButton("Adopt");
	
	private JButton btnBack = new JButton("Back");

      public AnimalDetails() {

			super("Your New Best Friend!");

			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setContentPane(new JLabel(new ImageIcon(("bg.jpg"))));
			// Set the size 
			setSize(1000, 800);
			//should set layout to 2 rows and 1 colume
			setLayout(new GridLayout(2, 1));		
			add(imgDog1);
			buildSouthPanel();

			this.add(pnlSouth, BorderLayout.SOUTH);

			this.setVisible(true);
    }
      
      
      

  	public void buildSouthPanel()
  	{
 
  		
  		//The function building the south panel.
  		pnlButton = new JPanel();

  		pnlButton.setLayout(new GridLayout(1,2));

		

  		
  		
  		
  		//Creating a new jpanel for the south of the main window
  		pnlSouth = new JPanel();
  		
  		pnlSouth.setLayout(new BorderLayout());
  		
  		pnlSouth.setLayout(new GridLayout(5,3));
  		
  		lblName = new JLabel("NAME: Cowboy");
  		lblName.setFont(new Font("Serif", Font.BOLD, 25));
  		lblName.setForeground(Color.BLACK);
  		lblName.setOpaque(false);
  		
  		lblBreed = new JLabel("Beagle");
  		lblBreed.setFont(new Font("Serif", Font.BOLD, 25));
  		lblBreed.setForeground(Color.BLACK);
  		lblBreed.setOpaque(false);
  		
  		lblColor = new JLabel("Brown/Black");
  		lblColor.setFont(new Font("Serif", Font.BOLD, 25));
  		lblColor.setForeground(Color.BLACK);
  		lblColor.setOpaque(false);
  		
  		lblAge = new JLabel("6-Months");
  		lblAge.setFont(new Font("Serif", Font.BOLD, 25));
  		lblAge.setForeground(Color.BLACK);
  		lblAge.setOpaque(false);
  		
  		lblSex = new JLabel("Male");
  		lblSex.setFont(new Font("Serif", Font.BOLD, 25));
  		lblSex.setForeground(Color.BLACK);
  		lblSex.setOpaque(false);
  		
  		lblSize = new JLabel("25.00 lbs");
  		lblSize.setFont(new Font("Serif", Font.BOLD, 25));
  		lblSize.setForeground(Color.BLACK);
  		lblSize.setOpaque(false);
  		
  		
  		pnlSouth.setOpaque(false);
  		
  		
		btnBack.addActionListener(new btnBackListener());
		btnAdopt.addActionListener(new btnAdoptListener());

  		pnlButton.add(btnBack);
  		pnlButton.add(btnAdopt);
  		pnlSouth.add(lblName);
  		pnlSouth.add(lblBreed);
  		pnlSouth.add(lblColor);
  		pnlSouth.add(lblAge);
  		pnlSouth.add(lblSex);
  		pnlSouth.add(lblSize);
  		pnlSouth.add(pnlButton, SwingConstants.SOUTH);

  		
  	}
  	
private class btnBackListener implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			backToSelect = new SelectTypeGUI();
			setVisible(false);
			
		}

	}

private class btnAdoptListener implements ActionListener {
	
	public void actionPerformed(ActionEvent e) {
	
	
		JOptionPane.showMessageDialog(null, "Get ready to take home Your new best friend!");

		
	}

}

	
    public static void main(String[] args) {

        AnimalDetails frame = new AnimalDetails();

   
  }

}
