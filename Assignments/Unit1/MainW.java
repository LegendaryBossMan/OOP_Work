import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainW {

 private JFrame frame;
 private JTextField txtFName;
 private JTextField txtLName;
 private JTextField txtMessage;

 /**
  * Launch the application.
  */
 public static void main(String[] args) {
  EventQueue.invokeLater(new Runnable() {
   public void run() {
    try {
     MainW window = new MainW();
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
 public MainW() {
  initialize();
 }

 /**
  * Initialize the contents of the frame.
  */
 private void initialize() {
  frame = new JFrame();
  frame.getContentPane().setBackground(new Color(128, 0, 128));
  frame.getContentPane().setEnabled(false);
  frame.setBounds(100, 100, 690, 300);
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.getContentPane().setLayout(null);
  
  JLabel lblFirstName = new JLabel("First Name:");
  lblFirstName.setForeground(new Color(255, 255, 255));
  lblFirstName.setHorizontalAlignment(SwingConstants.CENTER);
  lblFirstName.setBounds(0, 11, 70, 14);
  frame.getContentPane().add(lblFirstName);
  
  txtFName = new JTextField();
  txtFName.setBounds(82, 8, 86, 20);
  frame.getContentPane().add(txtFName);
  txtFName.setColumns(10);
  
  txtLName = new JTextField();
  txtLName.setBounds(82, 33, 86, 20);
  frame.getContentPane().add(txtLName);
  txtLName.setColumns(10);
  
  JLabel lblLastName = new JLabel("Last Name:");
  lblLastName.setForeground(new Color(255, 255, 255));
  lblLastName.setBackground(new Color(255, 255, 255));
  lblLastName.setHorizontalAlignment(SwingConstants.CENTER);
  lblLastName.setBounds(0, 36, 70, 14);
  frame.getContentPane().add(lblLastName);
  
  JButton btnHitMe = new JButton("Hit Me!!");
  btnHitMe.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    
    //button click event
    txtMessage.setText("Hello "+ txtFName.getText()+" "+ txtLName.getText());
//          if(txtMessage == "Hello Thomas Sullivan")
//          {
//          txtMessage.setText("Hello He-Man"); 
//          }
          }
  });
  btnHitMe.setBounds(417, 100, 89, 23);
  frame.getContentPane().add(btnHitMe);
  
  txtMessage = new JTextField();
  txtMessage.setForeground(new Color(0, 0, 0));
  txtMessage.setBackground(new Color(255, 255, 255));
  txtMessage.setBounds(10, 230, 654, 20);
  frame.getContentPane().add(txtMessage);
  txtMessage.setColumns(10);
 }
}
