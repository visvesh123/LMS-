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
import javax.swing.border.EmptyBorder;

import logins.Admin_1;
import logins.Frame1;
import logins.Home;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class admin_student extends JFrame {
static String name;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					admin_student frame = new admin_student(name);
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
	public admin_student(String name) {
		this.name=name;
		setLocationByPlatform(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 495);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 784, 456);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(30, 144, 255));
		panel_1.setBounds(0, 0, 785, 74);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(226, 206, 52, 39);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(254, 157, 234, 28);
		panel.add(textField_3);
		
		
	
		
		JLabel lblNewLabel = new JLabel("STUDENTS ");
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 20));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(375, 11, 212, 61);
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(30, 144, 255));
		panel_2.setBounds(0, 75, 110, 381);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.setBackground(new Color(30, 144, 255));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton.setBackground(new Color(30,145,255));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton.setBackground(new Color(0,0,205));
			}
		});
		btnNewButton.setBounds(0, 5, 110, 38);
		panel_2.add(btnNewButton);
		
		JButton btnRemove = new JButton("REMOVE");
		btnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				admin_remove h=new admin_remove(name);
				h.setVisible(true);
				dispose();
			}
		});
		btnRemove.setForeground(Color.WHITE);
		btnRemove.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnRemove.setBackground(new Color(30, 144, 255));
		btnRemove.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				btnRemove.setBackground(new Color(30,145,255));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnRemove.setBackground(new Color(0,0,205));
			}
		});
		btnRemove.setBounds(0, 41, 110, 38);
		panel_2.add(btnRemove);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				admin_updates h=new admin_updates(name);
				h.setVisible(true);
				dispose();
			}
		});
		btnUpdate.setForeground(Color.WHITE);
		btnUpdate.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnUpdate.setBackground(new Color(30, 144, 255));
		btnUpdate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				btnUpdate.setBackground(new Color(30,145,255));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnUpdate.setBackground(new Color(0,0,205));
			}
		});
		btnUpdate.setBounds(0, 74, 110, 38);
		panel_2.add(btnUpdate);
		
		JButton btnLook = new JButton("BACK");
		btnLook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Admin_1 f=new Admin_1(name);
				f.setVisible(true);
				dispose();
			}
		});
		btnLook.setForeground(Color.WHITE);
		btnLook.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnLook.setBackground(new Color(30, 144, 255));
		btnLook.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				btnLook.setBackground(new Color(30,145,255));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnLook.setBackground(new Color(0,0,205));
			}
		});
		btnLook.setBounds(0, 343, 110, 38);
		panel_2.add(btnLook);
		
		JLabel label = new JLabel("Name:");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label.setBounds(120, 96, 127, 39);
		panel.add(label);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(226, 96, 151, 39);
		panel.add(textField);
		
		JLabel lblEmail = new JLabel("email:");
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEmail.setBounds(387, 96, 74, 39);
		panel.add(lblEmail);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(449, 96, 325, 39);
		panel.add(textField_1);
		
		JLabel lblCreatePassword = new JLabel("Create Password:");
		lblCreatePassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblCreatePassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCreatePassword.setBounds(120, 148, 127, 39);
		panel.add(lblCreatePassword);
		
		JLabel lblConfirmPassword = new JLabel("Login Id:");
		lblConfirmPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblConfirmPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblConfirmPassword.setBounds(120, 206, 127, 39);
		panel.add(lblConfirmPassword);
		
		JButton button = new JButton("ADD");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				try {
					String na=textField.getText();
					String em=textField_1.getText();
					String log=textField_2.getText();
					String pass=textField_3.getText();
					if(na.equals("") ||em.equals("")||pass.equals("")||log.equals("") ) {
						JOptionPane.showMessageDialog(null, "Enter all details");
						
					}
					Connection con=getConnection();
				//System.out.println(na);
				String query= "INSERT INTO login (idlogin, user_name, pass, email, otp) VALUES (?, ? , ?, ?, ?);";
				PreparedStatement stmt = con.prepareStatement(query);
				stmt.setString(1, log);
				stmt.setString(2, na);
				stmt.setString(3, pass);
				stmt.setString(4, em);
				stmt.setString(5, pass);
				
				
				
				int row = stmt.executeUpdate();
				System.out.println(row);
				if(row==1) {
					JOptionPane.showMessageDialog(null, "Updated Succesfully");
					
				}
				else {
					JOptionPane.showMessageDialog(null, "Update Failed");
				}
				
				
				
				con.close();
			}
				catch(Exception a) {
					a.getMessage();
				
				
				
			}
			}
		});
		button.setForeground(Color.WHITE);
		button.setFont(new Font("SansSerif", Font.BOLD, 15));
		button.setBackground(new Color(30, 144, 255));
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				button.setBackground(new Color(30, 144, 255));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				button.setBackground(new Color(0,0,205));
			}
		});
		button.setBounds(378, 275, 110, 38);
		panel.add(button);
		

	}
}
