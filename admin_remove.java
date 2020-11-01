package logins;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class admin_remove extends JFrame {
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
					admin_remove frame = new admin_remove(name);
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
	public admin_remove(String name) {
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
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				admin_student f=new admin_student(name);
				f.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBackground(new Color(30, 144, 255));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnNewButton.setBounds(0, 5, 110, 38);
		panel_2.add(btnNewButton);
		
		JButton btnRemove = new JButton("REMOVE");
		btnRemove.setForeground(Color.WHITE);
		btnRemove.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnRemove.setBackground(new Color(30, 144, 255));
		btnRemove.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				btnRemove.setBackground(new Color(30, 144, 255));
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
				btnUpdate.setBackground(new Color(30, 144, 255));
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
				btnLook.setBackground(new Color(30, 144, 255));
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
		
		
		JLabel lblConfirmPassword = new JLabel("Login Id:");
		lblConfirmPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblConfirmPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblConfirmPassword.setBounds(409, 96, 127, 39);
		panel.add(lblConfirmPassword);
		
		JButton btnRemove_1 = new JButton("REMOVE");
		btnRemove_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				String na=textField.getText();
				String log=textField_1.getText();
				if(na.equals("") ||log.equals("") ) {
					JOptionPane.showMessageDialog(null, "Enter all details");
					
				}
				Connection con=getConnection();
			//System.out.println(na);
			String query= " DELETE FROM login WHERE idlogin = ?";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setString(1, log);
			//stmt.setString(2, na);
			
			
			
			
			int row = stmt.executeUpdate();
			//System.out.println(row);
			if(row==1) {
				JOptionPane.showMessageDialog(null, "Removed Succesfully");
				
			}
			else {
				JOptionPane.showMessageDialog(null, "Deletion Failed");
			}
			
			
			
			con.close();
		}
			catch(Exception a) {
				a.getMessage();
			
			
			
		}
				
			}
		});
		btnRemove_1.setForeground(Color.WHITE);
		btnRemove_1.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnRemove_1.setBackground(new Color(30, 144, 255));
		btnRemove_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				btnRemove_1.setBackground(new Color(30, 144, 255));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnRemove_1.setBackground(new Color(0,0,205));
			}
		});
		btnRemove_1.setBounds(372, 146, 110, 38);
		panel.add(btnRemove_1);
		
		textField = new JTextField();
		textField.setBounds(225, 107, 135, 28);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(524, 107, 147, 28);
		panel.add(textField_1);
	
	}

}
