package Package1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class EventHandling4 {
	JFrame f1;
	JButton b1;
	JLabel l1,l2,l3;
	JTextField tx;
	JPasswordField pw;
	
	
	public static void main(String[] args) {
		EventHandling4 ev4 = new EventHandling4();
		ev4.gui();
		
	}
	public void gui() {
		f1 = new JFrame();
		f1.setTitle("My Login Frame");
		f1.setSize(800, 600);
		f1.setResizable(false);
		
		l1 = new JLabel("Enter Login Name : ");
		l1.setBounds(100, 150, 250, 30);
		
		f1.setLayout(null);
		f1.add(l1);
		
		l2 = new JLabel("Enter Password  : ");
		l2.setBounds(100, 200, 250, 30);
		
		f1.setLayout(null);
		f1.add(l2);
		
		tx = new JTextField();
		tx.setBackground(Color.cyan);
		tx.setForeground(Color.red);
		tx.setBounds(230, 150, 250, 30);
		f1.add(tx);
		
		pw = new JPasswordField();
		pw.setBackground(Color.cyan);
		pw.setForeground(Color.red);
		pw.setBounds(230, 200, 250, 30);
		f1.add(pw);
		
		b1 = new JButton("Login");
		b1.setBounds(100, 250, 80, 30);
		f1.add(b1);
		
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				String loginName;
				String password;
				
				loginName = tx.getText();
				password = pw.getText();
				
				System.out.println("loginName + password");
				
				l3 = new JLabel();
				l3.setBounds(100, 300, 400, 30);
				l3.setText("Login Name is : " + loginName + " Password is : " + password);
				f1.add(l3);
				f1.repaint();
				
			}
			
		});
		
		
		
		
		f1.setVisible(true);
	}

}
