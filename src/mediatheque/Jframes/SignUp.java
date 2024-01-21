package mediatheque.Jframes;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class SignUp extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPanel;
	private JTextField txtUsername;
	private JTextField txtCNE;
	private JPasswordField password;
	private JPasswordField confirmPassword;

	public SignUp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPanel = new JPanel();
		contentPanel.setBackground(new Color(22, 26, 48));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setSize(865,701);
		setContentPane(contentPanel);
		contentPanel.setLayout(null);
		setResizable(false);
		
		JPanel centeredPanel = new JPanel();
		centeredPanel.setBorder(null);
		centeredPanel.setBackground(new Color(49, 48, 77));
		centeredPanel.setBounds(177, 105, 501, 486);
		contentPanel.add(centeredPanel);
		centeredPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
		centeredPanel.setLayout(null);
		
		txtUsername = new JTextField();
		txtUsername.setFont(new Font("Verdana", Font.PLAIN, 18));
		txtUsername.setBounds(84, 135, 334, 35);
		centeredPanel.add(txtUsername);
		txtUsername.setColumns(10);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if ( getPasswordFromField(password).equals(getPasswordFromField(confirmPassword))) {
					try {
						Class.forName("com.mysql.cj.jdbc.Driver");
						Connection con = DriverManager.getConnection("jdbc:mysql://localhost/librarymanagementsystem","root","root");
						Statement st = con.createStatement();
						String query = "insert into sign_up (CNE,username) values (?,?)";
						PreparedStatement ps = con.prepareStatement(query);
						ps.setString(1, txtCNE.getText());
						ps.setString(2, txtUsername.getText());

						ps.executeUpdate();
						JOptionPane.showMessageDialog(SignUp.this, "Data is stored successefully");
						// ADD in the login table
						String query1 = "insert into login (username,password) values (?,?)";
						PreparedStatement ps1 = con.prepareStatement(query1);
						ps1.setString(1, txtUsername.getText());
						ps1.setString(2, getPasswordFromField(password));
						ps1.executeUpdate();
						
						con.close();
						txtCNE.setText("");
						txtUsername.setText("");
						password.setText("");
						confirmPassword.setText("");
					} 
					
					catch (Exception e1) {
						JOptionPane.showMessageDialog(null, "Error while establishing connection");
					}
				}
				else
					JOptionPane.showMessageDialog(SignUp.this, "Password is incorrect");

			}
		});
		btnRegister.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Home home = new Home();
				home.setVisible(true);
				dispose();
			} 
		});
		btnRegister.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnRegister.setBounds(145, 363, 199, 35);
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
		lblLogin.setBounds(94, 419, 324, 37);
		centeredPanel.add(lblLogin);
		
		txtCNE = new JTextField();
		txtCNE.setFont(new Font("Verdana", Font.PLAIN, 18));
		txtCNE.setColumns(10);
		txtCNE.setBounds(84, 46, 334, 35);
		centeredPanel.add(txtCNE);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("CNE");
		lblNewLabel_1_1_1.setForeground(new Color(240, 236, 255));
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1_1_1.setBounds(84, 16, 107, 37);
		centeredPanel.add(lblNewLabel_1_1_1);
		
		password = new JPasswordField();
		password.setFont(new Font("Verdana", Font.PLAIN, 18));
		password.setBounds(84, 218, 334, 35);
		centeredPanel.add(password);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Username");
		lblNewLabel_1_1_1_1.setForeground(new Color(240, 236, 255));
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1_1_1_1.setBounds(84, 104, 107, 37);
		centeredPanel.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("Password");
		lblNewLabel_1_1_1_2.setForeground(new Color(240, 236, 255));
		lblNewLabel_1_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1_1_1_2.setBounds(84, 187, 107, 37);
		centeredPanel.add(lblNewLabel_1_1_1_2);
		
		confirmPassword = new JPasswordField();
		confirmPassword.setFont(new Font("Verdana", Font.PLAIN, 18));
		confirmPassword.setBounds(84, 306, 334, 35);
		centeredPanel.add(confirmPassword);
		
		JLabel lblNewLabel_1_1_1_2_1 = new JLabel("Confirm Password");
		lblNewLabel_1_1_1_2_1.setForeground(new Color(240, 236, 255));
		lblNewLabel_1_1_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1_1_1_2_1.setBounds(84, 274, 183, 37);
		centeredPanel.add(lblNewLabel_1_1_1_2_1);
		
		JLabel lblNewLabel = new JLabel("Sign Up");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(240, 236, 255));
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 36));
		lblNewLabel.setBounds(291, 29, 242, 55);
		contentPanel.add(lblNewLabel);

		setLocationRelativeTo(null);
		setTitle("Mediatheque : Sign Up");

		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\asus\\Downloads\\logo.png"));
	}
	
    public static String getPasswordFromField(JPasswordField passwordField) {
        char[] passwordChars = passwordField.getPassword();
        // Convert the char array to a string
        String password = String.valueOf(passwordChars);
        // Clear the original char array for security reasons
        java.util.Arrays.fill(passwordChars, ' ');

        return password;
    }
	
	public static void main(String[] args) throws UnsupportedLookAndFeelException {
		UIManager.setLookAndFeel(new NimbusLookAndFeel());
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp frame = new SignUp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
