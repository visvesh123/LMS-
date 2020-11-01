package logins;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.JSeparator;

public class Payments extends JFrame {
	static String name;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Payments frame = new Payments(name);
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
	public Payments(String name) {
		this.name=name;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 874, 485);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		//setUndecorated(true);
		contentPane.setLayout(null);
		
		Panel panel = new Panel();
		panel.setBackground(new Color(139, 0, 0));
		panel.setBounds(0, 0, 202, 446);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Parents portal\r\n");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Desktop d=Desktop.getDesktop();
				try {
					d.browse(new URI("https://mahindraecolecentrale.edu.in/parents/login?referer_page=https%3A%2F%2Fmahindraecolecentrale.edu.in%2Fparents%2F"));
				} catch (Exception e1) {
					
					e1.printStackTrace();
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
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home h=new Home(name);
				h.setVisible(true);
				dispose();
			}
		});
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("SansSerif", Font.BOLD, 15));
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

		btnBack.setBackground(new Color(139, 0, 0));
		btnBack.setBounds(0, 402, 202, 44);
		panel.add(btnBack);
		
		JButton btnOffline = new JButton("International");
		btnOffline.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Desktop d=Desktop.getDesktop();
				try {
					d.browse(new URI("https://www.flywire.com/how-it-works/"));
				} catch (Exception e1) {
					
					e1.printStackTrace();
				} 

			}
		});
		btnOffline.setForeground(Color.WHITE);
		btnOffline.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnOffline.setBackground(new Color(139, 0, 0));
		btnOffline.setBounds(0, 44, 202, 45);
		panel.add(btnOffline);
		
		
		
		JLabel lblNewLabel = new JLabel("STANFORD E-PAY");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Rockwell Condensed", Font.BOLD, 30));
		lblNewLabel.setBounds(208, 0, 352, 78);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Please see the Stanford ePay FAQ's (PDF) for more information. For individualized assistance, contact the Student Services Center.");
		lblNewLabel_1.setBounds(208, 377, 656, 58);
		contentPane.add(lblNewLabel_1);
		
		JTextArea txtrHelpdeskForStudent = new JTextArea();
		txtrHelpdeskForStudent.setBackground(UIManager.getColor("Button.background"));
		txtrHelpdeskForStudent.setLineWrap(true);
		txtrHelpdeskForStudent.setText("Helpdesk for Student, relating to payment related issue:\r\nContact person: Michael\r\nEmail ID: michael@stanford.in\r\nPhone: +41 40 6713 5156");
		txtrHelpdeskForStudent.setBounds(359, 244, 472, 122);
		contentPane.add(txtrHelpdeskForStudent);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(231, 63, 299, 2);
		contentPane.add(separator);
		
		JTextArea txtrDemandDraft = new JTextArea();
		txtrDemandDraft.setBackground(UIManager.getColor("Button.background"));
		txtrDemandDraft.setText("\r\nDemand Draft:\r\n\r\nPlease draw the DD in favour of \"Stanford University\".\r\nPlease mention your name, Hall Ticket Number and Contact Number on the backside.\r\n\r\n");
		txtrDemandDraft.setLineWrap(true);
		txtrDemandDraft.setFont(new Font("SansSerif", Font.PLAIN, 13));
		txtrDemandDraft.setBounds(218, 89, 529, 109);
		contentPane.add(txtrDemandDraft);
	}
}
