package mediatheque.Jframes;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
	private JTextField txtUsername;
	private JTextField txtPassword;
	private JTextField txtCNE;
	private JButton btnNewButton;


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
	public Parameters() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPanel = new JPanel();
		contentPanel.setBackground(new Color(22, 26, 48));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setSize(1280,720);
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
		centeredPanel.setBounds(412, 138, 539, 489);
		contentPanel.add(centeredPanel);
		centeredPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
		centeredPanel.setLayout(null);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(29, 78, 469, 35);
		centeredPanel.add(txtUsername);
		txtUsername.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Change Username");
		lblNewLabel_1.setForeground(new Color(240, 236, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1.setBounds(29, 34, 210, 37);
		centeredPanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Change Password");
		lblNewLabel_1_1.setForeground(new Color(240, 236, 255));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1_1.setBounds(29, 149, 210, 37);
		centeredPanel.add(lblNewLabel_1_1);
		
		txtPassword = new JTextField();
		txtPassword.setColumns(10);
		txtPassword.setBounds(29, 193, 469, 35);
		centeredPanel.add(txtPassword);

		txtCNE = new JTextField();
		txtCNE.setColumns(10);
		txtCNE.setBounds(29, 305, 469, 35);
		centeredPanel.add(txtCNE);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Change CNE");
		lblNewLabel_1_1_1.setForeground(new Color(240, 236, 255));
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1_1_1.setBounds(29, 261, 210, 37);
		centeredPanel.add(lblNewLabel_1_1_1);
		
		btnNewButton = new JButton("Update");
		btnNewButton.setForeground(new Color(22, 26, 48));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBounds(160, 380, 201, 44);
		centeredPanel.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Modify Your Infos!");
		lblNewLabel.setForeground(new Color(240, 236, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 34));
		lblNewLabel.setBounds(503, 53, 331, 55);
		contentPanel.add(lblNewLabel);

		setLocationRelativeTo(null);
		setTitle("Mediatheque : Parameters");

		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\asus\\Downloads\\logo.png"));
	}
}
