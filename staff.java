package logins;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class staff extends JFrame {
	static String name;

	private JPanel contentPane;
	public static Connection con;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					staff frame = new staff(name);
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public static void getConnection() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/project","root","root");		
	
	
	}
	/**
	 * Create the frame.
	 */
	public staff(String name) {
		this.name=name;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 908, 515);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	
		JPanel panel = new JPanel();
		panel.setBackground(new Color(139, 0, 0));
		panel.setBounds(0, 0, 252, 472);
		contentPane.add(panel);
		panel.setLayout(null);
		
		
		
		
		
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(231, 11, 146, 35);
		contentPane.add(lblNewLabel);
		
		JTextArea textArea = new JTextArea();
		//textArea.setText("2");
		textArea.setBackground(SystemColor.control);
		textArea.setBounds(263, 67, 522, 84);
		textArea.setLineWrap(true);
		
		contentPane.add(textArea);
		
		JLabel label = new JLabel();
		label.setFont(new Font("SansSerif", Font.BOLD, 14));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(231, 162, 146, 35);
		contentPane.add(label);
		
		JTextArea textArea_1 = new JTextArea();
		//textArea_1.setText("4");
		textArea_1.setBackground(SystemColor.menu);
		textArea_1.setBounds(263, 208, 522, 84);
		textArea_1.setWrapStyleWord(true);
		textArea_1.setLineWrap(true);
		contentPane.add(textArea_1);
		
		JLabel label_1 = new JLabel();
		label_1.setFont(new Font("SansSerif", Font.BOLD, 14));
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_1.setBounds(230, 316, 146, 35);
		contentPane.add(label_1);
		
		JTextArea textArea_2 = new JTextArea();
		//textArea_2.setText("6");
		textArea_2.setBackground(SystemColor.menu);
		textArea_2.setWrapStyleWord(true);
		textArea_2.setBounds(263, 357, 522, 84);
		textArea_2.setLineWrap(true);
		contentPane.add(textArea_2);
		
		
		JButton btnNewButton = new JButton("COMPUTER SCIENCE");
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					getConnection();
				String s= "CSE";
				String query= "Select * from staff where department=?";
				PreparedStatement stmt = con.prepareStatement(query);
				stmt.setString(1, s);
				
				ResultSet rs= stmt.executeQuery();
				int i=0;
				while(rs.next()) {
					if(i==0) {
					String name= rs.getString("name");
					String text= rs.getString("bio");
					label.setText(name);
					textArea_1.setText(text);
					System.out.println("Hello");
					}
					if(i==1) {
						String name= rs.getString("name");
						String text= rs.getString("bio");
						lblNewLabel.setText(name);
						textArea.setText(text);
						System.out.println("Hello");
						}
						
					if(i==2) {
						String name= rs.getString("name");
						String text= rs.getString("bio");
						label_1.setText(name);
						textArea_2.setText(text);
						System.out.println("Hello");
						}
						
					i++;
					
				}
				con.close();
				}
				catch(Exception b) {
					b.getMessage();
					
				}
			}
		});
		
		btnNewButton.setForeground(new Color(255, 255, 255));
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
		btnNewButton.setBackground(new Color(139, 0, 0));
		btnNewButton.setBounds(0, 0, 252, 40);
		panel.add(btnNewButton);
		
		JButton btnMechanical = new JButton("MECHANICAL\r\n");
		btnMechanical.setForeground(Color.WHITE);
		btnMechanical.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnMechanical.setBackground(new Color(139, 0, 0));
		btnMechanical.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				btnMechanical.setBackground(new Color(139,0,0));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnMechanical.setBackground(new Color(178,34,34));
			}
		});
		btnMechanical.setBounds(0, 39, 252, 40);
		btnMechanical.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				Class.forName("com.mysql.cj.jdbc.Driver"); 
				Connection con=DriverManager.getConnection(  
				"jdbc:mysql://localhost:3306/project","root","root");
				String s= "MEC";
				String query= "Select * from staff where department=?";
				PreparedStatement stmt = con.prepareStatement(query);
				stmt.setString(1, s);
				
				ResultSet rs= stmt.executeQuery();
				int i=0;
				while(rs.next()) {
					if(i==0) {
					String name= rs.getString("name");
					String text= rs.getString("bio");
					label.setText(name);
					textArea_1.setText(text);
					System.out.println("Hello");
					}
					if(i==1) {
						String name= rs.getString("name");
						String text= rs.getString("bio");
						lblNewLabel.setText(name);
						textArea.setText(text);
						System.out.println("Hello");
						}
						
					if(i==2) {
						String name= rs.getString("name");
						String text= rs.getString("bio");
						label_1.setText(name);
						textArea_2.setText(text);
						System.out.println("Hello");
						}
						
					i++;
					
				}
				con.close();
				}
				catch(Exception b) {
					b.getMessage();
					
				}
			}
		});
		panel.add(btnMechanical);
		
		JButton btnCivil = new JButton("CIVIL");
		btnCivil.setForeground(Color.WHITE);
		btnCivil.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnCivil.setBackground(new Color(139, 0, 0));
		btnCivil.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				btnCivil.setBackground(new Color(139,0,0));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnCivil.setBackground(new Color(178,34,34));
			}
		});
		btnCivil.setBounds(0, 79, 252, 40);
		btnCivil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				Class.forName("com.mysql.cj.jdbc.Driver"); 
				Connection con=DriverManager.getConnection(  
				"jdbc:mysql://localhost:3306/project","root","root");
				String s= "CIVIL";
				String query= "Select * from staff where department=?";
				PreparedStatement stmt = con.prepareStatement(query);
				stmt.setString(1, s);
				
				ResultSet rs= stmt.executeQuery();
				int i=0;
				while(rs.next()) {
					if(i==0) {
					String name= rs.getString("name");
					String text= rs.getString("bio");
					label.setText(name);
					textArea_1.setText(text);
					//System.out.println("Hello");
					}
					if(i==1) {
						String name= rs.getString("name");
						String text= rs.getString("bio");
						lblNewLabel.setText(name);
						textArea.setText(text);
					//	System.out.println("Hello");
						}
						
					if(i==2) {
						String name= rs.getString("name");
						String text= rs.getString("bio");
						label_1.setText(name);
						textArea_2.setText(text);
						//System.out.println("Hello");
						}
						
					i++;
					
				}
				con.close();
				}
				catch(Exception b) {
					b.getMessage();
					
				}
			}
		});
		panel.add(btnCivil);
		
		JButton btnElectricalelectronics = new JButton("ELECTRICAL/ELECTRONICS");
		btnElectricalelectronics.setForeground(Color.WHITE);
		btnElectricalelectronics.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnElectricalelectronics.setBackground(new Color(139, 0, 0));
		btnElectricalelectronics.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				btnElectricalelectronics.setBackground(new Color(139,0,0));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnElectricalelectronics.setBackground(new Color(178,34,34));
			}
		});
		btnElectricalelectronics.setBounds(0, 119, 252, 40);
		btnElectricalelectronics.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				Class.forName("com.mysql.cj.jdbc.Driver"); 
				Connection con=DriverManager.getConnection(  
				"jdbc:mysql://localhost:3306/project","root","root");
				String s= "EEE";
				String query= "Select * from staff where department=?";
				PreparedStatement stmt = con.prepareStatement(query);
				stmt.setString(1, s);
				
				ResultSet rs= stmt.executeQuery();
				int i=0;
				while(rs.next()) {
					if(i==0) {
					String name= rs.getString("name");
					String text= rs.getString("bio");
					label.setText(name);
					textArea_1.setText(text);
					//System.out.println("Hello");
					}
					if(i==1) {
						String name= rs.getString("name");
						String text= rs.getString("bio");
						lblNewLabel.setText(name);
						textArea.setText(text);
						//System.out.println("Hello");
						}
						
					if(i==2) {
						String name= rs.getString("name");
						String text= rs.getString("bio");
						label_1.setText(name);
						textArea_2.setText(text);
						//System.out.println("Hello");
						}
						
					i++;
					
				}
				con.close();
				}
				catch(Exception b) {
					b.getMessage();
					
				}
			}
		});
		panel.add(btnElectricalelectronics);
		
		JButton btnHumanitySciences = new JButton("HUMANITY SCIENCES");
		btnHumanitySciences.setForeground(Color.WHITE);
		btnHumanitySciences.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnHumanitySciences.setBackground(new Color(139, 0, 0));
		btnHumanitySciences.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				btnHumanitySciences.setBackground(new Color(139,0,0));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnHumanitySciences.setBackground(new Color(178,34,34));
			}
		});
		btnHumanitySciences.setBounds(0, 159, 252, 40);
		btnHumanitySciences.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			try {
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/project","root","root");
			String s= "HS";
			String query= "Select * from staff where department=?";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setString(1, s);
			
			ResultSet rs= stmt.executeQuery();
			int i=0;
			while(rs.next()) {
				if(i==0) {
				String name= rs.getString("name");
				String text= rs.getString("bio");
				label.setText(name);
				textArea_1.setText(text);
				//System.out.println("Hello");
				}
				if(i==1) {
					String name= rs.getString("name");
					String text= rs.getString("bio");
					lblNewLabel.setText(name);
					textArea.setText(text);
					//System.out.println("Hello");
					}
					
				if(i==2) {
					String name= rs.getString("name");
					String text= rs.getString("bio");
					label_1.setText(name);
					textArea_2.setText(text);
					//System.out.println("Hello");
					}
					
				i++;
				
			}
			con.close();
			}
			catch(Exception b) {
				b.getMessage();
				
			}
		}
	});
	
		panel.add(btnHumanitySciences);
		
		JButton btnPhysics = new JButton("PHYSICS");
		btnPhysics.setForeground(Color.WHITE);
		btnPhysics.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnPhysics.setBackground(new Color(139, 0, 0));
		btnPhysics.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				btnPhysics.setBackground(new Color(139,0,0));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnPhysics.setBackground(new Color(178,34,34));
			}
		});
		btnPhysics.setBounds(0, 198, 252, 40);
		btnPhysics.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				Class.forName("com.mysql.cj.jdbc.Driver"); 
				Connection con=DriverManager.getConnection(  
				"jdbc:mysql://localhost:3306/project","root","root");
				String s= "PHY";
				String query= "Select * from staff where department=?";
				PreparedStatement stmt = con.prepareStatement(query);
				stmt.setString(1, s);
				
				ResultSet rs= stmt.executeQuery();
				int i=0;
				while(rs.next()) {
					if(i==0) {
					String name= rs.getString("name");
					String text= rs.getString("bio");
					label.setText(name);
					textArea_1.setText(text);
					//System.out.println("Hello");
					}
					if(i==1) {
						String name= rs.getString("name");
						String text= rs.getString("bio");
						lblNewLabel.setText(name);
						textArea.setText(text);
						//System.out.println("Hello");
						}
						
					if(i==2) {
						String name= rs.getString("name");
						String text= rs.getString("bio");
						label_1.setText(name);
						textArea_2.setText(text);
						//System.out.println("Hello");
						}
						
					i++;
					
				}
				con.close();
				}
				catch(Exception b) {
					b.getMessage();
					
				}
			}
			
		});
		panel.add(btnPhysics);
		
		JButton btnChemistry = new JButton("CHEMISTRY");
		btnChemistry.setForeground(Color.WHITE);
		btnChemistry.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnChemistry.setBackground(new Color(139, 0, 0));
		btnChemistry.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				btnChemistry.setBackground(new Color(139,0,0));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnChemistry.setBackground(new Color(178,34,34));
			}
		});
		btnChemistry.setBounds(0, 238, 252, 40);
		btnChemistry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				Class.forName("com.mysql.cj.jdbc.Driver"); 
				Connection con=DriverManager.getConnection(  
				"jdbc:mysql://localhost:3306/project","root","root");
				String s= "CHE";
				String query= "Select * from staff where department=?";
				PreparedStatement stmt = con.prepareStatement(query);
				stmt.setString(1, s);
				
				ResultSet rs= stmt.executeQuery();
				int i=0;
				while(rs.next()) {
					if(i==0) {
					String name= rs.getString("name");
					String text= rs.getString("bio");
					label.setText(name);
					textArea_1.setText(text);
					//System.out.println("Hello");
					}
					if(i==1) {
						String name= rs.getString("name");
						String text= rs.getString("bio");
						lblNewLabel.setText(name);
						textArea.setText(text);
						//System.out.println("Hello");
						}
						
					if(i==2) {
						String name= rs.getString("name");
						String text= rs.getString("bio");
						label_1.setText(name);
						textArea_2.setText(text);
						//System.out.println("Hello");
						}
						
					i++;
					
				}
				con.close();
				} 
				catch(Exception b) {
					b.getMessage();
					
				}
			}
		});
		panel.add(btnChemistry);
		
		JButton btnMathematics = new JButton("MATHEMATICS");
		btnMathematics.setForeground(Color.WHITE);
		btnMathematics.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnMathematics.setBackground(new Color(139, 0, 0));
		btnMathematics.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				btnMathematics.setBackground(new Color(139,0,0));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnMathematics.setBackground(new Color(178,34,34));
			}
		});
		btnMathematics.setBounds(0, 277, 252, 40);
		btnMathematics.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				Class.forName("com.mysql.cj.jdbc.Driver"); 
				Connection con=DriverManager.getConnection(  
				"jdbc:mysql://localhost:3306/project","root","root");
				String s= "MAT";
				String query= "Select * from staff where department=?";
				PreparedStatement stmt = con.prepareStatement(query);
				stmt.setString(1, s);
				
				ResultSet rs= stmt.executeQuery();
				int i=0;
				while(rs.next()) {
					if(i==0) {
					String name= rs.getString("name");
					String text= rs.getString("bio");
					label.setText(name);
					textArea_1.setText(text);
					//System.out.println("Hello");
					}
					if(i==1) {
						String name= rs.getString("name");
						String text= rs.getString("bio");
						lblNewLabel.setText(name);
						textArea.setText(text);
						//System.out.println("Hello");
						}
						
					if(i==2) {
						String name= rs.getString("name");
						String text= rs.getString("bio");
						label_1.setText(name);
						textArea_2.setText(text);
						//System.out.println("Hello");
						}
						
					i++;
					
				}
				con.close();
				}
				
				catch(Exception b) {
					b.getMessage();
					
				}
			}
		});
		panel.add(btnMathematics);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home f=new Home(name);
				f.setVisible(true);
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
		btnBack.setBounds(0, 424, 252, 48);
		panel.add(btnBack);
		
		
		
	}
	
	

}
