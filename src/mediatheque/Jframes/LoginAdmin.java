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
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import javax.swing.SwingConstants;


public class LoginAdmin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPanel;
	public static JTextField txtUsername;
	private JPasswordField txtpassword;

	public LoginAdmin() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\asus\\Downloads\\logo.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(777,628);
		contentPanel = new JPanel();
		contentPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		contentPanel.setBackground(new Color(22, 26, 48));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPanel);
		contentPanel.setLayout(null);
		setResizable(false);
		
		JPanel centeredPanel = new JPanel();
		centeredPanel.setBorder(null);
		centeredPanel.setBackground(new Color(49, 48, 77));
		centeredPanel.setBounds(169, 141, 421, 368);
		contentPanel.add(centeredPanel);
		centeredPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
		centeredPanel.setLayout(null);
		
		txtUsername = new JTextField();
		txtUsername.setFont(new Font("Verdana", Font.PLAIN, 18));
		txtUsername.setBounds(29, 78, 353, 35);
		centeredPanel.add(txtUsername);
		txtUsername.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Admin's name");
		lblNewLabel_1.setForeground(new Color(240, 236, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1.setBounds(29, 40, 162, 37);
		centeredPanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password");
		lblNewLabel_1_1.setForeground(new Color(240, 236, 255));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1_1.setBounds(29, 149, 107, 37);
		centeredPanel.add(lblNewLabel_1_1);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost/librarymanagementsystem","root","root");
					Statement st = con.createStatement();
					String query = "select * from loginadmin";
					ResultSet res = st.executeQuery(query);
					String user;
					String password;
					int test = 0;
					
					while(res.next()) 
					{
						user = res.getString("admin");
						password = res.getString("password");
						if(txtUsername.getText().equals(user) && getPasswordFromField(txtpassword).equals(password)) {
							new DocsAdministration().setVisible(true);
							dispose();
							test = 1;
							break;
						}
					}
					
					if(test==0)
					{
						JOptionPane.showMessageDialog(LoginAdmin.this, "Admin's name or password is incorrect");
					}
					
					con.close();
					
				}
				catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Error while establishing connection");
				}
					

			}
		});
		

		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnLogin.setBounds(121, 261, 177, 44);
		centeredPanel.add(btnLogin);
		
		txtpassword = new JPasswordField();
		txtpassword.setFont(new Font("Verdana", Font.PLAIN, 18));
		txtpassword.setBounds(29, 186, 353, 35);
		centeredPanel.add(txtpassword);
		
		JLabel lblNewLabel = new JLabel("Admin Authentification");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(240, 236, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 34));
		lblNewLabel.setBounds(126, 53, 509, 55);
		contentPanel.add(lblNewLabel);

		setLocationRelativeTo(null);
		setTitle("Mediatheque : Login");

		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\academic_education\\2eme annee\\Java\\Library Management System Project\\MediathequeProject\\book.jpg"));
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
					LoginAdmin frame = new LoginAdmin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
