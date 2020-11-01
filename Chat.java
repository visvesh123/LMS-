package logins;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
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
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Chat extends JFrame {
	static String name;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Chat frame = new Chat(name);
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
	public Chat(String name) {
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
		
		JLabel lblNewLabel = new JLabel("Chat Requests");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 30));
		lblNewLabel.setBounds(338, 10, 352, 78);
		contentPane.add(lblNewLabel);
		
		 
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
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\LENOVO\\Downloads\\1edit.PNG"));
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
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\LENOVO\\Downloads\\8editt.PNG"));
		lblNewLabel_5.setBounds(611, 104, 234, 327);
		
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
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Prafulla ", "Vegitha", "Satya Narayana", "Salome ", "Paromitha", "Om prakash", "Mahipal", "JLB", "Hari Prasad", "Gomathi", "Dibakar", "Deepti", "Deepthi", "Deep Seth", "Chitra", "Bhaskar Tamma", "Bhargav", "Ataullah Khan", "Achal Agarwal", "Abhijit Battacharya", " Sunil Bhooshan", ""}));
		comboBox.setBounds(394, 149, 182, 34);
		contentPane.add(comboBox);
		
		String s= (String) comboBox.getSelectedItem();
		
		JLabel lblNewLabel_1 = new JLabel("Select Faculty");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(227, 149, 130, 34);
		contentPane.add(lblNewLabel_1);
		
		JButton btnSendRequest = new JButton("SEND REQUEST");
		btnSendRequest.setForeground(Color.WHITE);
		btnSendRequest.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnSendRequest.setBackground(new Color(139, 0, 0));
		btnSendRequest.setBounds(672, 437, 200, 40);
		contentPane.add(btnSendRequest);
		
		JLabel lblNewLabel_6 = new JLabel("Click \"SEND REQUEST \" start conversation " );
		lblNewLabel_6.setFont(new Font("SansSerif", Font.BOLD, 14));
		lblNewLabel_6.setBounds(227, 369, 520, 50);
		repaint();
		contentPane.add(lblNewLabel_6);
		
	
	}
}
