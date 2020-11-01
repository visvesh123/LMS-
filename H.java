package logins;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Panel;
import java.awt.SystemColor;
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

public class H extends JFrame {
	static String name;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					H frame = new H(name);
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
	public H(String name) {
		this.name=name;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100,855, 493);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setUndecorated(true);
		
		Panel panel = new Panel();
		panel.setBackground(new Color(139, 0, 0));
		panel.setBounds(0, 0, 202, 493);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("HEALTH");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 30));
		lblNewLabel.setBounds(338, 10, 352, 78);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\91889\\Desktop\\images\\health2editt.PNG"));
		lblNewLabel_1.setBounds(278, 98, 243, 172);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\91889\\Desktop\\images\\health3editt.PNG"));
		lblNewLabel_2.setBounds(536, 98, 252, 172);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\91889\\Desktop\\java project\\java(oops)\\health1editt.PNG"));
		lblNewLabel_3.setBounds(305, 280, 433, 166);
		contentPane.add(lblNewLabel_3);
		
		
		
		
		
		//button1
		JButton btnNewButton = new JButton("About");
		
		JTextArea txtrOurMissionUniversity = new JTextArea();
		txtrOurMissionUniversity.setForeground(new Color(0, 0, 0));
		txtrOurMissionUniversity.setBackground(SystemColor.control);
		txtrOurMissionUniversity.setFont(new Font("SansSerif", Font.BOLD, 16));
		txtrOurMissionUniversity.setEditable(false);
		txtrOurMissionUniversity.setText("University Health Services strives to enhance the physical and psychological\r\n wellbeing of students by providing multifaceted health care services.\r\nAt University Health Services, we take special care of students. Whether \r\nyou have a health emergency, a concern about nutrition, or a bad case of \r\nthe flu, you can expect excellent care dispensed by health professionals\r\n who are friendly, concerned, and accessible.\r\nWe are there when you need us, and that's good to know when you are far \r\naway from home.\r\n\r\n");
		txtrOurMissionUniversity.setBounds(208, 82, 643, 179);
		
		JLabel lblNewLabel_4 = new JLabel("OUR MISSION");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("SansSerif", Font.BOLD, 30));
		lblNewLabel_4.setBounds(408, 28, 218, 33);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\91889\\Pictures\\all pics\\about.PNG"));
		lblNewLabel_5.setBounds(335, 271, 354, 179);
		
		
		
		
		
		JLabel lblNewLabel_6 = new JLabel("PRIMARY CARE CENTRE");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setFont(new Font("SansSerif", Font.BOLD, 28));
		lblNewLabel_6.setBounds(254, 37, 516, 55);
		
		JTextArea txtrThePrimaryCare = new JTextArea();
		txtrThePrimaryCare.setForeground(new Color(0, 0, 0));
		txtrThePrimaryCare.setEditable(false);
		txtrThePrimaryCare.setText("The Primary Care Center provides students access to board-certified physicians,\r\n nurse practitioners, registered nurses, and on-site specialty consultants .\r\n The center provides both inpatient and outpatient services.\r\nBoard-certified doctors, nurse practitioners, and nurses provide \r\nprimary medical care at the Outpatient Unit.\r\n The unit operates on an appointment basis. \r\n\r\nInformation on Fees\r\nAll students who pay the Campus Health Fee are eligible to be seen\r\n in the Health Services Primary Care Center.\r\n This fee is required of all undergraduate resident students and is\r\n automatically charged to all students living on campus.\r\n This fee does not replace the need for Medical Insurance.");
		txtrThePrimaryCare.setFont(new Font("SansSerif", Font.BOLD, 16));
		txtrThePrimaryCare.setBackground(SystemColor.control);
		txtrThePrimaryCare.setBounds(220, 120, 607, 314);
		
		JLabel lblNewLabel_7 = new JLabel("CONTACT AND HOURS");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setFont(new Font("SansSerif", Font.BOLD, 28));
		lblNewLabel_7.setBounds(259, 10, 516, 55);
		
		JTextArea txtrThePrimaryCare_1 = new JTextArea();
		txtrThePrimaryCare_1.setText("INPATIENT\r\nOpen 24/7 for inpatient care and for urgent evaluations.\r\nClosed during academic year vacations and for the summer.\r\nAppointments available\r\nMonday\u2013Friday, 8:00 a.m.\u2013 4:30 p.m.\r\n\r\nOUTPATIENT\r\nOpen 24/7 for urgent evaluations and inpatient care when Inpatient Unit is open \r\n(Please note when Inpatient is closed)\r\nDuring University Breaks\r\n\r\nAPPOINTMENTS AVAILABLE :\r\nMonday\u2013Friday, 8:30 a.m.\u2013 4:30 p.m.\r\nSummer :\r\nMonday\u2013Thursday, 8:30 a.m.\u2013 4:30 p.m.\r\nFriday, 9:00 a.m.\u2013 3:00 p.m.\r\nClosed on :\r\nThanksgiving, Christmas, and Easter breaks when the University is closed.\r\nCONTACT US ON : 617-552-3225");
		txtrThePrimaryCare_1.setFont(new Font("SansSerif", Font.BOLD, 16));
		txtrThePrimaryCare_1.setBackground(SystemColor.control);
		txtrThePrimaryCare_1.setBounds(215, 62, 607, 420);
		
		JLabel lblNewLabel_8 = new JLabel("FORMS");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 28));
		lblNewLabel.setBounds(259, 10, 516, 55);
		
		JTextArea txtrMandatoryHealthForms = new JTextArea();
		txtrMandatoryHealthForms.setText("MANDATORY HEALTH FORMS\r\nVISIT: https://sfs.stanford.edu/student-health/man-health-forms\r\n\r\n\r\nMEDICAL RELEASE FORM\r\nVISIT: https://sfs.stanford.edu/student-health/med-health-forms\r\n\r\n\r\nIMMUNISATION RECORD RELEASE FORM\r\nVISIT:https://sfs.stanford.edu/student-health/imm-health-forms\r\n\r\n\r\nHEALTH SERVICE CAMPUS HEALTH WAVIER FORM\r\nVISIT:https://sfs.stanford.edu/student-health/wav-health-forms");
		txtrMandatoryHealthForms.setEditable(false);
		txtrMandatoryHealthForms.setBackground(SystemColor.control);
		txtrMandatoryHealthForms.setFont(new Font("SansSerif", Font.BOLD, 16));
		txtrMandatoryHealthForms.setBounds(233, 96, 529, 354);
		
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnNewButton ) {
				    remove(lblNewLabel);
				    remove(lblNewLabel_1);
				    remove(lblNewLabel_2);
				    remove(lblNewLabel_3);
				    remove(lblNewLabel_6);
				    remove(lblNewLabel_7);
				    remove(lblNewLabel_8);
				    remove(txtrMandatoryHealthForms);
				    remove(txtrThePrimaryCare_1);
				    remove(txtrThePrimaryCare);
					contentPane.add(lblNewLabel_4);
					contentPane.add(lblNewLabel_5);
					contentPane.add(txtrOurMissionUniversity);
					repaint();
					
					}
				
			}
		});
		
		
		
		
		
		btnNewButton.setFont(new Font("SansSerif", Font.BOLD, 15));
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
		btnNewButton.setBounds(0, 0, 202, 45);
		
		panel.add(btnNewButton);
		
		
	//button2	
		
		
		JButton btnNewButton_1 = new JButton("Primary Care Cente");
		
		
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				    remove(lblNewLabel);
				    remove(lblNewLabel_1);
				    remove(lblNewLabel_2);
				    remove(lblNewLabel_3);
				    remove(lblNewLabel_4);
				    remove(lblNewLabel_5);
				    remove(lblNewLabel_7);
				    remove(lblNewLabel_8);
				    remove(txtrThePrimaryCare_1);
				    remove(txtrMandatoryHealthForms);
				     remove(txtrOurMissionUniversity);
					contentPane.add(lblNewLabel_6);
					contentPane.add(txtrThePrimaryCare);
					repaint();
					
					
				
				
				
				
			}
		});
		
		
		
		
		
		
		
		
		
		
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnNewButton_1.setBackground(new Color(139, 0, 0));
		btnNewButton_1.setBounds(0, 44, 202, 45);
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
		panel.add(btnNewButton_1);
		
	
		
		
		//button3
		
		
		JButton btnNewButton_2 = new JButton("Contact And Hours");
		
		
		
		
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				remove(lblNewLabel);
			    remove(lblNewLabel_1);
			    remove(lblNewLabel_2);
			    remove(lblNewLabel_3);
			    remove(lblNewLabel_4);
			    remove(lblNewLabel_5);
			    remove(lblNewLabel_8);
			    remove(txtrOurMissionUniversity);
			    remove(lblNewLabel_6);
			    remove(txtrThePrimaryCare);
			    remove(txtrMandatoryHealthForms);
			    contentPane.add(lblNewLabel_7);
			    contentPane.add(txtrThePrimaryCare_1);
			    repaint();
				
				
			}
		});
		
		
		
		
		
		
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setFont(new Font("SansSerif", Font.BOLD, 15));
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
		btnNewButton_2.setBounds(0, 89, 202, 45);
		panel.add(btnNewButton_2);
		
		
		//button4
		JButton btnNewButton_3 = new JButton("Forms");
		
		
		
		
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				remove(lblNewLabel);
			    remove(lblNewLabel_1);
			    remove(lblNewLabel_2);
			    remove(lblNewLabel_3);
			    remove(lblNewLabel_4);
			    remove(lblNewLabel_5);
			    remove(txtrOurMissionUniversity);
			    remove(lblNewLabel_6);
			    remove(txtrThePrimaryCare);
			    remove(lblNewLabel_7);
			    remove(txtrThePrimaryCare_1);
			    contentPane.add(lblNewLabel_8);
			    contentPane.add(txtrMandatoryHealthForms);
			    repaint();
				
				
				
				
				
			}
		});
		
		
		
		
		
		
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnNewButton_3.setBackground(new Color(139, 0, 0));
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
		btnNewButton_3.setBounds(0, 134, 202, 45);
		panel.add(btnNewButton_3);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					Home h= new Home(name);
					h.setVisible(true);
					dispose();
			}
		});
		btnBack.setForeground(Color.WHITE);
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
		btnBack.setBounds(0, 448, 202, 45);
		panel.add(btnBack);
		
		
		
		
	}
}
