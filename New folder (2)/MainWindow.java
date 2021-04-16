import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class MainWindow {

	private JFrame frame;
	private JTextField txtFirstName;
	private JTextField textField_1;
	private JTextField txtMessage;
	private JTextField txtLastName;
	private JLabel lblLastName;
	private JLabel lblSsn;
	private JTextField txtSSN;
	private JLabel lblMajor;
	private JTextField txtMajor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(200, 200, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setBounds(10, 42, 77, 14);
		frame.getContentPane().add(lblFirstName);
		
		txtFirstName = new JTextField();
		txtFirstName.setBounds(84, 39, 86, 20);
		frame.getContentPane().add(txtFirstName);
		txtFirstName.setColumns(10);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try 
				{
				Student s1 = new Student(txtFirstName.getText(),
						txtLastName.getText(),
						txtSSN.getText(),txtMajor.getText()
						); 
				txtMessage.setText("Sucessfully added Student");
				}
				catch (Exception Ex)
				{
					txtMessage.setText(Ex.getMessage());
				}
				}
		});
		btnSave.setBounds(295, 196, 89, 23);
		frame.getContentPane().add(btnSave);
		
	
		txtMessage = new JTextField();
		txtMessage.setBounds(10, 230, 414, 20);
		frame.getContentPane().add(txtMessage);
		txtMessage.setColumns(10);
		
		txtLastName = new JTextField();
		txtLastName.setBounds(84, 67, 86, 20);
		frame.getContentPane().add(txtLastName);
		txtLastName.setColumns(10);
		
		lblLastName = new JLabel("Last Name:");
		lblLastName.setBounds(10, 70, 54, 14);
		frame.getContentPane().add(lblLastName);
		
		lblSsn = new JLabel("SSN:");
		lblSsn.setBounds(10, 11, 46, 14);
		frame.getContentPane().add(lblSsn);
		
		txtSSN = new JTextField();
		txtSSN.setBounds(84, 8, 86, 20);
		frame.getContentPane().add(txtSSN);
		txtSSN.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 125, 152, 94);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JRadioButton rdbtnStudent = new JRadioButton("Student");
		rdbtnStudent.setBounds(46, 8, 63, 23);
		panel.add(rdbtnStudent);
		
		JRadioButton rdbtnFaculty = new JRadioButton("Faculty");
		rdbtnFaculty.setBounds(46, 48, 61, 23);
		panel.add(rdbtnFaculty);
		
		lblMajor = new JLabel("Major");
		lblMajor.setBounds(172, 160, 54, 19);
		frame.getContentPane().add(lblMajor);
		
		txtMajor = new JTextField();
		txtMajor.setBounds(236, 159, 148, 20);
		frame.getContentPane().add(txtMajor);
		txtMajor.setColumns(10);
	}
}
