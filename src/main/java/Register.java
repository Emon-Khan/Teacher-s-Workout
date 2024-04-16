package main.java;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Rectangle;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Window.Type;
import java.net.URL;

import javax.swing.ImageIcon;

public class Register extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JTextField textField_1;
	private JPanel contentPane;
	private JPasswordField passwordField_2;
	private JPasswordField passwordField_3;
	private JPasswordField passwordField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register frame = new Register();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Register() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 529, 422);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Register");
		lblNewLabel.setBounds(200, 11, 126, 37);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 26));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setBounds(33, 59, 85, 27);
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 12));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Email");
		lblNewLabel_1_1.setBounds(33, 97, 85, 27);
		lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Password");
		lblNewLabel_1_1_1.setBounds(33, 135, 85, 27);
		lblNewLabel_1_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Confirm Password");
		lblNewLabel_1_1_1_1.setBounds(33, 173, 159, 27);
		lblNewLabel_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		contentPane.add(lblNewLabel_1_1_1_1);
		
		JButton btnNewButton = new JButton("SIGNUP");
		btnNewButton.setBounds(348, 325, 115, 37);
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(210, 0, 98));
		btnNewButton.setFont(new Font("Georgia", Font.BOLD, 15));
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(200, 63, 263, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(200, 137, 263, 20);
		contentPane.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(200, 174, 263, 20);
		contentPane.add(passwordField_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(200, 100, 263, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		passwordField_2 = new JPasswordField();
		passwordField_2.setBounds(200, 211, 263, 20);
		contentPane.add(passwordField_2);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Height");
		lblNewLabel_1_1_1_1_1.setBounds(33, 211, 159, 27);
		lblNewLabel_1_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		contentPane.add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("Weight");
		lblNewLabel_1_1_1_1_1_1.setBounds(33, 249, 159, 27);
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		contentPane.add(lblNewLabel_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1 = new JLabel("Age");
		lblNewLabel_1_1_1_1_1_1_1.setBounds(33, 287, 159, 27);
		lblNewLabel_1_1_1_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		contentPane.add(lblNewLabel_1_1_1_1_1_1_1);
		
		passwordField_3 = new JPasswordField();
		passwordField_3.setBounds(200, 248, 263, 20);
		contentPane.add(passwordField_3);
		
		passwordField_4 = new JPasswordField();
		passwordField_4.setBounds(200, 285, 263, 20);
		contentPane.add(passwordField_4);
		
		JLabel lblNewLabel_2 = new JLabel("");
		URL imageURL = getClass().getResource("/main/java/Sunrise.jpg");
		if(imageURL!=null) {
			lblNewLabel_2.setIcon(new ImageIcon(imageURL));
		}else {
			System.err.println("Image file not found!");
		}
		lblNewLabel_2.setBounds(0, 0, 513, 383);
		contentPane.add(lblNewLabel_2);
	}
}
