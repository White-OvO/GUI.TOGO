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
import javax.swing.JTextField;

public class GUI implements ActionListener{
	private int count;
	private JLabel label;
	private JFrame frame;
	private JPanel panel;
	private JTextField firstNameField;
	private JTextField lastNameField;
	
	public GUI(){
		frame = new JFrame();
		panel = new JPanel();
		JButton button = new JButton("Click here");   
		label = new JLabel("Number of clicks: 0");   
		button.addActionListener(this);
		
		panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
		panel.setLayout(new GridLayout(0, 1));
		panel.add(button); 
		panel.add(label); 
		
		JPanel namePanel = new JPanel();
		namePanel.setLayout(new GridLayout(0, 2));
		
		firstNameField = new JTextField();
		lastNameField = new JTextField();
		// first name 
		namePanel.add(new JLabel("First Name:"));
		namePanel.add(firstNameField);
		
		// last name
		namePanel.add(new JLabel("Last Name:"));
		namePanel.add(lastNameField);
		
		
			
			panel.add(namePanel);
		
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Our GUI");  
		frame.pack();
		frame.setVisible(true);
		
		button = new JButton("Enter First and last Name"); // displays the button text
		button.addActionListener(this);
			panel.add(button);
	}

	public static void main(String[] args) {
		new GUI(); 
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Click here")) {
			count++;
			label.setText("Number of clicks: " + count); 
		} 
		else if (e.getActionCommand().equals("Enter First and last Name")) {
			String firstName = firstNameField.getText();
			String lastName = lastNameField.getText();
			System.out.println(firstName + " " + lastName);
		}
	}
}
