package logins;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Faculty_chtreq extends JFrame {
static String name;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Faculty_chtreq frame = new Faculty_chtreq(name);
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
	public Faculty_chtreq(String name) {
		 this.name=getName();

	        setLocationByPlatform(true);

	 

	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	 

	        setBounds(100, 100, 728, 495);

	 

	        contentPane = new JPanel();

	 

	        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

	 

	        setContentPane(contentPane);

	 

	        contentPane.setLayout(null);

	 

	      

	 

	        JPanel panel = new JPanel();

	 

	        panel.setBounds(0, 0, 724, 468);

	 

	        contentPane.add(panel);

	 

	        panel.setLayout(null);

	 

	      

	 

	        JPanel panel_1 = new JPanel();

	 

	        panel_1.setBackground(new Color(255, 215, 0));

	 

	        panel_1.setBounds(0, 0, 724, 100);

	 

	        panel.add(panel_1);

	 

	        panel_1.setLayout(null);

	 

	      

	 

	        JLabel lblNewLabel = new JLabel("CHAT REQUESTS");
	        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);

	 

	        lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 28));

	 

	        lblNewLabel.setForeground(new Color(0, 0, 0));

	 

	        lblNewLabel.setBounds(153, 10, 447, 61);

	 

	        panel_1.add(lblNewLabel);

	       

	        JPanel panel_2 = new JPanel();

	        panel_2.setBackground(new Color(255, 215, 0));

	        panel_2.setBounds(0, 97, 129, 371);

	        panel.add(panel_2);

	        panel_2.setLayout(null);

	       

	        JButton btnNewButton = new JButton("BACK");
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
	            	   
	            	   Faculty_1 h= new Faculty_1(name);
		           		h.setVisible(true);
		           		dispose();

	                             //  Faculty_1 f=new Faculty_1(name);

	                              // f.setVisible(true);

	                               //dispose();

	                              

	               }

	        });

	        btnNewButton.setFont(new Font("SansSerif", Font.BOLD, 15));

	        btnNewButton.setBounds(0, 330, 129, 41);

	        panel_2.add(btnNewButton);
	        
	        JButton btnNewButton_1 = new JButton(" REPLY");
	        btnNewButton_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseExited(MouseEvent e) {
					btnNewButton_1.setBackground(new Color(255, 215, 0));
				}
				@Override
				public void mouseEntered(MouseEvent e) {
					btnNewButton_1.setBackground(new Color(218,165,32));
				}
			});
	        btnNewButton_1.setBackground(new Color(255, 215, 0));
	        btnNewButton_1.setFont(new Font("SansSerif", Font.BOLD, 15));
	        btnNewButton_1.setBounds(261, 129, 99, 48);
	        panel.add(btnNewButton_1);
	        
	        JButton btnReply = new JButton("REPLY");
	        btnReply.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseExited(MouseEvent e) {
					btnReply.setBackground(new Color(255, 215, 0));
				}
				@Override
				public void mouseEntered(MouseEvent e) {
					btnReply.setBackground(new Color(218,165,32));
				}
			});
	        btnReply.setBackground(new Color(255, 215, 0));
	        btnReply.setFont(new Font("SansSerif", Font.BOLD, 15));
	        btnReply.setBounds(261, 202, 99, 48);
	        panel.add(btnReply);
	        
	        JButton btnReply_1 = new JButton(" REPLY");
	        btnReply_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseExited(MouseEvent e) {
					btnReply_1.setBackground(new Color(255, 215, 0));
				}
				@Override
				public void mouseEntered(MouseEvent e) {
					btnReply_1.setBackground(new Color(218,165,32));
				}
			});
	        btnReply_1.setBackground(new Color(255, 215, 0));
	        btnReply_1.setFont(new Font("SansSerif", Font.BOLD, 15));
	        btnReply_1.setBounds(261, 280, 99, 48);
	        panel.add(btnReply_1);
	        
	        JButton btnReply_2 = new JButton("REPLY");
	        btnReply_2.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseExited(MouseEvent e) {
					btnReply_2.setBackground(new Color(255, 215, 0));
				}
				@Override
				public void mouseEntered(MouseEvent e) {
					btnReply_2.setBackground(new Color(218,165,32));
				}
			});
	        btnReply_2.setBackground(new Color(255, 215, 0));
	        btnReply_2.setFont(new Font("SansSerif", Font.BOLD, 15));
	        btnReply_2.setBounds(261, 353, 99, 48);
	        panel.add(btnReply_2);
	        
	        JLabel lblNewLabel_1 = new JLabel("1- N. VISVESH REQUESTED A CHAT");
	        lblNewLabel_1.setForeground(Color.BLACK);
	        lblNewLabel_1.setFont(new Font("SansSerif", Font.PLAIN, 15));
	        lblNewLabel_1.setBounds(389, 130, 287, 47);
	        panel.add(lblNewLabel_1);
	        
	        JLabel lblN = new JLabel("2 - P . VARSHA REQUESTED A CHAT");
	        lblN.setForeground(Color.BLACK);
	        lblN.setFont(new Font("SansSerif", Font.PLAIN, 15));
	        lblN.setBounds(389, 203, 275, 47);
	        panel.add(lblN);
	        
	        JLabel lblVjahnaviRequested = new JLabel("3- V.JAHNAVI REQUESTED A CHAT");
	        lblVjahnaviRequested.setForeground(Color.BLACK);
	        lblVjahnaviRequested.setFont(new Font("SansSerif", Font.PLAIN, 15));
	        lblVjahnaviRequested.setBounds(389, 280, 275, 47);
	        panel.add(lblVjahnaviRequested);
	        
	        JLabel lblTsurrenderRequested = new JLabel("4- T.SURRENDER REQUESTED A CHAT");
	        lblTsurrenderRequested.setForeground(Color.BLACK);
	        lblTsurrenderRequested.setFont(new Font("SansSerif", Font.PLAIN, 15));
	        lblTsurrenderRequested.setBounds(389, 354, 303, 47);
	        panel.add(lblTsurrenderRequested);
	        
	        JButton btnRemove = new JButton("REMOVE");
	        btnRemove.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseExited(MouseEvent e) {
					btnRemove.setBackground(new Color(255, 215, 0));
				}
				@Override
				public void mouseEntered(MouseEvent e) {
					btnRemove.setBackground(new Color(218,165,32));
				}
			});
	        btnRemove.setBackground(new Color(255, 215, 0));
	        btnRemove.setFont(new Font("SansSerif", Font.BOLD, 15));
	        btnRemove.setBounds(139, 129, 99, 48);
	        panel.add(btnRemove);
	        
	        JButton btnRemove_1 = new JButton("REMOVE");
	        btnRemove_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseExited(MouseEvent e) {
					btnRemove_1.setBackground(new Color(255, 215, 0));
				}
				@Override
				public void mouseEntered(MouseEvent e) {
					btnRemove_1.setBackground(new Color(218,165,32));
				}
			});
	        btnRemove_1.setBackground(new Color(255, 215, 0));
	        btnRemove_1.setFont(new Font("SansSerif", Font.BOLD, 15));
	        btnRemove_1.setBounds(139, 202, 99, 48);
	        panel.add(btnRemove_1);
	        
	        JButton btnRemove_2 = new JButton("REMOVE\r\n");
	        btnRemove_2.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseExited(MouseEvent e) {
					btnRemove_2.setBackground(new Color(255, 215, 0));
				}
				@Override
				public void mouseEntered(MouseEvent e) {
					btnRemove_2.setBackground(new Color(218,165,32));
				}
			});
	        btnRemove_2.setBackground(new Color(255, 215, 0));
	        btnRemove_2.setFont(new Font("SansSerif", Font.BOLD, 15));
	        btnRemove_2.setBounds(139, 280, 99, 48);
	        panel.add(btnRemove_2);
	        
	        JButton btnRemove_3 = new JButton("REMOVE");
	        btnRemove_3.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseExited(MouseEvent e) {
					btnRemove_3.setBackground(new Color(255, 215, 0));
				}
				@Override
				public void mouseEntered(MouseEvent e) {
					btnRemove_3.setBackground(new Color(218,165,32));
				}
			});
	        btnRemove_3.setBackground(new Color(255, 215, 0));
	        btnRemove_3.setFont(new Font("SansSerif", Font.BOLD, 15));
	        btnRemove_3.setBounds(139, 353, 99, 48);
	        panel.add(btnRemove_3);
	        
	        JButton btnNewButton_2 = new JButton("REMOVE ALL");
	        btnNewButton_2.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseExited(MouseEvent e) {
					btnNewButton_2.setBackground(new Color(255, 215, 0));
				}
				@Override
				public void mouseEntered(MouseEvent e) {
					btnNewButton_2.setBackground(new Color(218,165,32));
				}
			});
	        btnNewButton_2.setBackground(new Color(255, 215, 0));
	        btnNewButton_2.setFont(new Font("SansSerif", Font.BOLD, 15));
	        btnNewButton_2.setBounds(139, 422, 221, 46);
	        panel.add(btnNewButton_2);
	
	}

}
