package logins;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Admin_1 extends JFrame {
static String name;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin_1 frame = new Admin_1(name);
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
	public Admin_1(String name) {
		this.name=name;
		setLocationByPlatform(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 495);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 774, 456);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(30, 144, 255));
		panel_1.setBounds(0, 0, 785, 148);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Hello, Administrator");
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 20));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(10, 11, 212, 61);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Frame1 f=new Frame1();
				f.setVisible(true);
				dispose();
			}
		});
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\LENOVO\\eclipse-workspace\\GUI\\src\\logins\\images\\logoutef.png"));
		lblNewLabel_3.setBounds(702, 1, 73, 71);
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel_3.setBackground(new Color(30,145,255));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_3.setBackground(new Color(220,220,20));
			}
		});
		panel_1.add(lblNewLabel_3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(28, 178, 116, 116);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Home h=new Home(name);
				h.setVisible(true);
				
			}
		});
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel_1.setBackground(new Color(139,0,0));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_1.setBackground(new Color(178,34,34));
			}
		});
		lblNewLabel_1.setIcon(new ImageIcon(Admin_1.class.getResource("/logins/images/house.png")));
		lblNewLabel_1.setBounds(10, 11, 96, 74);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("HOME");
		lblNewLabel_2.setFont(new Font("SansSerif", Font.PLAIN, 14));
		lblNewLabel_2.setForeground(new Color(100, 149, 237));
		lblNewLabel_2.setBounds(34, 96, 46, 14);
		panel_2.add(lblNewLabel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBounds(265, 178, 116, 116);
		panel.add(panel_3);
		
		JLabel label = new JLabel("New label");
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				admin_student h=new admin_student(name);
				h.setVisible(true);
				dispose();
			}
		});
		label.setIcon(new ImageIcon(Admin_1.class.getResource("/logins/images/student_e.png")));
		label.setBounds(10, 11, 96, 74);
		panel_3.add(label);
		
		JLabel lblStudents = new JLabel("STUDENTS");
		lblStudents.setForeground(new Color(100, 149, 237));
		lblStudents.setFont(new Font("SansSerif", Font.PLAIN, 14));
		lblStudents.setBounds(20, 96, 86, 14);
		panel_3.add(lblStudents);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBounds(497, 178, 116, 116);
		panel.add(panel_4);
		
		JLabel label_2 = new JLabel("New label");
		label_2.setIcon(new ImageIcon(Admin_1.class.getResource("/logins/images/time-management_e.png")));
		label_2.setBounds(10, 11, 96, 74);
		panel_4.add(label_2);
		
		JLabel lblTimetable = new JLabel("TIME-TABLE");
		lblTimetable.setForeground(new Color(100, 149, 237));
		lblTimetable.setFont(new Font("SansSerif", Font.PLAIN, 14));
		lblTimetable.setBounds(20, 96, 86, 14);
		panel_4.add(lblTimetable);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBounds(28, 329, 116, 116);
		panel.add(panel_5);
		
		JLabel label_4 = new JLabel("New label");
		label_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Settings h=new Settings(name);
				h.setVisible(true);
				dispose();
			}
		});
		label_4.setIcon(new ImageIcon(Admin_1.class.getResource("/logins/images/settings_e.png")));
		label_4.setBounds(10, 11, 96, 74);
		panel_5.add(label_4);
		
		JLabel lblSettings = new JLabel("SETTINGS");
		lblSettings.setForeground(new Color(100, 149, 237));
		lblSettings.setFont(new Font("SansSerif", Font.PLAIN, 14));
		lblSettings.setBounds(20, 91, 72, 14);
		panel_5.add(lblSettings);
		
		JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBounds(265, 329, 116, 116);
		panel.add(panel_6);
		
		JLabel label_6 = new JLabel("New label");
		label_6.setIcon(new ImageIcon(Admin_1.class.getResource("/logins/images/checklist_e.png")));
		label_6.setBounds(10, 0, 96, 90);
		panel_6.add(label_6);
		
		JLabel lblClasses = new JLabel("CLASSES");
		lblClasses.setForeground(new Color(100, 149, 237));
		lblClasses.setFont(new Font("SansSerif", Font.PLAIN, 14));
		lblClasses.setBounds(20, 91, 72, 14);
		panel_6.add(lblClasses);
		
		JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setBounds(497, 329, 116, 116);
		panel.add(panel_7);
		
		JLabel label_8 = new JLabel("New label");
		label_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				admin_upd h=new admin_upd(name);
				h.setVisible(true);
				dispose();
				
			}
		});
		label_8.setIcon(new ImageIcon(Admin_1.class.getResource("/logins/images/reload_e.png")));
		label_8.setBounds(10, 11, 96, 80);
		panel_7.add(label_8);
		
		JLabel lblUpdate = new JLabel("UPDATE\r\n");
		lblUpdate.setForeground(new Color(100, 149, 237));
		lblUpdate.setFont(new Font("SansSerif", Font.PLAIN, 14));
		lblUpdate.setBounds(20, 96, 69, 14);
		panel_7.add(lblUpdate);
	}

}
