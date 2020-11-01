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
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JComboBox;
import javax.swing.JTextArea;

public class Compaint extends JFrame {
	static String name;

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Compaint frame = new Compaint(name);
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
	public Compaint(String name) {
		this.name=name;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 717, 493);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(165, 42, 42));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(170, 83, 151, 39);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Complaint/Suggestions Form ");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 17));
		lblNewLabel.setBounds(268, 0, 270, 56);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name:");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(58, 81, 127, 39);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setHorizontalAlignment(SwingConstants.CENTER);
		lblId.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblId.setBounds(394, 83, 127, 39);
		contentPane.add(lblId);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(485, 83, 107, 39);
		contentPane.add(textField_1);
		
		JLabel lblWriteYourComplaint = new JLabel("Write your complaint below (along with hostel name and room number)");
		lblWriteYourComplaint.setForeground(new Color(255, 255, 255));
		lblWriteYourComplaint.setHorizontalAlignment(SwingConstants.CENTER);
		lblWriteYourComplaint.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblWriteYourComplaint.setBounds(58, 133, 534, 39);
		contentPane.add(lblWriteYourComplaint);
		
		JLabel label_1 = new JLabel("Name:");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_1.setBounds(195, 83, 127, 39);
		contentPane.add(label_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(102, 183, 466, 171);
		contentPane.add(textArea);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(165, 42, 42));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
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
		btnNewButton.setBounds(290, 388, 151, 33);
		contentPane.add(btnNewButton);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setForeground(new Color(255, 255, 255));
		btnBack.setBackground(new Color(139, 0, 0));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Amenities h=new Amenities(name);
				h.setVisible(true);
				dispose();
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnBack.setBounds(0, 410, 89, 33);
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
		contentPane.add(btnBack);
	}
}
