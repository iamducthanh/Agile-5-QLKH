package FormQLKH;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.beans.PropertyChangeListener;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

@SuppressWarnings("serial")
public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textUsername;
	private JTextField textEmail;
	private JTextField textPassword;
	static Login frame = new Login();
	private String username = "agile5";
	private String password = "agile5";

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
	Action loginAction = new AbstractAction() {	
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			login();
		}
	};
	
	public Login() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 376, 262);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setFocusable(true);
		setContentPane(contentPane);
		contentPane.setLayout(null);

		textUsername = new JTextField(" Usename");
		textUsername.setForeground(Color.WHITE);
		textUsername.setBackground(new Color(0, 0, 0, 200));
		textUsername.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textUsername.setColumns(10);
		textUsername.setBorder(new LineBorder(Color.WHITE));
		textUsername.setBounds(145, 52, 205, 27);
		contentPane.add(textUsername);

		textEmail = new JTextField(" Email");
		textEmail.setForeground(Color.WHITE);
		textEmail.setBackground(new Color(0, 0, 0, 200));
		textEmail.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textEmail.setColumns(10);
		textEmail.setBorder(new LineBorder(Color.WHITE));
		textEmail.setBounds(145, 128, 205, 27);
		contentPane.add(textEmail);

		textPassword = new JTextField();
		textPassword.setForeground(Color.WHITE);
		textPassword.setBackground(new Color(0, 0, 0, 200));
		textPassword.setText(" Password");
		textPassword.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textPassword.setColumns(10);
		textPassword.setBorder(new LineBorder(Color.WHITE));
		textPassword.setBounds(145, 90, 205, 27);
		contentPane.add(textPassword);

		JLabel lblLogin = new JLabel("User Login");
		lblLogin.setForeground(Color.WHITE);
		lblLogin.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblLogin.setBounds(145, 11, 257, 40);
		contentPane.add(lblLogin);

		JButton btnLogin = new JButton("Login");
		btnLogin.setForeground(Color.WHITE);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login();
			}
		});
		btnLogin.setBorder(new LineBorder(new Color(255, 255, 255)));
		btnLogin.setBackground(SystemColor.activeCaptionBorder);
		btnLogin.setBounds(144, 179, 89, 23);
		contentPane.add(btnLogin);

		JLabel lblUser = new JLabel("New label");
		lblUser.setIcon(new ImageIcon("src\\Image\\user.jpg"));
		lblUser.setBounds(13, 52, 122, 150);
		contentPane.add(lblUser);

		textUsername.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (textUsername.getText().equals(" Usename")) {
					textUsername.setText("");
				}
			}

			@Override
			public void focusLost(FocusEvent e) {
				if (textUsername.getText().equals("")) {
					textUsername.setText(" Usename");
				}
			}
		});

		textPassword.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (textPassword.getText().equals(" Password")) {
					textPassword.setText("");
				}
			}

			@Override
			public void focusLost(FocusEvent e) {
				if (textPassword.getText().equals("")) {
					textPassword.setText(" Password");
				}
			}
		});

		textEmail.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (textEmail.getText().equals(" Email")) {
					textEmail.setText("");
				}
			}

			@Override
			public void focusLost(FocusEvent e) {
				if (textEmail.getText().equals("")) {
					textEmail.setText(" Email");
				}
			}
		});

		JLabel bkg = new JLabel();
		bkg.setBounds(0, 0, 385, 262);
		bkg.setIcon(new ImageIcon("src\\Image\\backLogin.jpg"));
		contentPane.add(bkg);
		btnLogin.setContentAreaFilled(false);
		
		textUsername.addActionListener(loginAction);
		textPassword.addActionListener(loginAction);
		textEmail.addActionListener(loginAction);

	}
	
	public void login() {
		@SuppressWarnings("unused")
		String userString = textUsername.getText();
		@SuppressWarnings("unused")
		String pasString = textPassword.getText();
//		if(userString.equals(username) && pasString.equals(password)) {
			QLKH qlkh = new QLKH();
			qlkh.mainFrame();
			frame.setVisible(false);
//		} else {
//			JOptionPane.showMessageDialog(null, "Sai thong tin dang nhap");
//		}
	}
}
