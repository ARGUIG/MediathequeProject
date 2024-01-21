package mediatheque.Jframes;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

public class DocsAdministration extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
 
	/**
	 * Create the frame.
	 */
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
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(600, 134, 394, 193);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"isbn", "title", "author", "yearOfPublication"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, Integer.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane.setViewportView(table);
	}
}
