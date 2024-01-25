package mediatheque.Jframes;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;

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

public class Kindles extends JFrame {

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



	public Kindles() {
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
			
		});
		lblKindles.setForeground(new Color(217, 217, 217));
		lblKindles.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblKindles.setBackground(new Color(22, 26, 48));
		lblKindles.setBounds(0, 199, 226, 42);
		lblKindles.setOpaque(true);
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

		setLocationRelativeTo(null);
		setTitle("Mediatheque : My Kindles");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\asus\\Downloads\\logo.png"));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(227, 249, 893, 365);
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
				"ISBN", "Title", "Author", "Category","Status"
			}
		));
		
		txtSearch = new JTextField();
		txtSearch.setForeground(new Color(33, 33, 33));
		txtSearch.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtSearch.setText("Search by title of a Book, Magazine...");
		txtSearch.setBounds(390, 24, 402, 34);
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
					// create a query of select
					String query = "select * from kindles where username= ?";
					// create a state of connection
					PreparedStatement ps = con.prepareStatement(query);
					ps.setString(1, Login.txtUsername.getText());
					ResultSet res = ps.executeQuery();
					int test =0; 

					while(res.next())
					{
						Object[] obj = null; // Declare the obj array outside the if conditions

						if (res.getString(4).equals(txtSearch.getText())) {
						    DefaultTableModel T = (DefaultTableModel) table.getModel();
					        obj = new Object[]{res.getString(3), res.getString(4), res.getString(5), res.getString(6),res.getString(7)};
						    T.addRow(obj);
						    test = 1;
						}
					}
					
					if (test==0)
						JOptionPane.showMessageDialog(Kindles.this, "This title doesn't exist");
					
					con.close();
					txtSearch.setText("");

				}
				catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Error while establishing connection");

				}
			}
		});
		btnSearch.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSearch.setBounds(800, 24, 95, 34);
		contentPanel.add(btnSearch);
		
		JLabel lblNewLabel_1 = new JLabel("Delete from Kindles :");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Verdana", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(238, 154, 255, 31);
		contentPanel.add(lblNewLabel_1);
		
		txtISBN = new JTextField();
		txtISBN.setText("Enter the ISBN ");
		txtISBN.setForeground(new Color(33, 33, 33));
		txtISBN.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtISBN.setColumns(10);
		txtISBN.setBounds(480, 153, 242, 34);
		contentPanel.add(txtISBN);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					// load mysql driver
					Class.forName("com.mysql.cj.jdbc.Driver");
					// create the connection
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost/librarymanagementsystem","root","root");
					// create a query of select					
					Statement st = con.createStatement();
					ResultSet res = st.executeQuery("SELECT * FROM kindles");
					int test = 0;
					while(res.next())
					{
						if (res.getString(3).equals(txtISBN.getText())) {
							String query = "DELETE FROM favorites WHERE username= ? AND ISBN= ?";
							PreparedStatement ps = con.prepareStatement(query);
							ps.setString(1, Login.txtUsername.getText());
							ps.setString(2, txtISBN.getText());
							ps.executeUpdate();
							JOptionPane.showMessageDialog(Kindles.this, "The data has been removed successfully");
							test = 1;
							break;
						}
					}
					if(test == 0)
						JOptionPane.showMessageDialog(Kindles.this, "This ISBN doesn't exist in your kindles");


					con.close();
					txtISBN.setText("");
					
				}
				catch (Exception exception) {
					JOptionPane.showMessageDialog(null, "Erreur while establishing connection");
					
				}
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnDelete.setBounds(734, 153, 95, 34);
		contentPanel.add(btnDelete);
		
		ShowKindlesData();		
	}
	
	private void ShowKindlesData() {
		try {
			
			// load mysql driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// create the connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/librarymanagementsystem","root","root");
			// create a query of select
			String query = "select * from kindles where username=?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, Login.txtUsername.getText());
			ResultSet res = ps.executeQuery();

			while(res.next())
			{
				Object[] obj = null; // Declare the obj array outside the if conditions
			    DefaultTableModel T = (DefaultTableModel) table.getModel();
		        obj = new Object[]{res.getString(3), res.getString(4), res.getString(5), res.getString(6),res.getString(7)};
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
					Kindles frame = new Kindles();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
}
