package logins;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Panel;
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
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

public class Sports extends JFrame {
static 	String name;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sports frame = new Sports(name);
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
	public Sports(String name) {
		this.name=name;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 855, 493);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		//setUndecorated(true);
		
		Panel panel = new Panel();
		panel.setBackground(new Color(139, 0, 0));
		panel.setBounds(0, 0, 202, 482);
		contentPane.add(panel);
		panel.setLayout(null);
		
	
		JLabel lblNewLabel = new JLabel("SPORTS");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 30));
		lblNewLabel.setBounds(332, 0, 352, 78);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_17 = new JLabel("");
		lblNewLabel_17.setIcon(new ImageIcon(Sports.class.getResource("/logins/images/home.jpg")));
		lblNewLabel_17.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_17.setBounds(197, 56, 623, 390);
		contentPane.add(lblNewLabel_17);
		
		//for basketball
		
		JLabel lblNewLabel_2 = new JLabel("BASKETBALL");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("SansSerif", Font.BOLD, 30));
		lblNewLabel_2.setBounds(338, 10, 352, 78);
		
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setText("MEN'S TEAM:\r\nThe Stanford Cardinal men's basketball team\r\nrepresents Stanford University in Stanford,\r\nCalifornia, United States. The school's team\r\ncurrently competes in the Pac-12 Conference.\r\nThey are coached by Jerod Haase and play \r\ntheir home games at Maples Pavilion.\r\n\r\nWOMEN'S TEAM:\r\nThe Stanford Cardinal women's basketball\r\nteam represents Stanford University, located\r\nin Stanford, California. The school's team\r\ncurrently competes in the Pac-12\r\nConference and are coached by \r\nTara VanDerveer, in her 34th season with\r\nthe Cardinal.");
		textArea.setFont(new Font("SansSerif", Font.BOLD, 17));
		textArea.setBackground(UIManager.getColor("Button.background"));
		textArea.setBounds(220, 79, 368, 403);
		
		JLabel lblNewLabel_1 = new JLabel("");
		//lblNewLabel_1.setIcon(new ImageIcon("C:\\\\Users\\\\91889\\\\Pictures\\\\sports\\\\homes.jpg"));
		lblNewLabel_1.setIcon(new ImageIcon(Sports.class.getResource("/logins/images/basketball.jpg")));
		lblNewLabel_1.setBounds(598, 130, 234, 308);
		
		//for gymnasticts
		
		JLabel lblNewLabel_3 = new JLabel("GYMNASTICS");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("SansSerif", Font.BOLD, 30));
		lblNewLabel_3.setBounds(338, 10, 352, 78);
		
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setEditable(false);
		textArea_1.setText(" RECORDS:\r\nQuick Facts\r\nYear-By-Year\r\nConference Records\r\nRegional Championships History\r\nNCAA Championships History\r\nAll-Time High Scores\r\nAll-Americans\r\nAAI Award\r\nAll-Pac-10/12 Selections\r\nConference All-Academic Honors\r\nOlympians, World Team, National \r\nTeam Members\r\n\r\nLetterwinners\r\nNACGC/Women's Scholastic All-Americans\r\n");
		textArea_1.setFont(new Font("SansSerif", Font.BOLD, 17));
		textArea_1.setBackground(UIManager.getColor("Button.background"));
		textArea_1.setBounds(220, 79, 368, 403);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(Sports.class.getResource("/logins/images/gym.jpg")));
		lblNewLabel_4.setBounds(598, 130, 234, 308);
		
		
		//for swimming
		JLabel lblNewLabel_5 = new JLabel("SWIMMING");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("SansSerif", Font.BOLD, 30));
		lblNewLabel_5.setBounds(338, 10, 352, 78);
		
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setEditable(false);
		textArea_2.setText("RECORDS:\r\nTop-15 Performers (PDF)\r\nTeam Records\r\nAvery Aquatic Center \r\nWorld Record Holders\r\n\r\nCOACHES :\r\n       NAME                             TITLE\r\nDan Schemmel -The Goldman Family Director\r\n                            of Men's Swimming\t\r\nNeil Caskey\t  - Assistant Coach\r\nPatrick Jeffrey   -Head Diving Coach\t\r\nBrooke Kniffin\t  -Director of Operations\t\r\nAlec Scott\tVolunteer Assistant Coach\t");
		textArea_2.setFont(new Font("SansSerif", Font.BOLD, 17));
		textArea_2.setBackground(UIManager.getColor("Button.background"));
		textArea_2.setBounds(220, 79, 368, 403);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(Sports.class.getResource("/logins/images/swim.jpg")));
		lblNewLabel_6.setBounds(598, 130, 234, 308);
		
		
		
		//vollyball
		JLabel lblNewLabel_7 = new JLabel("VOLLYBALL");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setFont(new Font("SansSerif", Font.BOLD, 30));
		lblNewLabel_7.setBounds(338, 10, 352, 78);
		
		
		JTextArea textArea_3 = new JTextArea();
		textArea_3.setEditable(false);
		textArea_3.setText(" HONORS\r\nFirst Team All-Americans\r\nNational Players of the Year\r\nNational Awards\r\nConference Awards\r\nStanford Athletic Board Awards\r\nStanford Athletics Hall of Fame\r\nAcademic Awards\r\n\r\n\r\nCOACHES :\r\n  NAME\t          TITLE\r\nJohn Kosty        Head Coach\t\r\nKen Shibuya     Associate Head Coach \r\n                          Recruiting Coordinator\t\r\nDaniel Rasay\t   Assistant Coach\t");
		textArea_3.setFont(new Font("SansSerif", Font.BOLD, 17));
		textArea_3.setBackground(UIManager.getColor("Button.background"));
		textArea_3.setBounds(220, 79, 368, 403);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon(Sports.class.getResource("/logins/images/vollyedit.jpg")));
		lblNewLabel_8.setBounds(598, 130, 234, 308);
		
		
		
		//tennis
		JLabel lblNewLabel_9 = new JLabel("TENNIS");
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setFont(new Font("SansSerif", Font.BOLD, 30));
		lblNewLabel_9.setBounds(338, 10, 352, 78);
		
		
		JTextArea textArea_4 = new JTextArea();
		textArea_4.setText(" RECORDS\r\nSingle-Season Dual Victories\r\nCareer Dual Victories\r\n \r\n HISTORY\r\nYearly History\r\nCoaching History\r\nNCAA History\r\nNCAA Champions\r\nRecords vs. Opponents\r\n\r\nCOACHES:\r\nNAME\t                 TITLE\t\r\nPaul Goldstein\t   Family Director of  Tennis\t\r\nBrandon Coupe   James and Martha Poppy \r\n                            Associate Head Coach\t\r\n");
		textArea_4.setEditable(false);
		textArea_4.setFont(new Font("SansSerif", Font.BOLD, 17));
		textArea_4.setBackground(UIManager.getColor("Button.background"));
		textArea_4.setBounds(220, 79, 368, 403);
		
		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setIcon(new ImageIcon(Sports.class.getResource("/logins/images/tennis.jpg")));
		lblNewLabel_10.setBounds(598, 130, 234, 308);		
		
		//football
		JLabel lblNewLabel_11 = new JLabel("FOOTBALL");
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11.setFont(new Font("SansSerif", Font.BOLD, 30));
		lblNewLabel_11.setBounds(338, 10, 352, 78);
		
		
		JTextArea textArea_5 = new JTextArea();
		textArea_5.setEditable(false);
		textArea_5.setText("\r\n\r\n\r\nThe Stanford Cardinal football program\r\nrepresents Stanford University in college \r\nfootball at the NCAA Division I FBS level\r\nand is a member of the Pac-12\r\nConference's North Division. Stanford \r\nhas a highly successful football tradition.\r\nThe team is currently known as the\r\nCardinal, adopted prior to the \r\n1982 season. Stanford was known as the \r\n\"Indians\" from 1930 to January 1972, and\r\nthe \"Cardinals\" from 1972 through 1981.");
		textArea_5.setFont(new Font("SansSerif", Font.BOLD, 17));
		textArea_5.setBackground(UIManager.getColor("Button.background"));
		textArea_5.setBounds(220, 79, 368, 403);
		
		JLabel lblNewLabel_12 = new JLabel("");
		lblNewLabel_12.setIcon(new ImageIcon(Sports.class.getResource("/logins/images/football.jpg")));
		lblNewLabel_12.setBounds(598, 130, 234, 308);
		
		//golf
		JLabel lblNewLabel_13 = new JLabel("GOLF");
		lblNewLabel_13.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_13.setFont(new Font("SansSerif", Font.BOLD, 30));
		lblNewLabel_13.setBounds(338, 10, 352, 78);
		
		
		JTextArea textArea_6 = new JTextArea();
		textArea_6.setEditable(false);
		textArea_6.setText(" RECORDS\r\n Low Round (Team)\r\n Low Round (Individual)\r\n Low Tournament (Team)\r\n Career Stroke Average\r\n Season Stroke Average\r\n Wins\r\n \r\nHONORS AND AWARDS\r\n National\r\n NCAA\r\n All-America\r\n Academic All-America\r\n Conference\r\n Team");
		textArea_6.setFont(new Font("SansSerif", Font.BOLD, 17));
		textArea_6.setBackground(UIManager.getColor("Button.background"));
		textArea_6.setBounds(220, 79, 368, 403);
		
		JLabel lblNewLabel_14 = new JLabel("");
		lblNewLabel_14.setIcon(new ImageIcon(Sports.class.getResource("/logins/images/golf.jpg")));
		lblNewLabel_14.setBounds(598, 130, 234, 308);
		//soccer
		
		JLabel lblNewLabel_15 = new JLabel("SOCCER");
		lblNewLabel_15.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_15.setFont(new Font("SansSerif", Font.BOLD, 30));
		lblNewLabel_15.setBounds(338, 10, 352, 78);
		
		
		JTextArea textArea_7 = new JTextArea();
		textArea_7.setEditable(false);
		textArea_7.setText("MEN'S :\r\nThe Stanford Cardinal men's soccer team \r\nrepresents Stanford University in all NCAA \r\nDivision I men's college soccer competitions.\r\nThe Cardinal play in the Pac-12 Conference.\r\nTheir first season as a varsity program was\r\nin 1973.They have made five appearances\r\nin the College Cup, including winning the \r\n2015, 2016, and 2017 national championships.\r\n\r\nWOMEN'S :\r\nThe Stanford Cardinal women's soccer team\r\nrepresent Stanford University in the Pac-12\r\nConference of NCAA Division I soccer.\r\nPaul Ratcliffe has coached the Cardinal \r\nsince 2003, winning Pac-12 Coach of the\r\nYear eight times.\r\n");
		textArea_7.setFont(new Font("SansSerif", Font.BOLD, 17));
		textArea_7.setBackground(UIManager.getColor("Button.background"));
		textArea_7.setBounds(220, 79, 368, 403);
		
		JLabel lblNewLabel_16 = new JLabel("");
		lblNewLabel_16.setIcon(new ImageIcon(Sports.class.getResource("/logins/images/soccer edit.jpg")));
		lblNewLabel_16.setBounds(598, 130, 234, 308);
		
		
		
		
		//buttons start
		
		//button1
		JButton btnNewButton = new JButton("Basketball");
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
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnNewButton ) {
				    remove(lblNewLabel);
				    remove(lblNewLabel_3);
				    remove(lblNewLabel_4);
				    remove(lblNewLabel_5);
				    remove(lblNewLabel_6);
				    remove(lblNewLabel_7);
				    remove(lblNewLabel_8);
				    remove(lblNewLabel_9);
				    remove(lblNewLabel_10);
				    remove(lblNewLabel_11);
				    remove(lblNewLabel_12);
				    remove(lblNewLabel_13);
				    remove(lblNewLabel_14);
				    remove(lblNewLabel_15);
				    remove(lblNewLabel_16);
				    remove(lblNewLabel_17);
				   
				    remove(textArea_1);
				    remove(textArea_2);
				    remove(textArea_3);
				    remove(textArea_4);
				    remove(textArea_5);
				    remove(textArea_6);
				    remove(textArea_7);
				    contentPane.add(lblNewLabel_2);
					contentPane.add(lblNewLabel_1);
					contentPane.add(textArea);
					repaint();
					
					}
			}
		});
		btnNewButton.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(139, 0, 0));
		btnNewButton.setBounds(0, 0, 202, 45);
		panel.add(btnNewButton);
		
		//button2
		JButton btnNewButton_1 = new JButton("Gymnastics");
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
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 remove(lblNewLabel);
				    remove(lblNewLabel_1);
				    remove(lblNewLabel_2);
				    remove(lblNewLabel_5);
				    remove(lblNewLabel_6);
				    remove(lblNewLabel_7);
				    remove(lblNewLabel_8);
				    remove(lblNewLabel_9);
				    remove(lblNewLabel_10);
				    remove(lblNewLabel_11);
				    remove(lblNewLabel_12);
				    remove(lblNewLabel_13);
				    remove(lblNewLabel_14);
				    remove(lblNewLabel_15);
				    remove(lblNewLabel_16);
				    remove(lblNewLabel_17);
				
				    remove(textArea);
				    remove(textArea_2);
				    remove(textArea_3);
				    remove(textArea_4);
				    remove(textArea_5);
				    remove(textArea_6);
				    remove(textArea_7);
				    contentPane.add(lblNewLabel_4);
					contentPane.add(lblNewLabel_3);
					contentPane.add(textArea_1);
					repaint();
					
				
			}
		});
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnNewButton_1.setBackground(new Color(139, 0, 0));
		btnNewButton_1.setBounds(0, 44, 202, 45);
		panel.add(btnNewButton_1);
	
		//button 3
		JButton btnNewButton_2 = new JButton("Swimming");
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
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 remove(lblNewLabel);
				    remove(lblNewLabel_1);
				    remove(lblNewLabel_2);
				    remove(lblNewLabel_3);
				    remove(lblNewLabel_4);
				    remove(lblNewLabel_7);
				    remove(lblNewLabel_8);
				    remove(lblNewLabel_9);
				    remove(lblNewLabel_10);
				    remove(lblNewLabel_11);
				    remove(lblNewLabel_12);
				    remove(lblNewLabel_13);
				    remove(lblNewLabel_14);
				    remove(lblNewLabel_15);
				    remove(lblNewLabel_16);
				    remove(lblNewLabel_17);
				
				    remove(textArea_1);
				    remove(textArea);
				    remove(textArea_3);
				    remove(textArea_4);
				    remove(textArea_5);
				    remove(textArea_6);
				    remove(textArea_7);
				    contentPane.add(lblNewLabel_5);
					contentPane.add(lblNewLabel_6);
					contentPane.add(textArea_2);
					repaint();
					
			}
		});
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnNewButton_2.setBackground(new Color(139, 0, 0));
		btnNewButton_2.setBounds(0, 89, 202, 45);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Volleyball");
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				
				btnNewButton_3.setBackground(new Color(139,0,0));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton_3.setBackground(new Color(178,34,34));
			}
		});
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				remove(lblNewLabel);
			    remove(lblNewLabel_1);
			    remove(lblNewLabel_2);
			    remove(lblNewLabel_3);
			    remove(lblNewLabel_4);
			    remove(lblNewLabel_5);
			    remove(lblNewLabel_6);
			    remove(lblNewLabel_9);
			    remove(lblNewLabel_10);
			    remove(lblNewLabel_11);
			    remove(lblNewLabel_12);
			    remove(lblNewLabel_13);
			    remove(lblNewLabel_14);
			    remove(lblNewLabel_15);
			    remove(lblNewLabel_16);
			    remove(lblNewLabel_17);
			
			    remove(textArea_1);
			    remove(textArea);
			    remove(textArea_2);
			    remove(textArea_4);
			    remove(textArea_5);
			    remove(textArea_6);
			    remove(textArea_7);
			    contentPane.add(lblNewLabel_7);
				contentPane.add(lblNewLabel_8);
				contentPane.add(textArea_3);
				repaint();
				
			}
		});
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 15));
		btnNewButton_3.setBackground(new Color(139, 0, 0));
		btnNewButton_3.setBounds(0, 134, 202, 45);
		panel.add(btnNewButton_3);
		
		JButton button = new JButton("Tennis");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
			button.setBackground(new Color(139,0,0));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				button.setBackground(new Color(178,34,34));
			}
		});
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				remove(lblNewLabel);
			    remove(lblNewLabel_1);
			    remove(lblNewLabel_2);
			    remove(lblNewLabel_3);
			    remove(lblNewLabel_4);
			    remove(lblNewLabel_5);
			    remove(lblNewLabel_6);
			    remove(lblNewLabel_7);
			    remove(lblNewLabel_8);
			    remove(lblNewLabel_11);
			    remove(lblNewLabel_12);
			    remove(lblNewLabel_13);
			    remove(lblNewLabel_14);
			    remove(lblNewLabel_15);
			    remove(lblNewLabel_16);
			    remove(lblNewLabel_17);
			
			    remove(textArea_1);
			    remove(textArea);
			    remove(textArea_2);
			    remove(textArea_3);
			    remove(textArea_5);
			    remove(textArea_6);
			    remove(textArea_7);
			    contentPane.add(lblNewLabel_9);
				contentPane.add(lblNewLabel_10);
				contentPane.add(textArea_4);
				repaint();
			}
		});
		button.setForeground(Color.WHITE);
		button.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 15));
		button.setBackground(new Color(139, 0, 0));
		button.setBounds(0, 180, 202, 45);
		panel.add(button);
		
		JButton button_1 = new JButton("Football");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				button_1.setBackground(new Color(139,0,0));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				button_1.setBackground(new Color(178,34,34));
				
			}
		});
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				remove(lblNewLabel);
			    remove(lblNewLabel_1);
			    remove(lblNewLabel_2);
			    remove(lblNewLabel_3);
			    remove(lblNewLabel_4);
			    remove(lblNewLabel_5);
			    remove(lblNewLabel_6);
			    remove(lblNewLabel_7);
			    remove(lblNewLabel_8);
			    remove(lblNewLabel_9);
			    remove(lblNewLabel_10);
			    remove(lblNewLabel_13);
			    remove(lblNewLabel_14);
			    remove(lblNewLabel_15);
			    remove(lblNewLabel_16);
			    remove(lblNewLabel_17);
			    
			    remove(textArea_1);
			    remove(textArea);
			    remove(textArea_2);
			    remove(textArea_3);
			    remove(textArea_4);
			    remove(textArea_6);
			    remove(textArea_7);
			    contentPane.add(lblNewLabel_11);
				contentPane.add(lblNewLabel_12);
				contentPane.add(textArea_5);
				repaint();
			}
		});
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 15));
		button_1.setBackground(new Color(139, 0, 0));
		button_1.setBounds(0, 224, 202, 45);
		panel.add(button_1);
		
		JButton button_2 = new JButton("Golf");
		button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				
				button_2.setBackground(new Color(139,0,0));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				button_2.setBackground(new Color(178,34,34));
			}
		});
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				remove(lblNewLabel);
			    remove(lblNewLabel_1);
			    remove(lblNewLabel_2);
			    remove(lblNewLabel_3);
			    remove(lblNewLabel_4);
			    remove(lblNewLabel_5);
			    remove(lblNewLabel_6);
			    remove(lblNewLabel_7);
			    remove(lblNewLabel_8);
			    remove(lblNewLabel_9);
			    remove(lblNewLabel_10);
			    remove(lblNewLabel_11);
			    remove(lblNewLabel_12);
			    remove(lblNewLabel_15);
			    remove(lblNewLabel_16);
			    remove(lblNewLabel_17);
			    
			    remove(textArea_1);
			    remove(textArea);
			    remove(textArea_2);
			    remove(textArea_3);
			    remove(textArea_4);
			    remove(textArea_5);
			    remove(textArea_7);
			    contentPane.add(lblNewLabel_13);
				contentPane.add(lblNewLabel_14);
				contentPane.add(textArea_6);
				repaint();
			}
		});
		button_2.setForeground(Color.WHITE);
		button_2.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 15));
		button_2.setBackground(new Color(139, 0, 0));
		button_2.setBounds(0, 269, 202, 45);
		panel.add(button_2);
		
		JButton button_3 = new JButton("Soccer");
		button_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				button_3.setBackground(new Color(139,0,0));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				button_3.setBackground(new Color(178,34,34));
			}
		});
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				remove(lblNewLabel);
			    remove(lblNewLabel_1);
			    remove(lblNewLabel_2);
			    remove(lblNewLabel_3);
			    remove(lblNewLabel_4);
			    remove(lblNewLabel_5);
			    remove(lblNewLabel_6);
			    remove(lblNewLabel_7);
			    remove(lblNewLabel_8);
			    remove(lblNewLabel_9);
			    remove(lblNewLabel_10);
			    remove(lblNewLabel_11);
			    remove(lblNewLabel_12);
			    remove(lblNewLabel_13);
			    remove(lblNewLabel_14);
			    remove(lblNewLabel_17);
			    
			    remove(textArea_1);
			    remove(textArea);
			    remove(textArea_2);
			    remove(textArea_3);
			    remove(textArea_4);
			    remove(textArea_5);
			    remove(textArea_6);
			    contentPane.add(lblNewLabel_16);
				contentPane.add(lblNewLabel_15);
				contentPane.add(textArea_7);
				repaint();
			}
		});
		button_3.setForeground(Color.WHITE);
		button_3.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 15));
		button_3.setBackground(new Color(139, 0, 0));
		button_3.setBounds(0, 314, 202, 45);
		panel.add(button_3);
		
		JButton button_4 = new JButton("BACK");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home h=new Home(name);
				h.setVisible(true);
				dispose();
				
				
				 //adding to home page the back button
			}
		});
		button_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				button_4.setBackground(new Color(139,0,0));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				button_4.setBackground(new Color(178,34,34));
				
			}
		});
		button_4.setForeground(Color.WHITE);
		button_4.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 15));
		button_4.setBackground(new Color(139, 0, 0));
		button_4.setBounds(0, 414, 202, 45);
		panel.add(button_4);
		
	
		

		
		

	}

}
