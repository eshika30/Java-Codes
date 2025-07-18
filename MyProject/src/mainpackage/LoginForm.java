package mainpackage;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class LoginForm {

	private JFrame frmNInfinityEngineering;
	private JTextField txtLoginName;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginForm window = new LoginForm();
					window.frmNInfinityEngineering.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmNInfinityEngineering = new JFrame();
		frmNInfinityEngineering.setIconImage(Toolkit.getDefaultToolkit().getImage(LoginForm.class.getResource("/Images/logo.jpg")));
		frmNInfinityEngineering.setTitle("N Infinity Engineering Academy");
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int width = screenSize.width;
		int height = screenSize.height;
		frmNInfinityEngineering.setSize(width/2,height/2);
		frmNInfinityEngineering.setLocationRelativeTo(null);
		 
		//frame.setBounds(100, 100, 450, 300);
		frmNInfinityEngineering.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmNInfinityEngineering.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("N Infinity Engineering Academy");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 38));
		lblNewLabel.setBounds(10, 0, 734, 72);
		frmNInfinityEngineering.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(0, 0, 0));
		separator.setBounds(20, 70, 712, 2);
		frmNInfinityEngineering.getContentPane().add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("Login Name");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(46, 117, 127, 31);
		frmNInfinityEngineering.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(46, 176, 113, 31);
		frmNInfinityEngineering.getContentPane().add(lblNewLabel_2);
		
		txtLoginName = new JTextField();
		txtLoginName.setBounds(218, 119, 463, 31);
		frmNInfinityEngineering.getContentPane().add(txtLoginName);
		txtLoginName.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(218, 178, 463, 31);
		frmNInfinityEngineering.getContentPane().add(passwordField);
	}
}
