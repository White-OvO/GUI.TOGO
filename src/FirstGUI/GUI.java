package FirstGUI;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI {




	    public GUI(){
	        JFrame frame = new JFrame();
	        JPanel panel = new JPanel();
	        JButton button = new JButton("Click here");    // cretes the button (1/2)
	        
	        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
	        panel.setLayout(new GridLayout(0, 1));
	        panel.add(button); // adds the button (2/2)
	        
	        
	        frame.add(panel, BorderLayout.CENTER);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setTitle("Our GUI");   //title
	        frame.pack();
	        frame.setVisible(true);
	    

			
		}

	    public static void main(String[] args) {
	    	new GUI(); // creates GUI  adject from GUI CLASS
	    }

	}


