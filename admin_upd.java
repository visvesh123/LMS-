package logins;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;

public class admin_upd extends JFrame {
static String name;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					admin_upd frame = new admin_upd(name);
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
	public admin_upd(String name) {
		this.name=name;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 495);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		
		 JPanel panel = new JPanel();

         panel.setBounds(5, 5, 772, 438);

         contentPane.add(panel);
         panel.setLayout(null);

        

         JPanel panel_1 = new JPanel();
         panel_1.setForeground(new Color(255, 255, 255));
         panel_1.setBounds(0, 0, 785, 74);

         panel_1.setBackground(new Color(30, 144, 255));

         panel.add(panel_1);

         panel_1.setLayout(null);
         
         JLabel lblNewLabel = new JLabel("UPDATES");
         lblNewLabel.setForeground(new Color(255, 255, 255));
         lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 20));
         lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
         lblNewLabel.setBounds(324, 13, 161, 30);
         panel_1.add(lblNewLabel);
         
         JPanel panel_2 = new JPanel();
         panel_2.setForeground(new Color(255, 255, 255));

         panel_2.setBackground(new Color(30, 144, 255));

         panel_2.setBounds(0, 73, 110, 383);

         panel.add(panel_2);

         panel_2.setLayout(null);
         
         JButton btnNewButton = new JButton("NEWS");
         btnNewButton.setBackground(new Color(30, 144, 255));
         btnNewButton.setForeground(new Color(255, 255, 255));
         btnNewButton.setFont(new Font("SansSerif", Font.BOLD, 15));
         btnNewButton.addMouseListener(new MouseAdapter() {
 			@Override
 			public void mouseExited(MouseEvent e) {
 				btnNewButton.setBackground(new Color(30, 144, 255));
 			}
 			@Override
 			public void mouseEntered(MouseEvent e) {
 				btnNewButton.setBackground(new Color(0,0,205));
 			}
 		});
         btnNewButton.setBounds(0, 0, 110, 32);
         panel_2.add(btnNewButton);
         
         JButton btnNewButton_1 = new JButton("EVENTS");
         btnNewButton_1.setFont(new Font("SansSerif", Font.BOLD, 15));
         btnNewButton_1.setBackground(new Color(30, 144, 255));
         btnNewButton_1.setForeground(new Color(255, 255, 255));
         btnNewButton_1.addMouseListener(new MouseAdapter() {
 			@Override
 			public void mouseExited(MouseEvent e) {
 				btnNewButton_1.setBackground(new Color(30, 144, 255));
 			}
 			@Override
 			public void mouseEntered(MouseEvent e) {
 				btnNewButton_1.setBackground(new Color(0,0,205));
 			}
 		});
         btnNewButton_1.setBounds(0, 32, 110, 32);
         panel_2.add(btnNewButton_1);
         
         JButton btnNewButton_2 = new JButton("LIBRARY");
         btnNewButton_2.setForeground(new Color(255, 255, 255));
         btnNewButton_2.setBackground(new Color(30, 144, 255));
         btnNewButton_2.setFont(new Font("SansSerif", Font.BOLD, 15));
         btnNewButton_2.addMouseListener(new MouseAdapter() {
 			@Override
 			public void mouseExited(MouseEvent e) {
 				btnNewButton_2.setBackground(new Color(30, 144, 255));
 			}
 			@Override
 			public void mouseEntered(MouseEvent e) {
 				btnNewButton_2.setBackground(new Color(0,0,205));
 			}
 		});
         btnNewButton_2.setBounds(0, 63, 110, 32);
         panel_2.add(btnNewButton_2);
         
         JButton btnNewButton_3 = new JButton("STAFF");
         btnNewButton_3.setBackground(new Color(30, 144, 255));
         btnNewButton_3.setForeground(new Color(255, 255, 255));
         btnNewButton_3.setFont(new Font("SansSerif", Font.BOLD, 15));
         btnNewButton_3.addMouseListener(new MouseAdapter() {
 			@Override
 			public void mouseExited(MouseEvent e) {
 				btnNewButton_3.setBackground(new Color(30, 144, 255));
 			}
 			@Override
 			public void mouseEntered(MouseEvent e) {
 				btnNewButton_3.setBackground(new Color(0,0,205));
 			}
 		});
         btnNewButton_3.setBounds(0, 96, 110, 32);
         panel_2.add(btnNewButton_3);
         
         JButton btnNewButton_4 = new JButton("CLUBS");
         btnNewButton_4.setBackground(new Color(30, 144, 255));
         btnNewButton_4.setForeground(new Color(255, 255, 255));
         btnNewButton_4.setFont(new Font("SansSerif", Font.BOLD, 15));
         btnNewButton_4.addMouseListener(new MouseAdapter() {
 			@Override
 			public void mouseExited(MouseEvent e) {
 				btnNewButton_4.setBackground(new Color(30, 144, 255));
 			}
 			@Override
 			public void mouseEntered(MouseEvent e) {
 				btnNewButton_4.setBackground(new Color(0,0,205));
 			}
 		});
         btnNewButton_4.setBounds(0, 127, 110, 32);
         panel_2.add(btnNewButton_4);
         
         JButton btnNewButton_5 = new JButton("MEDIA");
         btnNewButton_5.setBackground(new Color(30, 144, 255));
         btnNewButton_5.setForeground(new Color(255, 255, 255));
         btnNewButton_5.setFont(new Font("SansSerif", Font.BOLD, 15));
         btnNewButton_5.addMouseListener(new MouseAdapter() {
 			@Override
 			public void mouseExited(MouseEvent e) {
 				btnNewButton_5.setBackground(new Color(30, 144, 255));
 			}
 			@Override
 			public void mouseEntered(MouseEvent e) {
 				btnNewButton_5.setBackground(new Color(0,0,205));
 			}
 		});
         btnNewButton_5.setBounds(0, 159, 110, 32);
         panel_2.add(btnNewButton_5);
         
         JButton btnNewButton_6 = new JButton("FOOD");
         btnNewButton_6.setBackground(new Color(30, 144, 255));
         btnNewButton_6.setForeground(new Color(255, 255, 255));
         btnNewButton_6.setFont(new Font("SansSerif", Font.BOLD, 15));
         btnNewButton_6.addMouseListener(new MouseAdapter() {
 			@Override
 			public void mouseExited(MouseEvent e) {
 				btnNewButton_6.setBackground(new Color(30, 144, 255));
 			}
 			@Override
 			public void mouseEntered(MouseEvent e) {
 				btnNewButton_6.setBackground(new Color(0,0,205));
 			}
 		});
         btnNewButton_6.setBounds(0, 191, 110, 32);
         panel_2.add(btnNewButton_6);
         
         JButton btnNewButton_7 = new JButton("SPORTS");
         btnNewButton_7.setBackground(new Color(30, 144, 255));
         btnNewButton_7.setForeground(new Color(255, 255, 255));
         btnNewButton_7.setFont(new Font("SansSerif", Font.BOLD, 15));
         btnNewButton_7.addMouseListener(new MouseAdapter() {
 			@Override
 			public void mouseExited(MouseEvent e) {
 				btnNewButton_7.setBackground(new Color(30, 144, 255));
 			}
 			@Override
 			public void mouseEntered(MouseEvent e) {
 				btnNewButton_7.setBackground(new Color(0,0,205));
 			}
 		});
         btnNewButton_7.setBounds(0, 223, 110, 32);
         panel_2.add(btnNewButton_7);
         
         JButton btnBack = new JButton("BACK");
         btnBack.addActionListener(new ActionListener() {
         	public void actionPerformed(ActionEvent e) {
         		Admin_1 h= new Admin_1(name);
         		h.setVisible(true);
         		dispose();
         	}
         });
         btnBack.setForeground(Color.WHITE);
         btnBack.setFont(new Font("SansSerif", Font.BOLD, 15));
         btnBack.setBackground(new Color(30, 144, 255));
         btnBack.addMouseListener(new MouseAdapter() {
 			@Override
 			public void mouseExited(MouseEvent e) {
 				btnBack.setBackground(new Color(30, 144, 255));
 			}
 			@Override
 			public void mouseEntered(MouseEvent e) {
 				btnBack.setBackground(new Color(0,0,205));
 			}
 		});
         btnBack.setBounds(0, 340, 110, 32);
         panel_2.add(btnBack);
		
	
	}
}
