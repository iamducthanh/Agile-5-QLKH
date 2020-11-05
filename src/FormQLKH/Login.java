package FormQLKH;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;


@SuppressWarnings("serial")
public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textUsername;
	private JTextField textEmail;
	private JTextField textPassword;
	static Login frame = new Login();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame.setVisible(true);
					frame.setTitle("Login");
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 383, 262);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaptionBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setFocusable(true);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textUsername = new JTextField(" Usename");
		textUsername.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textUsername.setColumns(10);
		textUsername.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textUsername.setBounds(145, 52, 205, 27);
		contentPane.add(textUsername);
		
		textEmail = new JTextField(" Email");
		textEmail.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textEmail.setColumns(10);
		textEmail.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textEmail.setBounds(145, 128, 205, 27);
		contentPane.add(textEmail);
		
		textPassword = new JTextField();
		textPassword.setText(" Password");
		textPassword.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textPassword.setColumns(10);
		textPassword.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textPassword.setBounds(145, 90, 205, 27);
		contentPane.add(textPassword);
		
		JLabel lblLogin = new JLabel("User Login");
		lblLogin.setForeground(Color.BLUE);
		lblLogin.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblLogin.setBounds(145, 11, 257, 40);
		contentPane.add(lblLogin);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				QLKH qlkh = new QLKH();
				qlkh.mainFrame();	
				frame.setVisible(false);
			}
		});
		btnLogin.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnLogin.setBackground(SystemColor.activeCaptionBorder);
		btnLogin.setBounds(144, 179, 89, 23);
		contentPane.add(btnLogin);
		
		JLabel lblUser = new JLabel("New label");
		lblUser.setIcon(new ImageIcon("src\\Image\\user.jpg"));
		lblUser.setBounds(10, 52, 125, 150);
		contentPane.add(lblUser);
		
		textUsername.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(textUsername.getText().equals(" Usename")) {
					textUsername.setText("");
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(textUsername.getText().equals("")) {
					textUsername.setText(" Usename");
				}
			}
		});
		
		textPassword.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(textPassword.getText().equals(" Password")) {
					textPassword.setText("");
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(textPassword.getText().equals("")) {
					textPassword.setText(" Password");
				}
			}
		});
		
		textEmail.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(textEmail.getText().equals(" Email")) {
					textEmail.setText("");
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(textEmail.getText().equals("")) {
					textEmail.setText(" Email");
				}
			}
		});
		
	}
	
	public void close() {
		
	}
}
