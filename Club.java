package logins;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;

public class Club extends JFrame {
	static String name; 

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Club frame = new Club(name);
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
	public Club(String name) {
		this.name=name;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 888, 527);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		//setUndecorated(true);
		
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(139, 0, 0));
		panel.setBounds(0, 0, 200, 494);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CLUBS AND ACTIVITIES");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 30));
		lblNewLabel.setBounds(338, 10, 352, 78);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBackground(new Color(240, 240, 240));
		lblNewLabel_1.setIcon(new ImageIcon(Club.class.getResource("/logins/images/7edit.PNG")));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(245, 157, 570, 222);
		contentPane.add(lblNewLabel_1);
		
		
		JButton btnNewButton = new JButton("CLUBS");
		
		 
		//labels for club
		
		JLabel lblNewLabel_2 = new JLabel("CLUBS");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("SansSerif", Font.BOLD, 30));
		lblNewLabel_2.setBounds(338, 10, 352, 78);
		
		
		
		JTextArea txtrActiveStudentClubs = new JTextArea();
		txtrActiveStudentClubs.setFont(new Font("SansSerif", Font.BOLD, 17));
		txtrActiveStudentClubs.setText("ACTIVE STUDENT CLUBS\r\n\r\nClub Soccer\r\nCybersecurity Club\r\nDance Team\r\nDigital Forensics Association\r\nEsports Club\r\nInternational Business Club\r\nMen's Rugby Club\r\nWomen's Rugby Club\r\nWomen in Technology\r\nVolleyball Club\r\nChamp\r\nCultural Community Alliance (CCA)");
		txtrActiveStudentClubs.setForeground(new Color(0, 0, 0));
		txtrActiveStudentClubs.setEditable(false);
		txtrActiveStudentClubs.setBackground(SystemColor.control);
		txtrActiveStudentClubs.setBounds(224, 96, 367, 355);
		
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(Club.class.getResource("/logins/images/1edit.PNG")));
		lblNewLabel_4.setBounds(611, 104, 234, 327);
		
		
		
		//labels for activities
		JLabel lblNewLabel_3 = new JLabel("ACTIVITIES");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("SansSerif", Font.BOLD, 30));
		lblNewLabel_3.setBounds(338, 10, 352, 78);
		
		JTextArea txtrActiveStudentClubs_1 = new JTextArea();
		txtrActiveStudentClubs_1.setFont(new Font("SansSerif", Font.BOLD, 17));
		txtrActiveStudentClubs_1.setText("  PURPOSE :\r\nStudents experience leadership opportunities\r\nthat help them grow into well-rounded adults.\r\nActivities expand interactions among students,\r\nwho are likely to interact with others who are\r\ndifferent from them.Thus, opportunities to\r\nexperience diversity are enhanced.\r\n ACTIVITIES :\r\nCommon activities include honour societies,\r\nservice clubs, arts organizations\r\n(band, choral, theatre), academic \r\n(forensics, debate, academic competition),\r\nand literary publications (newspaper, yearbook, \r\nliterary magazine). \r\n");
		txtrActiveStudentClubs_1.setForeground(new Color(0, 0, 0));
		txtrActiveStudentClubs_1.setEditable(false);
		txtrActiveStudentClubs_1.setBackground(SystemColor.control);
		txtrActiveStudentClubs_1.setBounds(218, 96, 383, 355);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(Club.class.getResource("/logins/images/8editt.PNG")));
		lblNewLabel_5.setBounds(611, 104, 234, 327);

		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnNewButton ) {
					remove(lblNewLabel);
				    remove(lblNewLabel_1);
				    remove(lblNewLabel_3);
				    remove(lblNewLabel_5);
				    remove(txtrActiveStudentClubs_1);
	                 contentPane.add(lblNewLabel_2);
					contentPane.add(lblNewLabel_4);
					contentPane.add(txtrActiveStudentClubs);
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
		btnNewButton.setBounds(0, 0, 200, 40);
		panel.add(btnNewButton);
		
		JButton btnActivities = new JButton("ACTIVITIES");
		btnActivities.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				remove(lblNewLabel);
				remove(lblNewLabel_1);
				remove(lblNewLabel_2);
				remove(lblNewLabel_4);
				remove(txtrActiveStudentClubs);
				contentPane.add(lblNewLabel_3);
				contentPane.add(lblNewLabel_5);
				contentPane.add(txtrActiveStudentClubs_1);
				repaint();
			}
		});
		btnActivities.setForeground(new Color(255, 255, 255));
		btnActivities.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnActivities.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				btnActivities.setBackground(new Color(139,0,0));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnActivities.setBackground(new Color(178,34,34));
			}
		});
		btnActivities.setBackground(new Color(139, 0, 0));
		btnActivities.setBounds(0, 39, 200, 40);
		panel.add(btnActivities);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setForeground(new Color(255, 255, 255));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home f=new Home(name);
				f.setVisible(true);
				dispose(); 
			}
		});
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
		btnBack.setBounds(0, 454, 200, 40);
		panel.add(btnBack);
		
		
	}
}
