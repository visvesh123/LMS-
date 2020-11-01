package logins;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class admin_updates extends JFrame {
static String name;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					admin_updates frame = new admin_updates(name);
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
	public admin_updates(String name) {
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
         panel_1.setForeground(new Color(255, 255, 255));
         panel_1.setBounds(0, 0, 785, 74);

         panel_1.setBackground(new Color(30, 144, 255));

         panel.add(panel_1);

         panel_1.setLayout(null);
         
         JLabel lblNewLabel = new JLabel("UPDATE");
         lblNewLabel.setForeground(new Color(255, 255, 255));
         lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 20));
         lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
         lblNewLabel.setBounds(291, 13, 200, 33);
         panel_1.add(lblNewLabel);
		
         
         JLabel label = new JLabel("Name:");

         label.setHorizontalAlignment(SwingConstants.CENTER);

         label.setFont(new Font("Tahoma", Font.PLAIN, 15));

         label.setBounds(185, 105, 90, 30);

         panel.add(label);

       
        
         
        
        
        JPanel panel_2 = new JPanel();
        panel_2.setForeground(new Color(255, 255, 255));

        panel_2.setBackground(new Color(30, 144, 255));

        panel_2.setBounds(0, 73, 110, 383);

        panel.add(panel_2);

        panel_2.setLayout(null);
        
        JButton btnNewButton_1 = new JButton("BACK");
        btnNewButton_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Admin_1 h=new Admin_1(name);
        		h.setVisible(true);
        		dispose();
        	}
        });
        btnNewButton_1.setBackground(new Color(30, 144, 255));
        btnNewButton_1.setFont(new Font("SansSerif", Font.BOLD, 15));
        btnNewButton_1.setForeground(new Color(255, 255, 255));
        btnNewButton_1.setBounds(0, 352, 110, 31);
        btnNewButton_1.addMouseListener(new MouseAdapter() {
 			@Override
 			public void mouseExited(MouseEvent e) {
 				btnNewButton_1.setBackground(new Color(30, 144, 255));
 			}
 			@Override
 			public void mouseEntered(MouseEvent e) {
 				btnNewButton_1.setBackground(new Color(0,0,205));
 			}
 		});
        panel_2.add(btnNewButton_1);
        
        JButton btnAdd = new JButton("ADD");
        btnAdd.setBackground(new Color(30, 144, 255));
        btnAdd.setFont(new Font("SansSerif", Font.BOLD, 14));
        btnAdd.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		admin_student h=new admin_student(name);
				h.setVisible(true);
				dispose();
        	}
        });
        btnAdd.setForeground(Color.WHITE);
        btnAdd.addMouseListener(new MouseAdapter() {
 			@Override
 			public void mouseExited(MouseEvent e) {
 				btnAdd.setBackground(new Color(30, 144, 255));
 			}
 			@Override
 			public void mouseEntered(MouseEvent e) {
 				btnAdd.setBackground(new Color(0,0,205));
 			}
 		});
        btnAdd.setBounds(0, 0, 110, 31);
        panel_2.add(btnAdd);
        
        JButton btnRemove = new JButton("REMOVE");
        btnRemove.setBackground(new Color(30, 144, 255));
        btnRemove.setFont(new Font("SansSerif", Font.BOLD, 14));
        btnRemove.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		admin_remove h=new admin_remove(name);
				h.setVisible(true);
				dispose();
        	}
        });
        btnRemove.setForeground(Color.WHITE);
        btnRemove.setBounds(0, 31, 110, 31);
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
        panel_2.add(btnRemove);
        
        JButton btnUpdate = new JButton("UPDATE");
        btnUpdate.setBackground(new Color(30, 144, 255));
        btnUpdate.setFont(new Font("SansSerif", Font.BOLD, 14));
        btnUpdate.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		admin_updates h=new admin_updates(name);
				h.setVisible(true);
				dispose();
        	}
        });
        btnUpdate.setForeground(Color.WHITE);
        btnUpdate.setBounds(0, 62, 110, 31);
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
        panel_2.add(btnUpdate);
        
              
       JTextField textField = new JTextField();
        textField.setBounds(333, 105, 274, 22);
        panel.add(textField);
        textField.setColumns(10);
        
        JLabel lblNewLabel_1 = new JLabel("New Name:");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel_1.setBounds(185, 163, 77, 22);
        panel.add(lblNewLabel_1);
        
       JTextField textField_1 = new JTextField();
        textField_1.setBounds(333, 164, 274, 22);
        panel.add(textField_1);
        textField_1.setColumns(10);
        
        JLabel lblNewLabel_2 = new JLabel("Password:");
        lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel_2.setBounds(185, 218, 77, 22);
        panel.add(lblNewLabel_2);
        
        JTextField textField_2 = new JTextField();
        textField_2.setBounds(333, 219, 274, 22);
        panel.add(textField_2);
        textField_2.setColumns(10);
        
        JLabel lblNewLabel_3 = new JLabel("New Password:");
        lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel_3.setBounds(185, 267, 104, 22);
        panel.add(lblNewLabel_3);
        
        JTextField textField_3 = new JTextField();
        textField_3.setBounds(333, 268, 274, 22);
        panel.add(textField_3);
        textField_3.setColumns(10);
        
        JLabel lblNewLabel_4 = new JLabel("Mail-id:");
        lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel_4.setBounds(185, 320, 90, 30);
        panel.add(lblNewLabel_4);
        
       JTextField textField_4 = new JTextField();
        textField_4.setBounds(333, 325, 274, 22);
        panel.add(textField_4);
        textField_4.setColumns(10);
        
        JLabel lblNewLabel_5 = new JLabel("New mail-id:");
        lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel_5.setBounds(185, 373, 104, 22);
        panel.add(lblNewLabel_5);
        
        JTextField textField_5 = new JTextField();
        textField_5.setBounds(337, 374, 270, 22);
        panel.add(textField_5);
        textField_5.setColumns(10);
        
        JButton btnNewButton = new JButton("UPDATE");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		try {
    				String na=textField.getText();
    				String new_na=textField_1.getText();
    				String pass=textField_2.getText();
    				String new_pass=textField_3.getText();
    				String em=textField_4.getText();
    				String new_em=textField_5.getText();
    				if(na.equals("") ||pass.equals("")  ) {
    					JOptionPane.showMessageDialog(null, "Enter current password  to update ");
    					
    				}
    				Connection con=getConnection();
    			
    			String query= " UPDATE login  SET pass = ? email=?  WHERE name = ?";
    			PreparedStatement stmt = con.prepareStatement(query);
    			stmt.setString(1, new_pass);
    			stmt.setString(2, new_em);
    			stmt.setString(3,na);
    			
    			
    			
    			
    			int row = stmt.executeUpdate();
    			//System.out.println(row);
    			if(row==1) {
    				JOptionPane.showMessageDialog(null, "Updated detaild Succesfully");
    				
    			}
    			else {
    				JOptionPane.showMessageDialog(null, "Could not update");
    			}
    			
    			
    			
    			con.close();
    		}
    			catch(Exception a) {
    				a.getMessage();
    			
    			
    			
    		}
        	}
        });
        btnNewButton.setForeground(new Color(255, 255, 255));
        btnNewButton.setFont(new Font("SansSerif", Font.BOLD, 15));
        btnNewButton.addMouseListener(new MouseAdapter() {
 			@Override
 			public void mouseExited(MouseEvent e) {
 				btnNewButton.setBackground(new Color(30, 144, 255));
 			}
 			@Override
 			public void mouseEntered(MouseEvent e) {
 				btnNewButton.setBackground(new Color(0,0,205));
 			}
 		});
        btnNewButton.setBackground(new Color(30,144, 255));
        btnNewButton.setBounds(635, 400, 110, 37);
        panel.add(btnNewButton);


	}

}
