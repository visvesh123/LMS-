package logins;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Faculty_noti extends JFrame {
static String name;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Faculty_noti frame = new Faculty_noti(name);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	

	public static Connection getConnection() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/project","root","root");		
	return con;
	
	}
	

	/**
	 * Create the frame.
	 */
	public Faculty_noti(String name) {
		 this.name=getName();

	        setLocationByPlatform(true);

	 

	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	 

	        setBounds(100, 100, 728, 495);

	 

	        contentPane = new JPanel();

	 

	        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

	 

	        setContentPane(contentPane);

	 

	        contentPane.setLayout(null);

	 

	      

	 

	        JPanel panel = new JPanel();

	 

	        panel.setBounds(0, 0, 714, 456);

	 

	        contentPane.add(panel);

	 

	        panel.setLayout(null);

	 

	      

	 

	        JPanel panel_1 = new JPanel();

	 

	        panel_1.setBackground(new Color(255, 215, 0));

	 

	        panel_1.setBounds(0, 0, 721, 100);

	 

	        panel.add(panel_1);

	 

	        panel_1.setLayout(null);

	 

	      

	 

	        JLabel lblNewLabel = new JLabel("POST NOTIFICATIONS");

	 

	        lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 28));

	 

	        lblNewLabel.setForeground(new Color(0, 0, 0));

	 

	        lblNewLabel.setBounds(247, 11, 328, 61);

	 

	        panel_1.add(lblNewLabel);

	       

	        JPanel panel_2 = new JPanel();

	        panel_2.setBackground(new Color(255, 215, 0));

	        panel_2.setBounds(0, 97, 129, 359);

	        panel.add(panel_2);

	        panel_2.setLayout(null);

	       

	        JButton btnNewButton = new JButton("BACK");
	        btnNewButton.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseExited(MouseEvent e) {
					
					btnNewButton.setBackground(new Color(255, 215, 0));
				}
				@Override
				public void mouseEntered(MouseEvent e) {
					btnNewButton.setBackground(new Color(218,165,32));
				}
			});
	        btnNewButton.setBackground(new Color(255, 215, 0));
	       

	        btnNewButton.addActionListener(new ActionListener() {

	               public void actionPerformed(ActionEvent e) {
	            	   Faculty_1 h= new Faculty_1(name);
	           		h.setVisible(true);
	           		dispose();

	                             //  Faculty_1 f=new Faculty_1(name);

	                              // f.setVisible(true);

	                               //dispose();

	                              

	               }

	        });

	        btnNewButton.setFont(new Font("SansSerif", Font.BOLD, 15));

	        btnNewButton.setBounds(0, 328, 129, 31);

	        panel_2.add(btnNewButton);

	       

	        JTextArea textArea = new JTextArea();

	        textArea.setLineWrap(true);

	        textArea.setBounds(211, 175, 409, 164);

	        panel.add(textArea);

	       

	        JButton btnPost = new JButton("POST");
	        btnPost.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		try {
						String na=textArea.getText();
						
						
						Connection con=getConnection();
					
					String query= "INSERT INTO noti (info) VALUES ( ? )";
					PreparedStatement stmt = con.prepareStatement(query);
					System.out.println(query);
					stmt.setString(1, na);
					
					System.out.println(stmt);
					
					
					int row = stmt.executeUpdate();
					System.out.println("Hello");
					
			
					
					if(row==1) {
						JOptionPane.showMessageDialog(null, "Notification posted Succesfully");
						
					}
					else {
						JOptionPane.showMessageDialog(null, "Sorry, try it again");
					}
					
					
					
					con.close();
				}
					catch(Exception a) {
						a.getMessage();
					
					
					
				}
	        	}
	        });
	        btnPost.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseExited(MouseEvent e) {
					btnPost.setBackground(new Color(255, 215, 0));
				}
				@Override
				public void mouseEntered(MouseEvent e) {
					btnPost.setBackground(new Color(218,165,32));
				}
			});
	       
	        btnPost.setBackground(new Color(255, 215, 0));

	        btnPost.setFont(new Font("SansSerif", Font.BOLD, 15));

	        btnPost.setBounds(332, 376, 129, 31);

	        panel.add(btnPost);
	
	
	}

}
