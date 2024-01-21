package mediatheque.Jframes;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.UIManager;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JTable;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Magazines extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPanel;
	private JTextField txtSearch;
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
	private JTable table;
	private JTextField txtISBN;
	private JLabel lblNewLabel_1;
	private JRadioButton rdbtnKindles;
	private JRadioButton rdbtnFavorites;


	public Magazines() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPanel = new JPanel();
		contentPanel.setBackground(new Color(22, 26, 48));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setSize(1135,656);
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
			
		});
		lblMagazines.setOpaque(true);
		lblMagazines.setForeground(new Color(217, 217, 217));
		lblMagazines.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblMagazines.setBackground(new Color(22, 26, 48));
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
			@Override
			public void mouseClicked(MouseEvent e) {
				Parameters cst = new Parameters();
				cst.setVisible(true);
				dispose();
			}
			public void mouseEntered(MouseEvent e) {
				lblParameters.setBackground(new Color(80,78,128));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblParameters.setBackground(null);
			}
		});
		lblParameters.setOpaque(true);
		lblParameters.setForeground(new Color(217, 217, 217));
		lblParameters.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblParameters.setBackground(new Color(49, 48, 77));
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
		
		
		txtSearch = new JTextField();
		txtSearch.setForeground(new Color(33, 33, 33));
		txtSearch.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtSearch.setText("Search for a Book by title");
		txtSearch.setBounds(377, 24, 317, 34);
		contentPanel.add(txtSearch);
		txtSearch.setColumns(10);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
		            // Clear existing rows in the table
		            DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
		            tableModel.setRowCount(0);
					
					// load mysql driver
					Class.forName("com.mysql.cj.jdbc.Driver");
					// create the connection
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost/librarymanagementsystem","root","root");
					// create a state of connection
					Statement st = con.createStatement();
					// create a query of select
					String query = "select * from magazine ";

					ResultSet res = st.executeQuery(query);
					int test =0; 

					while(res.next())
					{
						Object[] obj = null; // Declare the obj array outside the if conditions

						if (res.getString(3).equals(txtSearch.getText())) {
						    DefaultTableModel T = (DefaultTableModel) table.getModel();
					        obj = new Object[]{res.getString(2), res.getString(3), res.getString(4), res.getInt(5), res.getString(6), res.getString(7)};
						    T.addRow(obj);
						    test = 1;
						}
					}
					
					if (test==0)
						JOptionPane.showMessageDialog(Magazines.this, "This Magazine's title doesn't exist");
					
					con.close();
					txtSearch.setText("");

				}
				catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Error while establishing connection");

				}
			}
		});
		btnSearch.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSearch.setBounds(721, 24, 95, 34);
		contentPanel.add(btnSearch);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(227, 311, 893, 303);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setFillsViewportHeight(true);
		table.setSurrendersFocusOnKeystroke(true);
		table.setFont(new Font("Verdana", Font.PLAIN, 15));
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ISBN", "Title", "Author", "Year of publication", "Number of pages", "Periodicity", "Date of edition"
			}
		));
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					// load mysql driver
					Class.forName("com.mysql.cj.jdbc.Driver");
					// create the connection
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost/librarymanagementsystem","root","root");
					// create a state of connection
					Statement st = con.createStatement();
					// create a query of insert
					String Insertquery = "";
					String message = "";
					if(rdbtnKindles.isSelected())
					{
						Insertquery = "INSERT INTO kindles (username,ISBN,title,author,category) VALUES (?,?,?,?,?)";
						message = "This Magazine is added successfully to your kindles"; 
					}
					
					else 
						if(rdbtnFavorites.isSelected()) 
						{
							Insertquery = "INSERT INTO favorites (username,ISBN,title,author,category) VALUES (?,?,?,?,?)";
							message = "This Magazine is added successfully to your Favorites"; 

						}
					
					
					ResultSet res = st.executeQuery("SELECT * FROM magazine");
					
					int test =0; 
					while(res.next())
					{
						if (res.getString(2).equals(txtISBN.getText())) {
							
							PreparedStatement ps = con.prepareStatement(Insertquery);
							ps.setString(1,Login.txtUsername.getText());
							ps.setString(2,res.getString(2));
							ps.setString(3,res.getString(3));
							ps.setString(4,res.getString(4));
							ps.setString(5,"Magazine");
							
						    test = 1;
						    
							ps.executeUpdate();
							
							JOptionPane.showMessageDialog(Magazines.this,message);
						}

						
					}
					
					if (test==0)
						JOptionPane.showMessageDialog(Magazines.this, "This ISBN doesn't exist");
					
					con.close();
					txtISBN.setText("");

				}
				catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Error while establishing connection");

				}
			}
		});
		
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnAdd.setBounds(733, 197, 83, 34);
		contentPanel.add(btnAdd);
		
		txtISBN = new JTextField();
		txtISBN.setText("ISBN of the Magazine");
		txtISBN.setForeground(new Color(33, 33, 33));
		txtISBN.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtISBN.setColumns(10);
		txtISBN.setBounds(238, 196, 246, 33);
		contentPanel.add(txtISBN);
		
		rdbtnKindles = new JRadioButton("Kindles");
		rdbtnKindles.setFont(new Font("Verdana", Font.PLAIN, 20));
		rdbtnKindles.setForeground(new Color(255, 255, 255));
		rdbtnKindles.setBounds(507, 191, 116, 44);
		contentPanel.add(rdbtnKindles);
		
		rdbtnFavorites = new JRadioButton("Favorites");
		rdbtnFavorites.setForeground(Color.WHITE);
		rdbtnFavorites.setFont(new Font("Verdana", Font.PLAIN, 20));
		rdbtnFavorites.setBounds(611, 192, 116, 44);
		contentPanel.add(rdbtnFavorites);
		
		lblNewLabel_1 = new JLabel("Add Magazine to kindles/Favorites :");
		lblNewLabel_1.setFont(new Font("Verdana", Font.PLAIN, 20));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(238, 153, 361, 31);
		contentPanel.add(lblNewLabel_1);
		

		setLocationRelativeTo(null);
		setTitle("Mediatheque : Magazines");

		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\asus\\Downloads\\logo.png"));
		
		ShowMagazinesData();
	}
	
	private void ShowMagazinesData() {
		try {
			
			// load mysql driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// create the connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/librarymanagementsystem","root","root");
			// create a state of connection
			Statement st = con.createStatement();
			// create a query of select
			String query = "select * from magazine ";

			ResultSet res = st.executeQuery(query);

			while(res.next())
			{
				Object[] obj = null; 
			    DefaultTableModel T = (DefaultTableModel) table.getModel();
		        obj = new Object[]{res.getString(2), res.getString(3), res.getString(4), res.getInt(5), res.getString(6), res.getString(7)};
			    T.addRow(obj);

			}
	        
			con.close();
		}
		catch(Exception e1) {
			JOptionPane.showMessageDialog(null, "Error while establishing connection");

		}
	}

	
	public static void main(String[] args) throws Exception {
		UIManager.setLookAndFeel(new NimbusLookAndFeel());
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Magazines frame = new Magazines();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


}
