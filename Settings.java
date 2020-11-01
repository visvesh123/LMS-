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
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Settings extends JFrame {
static String name;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Settings frame = new Settings(name);
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
	public Settings(String name) {
		this.name=name;
		JRadioButton rdbtnOn, rdbtnNewRadioButton;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 495);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		 contentPane.setLayout(null);
		
		 JPanel panel = new JPanel();

         panel.setBounds(5, 5, 772, 438);

         contentPane.add(panel);
         panel.setLayout(null);

        

         JPanel panel_1 = new JPanel();
         panel_1.setBounds(0, 0, 785, 74);
         panel_1.setForeground(new Color(255, 255, 255));

         panel_1.setBackground(new Color(30, 144, 255));

         panel.add(panel_1);

         panel_1.setLayout(null);
         
         JLabel lblNewLabel = new JLabel("SETTINGS");
         lblNewLabel.setForeground(new Color(255, 255, 255));
         lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 20));
         lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
         lblNewLabel.setBounds(322, 13, 175, 31);
         panel_1.add(lblNewLabel);
         
         JPanel panel_2 = new JPanel();
         panel_2.setBounds(0, 73, 155, 383);
         panel_2.setForeground(new Color(255, 255, 255));

         panel_2.setBackground(new Color(30, 144, 255));

         panel.add(panel_2);

         panel_2.setLayout(null);
         
        
         
        
         
         
         
         JButton btnNewButton_4 = new JButton("BACK");
         btnNewButton_4.addActionListener(new ActionListener() {
         	public void actionPerformed(ActionEvent e) {
         		Admin_1 h=new Admin_1(name);
         		h.setVisible(true);
         		dispose();
         	}
         });
         btnNewButton_4.setBackground(new Color(30,144, 255));
         btnNewButton_4.setForeground(new Color(255, 255, 255));
         btnNewButton_4.setFont(new Font("SansSerif", Font.BOLD, 15));
         btnNewButton_4.setBounds(0, 336, 155, 34);
         panel_2.add(btnNewButton_4);
         
        
          		
         
         JSlider slider = new JSlider();
         slider.setForeground(new Color(30,144, 255));
         slider.setBounds(380, 161, 200, 26);
        
         
         JLabel lblNewLabel_1 = new JLabel("VOLUME:");
         lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
         lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
         lblNewLabel_1.setBounds(230, 161, 125, 26);
        
         
         JSlider slider_1 = new JSlider();
         slider_1.setForeground(new Color(30,144, 255));
         slider_1.setBounds(380, 233, 200, 26);
         
         
         JLabel lblNewLabel_2 = new JLabel("BRIGHTNESS:");
         lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
         lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
         lblNewLabel_2.setBounds(230, 233, 125, 26);
        
         
         JLabel lblNewLabel_3 = new JLabel("HD-QUALITY:");
         lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
         lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
         lblNewLabel_3.setBounds(230, 314, 125, 26);
        
         
         JSlider slider_2 = new JSlider();
         slider_2.setForeground(new Color(30, 144, 255));
         slider_2.setBounds(380, 314, 200, 26);
        
         JLabel lblNewLabel_4 = new JLabel("NETWORK:");
         lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
         lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
         lblNewLabel_4.setBounds(191, 131, 98, 25);
         
         
         
         
         JRadioButton rdbtnOn_1 = new JRadioButton("ON");
         JRadioButton rdbtnOff = new JRadioButton("OFF");
         rdbtnOff.addActionListener(new ActionListener() {
         	public void actionPerformed(ActionEvent e) {
         		if(rdbtnOff.isSelected()){
         			rdbtnOn_1.setSelected(false);
         			
         			
         	     
         	     
         		}
         			
         		
         	}
         });
         
         rdbtnOn_1.addActionListener(new ActionListener() {
         	public void actionPerformed(ActionEvent e) {
         		if(rdbtnOn_1.isSelected()){
         			rdbtnOff.setSelected(false);
         			
         			
         	     
         	     
         		}
         		
         	}
         });
         rdbtnOn_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
         rdbtnOn_1.setBounds(265, 186, 64, 25);
         
         
         
         rdbtnOff.setFont(new Font("Tahoma", Font.PLAIN, 15));
         rdbtnOff.setBounds(480, 186, 64, 25);
         
         
        
         
         
       
         
	         JRadioButton rdbtnNewRadioButton1 = new JRadioButton("OFF");
	         JRadioButton  rdbtnOn1 = new JRadioButton("ON");
         rdbtnOn1.addActionListener(new ActionListener() {
         	public void actionPerformed(ActionEvent e) {
         		
         		if(rdbtnOn1.isSelected()){
         			rdbtnNewRadioButton1.setSelected(false);
         			
         			
         	     
         	     
         		}
         	}
         });
         
         rdbtnOn1.setFont(new Font("Tahoma", Font.PLAIN, 15));
         rdbtnOn1.setBounds(388, 131, 67, 25);
         
         
         rdbtnNewRadioButton1.addActionListener(new ActionListener() {
         	public void actionPerformed(ActionEvent e) {
         		if(rdbtnNewRadioButton1.isSelected()){
         			rdbtnOn1.setSelected(false);
         			
         	      
         		}
         	}
         });
         rdbtnNewRadioButton1.setFont(new Font("Tahoma", Font.PLAIN, 15));
         rdbtnNewRadioButton1.setBounds(480, 132, 74, 25);
         
         JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("OFF\r\n");
         JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("ON");
         rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
         	public void actionPerformed(ActionEvent e) {
         		if(rdbtnNewRadioButton_1.isSelected()){
         			rdbtnNewRadioButton_2.setSelected(false);
         	}
         	}
         });
         rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
         rdbtnNewRadioButton_1.setBounds(245, 210, 127, 25);
         
         
        
         rdbtnNewRadioButton_2.addActionListener(new ActionListener() {
          	public void actionPerformed(ActionEvent e) {
          		if(rdbtnNewRadioButton_2.isSelected()){
          			rdbtnNewRadioButton_1.setSelected(false);
          	}
          	}
          });
         
         
         rdbtnNewRadioButton_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
         rdbtnNewRadioButton_2.setBounds(518, 210, 127, 25);
        
         
         JLabel lblNewLabel_6 = new JLabel("NOTIFICATIONS");
         lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
         lblNewLabel_6.setBounds(344, 122, 127, 25);
         
         
         
         
         
         
         
         
         
         
         
       

         JButton btnNewButton_2 = new JButton("GENERAL");
         
         btnNewButton_2.addActionListener(new ActionListener() {
 			public void actionPerformed(ActionEvent e) {
 				if(e.getSource()== btnNewButton_2){
 				 
 				 remove(lblNewLabel_4);
   				remove(rdbtnOn1);
   				 remove(rdbtnNewRadioButton1);
   				//remove(lblNewLabel_5);
  				remove(rdbtnOn_1); 
  				remove(rdbtnOff);
  				panel.add(slider);
				 panel.add(lblNewLabel_1);
				panel.add(slider_1);
				 panel.add(lblNewLabel_2);
				 panel.add(lblNewLabel_3);
				 panel.add(slider_2);
  				
  				
  				
  				
 				repaint();
 				}	
 			}
         });
         btnNewButton_2.setForeground(new Color(255, 255, 255));
         btnNewButton_2.setBackground(new Color(30,144, 255));
         btnNewButton_2.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseExited(MouseEvent e) {
					btnNewButton_2.setBackground(new Color(30,144,255));
				}
				@Override
				public void mouseEntered(MouseEvent e) {
					btnNewButton_2.setBackground(new Color(30,144,255));
				}
			});
         
         btnNewButton_2.setFont(new Font("SansSerif", Font.BOLD, 15));
         btnNewButton_2.setBounds(0, 33, 155, 41);
         panel_2.add(btnNewButton_2);
         
         
         JButton btnNewButton = new JButton("NETWORK");
         btnNewButton.setBackground(new Color(30,144, 255));
         btnNewButton.setForeground(new Color(255, 255, 255));
         btnNewButton.addActionListener(new ActionListener() {
  			public void actionPerformed(ActionEvent e) {
  				if(e.getSource()== btnNewButton){
  				//	remove(lblNewLabel_5);
  	  				remove(rdbtnOn_1); 
  	  				remove(rdbtnOff);
  				 remove(slider);
 				 remove(lblNewLabel_1);
 				remove(slider_1);
 				 remove(lblNewLabel_2);
 				 remove(lblNewLabel_3);
 				 remove(slider_2);
 				 
 				invalidate();
 				validate();
 				repaint();
 				 
 				panel.add(lblNewLabel_4);
  				panel.add(rdbtnOn1);
  				 panel.add(rdbtnNewRadioButton1);
  				
  				
  				
 				
  				}
 			}
         });
         btnNewButton.setForeground(new Color(255, 255, 255));
         btnNewButton.setBackground(new Color(30,144, 255));
         btnNewButton.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseExited(MouseEvent e) {
					btnNewButton.setBackground(new Color(30,144,255));
				}
				@Override
				public void mouseEntered(MouseEvent e) {
					btnNewButton.setBackground(new Color(30,144,255));
				}
			});
         
         btnNewButton.setFont(new Font("SansSerif", Font.BOLD, 15));
         btnNewButton.setBounds(0, 0, 155, 34);
         panel_2.add(btnNewButton);
         
         
         
        
         
         
         
         
         
         

	}

}
