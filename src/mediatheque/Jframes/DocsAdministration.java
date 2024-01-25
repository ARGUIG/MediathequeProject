package mediatheque.Jframes;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel; 
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton; 
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent; 

public class DocsAdministration extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtIsbn;
	private JTextField txtTitle;
	private JTextField txtAuthor;
	private JTextField txtYearOfPublication;
	private JTextField txtDate;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTable table;
	private int selectedRow;
	private JSpinner idNumberOfPages;
	private JComboBox idType;
	private JSpinner idBookTome;
	private JRadioButton rdbtnBook;
	private JRadioButton rdbttnMagazine;
	private JRadioButton rdbtnDictionnary;
	private JComboBox idPeridicity;
	private JSpinner idDictionnaryTome;
	private JComboBox idLanguage;
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public DocsAdministration() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBackground(new Color(22, 26, 48));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setSize(1135,656); 
		setContentPane(contentPane);
		setResizable(false);  
		setLocationRelativeTo(null);
		setTitle("Mediatheque : Document Administration");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\asus\\Downloads\\logo.png"));

		JLabel lblMagazine_1 = new JLabel("Dictionnary");
		lblMagazine_1.setBounds(64, 520, 129, 24);
		lblMagazine_1.setOpaque(true);
		lblMagazine_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblMagazine_1.setForeground(Color.WHITE);
		lblMagazine_1.setFont(new Font("Calibri", Font.BOLD, 22));
		lblMagazine_1.setBackground(new Color(22, 26, 48));
		
		JLabel lblBook = new JLabel("Book");
		lblBook.setBounds(86, 276, 70, 24);
		lblBook.setOpaque(true);
		lblBook.setBackground(new Color(22, 26, 48));
		lblBook.setHorizontalAlignment(SwingConstants.CENTER);
		lblBook.setForeground(Color.WHITE);
		lblBook.setFont(new Font("Calibri", Font.BOLD, 22));
		 
		txtIsbn = new JTextField();
		txtIsbn.setFont(new Font("SansSerif", Font.PLAIN, 16));
		txtIsbn.setBounds(41, 101, 135, 30);
		txtIsbn.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("ISBN");
		lblNewLabel_1.setBounds(41, 76, 135, 24);
		lblNewLabel_1.setFont(new Font("Calibri", Font.BOLD, 22));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		
		txtTitle = new JTextField();
		txtTitle.setFont(new Font("SansSerif", Font.PLAIN, 16));
		txtTitle.setBounds(189, 101, 135, 30);
		txtTitle.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Title");
		lblNewLabel_1_1.setBounds(189, 76, 135, 24);
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Calibri", Font.BOLD, 22));
		
		txtAuthor = new JTextField();
		txtAuthor.setFont(new Font("SansSerif", Font.PLAIN, 16));
		txtAuthor.setBounds(41, 164, 283, 30);
		txtAuthor.setColumns(10);
		
		JLabel lblAuthor = new JLabel("Author");
		lblAuthor.setBounds(41, 139, 283, 24);
		lblAuthor.setForeground(Color.WHITE);
		lblAuthor.setFont(new Font("Calibri", Font.BOLD, 22));
		
		txtYearOfPublication = new JTextField();
		txtYearOfPublication.setFont(new Font("SansSerif", Font.PLAIN, 17));
		txtYearOfPublication.setBounds(41, 230, 283, 30);
		txtYearOfPublication.setColumns(10);
		
		JLabel txtYear = new JLabel("Year Of Publication");
		txtYear.setBounds(41, 206, 283, 24);
		txtYear.setForeground(Color.WHITE);
		txtYear.setFont(new Font("Calibri", Font.BOLD, 22));
		
		JLabel lblType = new JLabel("Type");
		lblType.setBounds(41, 343, 174, 24);
		lblType.setHorizontalAlignment(SwingConstants.CENTER);
		lblType.setForeground(Color.WHITE);
		lblType.setFont(new Font("Calibri", Font.BOLD, 22));
		
		JLabel lblTome = new JLabel("Tome");
		lblTome.setBounds(41, 379, 174, 24);
		lblTome.setHorizontalAlignment(SwingConstants.CENTER);
		lblTome.setForeground(Color.WHITE);
		lblTome.setFont(new Font("Calibri", Font.BOLD, 22));
		
		idNumberOfPages = new JSpinner();
		idNumberOfPages.setFont(new Font("SansSerif", Font.PLAIN, 16));
		idNumberOfPages.setBounds(229, 301, 60, 26);
		idNumberOfPages.setModel(new SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));
		
		JLabel lblNumberOfPages = new JLabel("Number Of Pages");
		lblNumberOfPages.setBounds(45, 306, 174, 24);
		lblNumberOfPages.setHorizontalAlignment(SwingConstants.CENTER);
		lblNumberOfPages.setForeground(Color.WHITE);
		lblNumberOfPages.setFont(new Font("Calibri", Font.BOLD, 22));
		
		idType = new JComboBox();
		idType.setFont(new Font("Verdana", Font.PLAIN, 16));
		idType.setBounds(225, 338, 110, 30);
		idType.setModel(new DefaultComboBoxModel(new String[] {"FICTION", "ROMANCE", "BIOGRAPHY", "SCIENCE", "COMEDY", "RELIGION", "POLITICS", "HISTORIC"}));
		
		idBookTome = new JSpinner();
		idBookTome.setFont(new Font("SansSerif", Font.PLAIN, 16));
		idBookTome.setModel(new SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));
		idBookTome.setBounds(229, 374, 60, 26);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(41, 286, 283, 2);
		separator_1.setBackground(new Color(83, 82, 133));
		separator_1.setForeground(new Color(22, 26, 48));
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(41, 418, 283, 2);
		separator_1_1.setBackground(new Color(83, 82, 133));
		separator_1_1.setForeground(new Color(22, 26, 48));
		
		JLabel lblNumberOfPages_1 = new JLabel("Periodicity");
		lblNumberOfPages_1.setBounds(40, 448, 174, 24);
		lblNumberOfPages_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNumberOfPages_1.setForeground(Color.WHITE);
		lblNumberOfPages_1.setFont(new Font("Calibri", Font.BOLD, 22));
		
		JLabel lblType_1 = new JLabel("Date of edition");
		lblType_1.setBounds(36, 484, 174, 24);
		lblType_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblType_1.setForeground(Color.WHITE);
		lblType_1.setFont(new Font("Calibri", Font.BOLD, 22));
		
		idPeridicity = new JComboBox();
		idPeridicity.setFont(new Font("Verdana", Font.PLAIN, 16));
		idPeridicity.setBounds(220, 443, 110, 30);
		idPeridicity.setModel(new DefaultComboBoxModel(new String[] {"DAILY", "WEEKLY", "BIWEEKLY", "MONTHLY", "BIMONTHLY", "QUARTERLY", "SEMIANNUAL", "ANNUAL"}));
		
		txtDate = new JTextField();
		txtDate.setFont(new Font("SansSerif", Font.PLAIN, 16));
		txtDate.setBounds(220, 479, 110, 30);
		txtDate.setColumns(10);
		
		JSeparator separator_1_1_1 = new JSeparator();
		separator_1_1_1.setBounds(41, 530, 283, 2);
		separator_1_1_1.setBackground(new Color(83, 82, 133));
		separator_1_1_1.setForeground(new Color(22, 26, 48));
		
		JLabel lblNumberOfPages_1_1 = new JLabel("Language");
		lblNumberOfPages_1_1.setBounds(41, 554, 174, 24);
		lblNumberOfPages_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNumberOfPages_1_1.setForeground(Color.WHITE);
		lblNumberOfPages_1_1.setFont(new Font("Calibri", Font.BOLD, 22));
		
		idLanguage = new JComboBox();
		idLanguage.setFont(new Font("Verdana", Font.PLAIN, 16));
		idLanguage.setBounds(225, 547, 110, 30);
		idLanguage.setModel(new DefaultComboBoxModel(new String[] {"FRENSH", "ARABIC", "ENGLISH", "SPANISH"}));
		
		JLabel lblTome_1 = new JLabel("Tome");
		lblTome_1.setBounds(45, 590, 174, 24);
		lblTome_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblTome_1.setForeground(Color.WHITE);
		lblTome_1.setFont(new Font("Calibri", Font.BOLD, 22));
		
		idDictionnaryTome = new JSpinner();
		idDictionnaryTome.setFont(new Font("SansSerif", Font.PLAIN, 16));
		idDictionnaryTome.setModel(new SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));
		idDictionnaryTome.setBounds(229, 583, 60, 26);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1119, 60);
		panel.setBackground(new Color(49, 48, 77));
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(382, 149, 738, 465);
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
				"ISBN", "Title", "Author", "Category"
			}
		));
		
		JLabel lblNewLabel = new JLabel("MEDIATHEQUE Management");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 22));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(10, 11, 344, 38);
		panel.add(lblNewLabel);
		

        // Add the ListSelectionListener to the table
        table.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    selectedRow = table.getSelectedRow();
                    if (selectedRow != -1) {                  	
                    	ShowDataInFields();

                    }
                }
            }
        });
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(255, 255, 255));
		separator.setForeground(new Color(255, 255, 255));
		separator.setBounds(930, 0, 2, 60);
		panel.add(separator);
		separator.setOrientation(SwingConstants.VERTICAL);
		
		JLabel lblDocs = new JLabel("Manage Docs");
		lblDocs.setForeground(new Color(255, 255, 255));
		lblDocs.setHorizontalAlignment(SwingConstants.CENTER);
		lblDocs.setOpaque(true);
		lblDocs.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblDocs.setBackground(new Color(22, 26, 48));
		lblDocs.setBounds(380, 0, 164, 60);
		panel.add(lblDocs);
		
		JLabel lblKindles = new JLabel("Manage Kindles");
		lblKindles.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblKindles.setBackground(new Color(80,78,128));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblKindles.setBackground(null);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				KindlesAdministration cst = new KindlesAdministration();
				cst.setVisible(true);
				dispose();
			}
		});
		lblKindles.setOpaque(true);
		lblKindles.setHorizontalAlignment(SwingConstants.CENTER);
		lblKindles.setForeground(Color.WHITE);
		lblKindles.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblKindles.setBackground(new Color(49, 48, 77));
		lblKindles.setBounds(545, 0, 164, 60);
		panel.add(lblKindles);
		
		JLabel lblLogOUt = new JLabel("Log Out");
		lblLogOUt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblLogOUt.setBackground(new Color(80,78,128));
			}
			@Override 
			public void mouseExited(MouseEvent e) {
				lblLogOUt.setBackground(null);
			} 
			
			@Override
			public void mouseClicked(MouseEvent e) {
				new Login().setVisible(true);
				dispose();
			}
			
		});
		contentPane.setLayout(null);
		
		rdbtnDictionnary = new JRadioButton("");
		rdbtnDictionnary.setBounds(189, 520, 30, 23);
		buttonGroup.add(rdbtnDictionnary);
		rdbtnDictionnary.setForeground(new Color(22, 26, 48));
		rdbtnDictionnary.setBackground(new Color(22, 26, 48));
		contentPane.add(rdbtnDictionnary);
		
		rdbttnMagazine = new JRadioButton("");
		rdbttnMagazine.setBounds(189, 408, 30, 23);
		buttonGroup.add(rdbttnMagazine);
		rdbttnMagazine.setForeground(new Color(22, 26, 48));
		rdbttnMagazine.setBackground(new Color(22, 26, 48));
		contentPane.add(rdbttnMagazine);
		 
		rdbtnBook = new JRadioButton("");
		rdbtnBook.setBounds(151, 276, 30, 23);
		buttonGroup.add(rdbtnBook);
		rdbtnBook.setBackground(new Color(22, 26, 48));
		rdbtnBook.setForeground(new Color(22, 26, 48));
		contentPane.add(rdbtnBook);
		lblLogOUt.setOpaque(true);
		lblLogOUt.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogOUt.setForeground(Color.WHITE);
		lblLogOUt.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblLogOUt.setBackground(new Color(49, 48, 77));
		lblLogOUt.setBounds(955, 0, 164, 60);
		panel.add(lblLogOUt);
		contentPane.add(panel);
		
		JLabel lblMagazine = new JLabel("Magazine");
		lblMagazine.setBounds(86, 408, 107, 24);
		lblMagazine.setOpaque(true);
		lblMagazine.setHorizontalAlignment(SwingConstants.CENTER);
		lblMagazine.setForeground(Color.WHITE);
		lblMagazine.setFont(new Font("Calibri", Font.BOLD, 22));
		lblMagazine.setBackground(new Color(22, 26, 48));
		contentPane.add(lblMagazine);
		contentPane.add(lblNewLabel_1);
		contentPane.add(lblNewLabel_1_1);
		contentPane.add(txtIsbn);
		contentPane.add(txtTitle);
		contentPane.add(lblAuthor);
		contentPane.add(txtAuthor);
		contentPane.add(txtYear);
		contentPane.add(txtYearOfPublication);
		contentPane.add(lblBook);
		contentPane.add(separator_1);
		contentPane.add(lblNumberOfPages);
		contentPane.add(idNumberOfPages);
		contentPane.add(lblType);
		contentPane.add(idType);
		contentPane.add(lblTome);
		contentPane.add(idBookTome);
		contentPane.add(separator_1_1);
		contentPane.add(lblNumberOfPages_1);
		contentPane.add(idPeridicity);
		contentPane.add(lblType_1);
		contentPane.add(txtDate);
		contentPane.add(lblMagazine_1);
		contentPane.add(separator_1_1_1);
		contentPane.add(lblNumberOfPages_1_1);
		contentPane.add(idLanguage);
		contentPane.add(lblTome_1);
		contentPane.add(idDictionnaryTome);
		
		JButton btnAdd = new JButton("Add ");
		btnAdd.setFont(new Font("Verdana", Font.PLAIN, 18));
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					// load mysql driver
					Class.forName("com.mysql.cj.jdbc.Driver");
					// create the connection  
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost/librarymanagementsystem","root","root");
					String query = "";
					PreparedStatement ps;
					
					if(rdbtnBook.isSelected()) {
						query = "INSERT INTO book (ISBN,title,author,yearOfPublication,nbreOfPages,type,tome) VALUES (?,?,?,?,?,?,?)";
						ps = con.prepareStatement(query);
						
						ps.setString(1, txtIsbn.getText());
						ps.setString(2, txtTitle.getText());
						ps.setString(3, txtAuthor.getText());
						ps.setString(4, txtYearOfPublication.getText());
						ps.setInt(5, (int)idNumberOfPages.getValue());
						ps.setString(6, (String)idType.getSelectedItem());
						ps.setInt(7, (int)idBookTome.getValue());
						
						ps.executeUpdate();
						
						//store data in Home table
						query = "INSERT INTO home (ISBN,title,author,category) VALUES (?,?,?,?)";
						ps = con.prepareStatement(query);

						ps.setString(1, txtIsbn.getText());
						ps.setString(2, txtTitle.getText());
						ps.setString(3, txtAuthor.getText());
						ps.setString(4, "book");
						
						ps.executeUpdate();
						

						JOptionPane.showMessageDialog(DocsAdministration.this, "     Data is stored successefully.");

						con.close();
						txtIsbn.setText("");
						txtTitle.setText("");
						txtAuthor.setText("");
						txtYearOfPublication.setText("");
						idNumberOfPages.setValue(1);
						idBookTome.setValue(1);
					}
					
					else {
						if(rdbttnMagazine.isSelected()) 
						{
							query = "INSERT INTO magazine (ISBN,title,author,yearOfPublication,periodicity,dateEdition) VALUES (?,?,?,?,?,?)";
							ps = con.prepareStatement(query);

							ps.setString(1, txtIsbn.getText());
							ps.setString(2, txtTitle.getText());
							ps.setString(3, txtAuthor.getText());
							ps.setInt(4, Integer.parseInt(txtYearOfPublication.getText()));
							ps.setString(5, (String)idPeridicity.getSelectedItem());
							ps.setString(6, txtDate.getText());
							
							ps.executeUpdate();
							
							//store data in Home table
							query = "INSERT INTO home (ISBN,title,author,category) VALUES (?,?,?,?)";
							ps = con.prepareStatement(query);
							
							ps.setString(1, txtIsbn.getText());
							ps.setString(2, txtTitle.getText());
							ps.setString(3, txtAuthor.getText());
							ps.setString(4, "magazine");
							
							ps.executeUpdate();
							
						
							JOptionPane.showMessageDialog(DocsAdministration.this, "     Data is stored successefully.");
							
							con.close();
							txtIsbn.setText("");
							txtTitle.setText("");
							txtAuthor.setText("");
							txtYearOfPublication.setText("");
							txtDate.setText("");
						}
						
						else 
							if(rdbtnDictionnary.isSelected()) {
								query = "INSERT INTO dictionnary (ISBN,title,author,yearOfPublication,language,tome) VALUES (?,?,?,?,?,?)";
								ps = con.prepareStatement(query);

								ps.setString(1, txtIsbn.getText());
								ps.setString(2, txtTitle.getText());
								ps.setString(3, txtAuthor.getText());
								ps.setString(4, txtYearOfPublication.getText());
								ps.setString(5, (String)idLanguage.getSelectedItem());
								ps.setInt(6, (int)idDictionnaryTome.getValue());
								
								ps.executeUpdate();
								
								//store data in Home table
								query = "INSERT INTO home (ISBN,title,author,category) VALUES (?,?,?,?)";
								ps = con.prepareStatement(query);

								ps.setString(1, txtIsbn.getText());
								ps.setString(2, txtTitle.getText());
								ps.setString(3, txtAuthor.getText());
								ps.setString(4, "dictionnary");
								
								ps.executeUpdate();
								
								
								JOptionPane.showMessageDialog(DocsAdministration.this, "     Data is stored successefully.");
								
								con.close();
								txtIsbn.setText("");
								txtTitle.setText("");
								txtAuthor.setText("");
								txtYearOfPublication.setText("");
								idDictionnaryTome.setValue(1);
							}
					}

				}
				catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Error while establishing connection");

				}
			}
		});
		btnAdd.setBounds(473, 97, 129, 37);
		contentPane.add(btnAdd);
		
		JButton btnRemove = new JButton("Remove");
		btnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					// load mysql driver
					Class.forName("com.mysql.cj.jdbc.Driver");
					// create the connection
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost/librarymanagementsystem","root","root");
					// create a state of connection
					String query ="";
					PreparedStatement ps;

					
					if ("book".equals((String)table.getValueAt(selectedRow, 3))) {
						query= "DELETE FROM book WHERE ISBN=?";
						ps = con.prepareStatement(query);
						ps.setString(1,(String)table.getValueAt(selectedRow,0));
						ps.executeUpdate();

					}
					else {
						if("magazine".equals((String)table.getValueAt(selectedRow, 3))) {
							query= "DELETE FROM magazine WHERE ISBN=?";
							ps = con.prepareStatement(query);
							ps.setString(1,(String)table.getValueAt(selectedRow,0));
							ps.executeUpdate();
						}
						else {
							query= "DELETE FROM dictionnary WHERE ISBN=?";
							ps = con.prepareStatement(query);
							ps.setString(1,(String)table.getValueAt(selectedRow,0));
							ps.executeUpdate();
						}
					}
					
					//Remove from home table
					query= "DELETE FROM home WHERE ISBN=? AND category=?";
					ps = con.prepareStatement(query);
					ps.setString(1,(String)table.getValueAt(selectedRow,0));
					ps.setString(2,(String)table.getValueAt(selectedRow,3));
					ps.executeUpdate();
					
					JOptionPane.showMessageDialog(DocsAdministration.this,"Data has been deleted successfully");
					con.close();
					
				}
				catch (Exception exception) {
					JOptionPane.showMessageDialog(null, "Erreur while establishing connection");
					
				}
	
			}
		});
		btnRemove.setFont(new Font("Verdana", Font.PLAIN, 18));
		btnRemove.setBounds(708, 97, 129, 37);
		contentPane.add(btnRemove);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					// load mysql driver
					Class.forName("com.mysql.cj.jdbc.Driver");
					// create the connection  
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost/librarymanagementsystem","root","root");
					String query = "";
					PreparedStatement ps;
					
					if(rdbtnBook.isSelected()) {
						query = "UPDATE book SET ISBN=?,title=?,author=?,yearOfPublication=?,nbreOfPages=?,type=?,tome=? WHERE ISBN=?";
						ps = con.prepareStatement(query);
						
						ps.setString(1, txtIsbn.getText());
						ps.setString(2, txtTitle.getText());
						ps.setString(3, txtAuthor.getText());
						ps.setString(4, txtYearOfPublication.getText());
						ps.setInt(5, (int)idNumberOfPages.getValue());
						ps.setString(6, (String)idType.getSelectedItem());
						ps.setInt(7, (int)idBookTome.getValue());
						ps.setString(8,(String)table.getValueAt(selectedRow,0));
						
						ps.executeUpdate();
						

						//update data in Home table
						query = "UPDATE home SET ISBN=?,title=?,author=? WHERE ISBN=? AND category=?";
						ps = con.prepareStatement(query);

						ps.setString(1, txtIsbn.getText());
						ps.setString(2, txtTitle.getText());
						ps.setString(3, txtAuthor.getText());
						ps.setString(4,(String)table.getValueAt(selectedRow,0));
						ps.setString(5, "book");
						
						ps.executeUpdate();

						JOptionPane.showMessageDialog(DocsAdministration.this, "     Data has been updated successefully.");

						con.close();
						txtIsbn.setText("");
						txtTitle.setText("");
						txtAuthor.setText("");
						txtYearOfPublication.setText("");
						idNumberOfPages.setValue(1);
						idType.setSelectedItem("FICTION");
						idBookTome.setValue(1);
						rdbtnBook.setSelected(false);
					}
					
					else {
						if(rdbttnMagazine.isSelected()) 
						{
							query = "UPDATE magazine SET ISBN=?,title=?,author=?,yearOfPublication=?,periodicity=?,dateEdition=? WHERE ISBN=?";
							ps = con.prepareStatement(query);
							
							ps.setString(1, txtIsbn.getText());
							ps.setString(2, txtTitle.getText());
							ps.setString(3, txtAuthor.getText());
							ps.setString(4, txtYearOfPublication.getText());
							ps.setString(5, (String)idPeridicity.getSelectedItem());
							ps.setString(6, txtDate.getText());
							ps.setString(7,(String)table.getValueAt(selectedRow,0));
							
							ps.executeUpdate();
							

							//update data in Home table
							query = "UPDATE home SET ISBN=?,title=?,author=? WHERE ISBN=? AND category=?";
							ps = con.prepareStatement(query);

							ps.setString(1, txtIsbn.getText());
							ps.setString(2, txtTitle.getText());
							ps.setString(3, txtAuthor.getText());
							ps.setString(4,(String)table.getValueAt(selectedRow,0));
							ps.setString(5, "magazine");
							
							ps.executeUpdate();

							JOptionPane.showMessageDialog(DocsAdministration.this, "     Data has been updated successefully.");

							con.close();
							txtIsbn.setText("");
							txtTitle.setText("");
							txtAuthor.setText("");
							txtYearOfPublication.setText("");
							idType.setSelectedItem("DAILY");
							txtDate.setText("");
							rdbttnMagazine.setSelected(false);
						}
						
						else 
							if(rdbtnDictionnary.isSelected()) {
								query = "UPDATE dictionnary SET ISBN=?,title=?,author=?,yearOfPublication=?,language=?,tome=? WHERE ISBN=?";
								ps = con.prepareStatement(query);
								
								ps.setString(1, txtIsbn.getText());
								ps.setString(2, txtTitle.getText());
								ps.setString(3, txtAuthor.getText());
								ps.setString(4, txtYearOfPublication.getText());
								ps.setString(5, (String)idLanguage.getSelectedItem());
								ps.setInt(6, (int)idDictionnaryTome.getValue());
								ps.setString(7,(String)table.getValueAt(selectedRow,0));
								ps.executeUpdate();

								
								//Update data in Home table
								query = "UPDATE home SET ISBN=?,title=?,author=? WHERE ISBN=? AND category=?";
								ps = con.prepareStatement(query);

								ps.setString(1, txtIsbn.getText());
								ps.setString(2, txtTitle.getText());
								ps.setString(3, txtAuthor.getText());
								ps.setString(4,(String)table.getValueAt(selectedRow,0));
								ps.setString(5, "dictionnary");

								ps.executeUpdate();
								
								JOptionPane.showMessageDialog(DocsAdministration.this, "     Data has been updated successefully.");
								
								con.close();
								txtIsbn.setText("");
								txtTitle.setText("");
								txtAuthor.setText("");
								txtYearOfPublication.setText("");
								idLanguage.setSelectedItem("FRENSH");
								idDictionnaryTome.setValue(1);
							}
					}

				}
				catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Error while establishing connection");

				}
			}
		});
		btnUpdate.setFont(new Font("Verdana", Font.PLAIN, 18));
		btnUpdate.setBounds(939, 95, 129, 37);
		contentPane.add(btnUpdate);
		ShowDocsData();
	}
	
	private void ShowDocsData() {
		try {
			
			// load mysql driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// create the connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/librarymanagementsystem","root","root");
			// create a query of select
			String query = "select * from home";
			// create a state of connection
			Statement st = con.createStatement();
			ResultSet res = st.executeQuery(query);

			while(res.next())
			{
				Object[] obj = null; // Declare the obj array outside the if conditions
			    DefaultTableModel T = (DefaultTableModel) table.getModel();
		        obj = new Object[]{res.getString(2), res.getString(3), res.getString(4), res.getString(5)};
			    T.addRow(obj);

			}
	        
			con.close();
		}
		catch(Exception e1) {
			JOptionPane.showMessageDialog(null, "Error while establishing connection");

		}
	}
	
	public void ShowDataInFields() {
		try {
			
			// load mysql driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// create the connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/librarymanagementsystem","root","root");
			// create a query of select
			String query = "SELECT * FROM " + (String)table.getValueAt(selectedRow, 3) + " WHERE ISBN = ?";
			// create a state of connection
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1,(String)table.getValueAt(selectedRow, 0));
			ResultSet res = ps.executeQuery();

			while(res.next())
			{
				if ("book".equals((String)table.getValueAt(selectedRow, 3))){
					txtIsbn.setText(res.getString(2));
					txtTitle.setText(res.getString(3));
					txtAuthor.setText(res.getString(4));
					txtYearOfPublication.setText((String)res.getString(5));
					rdbtnBook.setSelected(true);
					idNumberOfPages.setValue(Integer.parseInt(res.getString(6)));
					idType.setSelectedItem(res.getString(7));
					idBookTome.setValue(Integer.parseInt(res.getString(8)));
				}
				else {
					if("magazine".equals((String)table.getValueAt(selectedRow, 3))) {
						txtIsbn.setText(res.getString(2));
						txtTitle.setText(res.getString(3));
						txtAuthor.setText(res.getString(4));
						txtYearOfPublication.setText((String)res.getString(5));
						rdbttnMagazine.setSelected(true);
						idPeridicity.setSelectedItem(res.getString(6));
						txtDate.setText(res.getString(7));	
					}
					else {
						txtIsbn.setText(res.getString(2));
						txtTitle.setText(res.getString(3));
						txtAuthor.setText(res.getString(4));
						txtYearOfPublication.setText((String)res.getString(5));
						rdbtnDictionnary.setSelected(true);
						idLanguage.setSelectedItem(res.getString(6));
						idDictionnaryTome.setValue(Integer.parseInt(res.getString(7)));
						
					}
					
				}
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
					DocsAdministration frame = new DocsAdministration();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}	
}
