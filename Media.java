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

public class Media extends JFrame {
	static String name;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Media frame = new Media(name);
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
	public Media(String name) {
		setLocationByPlatform(true);
		this.name=name;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 977, 698);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		//setUndecorated(true);
	
		
		Panel panel = new Panel();
		panel.setBackground(new Color(139, 0, 0));
		panel.setBounds(0, 0, 202, 698);
		contentPane.add(panel);
		panel.setLayout(null);
		
		//on main frame labels
		
				JLabel lblNewLabel = new JLabel("MEDIA");
				lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 30));
				lblNewLabel.setBounds(338, 10, 352, 78);
				contentPane.add(lblNewLabel);
				
				JLabel lblNewLabel_1 = new JLabel("");
				lblNewLabel_1.setIcon(new ImageIcon(Media.class.getResource("/logins/images/med1edit.PNG")));
				lblNewLabel_1.setBounds(229, 487, 245, 151);
				contentPane.add(lblNewLabel_1);
				
				JLabel lblNewLabel_2 = new JLabel("");
				lblNewLabel_2.setIcon(new ImageIcon(Media.class.getResource("/logins/images/mediaedit.PNG")));
				lblNewLabel_2.setBounds(484, 451, 209, 187);
				contentPane.add(lblNewLabel_2);
				
				JLabel lblNewLabel_3 = new JLabel("");
				lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_3.setIcon(new ImageIcon(Media.class.getResource("/logins/images/med2editt.PNG")));
				lblNewLabel_3.setBounds(689, 482, 305, 151);
				contentPane.add(lblNewLabel_3);
				
				JTextArea textArea = new JTextArea();
				textArea.setLineWrap(true);
				textArea.setFont(new Font("SansSerif", Font.BOLD, 17));
				textArea.setEditable(false);
				textArea.setBackground(SystemColor.control);
				textArea.setBounds(257, 120, 665, 265);
				contentPane.add(textArea);	
		
		
		
		//lables for button 1
		
		JLabel lblNewLabel_4 = new JLabel("PHOTOS");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("SansSerif", Font.BOLD, 26));
		lblNewLabel_4.setBackground(SystemColor.control);
		lblNewLabel_4.setBounds(239, 10, 625, 42);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(Media.class.getResource("/logins/images/12edit.PNG")));
		lblNewLabel_5.setBounds(286, 62, 500, 265);
	    
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(Media.class.getResource("/logins/images/11edit.PNG")));
		lblNewLabel_6.setBounds(286, 331, 500, 357);
		
		
		//labels for button3 for videos
		
		JLabel lblNewLabel_7 = new JLabel("VIDEOS");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setFont(new Font("SansSerif", Font.BOLD, 26));
		lblNewLabel_7.setBackground(SystemColor.control);
		lblNewLabel_7.setBounds(239, 10, 625, 42);
		
		JLabel lblNewLabel_8 = new JLabel();
		lblNewLabel_8.setBounds(644, 148, 281, 210);
		lblNewLabel_8.setIcon(new ImageIcon(Media.class.getResource("/logins/images/vid4.PNG")));
				
		JLabel lblV = new JLabel();
		lblV.setHorizontalAlignment(SwingConstants.CENTER);
		lblV.setBounds(283, 148, 281, 210);
		lblV.setIcon(new ImageIcon(Media.class.getResource("/logins/images/video1.png")));
		
		
		JLabel lblV_1 = new JLabel();
		lblV_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblV_1.setBounds(239, 400, 254, 210);
	lblV_1.setIcon(new ImageIcon(Media.class.getResource("/logins/images/vid2.png")));
	
		
		JLabel lblV_2 = new JLabel("");
		lblV_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblV_2.setBounds(644, 400, 281, 210);
		lblV_2.setIcon(new ImageIcon(Media.class.getResource("/logins/images/video.png")));
		
		
		JLabel lblNewLabel_9 = new JLabel("College fest");
		lblNewLabel_9.setFont(new Font("SansSerif", Font.BOLD, 26));
		lblNewLabel_9.setBounds(283, 86, 263, 52);
		lblNewLabel_9.setBackground(SystemColor.control);
		
		JLabel lblHeading = new JLabel("Graduation Ceremony");
		lblHeading.setFont(new Font("SansSerif", Font.BOLD, 26));
		lblHeading.setBounds(283, 381, 300, 52);
		lblHeading.setBackground(SystemColor.control);
		
		
		
		
		
		
		
		
		
		
		
		//button1
		
		JButton btnNewButton = new JButton("Photos");
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
				    remove(lblNewLabel_1);
				    remove(lblNewLabel_2);
				    remove(lblNewLabel_3);
				    remove(textArea);
				    remove(lblNewLabel_7);
				    remove(lblNewLabel_8);
				    remove(lblNewLabel_9);
				    remove(lblV_1);
				    remove(lblV);
				    remove(lblV_2);
				    remove(lblHeading);
				    contentPane.add(lblNewLabel_4);
					contentPane.add(lblNewLabel_5);
					contentPane.add(lblNewLabel_6);
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
		
		
		
		JButton btnNewButton_1 = new JButton("BACK");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home h= new Home(name);
				h.setVisible(true);
				dispose();
			}
		});
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
		
			
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnNewButton_1.setBackground(new Color(139, 0, 0));
		btnNewButton_1.setBounds(0, 613, 202, 45);
		panel.add(btnNewButton_1);
		
		
		
		//button3
		
		JButton button = new JButton("Videos");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 remove(lblNewLabel);
				    remove(lblNewLabel_1);
				    remove(lblNewLabel_2);
				    remove(lblNewLabel_3);
				    remove(textArea);
				    remove(lblNewLabel_4);
				    remove(lblNewLabel_5);
				    remove(lblNewLabel_6);
				
				contentPane.add(lblNewLabel_9);
				contentPane.add(lblNewLabel_7);
				contentPane.add(lblNewLabel_8);
				contentPane.add(lblV_1);
				contentPane.add(lblV_2);
				contentPane.add(lblV);
				contentPane.add(lblHeading);
				repaint();
				
				
				
			}
		});
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
		button.setForeground(Color.WHITE);
		button.setFont(new Font("SansSerif", Font.BOLD, 15));
		button.setBackground(new Color(139, 0, 0));
		button.setBounds(0, 44, 202, 45);
		panel.add(button);
	
		
	}

}
