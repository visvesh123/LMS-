package logins;

import java.awt.BorderLayout;

import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.SwingConstants;
import java.awt.Desktop;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.plaf.basic.*;
import javax.swing.JTextField;
import javax.swing.JMenu;
import javax.swing.JPopupMenu;
import java.awt.Component;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;


class AutoCompleteComboBox extends JComboBox {
	   public int caretPos = 0;
	   public JTextField tfield = null;
	   public AutoCompleteComboBox(final Object countries[]) {
	      super(countries);
	      setEditor(new BasicComboBoxEditor());
	      setEditable(true);
	   }
	   public void setSelectedIndex(int index) {
	      super.setSelectedIndex(index);
	      tfield.setText(getItemAt(index).toString());
	      tfield.setSelectionEnd(caretPos + tfield.getText().length());
	      tfield.moveCaretPosition(caretPos);
	   }
	   public void setEditor(ComboBoxEditor editor) {
	      super.setEditor(editor);
	      if(editor.getEditorComponent() instanceof JTextField) {
	         tfield = (JTextField) editor.getEditorComponent();
	         tfield.addKeyListener(new KeyAdapter() {
	            public void keyReleased(KeyEvent ke) {
	               char key = ke.getKeyChar();
	               if (!(Character.isLetterOrDigit(key) || Character.isSpaceChar(key) )) return;
	               caretPos = tfield.getCaretPosition();
	               String text="";
	               try {
	                  text = tfield.getText(0, caretPos);
	               } catch (javax.swing.text.BadLocationException e) {
	                  e.printStackTrace();
	               }
	               for (int i=0; i < getItemCount(); i++) {
	                  String element = (String) getItemAt(i);
	                  if (element.startsWith(text)) {
	                     setSelectedIndex(i);
	                     return;
	                  }
	               }
	            }
	         });
	      }
	   }
	}
public class Home extends JFrame {
	static String name;
	private JTextField txtHello;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home(name);
					frame.setVisible(true); 
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/project","root","root");		
	return con;
	
	}


	/**
	 * Create the frame.
	 */
	public Home(String  name) {
		Home.name=name;
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\LENOVO\\Desktop\\CS\\JAVA\\java_projects\\Student_Portal\\home"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1084, 639);
		//setUndecorated(true);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(139, 0, 0));
		panel.setBounds(0, 0, 1068, 606);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		
		JButton btnNewButton = new JButton("ACADEMICS");
		btnNewButton.setBackground(new Color(139, 0, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frame4 f=new Frame4(name);
				f.setVisible(true);
				dispose();
			}
		});
		
		
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\LENOVO\\Downloads\\aca.png"));
		btnNewButton.setBounds(10, 98, 119, 109);
		
		panel.add(btnNewButton);
		
		String[] countries = new String[] {"academics", "food", "payments", "library", "map",
				"amenities", "sports", "clubs/activities", "news/events", "media", "health"};
		
		JComboBox comboBox_1;
		comboBox_1=  new AutoCompleteComboBox(countries);
		comboBox_1.setBounds(472, 17, 279, 41);
		setLocationRelativeTo(null);
		panel.add(comboBox_1);
		
		JButton button = new JButton("");
		button.setBackground(new Color(139, 0, 0));
		button.setIcon(new ImageIcon("C:\\Users\\LENOVO\\Downloads\\book.png"));
		button.setBounds(379, 98, 120, 109);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Library f=new Library(name);
				f.setVisible(true);
				dispose();
			}
		});
		panel.add(button);
		
		JButton button_10 = new JButton("");
		button_10.setBackground(new Color(139, 0, 0));
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				News f= new News(name);
				f.setVisible(true);
				dispose();
				
			}
		});
		button_10.setIcon(new ImageIcon("C:\\Users\\LENOVO\\eclipse-workspace\\GUI\\src\\logins\\images\\communicationsee.png"));
		button_10.setBounds(188, 98, 120, 113);
		panel.add(button_10);
		
		JButton button_1 = new JButton("");
		button_1.setBackground(new Color(139, 0, 0));
		button_1.setIcon(new ImageIcon("C:\\Users\\LENOVO\\Downloads\\teacher.png"));
		button_1.setBounds(573, 98, 112, 109);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				staff f=new staff(name);
				f.setVisible(true);
				dispose();
			}
		});
		panel.add(button_1);
		
		JButton button_2 = new JButton("");
		button_2.setBackground(new Color(139, 0, 0));
		button_2.setIcon(new ImageIcon("C:\\Users\\LENOVO\\eclipse-workspace\\GUI\\src\\logins\\images\\disco-ballee.png"));
		button_2.setBounds(10, 253, 119, 119);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Club f=new Club(name);
				f.setVisible(true);
				dispose();
			}
		});
		panel.add(button_2);
		
		JButton button_3 = new JButton("");
		button_3.setBackground(new Color(139, 0, 0));
		button_3.setIcon(new ImageIcon("C:\\Users\\LENOVO\\Downloads\\photograph.png"));
		button_3.setBounds(188, 253, 120, 119);
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Media f=new Media(name);
				f.setVisible(true);
				dispose();
			}
		});
		panel.add(button_3);
		
		JButton button_4 = new JButton("");
		button_4.setBackground(new Color(139, 0, 0));
		button_4.setIcon(new ImageIcon("C:\\Users\\LENOVO\\Downloads\\knife.png"));
		button_4.setBounds(379, 253, 120, 119);
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Food f=new Food(name);
				f.setVisible(true);
				dispose();
			}
		});
		panel.add(button_4);
		
		JButton button_5 = new JButton("");
		button_5.setBackground(new Color(139, 0, 0));
		button_5.setIcon(new ImageIcon("C:\\Users\\LENOVO\\Downloads\\health-care.png"));
		button_5.setBounds(573, 263, 112, 109);
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				H f=new H(name);
				f.setVisible(true);
				dispose();
			}
		});
		panel.add(button_5);
		
		JButton button_6 = new JButton("");
		button_6.setBackground(new Color(139, 0, 0));
		button_6.setIcon(new ImageIcon("C:\\Users\\LENOVO\\Downloads\\birdie.png"));
		button_6.setBounds(10, 422, 112, 119);
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sports f=new Sports(name);
				f.setVisible(true);
				dispose();
			}
		});
		panel.add(button_6);
		
		JButton button_7 = new JButton("");
		button_7.setBackground(new Color(139, 0, 0));
		button_7.setIcon(new ImageIcon("C:\\Users\\LENOVO\\Downloads\\map.png"));
		button_7.setBounds(188, 422, 112, 119);
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Map f=new Map(name);
				f.setVisible(true);
				dispose();
			}
		});
		panel.add(button_7);
		
		JButton button_8 = new JButton("");
		button_8.setBackground(new Color(139, 0, 0));
		button_8.setIcon(new ImageIcon("C:\\Users\\LENOVO\\Downloads\\payment-method.png"));
		button_8.setBounds(379, 422, 120, 119);
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Payments f=new Payments(name);
				f.setVisible(true);
				dispose();
			}
		});
		panel.add(button_8);
		
		JButton button_9 = new JButton("");
		button_9.setBackground(new Color(139, 0, 0));
		button_9.setIcon(new ImageIcon("C:\\Users\\LENOVO\\Downloads\\sleeping.png"));
		button_9.setBounds(573, 423, 120, 118);
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Amenities f=new Amenities(name);
				f.setVisible(true);
				dispose();
			}
		});
		panel.add(button_9);
		
		JLabel lblNewLabel = new JLabel("ACADEMICS");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblNewLabel.setBounds(0, 214, 152, 28);
		
		panel.add(lblNewLabel);
		
		JLabel lblNewsEvents = new JLabel("NEWS & EVENTS");
		lblNewsEvents.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewsEvents.setForeground(Color.WHITE);
		lblNewsEvents.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblNewsEvents.setBounds(173, 214, 152, 28);
		panel.add(lblNewsEvents);
		
		JLabel lblLiibrary = new JLabel("LIIBRARY");
		lblLiibrary.setHorizontalAlignment(SwingConstants.CENTER);
		lblLiibrary.setForeground(Color.WHITE);
		lblLiibrary.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblLiibrary.setBounds(361, 218, 152, 28);
		panel.add(lblLiibrary);
		
		JLabel lblStaff = new JLabel("STAFF");
		lblStaff.setHorizontalAlignment(SwingConstants.CENTER);
		lblStaff.setForeground(Color.WHITE);
		lblStaff.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblStaff.setBounds(554, 214, 152, 28);
		panel.add(lblStaff);
		
		JLabel lblClubsActivities = new JLabel("CLUBS & ACTIVITIES");
		lblClubsActivities.setHorizontalAlignment(SwingConstants.CENTER);
		lblClubsActivities.setForeground(Color.WHITE);
		lblClubsActivities.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblClubsActivities.setBounds(0, 383, 152, 28);
		panel.add(lblClubsActivities);
		
		JLabel lblMedia = new JLabel("MEDIA");
		lblMedia.setHorizontalAlignment(SwingConstants.CENTER);
		lblMedia.setForeground(Color.WHITE);
		lblMedia.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblMedia.setBounds(173, 383, 152, 28);
		panel.add(lblMedia);
		
		JLabel lblFood = new JLabel("FOOD");
		lblFood.setHorizontalAlignment(SwingConstants.CENTER);
		lblFood.setForeground(Color.WHITE);
		lblFood.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblFood.setBounds(361, 379, 152, 32);
		panel.add(lblFood);
		
		JLabel lblHealth = new JLabel("HEALTH");
		lblHealth.setHorizontalAlignment(SwingConstants.CENTER);
		lblHealth.setForeground(Color.WHITE);
		lblHealth.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblHealth.setBounds(554, 383, 152, 28);
		panel.add(lblHealth);
		
		JLabel lblPayments = new JLabel("PAYMENTS");
		lblPayments.setHorizontalAlignment(SwingConstants.CENTER);
		lblPayments.setForeground(Color.WHITE);
		lblPayments.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblPayments.setBounds(361, 552, 152, 28);
		panel.add(lblPayments);
		
		JLabel lblAmenities = new JLabel("AMENITIES");
		lblAmenities.setHorizontalAlignment(SwingConstants.CENTER);
		lblAmenities.setForeground(Color.WHITE);
		lblAmenities.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblAmenities.setBounds(554, 552, 152, 28);
		panel.add(lblAmenities);
		
		JLabel lblMaps = new JLabel("MAPS");
		lblMaps.setHorizontalAlignment(SwingConstants.CENTER);
		lblMaps.setForeground(Color.WHITE);
		lblMaps.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblMaps.setBounds(173, 552, 152, 28);
		panel.add(lblMaps);
		
		JLabel lblSports = new JLabel("SPORTS");
		lblSports.setHorizontalAlignment(SwingConstants.CENTER);
		lblSports.setForeground(Color.WHITE);
		lblSports.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblSports.setBounds(0, 552, 152, 28);
		panel.add(lblSports);
		
		JButton btnNewButton_2 = new JButton("SIGN OUT");
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\LENOVO\\eclipse-workspace\\GUI\\src\\logins\\images\\logoutef.png"));
		btnNewButton_2.setBackground(new Color(139, 0, 0));
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setFont(new Font("SansSerif", Font.BOLD, 14));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frame1 f=new Frame1();
				f.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setToolTipText("To log out from your account");
		btnNewButton_2.setBounds(994, 1, 74, 69);
		btnNewButton_2.addMouseListener(new MouseAdapter(){
			 @Override
			 public void mouseExited(MouseEvent e) {
					btnNewButton_2.setBackground(new Color(139,0,0));
				}
				@Override
				public void mouseEntered(MouseEvent e) {
					btnNewButton_2.setBackground(new Color(178,34,34));
				}
			});
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("ABOUT US");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\LENOVO\\eclipse-workspace\\GUI\\src\\logins\\images\\about-us.png"));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Desktop d=Desktop.getDesktop();
				try {
					d.browse(new URI("https://www.mahindraecolecentrale.edu.in/"));
				} catch (Exception e1) {
					
					e1.printStackTrace();
				} 
			}
		});
		btnNewButton_1.setBackground(new Color(139, 0, 0));
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("SansSerif", Font.BOLD, 14));
		btnNewButton_1.setBounds(940, 4, 50, 63);
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
		panel.add(btnNewButton_1);
		
		txtHello = new JTextField();
		txtHello.setFont(new Font("Lucida Handwriting", Font.BOLD, 18));
		txtHello.setText("Hello, "+name);
		txtHello.setForeground(new Color(255, 255, 255));
		txtHello.setEditable(false);
		txtHello.setBackground(new Color(139, 0, 0));
		txtHello.setBounds(0, 0, 183, 69);
		panel.add(txtHello);
		txtHello.setColumns(10);
		

		
		JTextArea textArea = new JTextArea();
		textArea.setForeground(new Color(255, 255, 255));
		textArea.setBackground(new Color(139, 0, 0));
		textArea.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		textArea.setLineWrap(true);
		textArea.setEditable(false);
		textArea.setBounds(739, 98, 319, 482);
		panel.add(textArea);
		
		try {
			Connection con=getConnection();
		String s=" Upcoming Events \r\n";
		String query= "Select * from noti" ;
		PreparedStatement stmt = con.prepareStatement(query);
		ResultSet rs= stmt.executeQuery();
		while(rs.next()) {	
			s=s+"\r\n\r\n"+ rs.getString("info");
		}
		textArea.setText(s);
		con.close();
	}
		catch(Exception a) {
			a.getMessage();
		}
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBackground(new Color(139, 0, 0));
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\LENOVO\\eclipse-workspace\\GUI\\src\\logins\\images\\notification.png"));
		lblNewLabel_1.setBounds(837, 17, 70, 63);
		panel.add(lblNewLabel_1);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ans=(String) comboBox_1.getSelectedItem();
				if(ans.equals("sports")) {
					Sports f=new Sports(name);
					f.setVisible(true);
					dispose();
					
				}
				if(ans.equals("payments")) {
					Payments f=new Payments(name);
					f.setVisible(true);
					dispose();
					
				}
				if(ans.equals("academics")) {
					Frame4 f=new Frame4(name);
					f.setVisible(true);
					dispose();
					
				}
				if(ans.equals("library")) {
					Library f=new Library(name);
					f.setVisible(true);
					dispose();
					
				}
				if(ans.equals("amenities")) {
					 Amenities f=new Amenities(name);
					f.setVisible(true);
					dispose();
					
				}
				if(ans.equals("clubs/activities")) {
					Club f=new Club(name);
					f.setVisible(true);
					dispose();
					
				}
				if(ans.equals("news/events")) {
					News f=new News(name);
					f.setVisible(true);
					dispose();
					
				}
				if(ans.equals("media")) {
					Media f=new Media(name);
					f.setVisible(true);
					dispose();
					
				}
				if(ans.equals("health")) {
					H f=new H(name);
					f.setVisible(true);
					dispose();
					
				}
				if(ans.equals("food")) {
					 Food f=new Food(name);
					f.setVisible(true);
					dispose();
					
				}
				if(ans.equals("map")) {
					Map f=new Map(name);
					f.setVisible(true);
					dispose();
					
				}
				
				
				
				
			}
		});
		btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\LENOVO\\eclipse-workspace\\GUI\\src\\logins\\images\\zoomeef.png"));
		btnNewButton_3.setBounds(751, 17, 44, 40);
		panel.add(btnNewButton_3);
		
		JButton button_11 = new JButton("Request Chat");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Chat h=new Chat(name);
				h.setVisible(true);
				dispose();
			}
		});
		button_11.setForeground(Color.WHITE);
		button_11.setFont(new Font("SansSerif", Font.BOLD, 15));
		button_11.setBackground(new Color(165, 42, 42));
		button_11.setBounds(269, 26, 132, 28);
		panel.add(button_11);
		
		
		
		
	}
	
}
