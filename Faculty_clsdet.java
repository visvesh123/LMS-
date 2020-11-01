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
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Faculty_clsdet extends JFrame {
static String name;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Faculty_clsdet frame = new Faculty_clsdet(name);
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
	public Faculty_clsdet(String name) {
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

	 

	      

	 

	        JLabel lblNewLabel = new JLabel("UPLOAD COURSE CONTENT");
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
	        
	        JButton btnNewButton_2 = new JButton("CLICK HERE TO UPLOAD REFERENCES\r\n");
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
	        btnNewButton_2.setBounds(139, 342, 424, 31);
	        panel.add(btnNewButton_2);
	        
	        JTextField textField_1 = new JTextField();
	        textField_1.setBounds(139, 383, 485, 54);
	        panel.add(textField_1);
	        textField_1.setColumns(10);
	        
	        JButton btnClickHereTo = new JButton("CLICK HERE TO UPLOAD LECTURE NOTES\r\n");
	        btnClickHereTo.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseExited(MouseEvent e) {
					
					btnClickHereTo.setBackground(new Color(255, 215, 0));
				}
				@Override
				public void mouseEntered(MouseEvent e) {
					btnClickHereTo.setBackground(new Color(218,165,32));
				}
			});
	        btnClickHereTo.setFont(new Font("SansSerif", Font.BOLD, 15));
	        btnClickHereTo.setBackground(new Color(255, 215, 0));
	        btnClickHereTo.setBounds(139, 131, 424, 31);
	        panel.add(btnClickHereTo);
	        
	        JButton btnClickHereTo_1 = new JButton("CLICK HERE TO UPLOAD LECTURE VIDEOS\r\n");
	        btnClickHereTo_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseExited(MouseEvent e) {
					
					btnClickHereTo_1.setBackground(new Color(255, 215, 0));
				}
				@Override
				public void mouseEntered(MouseEvent e) {
					btnClickHereTo_1.setBackground(new Color(218,165,32));
				}
			});btnClickHereTo_1.setFont(new Font("SansSerif", Font.BOLD, 15));
	        
	        btnClickHereTo_1.setBackground(new Color(255, 215, 0));
	        btnClickHereTo_1.setBounds(139, 239, 424, 31);
	        panel.add(btnClickHereTo_1);
	        
	       JTextField textField = new JTextField();
	        textField.setColumns(10);
	        textField.setBounds(139, 280, 485, 54);
	        panel.add(textField);
	        
	       JTextField textField_2 = new JTextField();
	        textField_2.setColumns(10);
	        textField_2.setBounds(139, 172, 485, 54);
	        panel.add(textField_2);
		
	}

}
