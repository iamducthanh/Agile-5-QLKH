package FormQLKH;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

@SuppressWarnings("serial")
public class QLKH extends JFrame {

	private JPanel contentPane;
	private JTextField textHanSuDung;
	private JTextField textMaSP;
	private JTextField textTen;
	private JTextField textGia;
	private JTextField textSoLuong;
	private JTable table;
	DefaultTableModel model = new DefaultTableModel();

	/**
	 * Launch the application.
	 */
	
	public void mainFrame() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QLKH frame = new QLKH();
					frame.setTitle("QUẢN LÝ KHÁCH KHO HÀNG");
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
	
	JButton btnClear = new JButton("  Clear   ");
	JButton btnAdd = new JButton(" Thêm   ");
	JButton btnUpdate = new JButton("  Sửa     ");
	JButton btnDelete = new JButton("  Xóa      ");
	JButton btnHistory = new JButton(" Lịch sử");
	
	public QLKH() {
		setBackground(SystemColor.activeCaptionBorder);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 601, 560);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblQLKH = new JLabel("QUẢN LÝ KHO HÀNG");
		lblQLKH.setForeground(Color.BLUE);
		lblQLKH.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblQLKH.setBounds(100, 24, 477, 40);
		contentPane.add(lblQLKH);

		Text text = new Text(lblQLKH);

		JLabel lblTTCT = new JLabel("Thông tin chi tiết");
		lblTTCT.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblTTCT.setBounds(10, 87, 272, 19);
		contentPane.add(lblTTCT);

		JLabel lblMaSP = new JLabel("Mã sản phẩm");
		lblMaSP.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMaSP.setBounds(24, 121, 100, 19);
		contentPane.add(lblMaSP);

		JLabel lblTen = new JLabel("Tên");
		lblTen.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTen.setBounds(24, 159, 100, 19);
		contentPane.add(lblTen);

		JLabel lblGia = new JLabel("Giá");
		lblGia.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblGia.setBounds(24, 197, 100, 19);
		contentPane.add(lblGia);

		JLabel lblSoLuong = new JLabel("Số lượng");
		lblSoLuong.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSoLuong.setBounds(24, 235, 100, 19);
		contentPane.add(lblSoLuong);

		JLabel lblHanSuDung = new JLabel("Hạn sử dụng");
		lblHanSuDung.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblHanSuDung.setBounds(24, 273, 100, 19);
		contentPane.add(lblHanSuDung);

		textHanSuDung = new JTextField();
		textHanSuDung.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textHanSuDung.setBounds(147, 269, 292, 27);
		contentPane.add(textHanSuDung);
		textHanSuDung.setColumns(10);

		textMaSP = new JTextField();
		textMaSP.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textMaSP.setColumns(10);
		textMaSP.setBounds(147, 117, 292, 27);
		contentPane.add(textMaSP);

		textTen = new JTextField();
		textTen.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textTen.setColumns(10);
		textTen.setBounds(147, 155, 292, 27);
		contentPane.add(textTen);

		textGia = new JTextField();
		textGia.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textGia.setColumns(10);
		textGia.setBounds(147, 193, 292, 27);
		contentPane.add(textGia);

		textSoLuong = new JTextField();
		textSoLuong.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textSoLuong.setColumns(10);
		textSoLuong.setBounds(147, 231, 292, 27);
		contentPane.add(textSoLuong);
		text.start();

		btnClear.setForeground(Color.BLACK);

		btnClear.setBackground(SystemColor.activeCaptionBorder);
		btnClear.setBounds(468, 121, 89, 23);
		contentPane.add(btnClear);

		JScrollPane scrollPaneFormTable = new JScrollPane();
		scrollPaneFormTable.setBounds(10, 350, 567, 157);
		scrollPaneFormTable.setBackground(new Color(0,0,0,0));
		contentPane.add(scrollPaneFormTable);

		table = new JTable();
		scrollPaneFormTable.setViewportView(table);
		btnAdd.setForeground(Color.BLACK);

		btnAdd.setBackground(SystemColor.activeCaptionBorder);
		btnAdd.setBounds(468, 159, 89, 23);
		contentPane.add(btnAdd);

		btnUpdate.setBackground(SystemColor.activeCaptionBorder);
		btnUpdate.setBounds(468, 197, 89, 23);
		contentPane.add(btnUpdate);

		btnDelete.setBackground(SystemColor.activeCaptionBorder);
		btnDelete.setBounds(468, 235, 89, 23);
		contentPane.add(btnDelete);

		btnHistory.setBackground(SystemColor.activeCaptionBorder);
		btnHistory.setBounds(468, 273, 89, 23);
		contentPane.add(btnHistory);
		
		JLabel lblDanhSch = new JLabel("Danh sách");
		lblDanhSch.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblDanhSch.setBounds(10, 320, 272, 19);
		contentPane.add(lblDanhSch);
		
		btnClear.setBorder(new LineBorder(new Color(64, 64, 64), 1));
		btnAdd.setBorder(new LineBorder(Color.DARK_GRAY));
		btnDelete.setBorder(new LineBorder(Color.DARK_GRAY));
		btnHistory.setBorder(new LineBorder(Color.DARK_GRAY));
		btnUpdate.setBorder(new LineBorder(Color.DARK_GRAY));
		
		btnClear.setContentAreaFilled(false);
		btnHistory.setContentAreaFilled(false);
		btnDelete.setContentAreaFilled(false);
		btnUpdate.setContentAreaFilled(false);
		btnAdd.setContentAreaFilled(false);
		
		textGia.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textHanSuDung.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textMaSP.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textSoLuong.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textTen.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));

		
		table();
		image();
		hover();
		
		//action
		
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		btnHistory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				History history = new History();
				history.mainHistory();
			}
		});
	}
	
	public void table() {
		JTableHeader header = table.getTableHeader();
		header.setBackground(new Color(179, 115, 52, 200));
		model.addColumn("Mã sản phẩm");
		model.addColumn("Tên");
		model.addColumn("Giá");
		model.addColumn("Số lượng");
		model.addColumn("Hạn sử dụng");
		model.addColumn("Trạng thái");

		table.setModel(model);
		table.setBackground(Color.blue);
	}
	
	public void image() {
		btnClear.setIcon(new ImageIcon("src\\Image\\clear.png"));
		btnHistory.setIcon(new ImageIcon("src\\Image\\history.png"));
		btnAdd.setIcon(new ImageIcon("src\\Image\\luu.png"));
		btnUpdate.setIcon(new ImageIcon("src\\Image\\update.png"));
		btnDelete.setIcon(new ImageIcon("src\\Image\\delete.png"));
		
		JLabel bkg = new JLabel();
		bkg.setIcon(new ImageIcon("src\\Image\\background.jpg"));
		bkg.setBounds(0, 0, 601, 534);
		contentPane.add(bkg);
	}
	
	public void hover() {
		btnClear.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {		
				btnClear.setBounds(465, 118, 95, 29);
				btnClear.setBorder(new LineBorder(new Color(64, 64, 64), 2));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnClear.setBounds(468, 121, 89, 23);
				btnClear.setBorder(new LineBorder(new Color(64, 64, 64), 1));
			}
		});
		
		btnAdd.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {			
				btnAdd.setBounds(465, 156, 95, 29);
				btnAdd.setBorder(new LineBorder(new Color(64, 64, 64), 2));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnAdd.setBounds(468, 159, 89, 23);
				btnAdd.setBorder(new LineBorder(new Color(64, 64, 64), 1));
			}
		});
		
		btnDelete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnDelete.setBounds(465, 232, 95, 29);
				btnDelete.setBorder(new LineBorder(new Color(64, 64, 64), 2));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnDelete.setBounds(468, 235, 89, 23);
				btnDelete.setBorder(new LineBorder(new Color(64, 64, 64), 1));
			}
		});
		
		btnHistory.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnHistory.setBounds(465, 270, 95, 29);
				btnHistory.setBorder(new LineBorder(new Color(64, 64, 64), 2));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnHistory.setBounds(468, 273, 89, 23);
				btnHistory.setBorder(new LineBorder(new Color(64, 64, 64), 1));
			}
		});
		
		btnUpdate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnUpdate.setBounds(465, 194, 95, 29);
				btnUpdate.setBorder(new LineBorder(new Color(64, 64, 64), 2));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnUpdate.setBounds(468, 197, 89, 23);
				btnUpdate.setBorder(new LineBorder(new Color(64, 64, 64), 1));
			}
		});
		
	}
}
