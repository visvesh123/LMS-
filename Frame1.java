package logins;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;

public class Frame1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 frame = new Frame1();
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
	public Frame1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 923, 492);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(139, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("STUDENT ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				
				if(ae.getSource()==btnNewButton) {
					Frame2 f=new Frame2();
					f.setVisible(true);
					dispose();
				}
			}
		});
		btnNewButton.setForeground(new Color(139, 0, 0));
		btnNewButton.setToolTipText("to login as  a student");
		btnNewButton.setFont(new Font("SansSerif", Font.BOLD, 16));
		 btnNewButton.addMouseListener(new MouseAdapter(){
			 @Override
			 public void mouseExited(MouseEvent e) {
					btnNewButton.setBackground(new Color(240,240,240));
				}
				@Override
				public void mouseEntered(MouseEvent e) {
					btnNewButton.setBackground(new Color(178,34,34));
				}
			});
		btnNewButton.setBounds(90, 325, 175, 40);
		contentPane.add(btnNewButton);
		
		JButton btnFaculty = new JButton("FACULTY");
		btnFaculty.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnFaculty) {
					Frame2 f=new Frame2();
					f.setVisible(true);
					dispose();
				}
			}
		});
		btnFaculty.setForeground(new Color(139, 0, 0));
		btnFaculty.setToolTipText("to login as a faculty");
		btnFaculty.setFont(new Font("SansSerif", Font.BOLD, 16));
		 btnFaculty.addMouseListener(new MouseAdapter(){
			 @Override
			 public void mouseExited(MouseEvent e) {
					btnFaculty.setBackground(new Color(240,240,240));
				}
				@Override
				public void mouseEntered(MouseEvent e) {
					btnFaculty.setBackground(new Color(178,34,34));
				}
			});
		btnFaculty.setBounds(370, 325, 175, 40);
		contentPane.add(btnFaculty);
		
		JButton btnAdmin = new JButton("ADMIN");
		btnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if(ae.getSource()==btnAdmin) {
					Frame2 f=new Frame2();
					f.setVisible(true);
					dispose();
				}
			}
		});
		btnAdmin.setToolTipText("to login as administrator");
		btnAdmin.setForeground(new Color(139, 0, 0));
		btnAdmin.setFont(new Font("SansSerif", Font.BOLD, 16));
		 btnAdmin.addMouseListener(new MouseAdapter(){
			 @Override
			 public void mouseExited(MouseEvent e) {
					btnAdmin.setBackground(new Color(240,240,240));
				}
				@Override
				public void mouseEntered(MouseEvent e) {
					btnAdmin.setBackground(new Color(178,34,34));
				}
			});
		btnAdmin.setBounds(641, 325, 175, 40);
		contentPane.add(btnAdmin);
		//setUndecorated(true);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Frame1.class.getResource("/logins/images/Webp.net-resizeimage (5).jpg")));
		lblNewLabel.setBounds(0, 0, 907, 453);
		contentPane.add(lblNewLabel);
	}
}
