package FormQLKH;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

@SuppressWarnings("serial")
public class History extends JFrame {

	private JPanel contentPane;
	private JTable table;
	DefaultTableModel model = new DefaultTableModel();
	static History frame = new History();

	/**
	 * Launch the application.
	 */
	
	public void mainHistory() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame.setVisible(true);
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
	public History() {
		setTitle("Lịch sử");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 340);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("L\u1ECBch s\u1EED");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(20, 11, 354, 28);
		contentPane.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 50, 395, 202);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		JTableHeader header = new JTableHeader();
		header.setBackground(Color.red);
		model.addColumn("Lịch sử");
		table.setModel(model);
		JButton btnQuayLi = new JButton("Quay lại");
		btnQuayLi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
			}
		});
		btnQuayLi.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnQuayLi.setBackground(SystemColor.activeCaptionBorder);
		btnQuayLi.setBounds(326, 269, 89, 23);
		contentPane.add(btnQuayLi);
		JLabel lblBkg = new JLabel();
		lblBkg.setBounds(0, 0, 450, 340);
		lblBkg.setIcon(new ImageIcon("src\\Image\\background.jpg"));
		contentPane.add(lblBkg);
		btnQuayLi.setContentAreaFilled(false);
		JTableHeader header1 = table.getTableHeader();
		header1.setBackground(new Color(179, 115, 52, 200));
	}
}
