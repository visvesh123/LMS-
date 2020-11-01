package logins;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class personal_info extends JFrame {
static String name;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					personal_info frame = new personal_info(name);
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
	public personal_info(String name) {
		this.name=name;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 923, 521);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		//setUndecorated(true);
		
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(139, 0, 0));
		panel.setBounds(0, 0, 249, 489);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(249, 0, 658, 489);
		contentPane.add(panel_1);
	
		
		// Text Area
				JTextArea textArea = new JTextArea();
				textArea.setLineWrap(true);
				textArea.setBackground(SystemColor.control);
				textArea.setFont(new Font("SansSerif", Font.PLAIN, 18));
				textArea.setBounds(10, 5, 576, 443);
				textArea.setEditable(false);
				
		
				
				JLabel lblNewLabel = new JLabel("New label");
				lblNewLabel.setIcon(new ImageIcon(personal_info.class.getResource("/logins/images1/info.png")));
				lblNewLabel.setBounds(376, 21, 242, 213);
				contentPane.add(lblNewLabel);
				
				JLabel lblNewLabel_1 = new JLabel("All your academic  information is found here.");
				lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
				lblNewLabel_1.setBounds(376, 260, 311, 35);
				contentPane.add(lblNewLabel_1);
		
		
		
		
		JButton btnNewButton = new JButton("PROFILE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Connection con=getConnection();
				String s=" Profile of ";
				String query= "Select * from info where user_name=?";
				PreparedStatement stmt = con.prepareStatement(query);
				stmt.setString(1, name);
				
				
				ResultSet rs= stmt.executeQuery();
				while(rs.next()) {
					
					String s1=rs.getString("user_name");
					s=s+ s1;
					s=s+"\r\n"+ rs.getString("profile");
				}
				
				textArea.setText(s);
				//System.out.println(s);
				remove(lblNewLabel);
				remove(lblNewLabel_1);
				panel_1.add(textArea);
				repaint();
				con.close();
			}
				catch(Exception a) {
					a.getMessage();
				}
			}
		});
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
			
		btnNewButton.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(139, 0, 0));

		btnNewButton.setBounds(0, 0, 249, 40); 
		panel.add(btnNewButton);
		
		JButton btnAttendance = new JButton("ATTENDANCE");
		btnAttendance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Connection con=getConnection();
				String s=" Attendance of ";
				String query= "Select * from info where user_name=?";
				PreparedStatement stmt = con.prepareStatement(query);
				stmt.setString(1, name);
				
				
				ResultSet rs= stmt.executeQuery();
				while(rs.next()) {
					
					String s1=rs.getString("user_name");
					s=s+ s1;
					s=s+"\r\n"+ rs.getString("attendance");
				}
				
				textArea.setText(s);
				//System.out.println(s);
				remove(lblNewLabel);
				remove(lblNewLabel_1);
				panel_1.add(textArea);
				repaint();
				con.close();
			}
				catch(Exception a) {
					a.getMessage();
				}
			}
		});
		btnAttendance.setForeground(Color.WHITE);
		btnAttendance.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnAttendance.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				btnAttendance.setBackground(new Color(139,0,0));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnAttendance.setBackground(new Color(178,34,34));
			}
		});
		btnAttendance.setBackground(new Color(139, 0, 0));
		btnAttendance.setBounds(0, 40, 249, 40);
		panel.add(btnAttendance);
		
		JButton btnGrades = new JButton("GRADES");
		btnGrades.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Connection con=getConnection();
				String s=" Grades of  ";
				String query= "Select * from info where user_name=?";
				PreparedStatement stmt = con.prepareStatement(query);
				stmt.setString(1, name);
				
				
				ResultSet rs= stmt.executeQuery();
				while(rs.next()) {
					
					String s1=rs.getString("user_name");
					s=s+ s1;
					s=s+"\r\n"+ rs.getString("grades");
				}
				
				textArea.setText(s);
				//System.out.println(s);
				remove(lblNewLabel);
				remove(lblNewLabel_1);
				panel_1.add(textArea);
				repaint();
				con.close();
			}
				catch(Exception a) {
					a.getMessage();
				}
			}
		});
		btnGrades.setForeground(Color.WHITE);
		btnGrades.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				btnGrades.setBackground(new Color(139,0,0));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnGrades.setBackground(new Color(178,34,34));
			}
		});
		btnGrades.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnGrades.setBackground(new Color(139, 0, 0));
		btnGrades.setBounds(0, 81, 249, 40);
		panel.add(btnGrades);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frame4 f = new Frame4(name);
				f.setVisible(true);
				dispose();
			}
		});
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnBack.setBackground(new Color(139, 0, 0));
		btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				btnBack.setBackground(new Color(139,0,0));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnBack.setBackground(new Color(178,34,34));
			}
		});
		btnBack.setBounds(0, 449, 249, 40);
		panel.add(btnBack);
		
		
		
		

}
}
