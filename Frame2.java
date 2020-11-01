package logins;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Frame2 extends JFrame {
String name;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame2 frame = new Frame2();
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
	public Frame2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 895, 492);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(178, 34, 34));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		//setUndecorated(true);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(484, 117, 175, 40);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
		
		passwordField = new JPasswordField();
		passwordField.setBounds(484, 241, 175, 40);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Frame2.class.getResource("/logins/images1/log.jpg")));
		lblNewLabel.setBounds(10, 11, 353, 372);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.setBackground(new Color(240, 240, 240));
		btnNewButton.setFont(new Font("SansSerif", Font.BOLD, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				try{  
					Class.forName("com.mysql.cj.jdbc.Driver");  
					Connection con=DriverManager.getConnection(  
					"jdbc:mysql://localhost:3306/project","root","root");
					
					String name= textField.getText();
				@SuppressWarnings("deprecation")
				String pass=passwordField.getText();
					
					String query = "SELECT * from login where user_name=? and pass=?";
					PreparedStatement stmt = con.prepareStatement(query);
					stmt.setString(1, name);
					stmt.setString(2, pass);
					ResultSet rs= stmt.executeQuery();
					if(rs.next())
					{
						JOptionPane.showMessageDialog(null, "Login Successful");
					String  ans= rs.getString("user_name");
					System.out.println(ans);
						if(ans.equals("Admin")) {
							Admin_1 h=new Admin_1(name);
							h.setVisible(true);
							dispose();
						}
						else if(ans.equals("Prafulla")) {
							Faculty_1 k =new Faculty_1(name);
							k.setVisible(true);
							dispose();
							
							
						}
						else {
						Home h=new Home(ans);
						h.setVisible(true);
						dispose();
						}
						
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Login Failed");
						Frame2 f2=new Frame2();
						f2.setVisible(true);
						dispose();
					}
					con.close();
			}
				
				
				catch(Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(484, 310, 175, 40);
		 btnNewButton.addMouseListener(new MouseAdapter(){
			 @Override
			 public void mouseExited(MouseEvent e) {
					btnNewButton.setBackground(new Color(240,240,240));
				}
				@Override
				public void mouseEntered(MouseEvent e) {
					btnNewButton.setBackground(new Color(130,144,255));
				}
			});
		contentPane.add(btnNewButton);
		
		JButton btnForgotPassword = new JButton("Forgot Password");
		btnForgotPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if(ae.getSource()== btnForgotPassword) {
					Frame3 f=new Frame3(name);
					f.setVisible(true);
					dispose();
				}
			}
		});
		btnForgotPassword.setToolTipText("Click here to reset password");
		btnForgotPassword.setBounds(681, 402, 175, 40);
		 btnForgotPassword.addMouseListener(new MouseAdapter(){
			 @Override
			 public void mouseExited(MouseEvent e) {
					btnForgotPassword.setBackground(new Color(240,240,240));
				}
				@Override
				public void mouseEntered(MouseEvent e) {
					btnForgotPassword.setBackground(new Color(130,144,255));
				}
			});
		contentPane.add(btnForgotPassword);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(139, 0, 0));
		separator.setBounds(495, 432, 254, -67);
		contentPane.add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("USER NAME");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Serif", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(484, 66, 200, 40);
		contentPane.add(lblNewLabel_1);
		
		
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setForeground(new Color(255, 255, 255));
		lblPassword.setFont(new Font("Serif", Font.PLAIN, 15));
		lblPassword.setBounds(484, 190, 200, 40);
		contentPane.add(lblPassword);
		
		JButton btnNewButton_1 = new JButton("BACK");
		btnNewButton_1.setFont(new Font("SansSerif", Font.BOLD, 14));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frame1 f=new Frame1();
				f.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(0, 408, 100, 45);
		btnNewButton_1.addMouseListener(new MouseAdapter(){
			 @Override
			 public void mouseExited(MouseEvent e) {
					btnNewButton_1.setBackground(new Color(240,240,240));
				}
				@Override
				public void mouseEntered(MouseEvent e) {
					btnNewButton_1.setBackground(new Color(130,144,255));
				}
			});
		contentPane.add(btnNewButton_1);
	}
}
