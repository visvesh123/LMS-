package logins;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;

public class Amenities extends JFrame {
static String name;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Amenities frame = new Amenities(name);
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
	public Amenities(String name) {
		this.name=name;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1087, 482);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.control);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		//setUndecorated(true);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(139,0,0));
		panel.setBounds(0,0,202,482);
		contentPane.add(panel);
		panel.setLayout(null);
		
		
	JLabel lblNewLabel_1= new JLabel("AMENITIES");
	lblNewLabel_1.setIcon(null);
	lblNewLabel_1.setBackground(new Color(255,255,255));
		lblNewLabel_1.setForeground(new Color(0,0,0));
		lblNewLabel_1.setFont(new Font("SansSerif", Font.BOLD, 30));
		lblNewLabel_1.setBounds(333, 13, 618, 204);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("GYM");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(460, 13, 167, 49);
		
		
		 JTextArea txtrWellEquippedGymnasium = new JTextArea();
			txtrWellEquippedGymnasium.setForeground(new Color(0, 0, 0));
			txtrWellEquippedGymnasium.setBackground(SystemColor.control);
			txtrWellEquippedGymnasium.setFont(new Font("SansSerif", Font.BOLD, 20));
			txtrWellEquippedGymnasium.setText("Well equipped gymnasium is available within campus for students \r\nas well as faculty. Physical activity is  good for your mental health. \r\nExperts believe that exercise releases chemicals in your brain that\r\n make you feel good. Regular exercise can also boost your \r\nself-esteem and help you concentrate, sleep, look and feel better.\r\n");
			txtrWellEquippedGymnasium.setBounds(202, 105, 648, 258);
		
		
			JLabel lblNewLabel_2 = new JLabel("New label");
			 lblNewLabel_2.setIcon(new ImageIcon());
			lblNewLabel_2.setBounds(850, 105, 183, 239);
			
			 JLabel lblNewLabel_3 = new JLabel("AQUATIC CENTER");
				lblNewLabel_3.setForeground(new Color(0,0, 0));
				lblNewLabel_3.setFont(new Font("SansSerif", Font.BOLD, 30));
				lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_3.setBounds(460, 13, 293, 38);
			
				 JLabel lblNewLabel_4 = new JLabel("New label");
					lblNewLabel_4.setIcon(new ImageIcon(Amenities.class.getResource("/logins/images/am_1.jpg")));
					lblNewLabel_4.setBounds(828, 105, 229, 257);
			

					JTextArea txtrTheAveryAquatic = new JTextArea();
					txtrTheAveryAquatic.setBackground(SystemColor.control);
					txtrTheAveryAquatic.setForeground(new Color(0, 0, 0));
					txtrTheAveryAquatic.setFont(new Font("SansSerif", Font.BOLD, 20));
					txtrTheAveryAquatic.setText("The Avery Aquatic Center is the home of all Stanford aquatic\r\n teams and is widely considered to be the finest outdoor \r\nswimming and diving facility in the United States and perhaps\r\n the world. The facility is home to the Cardinal's men's and\r\n women's water polo, men's and women's swimming and diving\r\n and synchronized swimming programs.\r\n\r\n");
					txtrTheAveryAquatic.setBounds(202, 105, 597, 257);
					
					
					 JLabel lblNewLabel_5 = new JLabel("HOSTEL");
						lblNewLabel_5.setForeground(new Color(0, 0, 0));
						lblNewLabel_5.setFont(new Font("SansSerif", Font.BOLD, 30));
						lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
						lblNewLabel_5.setBounds(460, 13, 165, 39);
			
						JTextArea txtrStartingCollegeIs = new JTextArea();
						txtrStartingCollegeIs.setBackground(SystemColor.control);
						txtrStartingCollegeIs.setForeground(new Color(0, 0, 0));
						txtrStartingCollegeIs.setFont(new Font("SansSerif", Font.BOLD, 22));
						txtrStartingCollegeIs.setText("Starting college is like entering in a new phase of life.\r\n New city, new friends, new experiences, new\r\n responsibilities these are just a glimpses of what awaits\r\n you. As Stanford provieds the best facilities which includes\r\n free WI-FI in hostels ,cleaning,washing and many more\r\n in hostels.");
						txtrStartingCollegeIs.setBounds(202, 105, 580, 275);
						
						
						JLabel lblNewLabel_6 = new JLabel("New label");
						lblNewLabel_6.setIcon(new ImageIcon(Amenities.class.getResource("/logins/images/am_3.jpg")));
						lblNewLabel_6.setBounds(782, 92, 251, 275);
						
						
						
						JButton btnNewButton_3 = new JButton("COMPLAINTS");
						btnNewButton_3.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								if(e.getSource()==btnNewButton_3){
									Compaint c = new Compaint(name);
									c.setVisible(true);
									dispose();
								}
							}
						});
						btnNewButton_3.setBackground(new Color(139,0,0));
						btnNewButton_3.setForeground(new Color(255, 255, 255));
						btnNewButton_3.setFont(new Font("SansSerif", Font.BOLD, 20));
						btnNewButton_3.setBounds(335, 402, 178, 31);
						
					
					
						
						JLabel lblNewLabel_7= new JLabel("THEATRE");
						lblNewLabel_7.setForeground(new Color(0, 0, 0));
						lblNewLabel_7.setFont(new Font("SansSerif", Font.BOLD, 30));
						lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
						lblNewLabel_7.setBounds(460, 13, 214, 47);
						JTextArea txtrInStanford = new JTextArea();
						txtrInStanford.setBackground(SystemColor.control);
						txtrInStanford.setForeground(new Color(0, 0, 0));
						txtrInStanford.setFont(new Font("SansSerif", Font.BOLD, 20));
						txtrInStanford.setText("In Stanford , at theatre ,plays happen on every saturday\r\n and sunday. It is a place where all dramatic arts, an art \r\nconcerned almost exclusively with live performances in \r\nwhich the action is precisely planned to create a coherent \r\nand significant sense of drama.\r\n\r\n");
						txtrInStanford.setBounds(202,105, 570, 259);
					JLabel lblNewLabel_8 = new JLabel("New label");
						lblNewLabel_8.setIcon(new ImageIcon(Amenities.class.getResource("/logins/images/am_5.jpg")));
						lblNewLabel_8.setBounds(805, 98, 252, 248);
						
						
						JLabel lblNewLabel_9 = new JLabel("STADIUM");
						lblNewLabel_9.setForeground(new Color(0, 0, 0));
						lblNewLabel_9.setFont(new Font("SansSerif", Font.BOLD, 30));
						lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
						lblNewLabel_9.setBounds(460, 13, 193, 34);
						JTextArea txtrStanfordStadiumIs = new JTextArea();
						txtrStanfordStadiumIs.setBackground(SystemColor.control);
						txtrStanfordStadiumIs.setForeground(new Color(0,0, 0));
						txtrStanfordStadiumIs.setFont(new Font("SansSerif", Font.BOLD, 20));
						txtrStanfordStadiumIs.setText("Stanford Stadium is an outdoor athletic stadium  on the\r\n campus of Stanford University. It is the home of the Stanford\r\n Cardinal college football team as well as the site of the\r\n university's commencement exercises.The facility occupies \r\n18.4 acres (74,000 m2), with a footprint of 601,128 sq ft,\r\n a playing surface 29 feet (8.8 m) below ground level,\r\n and is now a rectangle shape stadium. \r\nToday, it seats 50,424.");
						txtrStanfordStadiumIs.setBounds(202,105, 580, 295);
						JLabel lblNewLabel_10 = new JLabel("New label");
						lblNewLabel_10.setIcon(new ImageIcon(Amenities.class.getResource("/logins/images/am_2.jpg")));
						lblNewLabel_10.setBounds(808, 84, 249, 295);
						
						
						
						
						
						
						
						
						
		
		
		
		JButton btnNewButton_7 = new JButton("BACK");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home h=new Home(name);
				h.setVisible(true);
				dispose();
			}
		});
		 btnNewButton_7.setForeground(new Color(255,255,255));
		 btnNewButton_7.setBackground(new Color(139,0,0));
		 btnNewButton_7.setFont(new Font("SansSerif", Font.BOLD, 13));
		 btnNewButton_7.setBounds(0,397,202,45);
		panel.add(btnNewButton_7);
		
		
		
		JButton btnNewButton = new JButton("GYM");
			btnNewButton.setFont(new Font("SansSerif", Font.BOLD, 13));
			 btnNewButton.setBounds(0,0,202,45);
			panel.add(btnNewButton);
			
		 
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//if(e.getSource()== btnNewButton){
					remove( lblNewLabel_1);
					remove(lblNewLabel_1);
					remove(lblNewLabel_7);
					remove(txtrInStanford);
					remove(lblNewLabel_8);
					//remove( lblNewLabel);
					//remove(txtrWellEquippedGymnasium);
					//remove(lblNewLabel_2);
					remove(lblNewLabel_3);
					remove(lblNewLabel_4);
					remove(txtrTheAveryAquatic);
					remove(lblNewLabel_5);
					remove(txtrStartingCollegeIs);
					remove(lblNewLabel_6);
					remove(btnNewButton_3);
					//remove(btnNewButton_4);
					remove(lblNewLabel_7);
					remove(txtrInStanford);
					remove(lblNewLabel_8);
					remove(lblNewLabel_9);
					remove(txtrStanfordStadiumIs);
					remove(lblNewLabel_10);
					
					contentPane.add( lblNewLabel);
					contentPane.add(txtrWellEquippedGymnasium);
					contentPane.add(lblNewLabel_2);
					repaint();
				//}
			}
		});
		
		 btnNewButton.setForeground(new Color(255,255,255));
		 btnNewButton.setBackground(new Color(139,0,0));
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
		 
		 btnNewButton.setFont(new Font("SansSerif", Font.BOLD, 13));
		 btnNewButton.setBounds(0,0,202,45);
		panel.add(btnNewButton);
		 
		 
		JButton btnNewButton_1 = new JButton("AQUATIC CENTRE");
	
		

		
		
		
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				remove(lblNewLabel);
				//( lblNewLabel);
				
				remove( lblNewLabel_1);
				//remove(lblNewLabel_1);
				remove(lblNewLabel_7);
				remove(txtrInStanford);
				remove(lblNewLabel_8);
				remove( lblNewLabel);
				remove(txtrWellEquippedGymnasium);
				remove(lblNewLabel_2);
				//remove(lblNewLabel_3);
				//remove(lblNewLabel_4);
				//remove(txtrTheAveryAquatic);
				remove(lblNewLabel_5);
				remove(txtrStartingCollegeIs);
				remove(lblNewLabel_6);
				remove(btnNewButton_3);
				//remove(btnNewButton_4);
				remove(lblNewLabel_7);
				remove(txtrInStanford);
				remove(lblNewLabel_8);
				remove(lblNewLabel_9);
				remove(txtrStanfordStadiumIs);
				remove(lblNewLabel_10);
				
				
				contentPane.add(lblNewLabel_3);
				contentPane.add(lblNewLabel_4);
				contentPane.add(txtrTheAveryAquatic);
				repaint();
				
			}
		});
		 btnNewButton_1.setForeground(new Color(255,255,255));
		 btnNewButton_1.setFont(new Font("SansSerif", Font.BOLD, 13));
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
		 
		 btnNewButton_1.setBackground(new Color(139,0,0));
		 
		
		btnNewButton_1.setBounds(0,44,202,45);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("HOSTEL");
		
	
		
		
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()== btnNewButton_2){
					remove( lblNewLabel_1);
					//remove(lblNewLabel);
					remove(lblNewLabel_7);
					remove(txtrInStanford);
					remove(lblNewLabel_8);
					remove( lblNewLabel);
					remove(txtrWellEquippedGymnasium);
					remove(lblNewLabel_2);
					remove(lblNewLabel_3);
					remove(lblNewLabel_4);
					remove(txtrTheAveryAquatic);
					//remove(lblNewLabel_5);
					//remove(txtrStartingCollegeIs);
					//remove(lblNewLabel_6);
					//remove(btnNewButton_3);
					//remove(btnNewButton_4);
					remove(lblNewLabel_7);
					remove(txtrInStanford);
					remove(lblNewLabel_8);
					remove(lblNewLabel_9);
					remove(txtrStanfordStadiumIs);
					remove(lblNewLabel_10);
					
					
					contentPane.add(lblNewLabel_5);
					contentPane.add(txtrStartingCollegeIs);
					contentPane.add(lblNewLabel_6);
					contentPane.add(btnNewButton_3);
					//contentPane.add(btnNewButton_4);
					repaint();
				}
			}
		});
		btnNewButton_2.setForeground(new Color(255,255,255));
		 btnNewButton_2.setBackground(new Color(139,0,0));
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
		 
		btnNewButton_2.setFont(new Font("SansSerif", Font.BOLD, 13));
		btnNewButton_2.setBounds(0,89,202,45);
		panel.add(btnNewButton_2);
		
		
		JButton btnNewButton_5 = new JButton("THEATRE");
	
		
		
		btnNewButton_5.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()== btnNewButton_5){
				remove( lblNewLabel_1);
				//remove(lblNewLabel_1);
				remove(lblNewLabel_7);
				remove(txtrInStanford);
				remove(lblNewLabel_8);
				remove( lblNewLabel);
				remove(txtrWellEquippedGymnasium);
				remove(lblNewLabel_2);
				remove(lblNewLabel_3);
				remove(lblNewLabel_4);
				remove(txtrTheAveryAquatic);
				remove(lblNewLabel_5);
				remove(txtrStartingCollegeIs);
				remove(lblNewLabel_6);
				remove(btnNewButton_3);
			//	remove(btnNewButton_4);
				//remove(lblNewLabel_7);
				//remove(txtrInStanford);
				//remove(lblNewLabel_8);
				remove(lblNewLabel_9);
				remove(txtrStanfordStadiumIs);
				remove(lblNewLabel_10);
				
			
				
				contentPane.add(lblNewLabel_7);
				contentPane.add(txtrInStanford);
				contentPane.add(lblNewLabel_8);
				repaint();
				
			}
		}
	});
	
		btnNewButton_5.setForeground(new Color(255,255,255));
		 btnNewButton_5.setBackground(new Color(139,0,0));
		 btnNewButton_5.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseExited(MouseEvent e) {
					btnNewButton_5.setBackground(new Color(139,0,0));
				}
				@Override
				public void mouseEntered(MouseEvent e) {
					btnNewButton_5.setBackground(new Color(178,34,34));
				}
			});
		btnNewButton_5.setFont(new Font("SansSerif", Font.BOLD, 13));
		btnNewButton_5.setBounds(0, 133, 202, 45);
		panel.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("STADIUM");
	
		
		
		btnNewButton_6.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()== btnNewButton_6){
			//	remove(lblNewLabel_5);
				remove(lblNewLabel_1);
				remove(lblNewLabel_7);
				remove(txtrInStanford);
				remove(lblNewLabel_8);
				remove( lblNewLabel);
				remove(txtrWellEquippedGymnasium);
				remove(lblNewLabel_2);
				remove(lblNewLabel_3);
				remove(lblNewLabel_4);
				remove(txtrTheAveryAquatic);
				remove(lblNewLabel_5);
				remove(txtrStartingCollegeIs);
				remove(lblNewLabel_6);
				remove(btnNewButton_3);
				//remove(btnNewButton_4);
				remove(lblNewLabel_7);
				remove(txtrInStanford);
				remove(lblNewLabel_8);
				
				contentPane.add(lblNewLabel_9);
				contentPane.add(txtrStanfordStadiumIs);
				contentPane.add(lblNewLabel_10);
				repaint();
			}
		}
	});
	
		btnNewButton_6.setForeground(new Color(255,255,255));
		 btnNewButton_6.setBackground(new Color(139,0,0));
		 btnNewButton_6.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseExited(MouseEvent e) {
					btnNewButton_6.setBackground(new Color(139,0,0));
				}
				@Override
				public void mouseEntered(MouseEvent e) {
					btnNewButton_6.setBackground(new Color(178,34,34));
				}
			});
		 
		btnNewButton_6.setFont(new Font("SansSerif", Font.BOLD, 13));
		btnNewButton_6.setBounds(0, 177, 202, 45);
		panel.add(btnNewButton_6);
		
		
		
	}

}
