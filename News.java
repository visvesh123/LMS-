package logins;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Panel;
import java.awt.SystemColor;
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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class News extends JFrame {
	static String name;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					News frame = new News(name);
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
	public News(String name) {
		this.name=name;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 885, 493);
	
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.control);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(139, 0, 0));
		panel.setBounds(0, 0, 183, 454);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2  =new JLabel("EVENTS"); 
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setFont(new Font("SansSerif", Font.BOLD, 30));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(400, 13, 167, 49);
		
		JTextArea txtrTheCovidResponse_1 = new JTextArea();
		txtrTheCovidResponse_1.setFont(new Font("SansSerif", Font.BOLD, 20));
		txtrTheCovidResponse_1.setText("While we are all aware of the current medical pandemic\r\n we also are in the middle of a less visible pandemic\r\n of uncertainty, anxiety and distress.  Join us as \r\nKeri O. Brenner, MD, MPA, a palliative care physician and\r\n psychiatrist at Stanford, provides practical ideas and \r\ntips for coping with worry, separation, helplessness and loss\r\n during this pandemic.  This webinar focuses on how to be\r\n a catalyst of calm during coronavirus.");
		txtrTheCovidResponse_1.setForeground(new Color(0, 0, 0));
		txtrTheCovidResponse_1.setBackground(SystemColor.control);
		txtrTheCovidResponse_1.setBounds(230, 67, 580, 336);
		
		JLabel lblNewLabel_1 = new JLabel("NEWS AND EVENTS");
		lblNewLabel_1.setFont(new Font("SansSerif", Font.BOLD, 30));
		lblNewLabel_1.setBounds(350, 5, 350, 150);
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setBackground(new Color(255,255, 255));
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("NEWS");
		JLabel lblNewLabel = new JLabel("NEWS");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(400, 13, 167, 49);
		
		JTextArea txtrTheCovidResponse = new JTextArea();
		txtrTheCovidResponse.setFont(new Font("SansSerif", Font.BOLD, 20));
		txtrTheCovidResponse.setText("The COVID-19 Response Innovation Lab is a new \r\norganization sponsored by the Stanford Biosecurity \r\nprogram in the School of Medicine. The lab is an\r\n incubator that provides pro bono services, financial\r\n assistance and general support to organizations\r\n working on projects that address everything from\r\n job searching to social isolation to health data detection.");
		txtrTheCovidResponse.setForeground(new Color(0, 0, 0));
		txtrTheCovidResponse.setBackground(SystemColor.control);
		txtrTheCovidResponse.setBounds(230, 67, 575, 336);
		
    btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnNewButton ) {
				    remove(lblNewLabel_1);
				    remove(lblNewLabel_2);
				    remove(txtrTheCovidResponse_1);
					contentPane.add(lblNewLabel);
					contentPane.add(txtrTheCovidResponse);
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
		btnNewButton.setBounds(0, 0, 183, 45);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("EVENTS");
		
		
btnNewButton_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnNewButton_1 ) {
				    remove(lblNewLabel_1);
				    remove(lblNewLabel);
				    remove(txtrTheCovidResponse);
					contentPane.add(lblNewLabel_2);
					contentPane.add(txtrTheCovidResponse_1);
					repaint();					
					
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
		btnNewButton_1.setBounds(0, 45, 183, 45);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("BACK");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home h=new Home(name);
				h.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setFont(new Font("SansSerif", Font.BOLD, 15));

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
		btnNewButton_2.setBounds(0, 418, 183, 36);
		panel.add(btnNewButton_2);
	}

}
