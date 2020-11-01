package logins;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class Frame3 extends JFrame {
 static String name;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame3 frame = new Frame3(name);
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
	public Frame3(String name) {
		this.name=name;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 886, 501);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		//setUndecorated(true);
		JLabel lblNewLabel = new JLabel("EMAIL ID");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblNewLabel.setBounds(651, 68, 175, 40);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(563, 119, 263, 40);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(622, 312, 101, 40);
		contentPane.add(textField_1);
		
		JButton btnNewButton = new JButton("Send Verification Link");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{  
					Class.forName("com.mysql.cj.jdbc.Driver");  
					Connection con=DriverManager.getConnection(  
					"jdbc:mysql://localhost:3306/project","root","root");
					
					String email= textField.getText();
			
					//String otp=textField_1.getText();
					
					String query = "SELECT * from login where email=?";
					PreparedStatement stmt = con.prepareStatement(query);
					stmt.setString(1, email);
					
					ResultSet rs= stmt.executeQuery();
					while(rs.next()) {
						String otp=rs.getString("otp");
						textField_1.setText(otp);
						
					}
						
						
					
					con.close();
			}
				
				
				catch(Exception e1) {
					e1.printStackTrace();
				}
				
			}
		});
		btnNewButton.setBounds(597, 206, 204, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Frame3.class.getResource("/logins/images1/for.png")));
		lblNewLabel_1.setBounds(128, 119, 305, 312);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("STANFORD");
		lblNewLabel_2.setForeground(new Color(220, 220, 220));
		lblNewLabel_2.setFont(new Font("SansSerif", Font.BOLD, 55));
		lblNewLabel_2.setBounds(71, 0, 362, 119);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton_1 = new JButton("BACK\r\n");
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(139, 0, 0));
		btnNewButton_1.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frame2 f=new Frame2();
				f.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(0, 421, 126, 41);
		 btnNewButton_1.addMouseListener(new MouseAdapter(){
			 @Override
			 public void mouseExited(MouseEvent e) {
					btnNewButton_1.setBackground(new Color(139,0,0));
				}
				@Override
				public void mouseEntered(MouseEvent e) {
					btnNewButton_1.setBackground(new Color(178,34,34));
				}
			});
		contentPane.add(btnNewButton_1);
		
		JLabel lblOtp = new JLabel("One Time Password");
		lblOtp.setForeground(Color.WHITE);
		lblOtp.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblOtp.setBounds(597, 271, 175, 40);
		contentPane.add(lblOtp);
		
		
		
		JButton btnSubmit = new JButton("SUBMIT");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{  
					Class.forName("com.mysql.cj.jdbc.Driver");  
					Connection con=DriverManager.getConnection(  
					"jdbc:mysql://localhost:3306/project","root","root");
					
					String email= textField.getText();
			
					String otp=textField_1.getText();
					
					String query = "SELECT * from login where email=? and otp=?";
					PreparedStatement stmt = con.prepareStatement(query);
					stmt.setString(1, email);
					stmt.setString(2, otp);
					ResultSet rs= stmt.executeQuery();
					
						
					if(rs.next())
					{
						JOptionPane.showMessageDialog(null, "Login Successful");
						Home h=new Home(name);
						h.setVisible(true);
						dispose();
						
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Invalid ");
						
					}
					con.close();
			}
				
				
				catch(Exception e1) {
					e1.printStackTrace();
				}

			}
		});
		btnSubmit.setBounds(622, 381, 101, 34);
		contentPane.add(btnSubmit);
	}
}
