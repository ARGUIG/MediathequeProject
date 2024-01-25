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

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

import java.awt.FlowLayout;
import javax.swing.JTable;
import javax.swing.BoxLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

public class KindlesAdministration extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private int selectedRow;
	private String username="";
	private String ISBN="";
	private String title="";
	private String category="";
	
	public KindlesAdministration() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBackground(new Color(22, 26, 48));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setSize(1135,656);
		setContentPane(contentPane);
		setResizable(false);  
		setLocationRelativeTo(null);
		setTitle("Mediatheque : Kindles Administration");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\asus\\Downloads\\logo.png"));
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1119, 60);
		panel.setBackground(new Color(49, 48, 77));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("MEDIATHEQUE Management");
		lblNewLabel.setFont(new Font("HelveticaNowText Regular", Font.BOLD, 20));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(10, 11, 296, 38);
		panel.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(255, 255, 255));
		separator.setForeground(new Color(255, 255, 255));
		separator.setBounds(930, 0, 2, 60);
		panel.add(separator);
		separator.setOrientation(SwingConstants.VERTICAL);
		
		JLabel lblDocs = new JLabel("Manage Docs");
		lblDocs.addMouseListener(new MouseAdapter() {
			@Override
 
			public void mouseEntered(MouseEvent e) {
				lblDocs.setBackground(new Color(80,78,128));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblDocs.setBackground(null);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				DocsAdministration cst = new DocsAdministration();
				cst.setVisible(true);
				dispose();
			}
		});
		lblDocs.setForeground(new Color(255, 255, 255));
		lblDocs.setHorizontalAlignment(SwingConstants.CENTER);
		lblDocs.setOpaque(true);
		lblDocs.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblDocs.setBackground(new Color(49, 48, 77));
		lblDocs.setBounds(380, 0, 164, 60);
		panel.add(lblDocs);
		
		JLabel lblKindles = new JLabel("Manage Kindles");
		lblKindles.setOpaque(true);
		lblKindles.setHorizontalAlignment(SwingConstants.CENTER);
		lblKindles.setForeground(Color.WHITE);
		lblKindles.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblKindles.setBackground(new Color(22, 26, 48));
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
				Login cst = new Login();
				cst.setVisible(true);
				dispose();
			}
		});
		lblLogOUt.setOpaque(true);
		lblLogOUt.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogOUt.setForeground(Color.WHITE);
		lblLogOUt.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblLogOUt.setBackground(new Color(49, 48, 77));
		lblLogOUt.setBounds(955, 0, 164, 60);
		panel.add(lblLogOUt);
		
		JButton btnValid = new JButton("Valid");
		btnValid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(username!="" && category!="" && title!="" && ISBN!="") {
						// load mysql driver
						Class.forName("com.mysql.cj.jdbc.Driver");
						// create the connection  
						Connection con = DriverManager.getConnection("jdbc:mysql://localhost/librarymanagementsystem","root","root");
						String query = "";
						PreparedStatement ps;
						query = "UPDATE kindles SET status=? WHERE ISBN=? AND username=?";
						ps = con.prepareStatement(query);
						ps.setString(1, "valid");
						ps.setString(2, ISBN);
						ps.setString(3, username);
						
						ps.executeUpdate();
						JOptionPane.showMessageDialog(KindlesAdministration.this, " The "+category+" which title is "+title+"\n           is availble now for "
								+ username);
						
						con.close();
					}
					
					else
						JOptionPane.showMessageDialog(KindlesAdministration.this,"You have to select a row on the table");
						

				}
				catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Error while establishing connection");

				}
			}
		});
		btnValid.setFont(new Font("Verdana", Font.BOLD, 20));
		btnValid.setBounds(280, 99, 109, 38);
		contentPane.add(btnValid);
		
		JButton btnRefuse = new JButton("Refuse");
		btnRefuse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(username!="" && category!="" && title!="" && ISBN!="") {
						// load mysql driver
						Class.forName("com.mysql.cj.jdbc.Driver");
						// create the connection  
						Connection con = DriverManager.getConnection("jdbc:mysql://localhost/librarymanagementsystem","root","root");
						String query = "";
						PreparedStatement ps;
						query = "UPDATE kindles SET status=? WHERE ISBN=? AND username=?";
						ps = con.prepareStatement(query);
						ps.setString(1, "refused");
						ps.setString(2, ISBN);
						ps.setString(3, username);
						
						ps.executeUpdate();
						JOptionPane.showMessageDialog(KindlesAdministration.this, " The "+category+" which title is "+title+"\n           is not availble for "
								+ username);
						
						con.close();					
					}
					else
						JOptionPane.showMessageDialog(KindlesAdministration.this,"You have to select a row on the table");					
				}
				catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Error while establishing connection");

				}
			}
		});
		btnRefuse.setFont(new Font("Verdana", Font.BOLD, 20));
		btnRefuse.setBounds(727, 99, 109, 38);
		contentPane.add(btnRefuse);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(0, 149, 1119, 470);
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
				"Student's name","ISBN", "Title","Author", "Category", "Status"
			}
		));
		
        // Add the ListSelectionListener to the table
        table.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    selectedRow = table.getSelectedRow();
                    if (selectedRow != -1) {                  	
                    	username = (String) table.getValueAt(selectedRow, 0);
                    	ISBN = (String) table.getValueAt(selectedRow, 1);
                    	title=(String) table.getValueAt(selectedRow, 2);
                    	category=(String) table.getValueAt(selectedRow, 4);
                    }
                }
            }
        });
		
		
		ShowKindlesData();
	}
	
	private void ShowKindlesData() {
		try {
			
			// load mysql driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// create the connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/librarymanagementsystem","root","root");
			// create a query of select
			String query = "select * from kindles";
			// create a state of connection
			Statement st = con.createStatement();
			ResultSet res = st.executeQuery(query);

			while(res.next())
			{
				Object[] obj = null; // Declare the obj array outside the if conditions
			    DefaultTableModel T = (DefaultTableModel) table.getModel();
		        obj = new Object[]{res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7)};
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
					KindlesAdministration frame = new KindlesAdministration();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}





























