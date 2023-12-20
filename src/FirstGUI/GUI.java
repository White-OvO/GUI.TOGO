package FirstGUI;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI implements ActionListener{
		private int count = 0;
		private JLabel label;
		private JFrame frame;
		private JPanel panel;
		/// private methods for the gui in this class

	    public GUI(){
	        JFrame frame = new JFrame();
	        JPanel panel = new JPanel();
	        JButton button = new JButton("Click here");    // cretes the button (1/2)
	        label = new JLabel("Number of clicks: 0");   // label quote
	        button.addActionListener(this);// number of clicks to go up
	        
	        panel = new JPanel();
	        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
	        panel.setLayout(new GridLayout(0, 1));
	        panel.add(button); // adds the button (2/2)
	        panel.add(label); // displays label on bottom (2/2)
	        
	        frame.add(panel, BorderLayout.CENTER);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setTitle("Our GUI");   //title
	        frame.pack();
	        frame.setVisible(true);
	    

			
		}

	    public static void main(String[] args) {
	    	new GUI(); // creates GUI  adject from GUI CLASS
	    }

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			count++;
			label.setText("Number of clicks: " + count);
			
		}

	}


