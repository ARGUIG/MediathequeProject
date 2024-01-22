package mediatheque.Jframes;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Parameters extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPanel;
	private JLabel lblHome;
	private JLabel lblFavorites;
	private JLabel lblKindles;
	private JLabel lblBooks;
	private JLabel lblMagazines;
	private JLabel lblDictionaries;
	private JLabel lblParameters;
	private JLabel lblLogOut;
	private JLabel lblNewLabel;
	private JLabel lblLogo;
	private JTextField txtChangeUsername;
	private JTextField txtCNE;
	private JButton btnUpdate;
	private JPasswordField NewPassword;
	private JPasswordField ConfirmPassword;


	public Parameters() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPanel = new JPanel();
		contentPanel.setBackground(new Color(22, 26, 48));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setSize(1078,660);
		setContentPane(contentPanel);
		contentPanel.setLayout(null);
		setResizable(false);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(49, 48, 77));
		panel.setBounds(0, 0, 226, 683);
		contentPanel.add(panel);
		panel.setLayout(null);
		 
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 513, 226, 12);
		separator.setForeground(new Color(255, 255, 255));
		panel.add(separator);
		
		lblHome = new JLabel("  Home");
		lblHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Home home = new Home();
				home.setVisible(true);
				dispose();
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblHome.setBackground(new Color(80,78,128));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblHome.setBackground(null);
			}
		});
		lblHome.setBackground(null);
		lblHome.setForeground(new Color(217, 217, 217));
		lblHome.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblHome.setBounds(0, 101, 226, 42);
		panel.add(lblHome);
		lblHome.setOpaque(true);
		
		lblFavorites = new JLabel("  My Favorites");
		lblFavorites.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Favorites favorites = new Favorites();
				favorites.setVisible(true);
				dispose();
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblFavorites.setBackground(new Color(80,78,128));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblFavorites.setBackground(null);
			}
		});
		lblFavorites.setOpaque(true);
		lblFavorites.setForeground(new Color(217, 217, 217));
		lblFavorites.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblFavorites.setBackground(new Color(49, 48, 77));
		lblFavorites.setBounds(0, 150, 226, 42);
		panel.add(lblFavorites);
		
		lblKindles = new JLabel("  My Kindles");
		lblKindles.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Kindles kindles = new Kindles();
				kindles.setVisible(true);
				dispose();
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblKindles.setBackground(new Color(80,78,128));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblKindles.setBackground(null);
			}
		});
		lblKindles.setOpaque(true);
		lblKindles.setForeground(new Color(217, 217, 217));
		lblKindles.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblKindles.setBackground(new Color(49, 48, 77));
		lblKindles.setBounds(0, 199, 226, 42);
		panel.add(lblKindles);
		
		lblBooks = new JLabel("  Books");
		lblBooks.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Books cst = new Books();
				cst.setVisible(true);
				dispose();
			}
			public void mouseEntered(MouseEvent e) {
				lblBooks.setBackground(new Color(80,78,128));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblBooks.setBackground(null);
			}
		});
		lblBooks.setOpaque(true);
		lblBooks.setForeground(new Color(217, 217, 217));
		lblBooks.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblBooks.setBackground(new Color(49, 48, 77));
		lblBooks.setBounds(0, 248, 226, 42);
		panel.add(lblBooks);
		
		lblMagazines = new JLabel("  Magazines");
		lblMagazines.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Magazines cst = new Magazines();
				cst.setVisible(true);
				dispose();
			}
			public void mouseEntered(MouseEvent e) {
				lblMagazines.setBackground(new Color(80,78,128));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblMagazines.setBackground(null);
			}
		});
		lblMagazines.setOpaque(true);
		lblMagazines.setForeground(new Color(217, 217, 217));
		lblMagazines.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblMagazines.setBackground(new Color(49, 48, 77));
		lblMagazines.setBounds(0, 297, 226, 42);
		panel.add(lblMagazines);
		
		lblDictionaries = new JLabel("  Dictionaries");
		lblDictionaries.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Dictionaries cst = new Dictionaries();
				cst.setVisible(true);
				dispose();
			}
			public void mouseEntered(MouseEvent e) {
				lblDictionaries.setBackground(new Color(80,78,128));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblDictionaries.setBackground(null);
			}
		});
		lblDictionaries.setOpaque(true);
		lblDictionaries.setForeground(new Color(217, 217, 217));
		lblDictionaries.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblDictionaries.setBackground(new Color(49, 48, 77));
		lblDictionaries.setBounds(0, 346, 226, 42);
		panel.add(lblDictionaries);
		
		lblParameters = new JLabel("  Parameters");
		lblParameters.addMouseListener(new MouseAdapter() {
			
		});
		lblParameters.setOpaque(true);
		lblParameters.setForeground(new Color(217, 217, 217));
		lblParameters.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblParameters.setBackground(new Color(22, 26, 48));
		lblParameters.setBounds(0, 523, 226, 42);
		panel.add(lblParameters);
		
		lblLogOut = new JLabel("  Log Out");
		lblLogOut.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Login cst = new Login();
				cst.setVisible(true);
				dispose();
			}
			public void mouseEntered(MouseEvent e) {
				lblLogOut.setBackground(new Color(80,78,128));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblLogOut.setBackground(null);
			}
		});
		lblLogOut.setOpaque(true);
		lblLogOut.setForeground(new Color(217, 217, 217));
		lblLogOut.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblLogOut.setBackground(new Color(49, 48, 77));
		lblLogOut.setBounds(0, 572, 226, 42);
		panel.add(lblLogOut);
		
		lblNewLabel = new JLabel("MEDIATHEQUE");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("HelveticaNowText Regular", Font.BOLD, 20));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setBounds(54, 33, 158, 34);
		panel.add(lblNewLabel);
		
		lblLogo = new JLabel("");
		lblLogo.setBounds(7, 23, 40, 48);
		panel.add(lblLogo);
		lblLogo.setForeground(new Color(217, 217, 217));
		Image img =new ImageIcon(this.getClass().getResource("logo.png")).getImage();
		Image img2 = img.getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH);
		lblLogo.setIcon(new ImageIcon(img2));
		
		JPanel centeredPanel = new JPanel();
		centeredPanel.setBorder(null);
		centeredPanel.setBackground(new Color(49, 48, 77));
		centeredPanel.setBounds(424, 108, 427, 463);
		contentPanel.add(centeredPanel);
		centeredPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
		centeredPanel.setLayout(null);
		
		txtChangeUsername = new JTextField();
		txtChangeUsername.setFont(new Font("Verdana", Font.PLAIN, 18));
		txtChangeUsername.setBounds(46, 74, 327, 35);
		centeredPanel.add(txtChangeUsername);
		txtChangeUsername.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Change Username");
		lblNewLabel_1.setForeground(new Color(240, 236, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1.setBounds(46, 36, 210, 37);
		centeredPanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("New Password");
		lblNewLabel_1_1.setForeground(new Color(240, 236, 255));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1_1.setBounds(46, 213, 210, 37);
		centeredPanel.add(lblNewLabel_1_1);
		
		txtCNE = new JTextField();
		txtCNE.setFont(new Font("Verdana", Font.PLAIN, 18));
		txtCNE.setColumns(10);
		txtCNE.setBounds(46, 157, 327, 35);
		centeredPanel.add(txtCNE);
		
		btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if ( getPasswordFromField(NewPassword).equals(getPasswordFromField(ConfirmPassword))) {
					try {
						Class.forName("com.mysql.cj.jdbc.Driver");
						Connection con = DriverManager.getConnection("jdbc:mysql://localhost/librarymanagementsystem","root","root");
						
						//UPDATE SIGN_UP
						String query = "UPDATE sign_up SET CNE=? , username=? WHERE username=?";
						PreparedStatement ps = con.prepareStatement(query);
						ps.setString(1, txtChangeUsername.getText());
						ps.setString(2, txtCNE.getText());
						ps.setString(3, Login.txtUsername.getText());
						ps.executeUpdate();
						
												
						//UPDATE Login
						String query1 = "UPDATE login SET username=? , password=? WHERE username=?";
						PreparedStatement ps1 = con.prepareStatement(query1);
						ps1.setString(1, txtChangeUsername.getText());
						ps1.setString(2, getPasswordFromField(NewPassword));
						ps1.setString(3, Login.txtUsername.getText());
						ps1.executeUpdate();
						


						//UPDATE Kindles
						String query111 = "UPDATE kindles SET username=? WHERE username=?";
						PreparedStatement ps111 = con.prepareStatement(query111);
						ps111.setString(1, txtChangeUsername.getText());
						ps111.setString(2, Login.txtUsername.getText());
						ps111.executeUpdate();
						
						//UPDATE Favorites
						String query1111 = "UPDATE favorites SET username=? WHERE username=?";
						PreparedStatement ps1111 = con.prepareStatement(query1111);
						ps1111.setString(1, txtChangeUsername.getText());
						ps1111.setString(2, Login.txtUsername.getText());
						ps1111.executeUpdate();
						
						JOptionPane.showMessageDialog(Parameters.this, "Data is updated successefully");

						con.close();
						txtCNE.setText("");
						txtChangeUsername.setText("");
						NewPassword.setText("");
						ConfirmPassword.setText("");
					} 
					
					catch (Exception e1) {
						JOptionPane.showMessageDialog(null, "Error while establishing connection");
					}
				}
				
				else
					JOptionPane.showMessageDialog(Parameters.this, "Password is incorrect");

		}
		});
		btnUpdate.setForeground(new Color(22, 26, 48));
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnUpdate.setBounds(114, 399, 201, 44);
		centeredPanel.add(btnUpdate);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Change CNE");
		lblNewLabel_1_1_1_1.setForeground(new Color(240, 236, 255));
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1_1_1_1.setBounds(46, 121, 210, 37);
		centeredPanel.add(lblNewLabel_1_1_1_1);
		
		NewPassword = new JPasswordField();
		NewPassword.setFont(new Font("Verdana", Font.PLAIN, 18));
		NewPassword.setBounds(46, 249, 327, 35);
		centeredPanel.add(NewPassword);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Confrm Password");
		lblNewLabel_1_1_1.setForeground(new Color(240, 236, 255));
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1_1_1.setBounds(46, 297, 210, 37);
		centeredPanel.add(lblNewLabel_1_1_1);
		
		ConfirmPassword = new JPasswordField();
		ConfirmPassword.setFont(new Font("Verdana", Font.PLAIN, 18));
		ConfirmPassword.setBounds(46, 333, 327, 35);
		centeredPanel.add(ConfirmPassword);
		
		JLabel lblNewLabel = new JLabel("Modify Your Infos!");
		lblNewLabel.setForeground(new Color(240, 236, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 34));
		lblNewLabel.setBounds(465, 26, 331, 55);
		contentPanel.add(lblNewLabel);

		setLocationRelativeTo(null);
		setTitle("Mediatheque : Parameters");

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
	
	public static void main(String[] args) throws Exception {
		UIManager.setLookAndFeel(new NimbusLookAndFeel());
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Parameters frame = new Parameters();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
