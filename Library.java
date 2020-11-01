package logins;

import java.net.URL;



import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Panel;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Library extends JFrame {
 static String name;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Library frame = new Library(name);
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
	public Library(String name) {
		this.name=name;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 870, 510);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LIBRARY");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 30));
		lblNewLabel.setBounds(338, 10, 352, 78);
		contentPane.add(lblNewLabel);
		

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(208, 0, 672, 464);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		
		
		Panel panel = new Panel();
		panel.setBackground(new Color(139, 0, 0));
		panel.setBounds(0, 0, 202, 471);
		contentPane.add(panel);
		panel.setLayout(null);
		
		// Text Area
		JTextArea textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setBackground(SystemColor.control);
		textArea.setFont(new Font("SansSerif", Font.PLAIN, 25));
		textArea.setBounds(10, 5, 576, 443);
		textArea.setEditable(false);
		textArea.setLineWrap(true);
		
		JButton btnNewButton = new JButton("Books Issued");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Connection con=getConnection();
				String s=" Books issued by  ";
				String query= "Select * from book_status where user_name=?";
				PreparedStatement stmt = con.prepareStatement(query);
				stmt.setString(1, name);
				
				
				ResultSet rs= stmt.executeQuery();
				while(rs.next()) {
					String s1=rs.getString("user_name");
					s=s+ s1;
					s=s+"\r\n"+ rs.getString("issue");
				}
				
				textArea.setText(s);
				//System.out.println(s);
				remove(lblNewLabel);
				panel_1.add(textArea);
				repaint();
				con.close();
			}
				catch(Exception a) {
					a.getMessage();
				}
				
			}
		});
		btnNewButton.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(139, 0, 0));
		btnNewButton.setBounds(0, 0, 202, 45);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton.setBackground(new Color(139,0,0));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton.setBackground(new Color(178,34,34));
			}
		});
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Amount Due");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Connection con=getConnection();
				String s=" You have due of (which is to be paid)";
				String query= "Select * from lib where user_name=?";
				PreparedStatement stmt = con.prepareStatement(query);
				stmt.setString(1, name);
				
				
				ResultSet rs= stmt.executeQuery();
				while(rs.next()) {
					
					s=s+"\r\n"+ rs.getString("due");
				}
				
				textArea.setText(s);
				//System.out.println(s);
				remove(lblNewLabel);
				panel_1.add(textArea);
				repaint();
				con.close();
			}
				catch(Exception a) {
					a.getMessage();
				}
				
			}
		});
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnNewButton_1.setBackground(new Color(139, 0, 0));
		btnNewButton_1.setBounds(0, 44, 202, 45);
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton_1.setBackground(new Color(139,0,0));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton_1.setBackground(new Color(178,34,34));
			}
		});
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New Arrivals");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Connection con=getConnection();
				String s="";
				String query= "Select * from arrivals";
				PreparedStatement stmt = con.prepareStatement(query);
				
				
				ResultSet rs= stmt.executeQuery();
				while(rs.next()) {
					
					String s1=rs.getString("Book");
					s=s+"\r\n" +s1;
				}
				
				textArea.setText(s);
				//System.out.println(s);
				remove(lblNewLabel);
				panel_1.add(textArea);
				repaint();
				con.close();
			}
				catch(Exception a) {
					a.getMessage();
				}
				}
		});
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnNewButton_2.setBackground(new Color(139, 0, 0));
		btnNewButton_2.setBounds(0, 89, 202, 45);
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton_2.setBackground(new Color(139,0,0));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton_2.setBackground(new Color(178,34,34));
			}
		});
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Book Status");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					try {
						Connection con=getConnection();
					String s="You need to submit or return back ur books by ";
					String query="Select * from book_status where user_name=?" ;
					PreparedStatement stmt = con.prepareStatement(query);
					stmt.setString(1, name);
					
					ResultSet rs= stmt.executeQuery();
					while(rs.next()) {
						String s2=rs.getString("user_name");
						String s1=rs.getString("b_status");
						s=s2+", "+s+"\r\n" +s1;
					}
					
					textArea.setText(s);
					//System.out.println(s);
					remove(lblNewLabel);
					panel_1.add(textArea);
					repaint();
					con.close();
				}
					catch(Exception a) {
						a.getMessage();
					}
					
				
			}
		});
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnNewButton_3.setBackground(new Color(139, 0, 0));
		btnNewButton_3.setBounds(0, 134, 202, 45);
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton_3.setBackground(new Color(139,0,0));
			}
			public void mouseEntered(MouseEvent e) {
				btnNewButton_3.setBackground(new Color(178,34,34));
			}
		});
		panel.add(btnNewButton_3);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home h=new Home(name);
				h.setVisible(true);
				dispose();
			}
		});
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnBack.setBackground(new Color(139, 0, 0));
		 btnBack.addMouseListener(new MouseAdapter(){
			 @Override
			 public void mouseExited(MouseEvent e) {
					btnBack.setBackground(new Color(139,0,0));
				}
				@Override
				public void mouseEntered(MouseEvent e) {
					btnBack.setBackground(new Color(178,34,34));
				}
			});
		btnBack.setBounds(0, 426, 202, 45);
		panel.add(btnBack);
		
		
		
		
		
	}

	

}
