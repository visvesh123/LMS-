package logins;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

public class Frame4 extends JFrame {
	static String name;

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame4 frame = new Frame4(name);
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
	public Frame4(String name) {
		this.name=name;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 894, 493);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setUndecorated(true);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(215, 0, 630, 468);
		
		JTextArea txtrAutumnQuarter = new JTextArea();
		JTextArea txtrexperimentalHapticsSite = new JTextArea();
		JTextArea txtrExaminationDatesExamination = new JTextArea();
		JTextArea txtrThisCourseProvides = new JTextArea();
		
		
		// text areas
		
		
		txtrAutumnQuarter.setText("AUTUMN QUARTER 2019-20\r\nAugust 1 (Thu) Axess opens for course enrollment. Stanford Bulletin publishes academic year 2019-20 degree requirements\r\n\r\nAugust 26 (Mon) M.D. first and second-year students, first day of instruction\r\n\r\nSeptember 3 (Tue) Law School instruction begins for 1st-year J.D. students and L.L.M. students. See the Law School academic calendar web site.\r\n\r\nSeptember 13 (Fri) M.B.A. 1st-year instructions begins.\r\n\r\nSeptember 13 (Fri, 5:00 p.m.) At-status enrollment deadline in order to receive stipend or financial aid refund within the first week of term.\r\n\r\nSeptember 15 (Sun) Autumn Quarter Cardinal Care Waiver Deadline; see the Cardinal Care web site.\r\n\r\nSeptember 18 (Wed) New undergraduates arrive. Convocation. Undergraduate housing opens for new students; see Residential & Dining Enterprises Calendar.\r\n\r\nSeptember 20 (Fri) Undergraduate housing opens for returning students; see Residential & Dining Enterprises Calendar.\r\n\r\nSeptember 23 (Mon) First day of quarter; instruction begins.\r\n\r\nSeptember 23 (Mon, 5:00 p.m.) Preliminary Study List deadline. Students must be \"at status\"; i.e., students must have a study list with sufficient units to meet requirements for their status, whether full-time, 8-9-10 units (graduate students only), or approved Undergraduate Special Registration Status or Graduate Special Registration Status. The late study list fee is $200.\r\n\r\nSeptember 23 (Mon, 5:00 p.m.) Deadline to submit Leave of Absence for full refund (see undergraduate leaves of absence and graduate leaves of absence). See Tuition and Refund Schedule for a full refund schedule.\r\n\r\nSeptember 23 (Mon) Law School instruction begins for 2nd/3rd-year J.D. and advanced degree students. See the Law School academic calendar web site.\r\n\r\nSeptember 26 (Thu) Conferral of degrees, Summer Quarter 2018-19.\r\n\r\nSeptember 27 (Fri) GSB course add/drop deadline. See the full Graduate School of Business academic calendar.\r\n\r\nOctober 11 (Fri, 5:00 p.m.) Final Study List deadline, except GSB. Last day to add or drop a class; last day to adjust units on a variable-unit course. Last day for tuition reassessment for dropped courses or units. Students may withdraw from a course until the Course Withdrawal deadline and a 'W' notation will appear on the transcript.\r\n\r\nNovember 4 (Mon, 5:00 p.m.) Term withdrawal deadline; last day to submit Leave of Absence to withdraw from the University with a partial refund.\r\n\r\nNovember 15 (Fri, 5:00 p.m.) Change of grading basis deadline, except GSB.\r\n\r\nNovember 15 (Fri, 5:00 p.m.) Course withdrawal deadline, except GSB, Law, and M.D.\r\n\r\nNovember 15 (Fri, 5:00 p.m.) Application deadline for Autumn Quarter degree conferral.\r\n\r\nNovember 22 (Fri) Last day of Law classes. See the Law School academic calendar web site.\r\n\r\nNovember 25-29 (Mon-Fri) Thanksgiving Recess (no classes).\r\n\r\nNovember 30 - December 5 (Sat-Thu) Law School Reading Period. See the Law School academic calendar web site.\r\n\r\nDecember 2-8 (Mon-Sun) End-Quarter Period.\r\n\r\nDecember 6 (Fri) Last day of classes (unless class meets on Sat.), except Law.\r\n\r\nDecember 6 (Fri) Last opportunity to arrange Incomplete in a course, at last class.\r\n\r\nDecember 6 (Fri, noon) University thesis, D.M.A. final project, or Ph.D. dissertation, last day to submit.\r\n\r\nDecember 6 (Fri, 5:00 p.m.) Late application deadline for Autumn Quarter degree conferral ($50 fee).\r\n\r\nDecember 6-13 (Fri-Fri) Law School examinations. See the Law School academic calendar web site.\r\n\r\nDecember 9-13 (Mon-Fri) End-Quarter examinations.\r\n\r\nDecember 14 (Sat, noon) Undergraduate housing closes for Winter Break; see Residential & Dining Enterprises Calendar.\r\n\r\nDecember 17 (Tue, 11:59 p.m.) Grades due.\r\n\r\nDecember 23-January 3 (Mon-Fri) Winter Closure; the University is closed.\r\n\r\nJanuary 9 (Thu) Conferral of degrees, Autumn Quarter.");
		txtrAutumnQuarter.setEditable(false);
		txtrAutumnQuarter.setBackground(SystemColor.control);
		txtrAutumnQuarter.setLineWrap(true);
		
		txtrexperimentalHapticsSite.setText("\u201CExperimental Haptics\u201D\r\nSite logo\r\nHomework Assignments\r\n\r\nAssignment 1 - Force Field Rendering\r\n\r\nCS277-Assignment1.pdf\r\nDue Date: Tuesday, April 15th, 11:59 PM\r\n\r\nAssignment 2 - Implicit Surfaces\r\n\r\nCS277-Assignment2.pdf\r\nCS277-Assignment2-Code.zip\r\nDue Date: Tuesday, April 22nd, 11:59 PM\r\n\r\nNote that this assignment comes with a few extra source files, including a new main application file, that you must drop into the project template. After you copy and open the template project, you will need to replace application.cpp with the one provided, then add ImplicitMesh.cpp/h and MarchingSource.cpp/h to the Visual Studio or Xcode project.\r\n\r\nAssignment 3 - Collision Acceleration\r\n\r\nCS277-Assignment3.pdf\r\nCS277-Assignment3-Code.zip\r\nCS277-Assignment3-Data.zip\r\nDue Date: Tuesday, April 29th, 11:59 PM\r\n\r\nThis assignment comes with an application.cpp file similar to the previous one, and a PointSet class defined in PointSet.cpp/h. You will need to set up a project containing these source files as you did for Assignment 2. Download the data file archive as well and place the PLY files inside your project directory for your program to read.\r\n\r\nAssignment 4 - Dynamics Simulation\r\n\r\nCS277-Assignment4.pdf\r\nDue Date: Thursday, May 8th, 11:59 PM\r\n\r\nCourse Project\r\n\r\nCS277-ProjectInfo-2014.pdf\r\nDue Dates:\r\nProposal - Tuesday, May 6th, 11:59 PM\r\nMilestone - May 20th or May 22nd Lecture Period\r\nDemonstration & Showcase - Friday, May 30th, 1:30 PM\r\n\r\nProject Abstract Templates:\r\nMicrosoft Word\r\nApple Pages\r\n\r\n");
		txtrexperimentalHapticsSite.setBackground(SystemColor.control);
		txtrexperimentalHapticsSite.setEditable(false);
		txtrexperimentalHapticsSite.setLineWrap(true);
		
		txtrExaminationDatesExamination.setText("Examination Dates\tExamination Hours\r\n \t8:30-11:30 a.m.\t12:15-3:15 p.m.\t3:30-6:30 p.m.\t7:00-10:00 p.m.\r\nMonday, March 16, 2020\r\n\r\n(some exams moved to March 20)\r\n\r\nClasses starting at 8:30 on M, W, and/or F; and MTWTh(F)\r\n\r\nand Group, special, and make-up exams:\r\nCS 101, 105, 106A, 106AX, 106B, 106X\r\nGroup language exams:\r\nCHINLANG 1, 2B, 2, 3, 22\r\nFRENLANG 1, 1A, 2, 2A, 3, 21C, 22C, 23C, 124\r\nITALLANG 1, 1A, 2, 2A, 3, 20, 21, 21A, 22A, 113\r\n\r\nJAPANLNG 1, 2, 3, 22, 102\r\n\r\nSLAVLANG  1A, 2, 52, 112, 178, 182\r\n\r\nSPANLANG 1, 1A, 2, 2A, 3, 11C, 11SL, 12C, 12SL, 13C\r\n\r\nClasses starting at 10:30 on M, W, and/or F; and MTWTh(F)\r\n\r\nIf an exam in this time slot was interrupted on March 16 and is to be rescheduled (see instructor), these exams will typically be rescheduled to Friday, March 20, 3:30 - 6:30 p.m.\r\n\r\nExams in this time slot have been moved to Friday, March 20 from 7:00-10:00 p.m.\r\nFriday, March 20, 2020\r\n\r\n(same as original date)\r\n\r\nClasses starting at 11:30 on M, W, and/or F; and MTWTh(F)\tClasses starting at 11:30, 12:00 on T and/or Th\t\r\nClasses starting at 12:30 on M, W, and/or F; and MTWTh(F)\r\n\r\nIf exam was interrupted on March 16, use this time slot as makeup (see instructor) for:\r\n\r\nClasses starting at 10:30 on M, W, and/or F; and MTWTh(F)\r\nClasses starting at 4:30 any day\r\nMonday, March 23, 2020\r\n\r\n(originally Tuesday, March 17)\r\n\r\nClasses starting at 2:30, 3:00 on M, W, and/or F; and MTWTh(F)\tGroup, special, and make-up exams:\r\nMATH 19, 20, 21, 51, 52, 53, 62CM, 62DM\r\nClasses starting at 1:30 on T and/or Th\r\n\r\nGroup, special, and make-up exams:\r\nPHYSICS 23, 41, 41E\r\nTuesday, March 24, 2020\r\n\r\n(originally Wednesday, March 18)\r\n\r\nClasses starting at 8:30, 9:00, 9:30 on T and/or Th\tGroup, special, and make-up exams:\r\nCHEM 31B, 33, 141\r\nClasses starting at 1:30 on M, W, and/or F; and MTWTh(F)\tClasses starting at 3:30 on M, W, and/or F; and MTWTh(F)\r\nWednesday, March 25, 2020\r\n\r\n(originally Thursday, March 19)\r\n\r\nClasses starting at 9:30 on M, W, and/or F; and MTWTh(F)\tClasses starting at 3:00 on T and/or Th\tClasses starting at 10:30 on T and/or Th\tClasses starting at 5:30 or later any day");
		txtrExaminationDatesExamination.setEditable(false);
		txtrExaminationDatesExamination.setBackground(SystemColor.control);
		txtrExaminationDatesExamination.setLineWrap(true);
		

txtrThisCourseProvides.setText("This course provides a broad introduction to machine learning and statistical pattern recognition.\r\n\r\nTopics include: supervised learning (generative/discriminative learning, parametric/non-parametric learning, neural networks, support vector machines); unsupervised learning (clustering, dimensionality reduction, kernel methods); learning theory (bias/variance tradeoffs; VC theory; large margins); reinforcement learning and adaptive control.\r\nThe course will also discuss recent applications of machine learning, such as to robotic control, data mining, autonomous navigation, bioinformatics, speech recognition, and text and web data processing.\r\nStudents are expected to have the following background:\r\n\r\nPrerequisites: - Knowledge of basic computer science principles and skills, at a level sufficient to write a reasonably non-trivial computer program.\r\n- Familiarity with the basic probability theory. (Stat 116 is sufficient but not necessary.)\r\n- Familiarity with the basic linear algebra (any one of Math 51, Math 103, Math 113, or CS 205 would be much more than necessary.)\r\n\r\nSyllabus\r\nDOWNLOAD All Course Materials");
txtrThisCourseProvides.setEditable(false);
txtrThisCourseProvides.setBackground(SystemColor.control);
txtrThisCourseProvides.setLineWrap(true);
		
		
		
		
		// ...
		
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(139, 0, 0));
		panel.setBounds(0, 0, 218, 482);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(220, 0, 670, 493);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setIcon(new ImageIcon("C:\\Users\\LENOVO\\eclipse-workspace\\GUI\\src\\logins\\images\\reg.PNG"));
		lblNewLabel_10.setBounds(33, -23, 608, 183);
				
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\LENOVO\\eclipse-workspace\\GUI\\src\\logins\\images\\reg1.PNG"));
		lblNewLabel_1.setBounds(33, 144, 510, 309);
		
		
		table = new JTable();
		table.setBounds(255, 356, -68, -50);
		panel_1.add(table);
		
		JButton btnNewButton = new JButton("CALENDER");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//	remove(lblNewLabel);
				remove(txtrexperimentalHapticsSite);
				remove(txtrExaminationDatesExamination);
				remove(txtrThisCourseProvides);
				remove(lblNewLabel_1);
				remove(lblNewLabel_10);
				
				remove(scrollPane);
				contentPane.add(scrollPane);
				scrollPane.setViewportView(txtrAutumnQuarter);
				revalidate();
				repaint();
				
			}
			
		});
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
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(139, 0, 0));
		btnNewButton.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnNewButton.setBounds(0, 44, 218, 45);
		panel.add(btnNewButton);
		
		JButton btnPersonalInfo = new JButton("PERSONAL INFO");
		btnPersonalInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				personal_info h=new personal_info(name);
				h.setVisible(true);
				dispose();
			}
		});
		btnPersonalInfo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				btnPersonalInfo.setBackground(new Color(139,0,0));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnPersonalInfo.setBackground(new Color(178,34,34));
			}
		});
		btnPersonalInfo.setForeground(new Color(255, 255, 255));
		btnPersonalInfo.setBackground(new Color(139, 0, 0));
		btnPersonalInfo.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnPersonalInfo.setBounds(0, 0, 218, 45);
		panel.add(btnPersonalInfo);
		
		JButton btnAssignments = new JButton("ASSIGNMENTS");
		btnAssignments.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//	remove(lblNewLabel);
				remove(txtrAutumnQuarter);
				remove(txtrExaminationDatesExamination);
				remove(txtrThisCourseProvides);
				remove(lblNewLabel_1);
				remove(lblNewLabel_10);
				
				remove(scrollPane);
				contentPane.add(scrollPane,BorderLayout.CENTER);
				scrollPane.setViewportView(txtrexperimentalHapticsSite);
				revalidate();
				repaint();
				
			}
		});
		btnAssignments.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				btnAssignments.setBackground(new Color(139,0,0));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnAssignments.setBackground(new Color(178,34,34));
			}
		});
		btnAssignments.setForeground(new Color(255, 255, 255));
		btnAssignments.setBackground(new Color(139, 0, 0));
		btnAssignments.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnAssignments.setBounds(0, 89, 218, 45);
		panel.add(btnAssignments);
		
		JButton btnExamSchedules = new JButton("EXAM SCHEDULES");
		btnExamSchedules.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		
			//	remove(lblNewLabel);
				remove(txtrAutumnQuarter);
				remove(txtrexperimentalHapticsSite);
				remove(txtrThisCourseProvides);
				remove(scrollPane);
				remove(lblNewLabel_1);
				remove(lblNewLabel_10);
				
				contentPane.add(scrollPane);
				scrollPane.setViewportView(txtrExaminationDatesExamination);
				revalidate();
				repaint();
				
			
			}
		});
		btnExamSchedules.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				btnExamSchedules.setBackground(new Color(139,0,0));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnExamSchedules.setBackground(new Color(178,34,34));
			}
		});
		btnExamSchedules.setForeground(new Color(255, 255, 255));
		btnExamSchedules.setBackground(new Color(139, 0, 0));
		btnExamSchedules.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnExamSchedules.setBounds(0, 134, 218, 45);
		panel.add(btnExamSchedules);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home f=new Home(name);
				f.setVisible(true);
				dispose();
			}
		});
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnBack.setBackground(new Color(139, 0, 0));
		 btnBack.addMouseListener(new MouseAdapter(){
			 @Override
			 public void mouseExited(MouseEvent e) {
					btnBack.setBackground(new Color(139,0,0));
				}
				@Override
				public void mouseEntered(MouseEvent e) {
					btnBack.setBackground(new Color(178,34,34));
				}
			});
		btnBack.setBounds(0, 437, 218, 60);
		panel.add(btnBack);
		
		JButton btnCo = new JButton("COURSE \r\nREGISTRATION");
		btnCo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//remove(lblNewLabel);
				remove(txtrAutumnQuarter);
				remove(txtrexperimentalHapticsSite);
				remove(txtrThisCourseProvides);
				remove(scrollPane);
				
				remove(txtrExaminationDatesExamination);
				panel_1.add(lblNewLabel_10);
				panel_1.add(lblNewLabel_1);

				revalidate();
				repaint();
				
			}
		});
		btnCo.setForeground(Color.WHITE);
		btnCo.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnCo.setBackground(new Color(139, 0, 0));
		btnCo.setBounds(0, 179, 218, 45);
		panel.add(btnCo);
		
		
		
		
	}
}
