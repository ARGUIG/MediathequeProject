package mediatheque.Jframes;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JButton;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SignUp extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPanel;
	private JTextField txtUsername;
	private JTextField txtPassword;
	private JTextField txtCNE;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public SignUp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPanel = new JPanel();
		contentPanel.setBackground(new Color(22, 26, 48));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setSize(1280,720);
		setContentPane(contentPanel);
		contentPanel.setLayout(null);
		setResizable(false);
		
		JPanel centeredPanel = new JPanel();
		centeredPanel.setBorder(null);
		centeredPanel.setBackground(new Color(49, 48, 77));
		centeredPanel.setBounds(371, 137, 539, 489);
		contentPanel.add(centeredPanel);
		centeredPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
		centeredPanel.setLayout(null);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(29, 78, 469, 35);
		centeredPanel.add(txtUsername);
		txtUsername.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setForeground(new Color(240, 236, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1.setBounds(29, 34, 107, 37);
		centeredPanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password");
		lblNewLabel_1_1.setForeground(new Color(240, 236, 255));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1_1.setBounds(29, 149, 107, 37);
		centeredPanel.add(lblNewLabel_1_1);
		
		txtPassword = new JTextField();
		txtPassword.setColumns(10);
		txtPassword.setBounds(29, 193, 469, 35);
		centeredPanel.add(txtPassword);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Home home = new Home();
				home.setVisible(true);
				dispose();
			} 
		});
		btnRegister.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnRegister.setBounds(157, 373, 225, 35);
		centeredPanel.add(btnRegister);
		
		JLabel lblLogin = new JLabel(">> Already member? Login");
		lblLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Login login=new Login();
				login.setVisible(true);
				dispose();
			}
		});
		lblLogin.setForeground(new Color(240, 236, 255));
		lblLogin.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblLogin.setBounds(118, 431, 324, 37);
		centeredPanel.add(lblLogin);
		
		txtCNE = new JTextField();
		txtCNE.setColumns(10);
		txtCNE.setBounds(29, 305, 469, 35);
		centeredPanel.add(txtCNE);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("CNE");
		lblNewLabel_1_1_1.setForeground(new Color(240, 236, 255));
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1_1_1.setBounds(29, 261, 107, 37);
		centeredPanel.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel = new JLabel("Sign Up");
		lblNewLabel.setForeground(new Color(240, 236, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 34));
		lblNewLabel.setBounds(571, 52, 145, 55);
		contentPanel.add(lblNewLabel);

		setLocationRelativeTo(null);
		setTitle("Mediatheque : Sign Up");

		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\asus\\Downloads\\logo.png"));
	}
}
