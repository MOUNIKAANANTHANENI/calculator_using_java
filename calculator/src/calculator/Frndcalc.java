package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frndcalc {

	private JFrame frame;
	private JTextField t1;
	private JTextField t2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frndcalc window = new Frndcalc();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Frndcalc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.GRAY);
		frame.setBounds(100, 100, 657, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Calculator");
		lblNewLabel.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		lblNewLabel.setBounds(234, 11, 106, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\online lab\\Desktop\\images.jpg"));
		lblNewLabel_1.setBounds(339, 36, 292, 215);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Name");
		lblNewLabel_2.setFont(new Font("Sitka Display", Font.BOLD, 15));
		lblNewLabel_2.setBounds(28, 60, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Frnd Name");
		lblNewLabel_3.setFont(new Font("Sitka Display", Font.BOLD, 15));
		lblNewLabel_3.setBounds(28, 110, 78, 14);
		frame.getContentPane().add(lblNewLabel_3);
		JLabel lb = new JLabel("");
		lb.setBounds(28, 147, 264, 14);
		frame.getContentPane().add(lb);
		
		t1 = new JTextField();
		t1.setBounds(142, 55, 86, 20);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBounds(142, 105, 86, 20);
		frame.getContentPane().add(t2);
		t2.setColumns(10);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n=t1.getText();
				String fn=t2.getText();
				double p;
				int max=100;
				int min=1;
				p= Math.random()*(max-min+1)+min;	
				int k=(int) p;
			
				lb.setText("Frndship percentage is "+k+"%");
}
		});
		btnNewButton.setBounds(116, 184, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		
		
		
	}

}
