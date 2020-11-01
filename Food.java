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
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

public class Food extends JFrame {
	static String name;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Food frame = new Food(name);
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
	public Food(String name) {
		this.name=name;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 889, 496);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255,255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 209, 454);
		panel.setBackground(new Color(139, 0, 0));
		contentPane.add(panel);
		panel.setLayout(null); 
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(207, 0, 666, 454);
		contentPane.add(panel_1);
		
		JTextArea txtrToEnsure = new JTextArea();
		txtrToEnsure.setEditable(false);
		txtrToEnsure.setBackground(UIManager.getColor("Button.background"));
		txtrToEnsure.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtrToEnsure.setLineWrap(true);
		txtrToEnsure.setText("Our duties and responsibilities\r\n\r\n. To ensure that mess stores are in good condition.\r\n\uF0B7 To verify and certify the received bills from suppliers as well as\r\n.To take responsibility for temporary advances for necessity and observance its adjustment.\r\n\uF0B7 To keep record of monthly income and expenditure.\r\n\uF0B7 To supervise the kitchen and cook as well as decide suitable menu.\r\n\uF0B7 To make a Mess area should be clean, safety and disciplined\r\n\uF0B7 To maintain proper disposable method.\r\n\uF0B7 To manage the causal leaves and extra duty of cooks and helper");
		txtrToEnsure.setBounds(10, 30, 531, 207);
		
		
		JLabel lblNewLabel = new JLabel("NOURISH TO FLOURISH !!!");
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblNewLabel.setBounds(191, 0, 214, 33);
		
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(UIManager.getColor("Button.background"));
		textArea.setFont(new Font("SansSerif", Font.BOLD, 15));
		textArea.setBounds(10, 248, 664, 183);
		
		try {
			Connection con=getConnection();
		String s=" Contact details \r\n";
		String query= "Select * from mess_incharges" ;
		PreparedStatement stmt = con.prepareStatement(query);
		ResultSet rs= stmt.executeQuery();
		while(rs.next()) {	
			s=s+"\r\n\r\n"+ rs.getString("name") +"   "+rs.getString("contact no") +"   "+rs.getString("email") ;
		}
		textArea.setText(s);
		con.close();
	}
		catch(Exception a) {
			a.getMessage();
		}
		
		JLabel lblNewLabel_1 = new JLabel("Name:");
		lblNewLabel_1.setFont(new Font("SansSerif", Font.BOLD, 16));
		lblNewLabel_1.setBounds(23, 138, 70, 29);
		
		
		JTextField textField_2 = new JTextField();
		textField_2.setBounds(81, 136, 194, 37);
		
		textField_2.setColumns(10);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setFont(new Font("SansSerif", Font.BOLD, 16));
		lblId.setBounds(325, 138, 70, 29);
		
		
		JTextField textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(355, 138, 111, 37);
		
		
		JLabel lblYourComplaintssuggestions = new JLabel("Your complaints/suggestions:");
		lblYourComplaintssuggestions.setFont(new Font("SansSerif", Font.BOLD, 16));
		lblYourComplaintssuggestions.setBounds(23, 203, 252, 29);
		
		
		JTextArea textArea1 = new JTextArea();
		textArea1.setBounds(33, 232, 411, 140);
		
		
		JButton btnNewButton_s = new JButton("SUBMIT");
		btnNewButton_s.setForeground(new Color(255, 255, 255));
		btnNewButton_s.setBackground(new Color(139, 0, 0));
		btnNewButton_s.setFont(new Font("SansSerif", Font.BOLD, 14));
		btnNewButton_s.setBounds(284, 402, 89, 29);
		btnNewButton_s.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton_s.setBackground(new Color(139,0,0));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton_s.setBackground(new Color(178,34,34));
			}
		});
		
		
		JLabel lblNewLabel_11 = new JLabel("HELP US SERVE YOU BETTER  !!!");
		lblNewLabel_11.setFont(new Font("Segoe UI", Font.BOLD, 25));
		lblNewLabel_11.setBounds(118, 21, 411, 72);
		
		
		
		
		
		JButton btnNewButton = new JButton("WEEKLY SCHEDULE");
		
		
		
		
		
		
		 btnNewButton.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					if(e.getSource()==btnNewButton ) {
					    
						
						repaint();	
						
					}
					
					
				}
			});
			
			btnNewButton.setForeground(new Color(255, 255, 255));
			btnNewButton.setBackground(new Color(139, 0, 0));
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
			
			btnNewButton.setBounds(0, 0, 207, 45);
		panel.add(btnNewButton);
		
		
		JButton btnNewButton_1 = new JButton("SUGGGESTIONS");
		
		
		
		 btnNewButton_1.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					if(e.getSource()==btnNewButton_1 ) {
						remove(txtrToEnsure);
						remove(lblNewLabel);
						remove(textArea);
						
						invalidate();
						validate();
						repaint();
						panel_1.add(lblNewLabel_11);
						panel_1.add(btnNewButton_s);
						panel_1.add(textArea1);
						panel_1.add(lblNewLabel_1);
						panel_1.add(lblId);
						panel_1.add(textField_2);
						panel_1.add(lblYourComplaintssuggestions);
						panel_1.add(textField_1);
						
						
						
						
						
					}
					
					
				}
			});
			
			btnNewButton_1.setForeground(new Color(255, 255, 255));
			btnNewButton_1.setBackground(new Color(139, 0, 0));
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
			btnNewButton_1.setFont(new Font("SansSerif", Font.BOLD, 15));
			btnNewButton_1.setBounds(0,45, 207, 45);
		
		
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("BACK");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home h=new Home(name);
				h.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setFont(new Font("SansSerif", Font.BOLD, 16));
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(139, 0, 0));
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
		btnNewButton_2.setBounds(0, 415, 207, 39);
		panel.add(btnNewButton_2);
		
		
		
		JButton btnHello = new JButton("MESS INCHARGES");
		btnHello.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
					remove(textArea1);
					remove(lblId);
					remove(lblNewLabel_1);
					remove(lblNewLabel_11);
					remove(textField_1);
					remove(textField_2);
					remove(lblYourComplaintssuggestions);
					remove(btnNewButton_s);
					invalidate();
					validate();
					repaint();
					panel_1.add(txtrToEnsure);
					panel_1.add(lblNewLabel);
					panel_1.add(textArea);
				
					//panel_1.revalidate();
					
					
				
				
			}
		});
		btnHello.setForeground(Color.WHITE);
		btnHello.setFont(new Font("SansSerif", Font.BOLD, 16));
		btnHello.setBackground(new Color(139, 0, 0));
		btnHello.setBounds(0, 89, 207, 45);
		panel.add(btnHello);
		
		}
}
