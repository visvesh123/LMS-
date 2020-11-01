package logins;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Faculty_1 extends JFrame {
static	String name;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Faculty_1 frame = new Faculty_1(name);
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
	public Faculty_1(String name) {
		this.name=name;

        setLocationByPlatform(true);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setBounds(100, 100, 728, 495);

        contentPane = new JPanel();

        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);

        contentPane.setLayout(null);

       

        JPanel panel = new JPanel();

        panel.setBounds(0, 0, 714, 456);

        contentPane.add(panel);

        panel.setLayout(null);

       

        JPanel panel_1 = new JPanel();

        panel_1.setBackground(new Color(255, 215, 0));

        panel_1.setBounds(0, 0, 721, 148);

        panel.add(panel_1);

        panel_1.setLayout(null);

       

        JLabel lblNewLabel = new JLabel("Hello "+name);

        lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 28));

        lblNewLabel.setForeground(new Color(255, 255, 255));

        lblNewLabel.setBounds(10, 11, 338, 61);

        panel_1.add(lblNewLabel);
        
        JButton btnNewButton = new JButton("SIGN OUT");
        btnNewButton.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseExited(MouseEvent e) {
					
					btnNewButton.setBackground(new Color(255, 215, 0));
				}
				@Override
				public void mouseEntered(MouseEvent e) {
					btnNewButton.setBackground(new Color(218,165,32));
				}
			});
        btnNewButton.setBackground(new Color(255, 215, 0));
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Frame1 h=new Frame1();
        		h.setVisible(true);
        		dispose();
        		
        		
        	}
        });
        btnNewButton.setFont(new Font("SansSerif", Font.BOLD, 15));
        btnNewButton.setBounds(551, 0, 160, 52);
        panel_1.add(btnNewButton);

       

        JPanel panel_2 = new JPanel();

        panel_2.setBounds(36, 215, 157, 116);

        panel.add(panel_2);

        panel_2.setLayout(null);

       

        JLabel lblNewLabel_1 = new JLabel("");

        lblNewLabel_1.addMouseListener(new MouseAdapter() {

                        @Override

                        public void mousePressed(MouseEvent e) {

                                      Faculty_clsdet h=new Faculty_clsdet(name);
                                      h.setVisible(true);
                                      dispose();
                                       

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

        lblNewLabel_1.setIcon(new ImageIcon(Faculty_1.class.getResource("/logins/images/notes.png")));

        lblNewLabel_1.setBounds(31, 10, 96, 74);

        panel_2.add(lblNewLabel_1);

       

        JLabel lblNewLabel_2 = new JLabel("upload course content");
        lblNewLabel_2.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mousePressed(MouseEvent e) {
        		
        		
        	}
        });
        lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);

        lblNewLabel_2.setFont(new Font("SansSerif", Font.PLAIN, 14));

        lblNewLabel_2.setForeground(new Color(100, 149, 237));

        lblNewLabel_2.setBounds(0, 94, 147, 16);

        panel_2.add(lblNewLabel_2);

       

        JPanel panel_7 = new JPanel();

        panel_7.setLayout(null);

        panel_7.setBounds(258, 215, 157, 116);

        panel.add(panel_7);

       

        JLabel label_8 = new JLabel("");
        label_8.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mousePressed(MouseEvent e) {
        		Faculty_chtreq h= new Faculty_chtreq(name);
        		h.setVisible(true);
        		dispose();
        		
        	}
        });

        label_8.setIcon(new ImageIcon(Faculty_1.class.getResource("/logins/images/test.png")));

        label_8.setBounds(36, 10, 96, 80);

        panel_7.add(label_8);

       

        JLabel lblUpdate = new JLabel("request chat");
        lblUpdate.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mousePressed(MouseEvent e) {
        		
        		
        	}
        });

        lblUpdate.setForeground(new Color(100, 149, 237));

        lblUpdate.setFont(new Font("SansSerif", Font.PLAIN, 14));

        lblUpdate.setBounds(37, 91, 110, 19);

        panel_7.add(lblUpdate);
        
        JPanel panel_3 = new JPanel();
        panel_3.setBounds(491, 215, 157, 116);
        panel.add(panel_3);
        panel_3.setLayout(null);
        
        JLabel lblNewLabel_3 = new JLabel("");
        lblNewLabel_3.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mousePressed(MouseEvent e) {
        	}
        });
        lblNewLabel_3.setIcon(new ImageIcon(Faculty_1.class.getResource("/logins/images/notification.png")));
        lblNewLabel_3.setBounds(35, 10, 96, 79);
        lblNewLabel_3.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mousePressed(MouseEvent e) {
        		Faculty_noti h= new Faculty_noti(name);
        		h.setVisible(true);
        		dispose();
        		
        		
        	}
        });
        panel_3.add(lblNewLabel_3);
        
        JLabel lblNewLabel_4 = new JLabel("notifications");
        
        lblNewLabel_4.setFont(new Font("SansSerif", Font.PLAIN, 14));
        lblNewLabel_4.setForeground(new Color(30, 144, 255));
        lblNewLabel_4.setBounds(35, 93, 96, 23);
        panel_3.add(lblNewLabel_4);
	

	
		
	}

}
