package mediatheque.Jframes;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Toolkit;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPanel;
	private JTextField txtUsername;
	private JTextField txtPassword;


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
	public Login() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\asus\\Downloads\\logo.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPanel = new JPanel();
		contentPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		contentPanel.setBackground(new Color(22, 26, 48));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setSize(1280,720);
		setContentPane(contentPanel);
		contentPanel.setLayout(null);
		setResizable(false);
		
		JPanel centeredPanel = new JPanel();
		centeredPanel.setBorder(null);
		centeredPanel.setBackground(new Color(49, 48, 77));
		centeredPanel.setBounds(372, 157, 539, 399);
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
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Home home = new Home();
				home.setVisible(true);
				dispose();
			}
		});
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnLogin.setBounds(153, 262, 225, 35);
		centeredPanel.add(btnLogin);
		
		JLabel lblSignUp = new JLabel(">> No account? Create one");
		lblSignUp.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				SignUp signUp=new SignUp();
				signUp.setVisible(true);
				dispose(); 
			}
		});
		lblSignUp.setForeground(new Color(240, 236, 255));
		lblSignUp.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSignUp.setBounds(114, 333, 301, 37);
		centeredPanel.add(lblSignUp);
		
		JLabel lblNewLabel = new JLabel("WELCOME TO MEDIATHEQUE");
		lblNewLabel.setForeground(new Color(240, 236, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 34));
		lblNewLabel.setBounds(390, 70, 509, 55);
		contentPanel.add(lblNewLabel);

		setLocationRelativeTo(null);
		setTitle("Mediatheque : Login");

		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\asus\\Downloads\\logo.png"));
	}
}
