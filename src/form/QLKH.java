package form;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import entities.SanPham;
import help.Text;
import help.Validate;

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
    public static List<SanPham> list = new ArrayList<>();
    SanPham SP = new SanPham();
     StringBuilder error = new StringBuilder();

    /**
     * Launch the application.
     */
    public void mainFrame() {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    QLKH frame = new QLKH();
                    frame.setTitle("QUẢN L�? KH�?CH KHO HÀNG");
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
    JButton btnMoi = new JButton("  Mới     ");
    JButton btnAdd = new JButton(" Thêm   ");
    JButton btnUpdate = new JButton("  Sửa     ");
    JButton btnDelete = new JButton("  Xóa      ");
    JButton btnHistory = new JButton(" Lịch sử");
    JButton btnOpen = new JButton(" Mở       ");
    JButton btnFind = new JButton(" Tìm       ");
    JButton btnExit = new JButton(" Thoát    ");

    MouseListener hover = new MouseListener() {

        @Override
        public void mouseExited(MouseEvent e) {
            // TODO Auto-generated method stub
            JButton btnHover = (JButton) e.getComponent();
            int x = btnHover.getX();
            int y = btnHover.getY();
            int width = btnHover.getWidth();
            int height = btnHover.getHeight();
            btnHover.setBounds(x + 3, y + 3, width - 6, height - 6);
            btnHover.setBorder(new LineBorder(new Color(64, 64, 64), 1));
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            // TODO Auto-generated method stub
            JButton btnHover = (JButton) e.getComponent();
            int x = btnHover.getX();
            int y = btnHover.getY();
            int width = btnHover.getWidth();
            int height = btnHover.getHeight();
            btnHover.setBounds(x - 3, y - 3, width + 6, height + 6);
            btnHover.setBorder(new LineBorder(new Color(64, 64, 64), 2));
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            // TODO Auto-generated method stub

        }

        @Override
        public void mousePressed(MouseEvent e) {
            // TODO Auto-generated method stub

        }

        @Override
        public void mouseReleased(MouseEvent e) {
            // TODO Auto-generated method stub

        }

    };

    public QLKH() {
        setBackground(SystemColor.activeCaptionBorder);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 692, 560);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblQLKH = new JLabel("QUẢN L�? KHO HÀNG");
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

        btnMoi.setForeground(Color.BLACK);

        btnMoi.setBackground(SystemColor.activeCaptionBorder);
        btnMoi.setBounds(468, 121, 89, 23);
        contentPane.add(btnMoi);

        JScrollPane scrollPaneFormTable = new JScrollPane();
        scrollPaneFormTable.setBounds(10, 350, 658, 157);
        scrollPaneFormTable.setBackground(new Color(0, 0, 0, 0));
        contentPane.add(scrollPaneFormTable);

        table = new JTable();
        scrollPaneFormTable.setViewportView(table);
        btnAdd.setForeground(Color.BLACK);

        btnAdd.setBackground(SystemColor.activeCaptionBorder);
        btnAdd.setBounds(468, 159, 89, 23);
        contentPane.add(btnAdd);
        btnUpdate.setForeground(Color.BLACK);

        btnUpdate.setBackground(SystemColor.activeCaptionBorder);
        btnUpdate.setBounds(468, 197, 89, 23);
        contentPane.add(btnUpdate);
        btnDelete.setForeground(Color.BLACK);

        btnDelete.setBackground(SystemColor.activeCaptionBorder);
        btnDelete.setBounds(468, 235, 89, 23);
        contentPane.add(btnDelete);
        btnHistory.setForeground(Color.BLACK);

        btnHistory.setBackground(SystemColor.activeCaptionBorder);
        btnHistory.setBounds(567, 197, 89, 23);
        contentPane.add(btnHistory);

        JLabel lblDanhSch = new JLabel("Danh sách");
        lblDanhSch.setFont(new Font("Tahoma", Font.BOLD, 17));
        lblDanhSch.setBounds(10, 320, 272, 19);
        contentPane.add(lblDanhSch);

        btnMoi.setBorder(new LineBorder(new Color(64, 64, 64), 1));
        btnAdd.setBorder(new LineBorder(Color.DARK_GRAY));
        btnDelete.setBorder(new LineBorder(Color.DARK_GRAY));
        btnHistory.setBorder(new LineBorder(new Color(64, 64, 64)));
        btnUpdate.setBorder(new LineBorder(Color.DARK_GRAY));

        btnMoi.setContentAreaFilled(false);
        btnHistory.setContentAreaFilled(false);
        btnDelete.setContentAreaFilled(false);
        btnUpdate.setContentAreaFilled(false);
        btnAdd.setContentAreaFilled(false);

        textGia.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        textHanSuDung.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        textMaSP.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        textSoLuong.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        textTen.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        btnOpen.setForeground(Color.BLACK);

        btnOpen.setIcon(new ImageIcon("src\\Image\\open.png"));
        btnOpen.setContentAreaFilled(false);
        btnOpen.setBorder(new LineBorder(new Color(64, 64, 64)));
        btnOpen.setBackground(SystemColor.activeCaptionBorder);
        btnOpen.setBounds(567, 121, 89, 23);
        contentPane.add(btnOpen);

        btnFind.setIcon(new ImageIcon("src\\Image\\find.png"));
        btnFind.setForeground(Color.BLACK);
        btnFind.setContentAreaFilled(false);
        btnFind.setBorder(new LineBorder(new Color(64, 64, 64)));
        btnFind.setBackground(SystemColor.activeCaptionBorder);
        btnFind.setBounds(567, 159, 89, 23);
        contentPane.add(btnFind);
        btnExit.setForeground(Color.BLACK);

        btnExit.setIcon(new ImageIcon("src\\Image\\exit.png"));
        btnExit.setContentAreaFilled(false);
        btnExit.setBorder(new LineBorder(new Color(64, 64, 64)));
        btnExit.setBackground(SystemColor.activeCaptionBorder);
        btnExit.setBounds(567, 235, 89, 23);
        contentPane.add(btnExit);

        table();
        image();
        hover();

        //action
        btnAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                error.setLength(0);
                error.append(Validate.checkMa(textMaSP.getText()));
                error.append(Validate.checkTen(textTen.getText()));
                error.append(Validate.checkGia(textGia.getText()));
                error.append(Validate.checkSL(textSoLuong.getText()));
                error.append(Validate.checkHSD(textHanSuDung.getText()));

                if (error.length() == 0) {
                    list.add(new SanPham(textMaSP.getText(), textTen.getText(), textHanSuDung.getText(), Double.parseDouble(textGia.getText()), Integer.parseInt(textSoLuong.getText())));
                    filltable();

                } else {
                    JOptionPane.showMessageDialog(null, error.toString(), "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        btnMoi.addActionListener(new ActionListener() {
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
    }

    public void filltable() {
        model.setRowCount(0);
        for (SanPham sp : list) {
            model.addRow(new Object[]{
                sp.getMasp(), sp.getTen(), sp.getGia(), sp.getSoLuong(), sp.getHsd(), sp.getTrangThai()
            });
        }
    }

    public void image() {
        btnMoi.setIcon(new ImageIcon("src\\Image\\clear.png"));
        btnHistory.setIcon(new ImageIcon("src\\Image\\history.png"));
        btnAdd.setIcon(new ImageIcon("src\\Image\\luu.png"));
        btnUpdate.setIcon(new ImageIcon("src\\Image\\update.png"));
        btnDelete.setIcon(new ImageIcon("src\\Image\\delete.png"));

        JLabel bkg = new JLabel();
        bkg.setIcon(new ImageIcon("src\\Image\\background.jpg"));
        bkg.setBounds(0, 0, 678, 534);
        contentPane.add(bkg);
    }

    public void hover() {
        btnAdd.addMouseListener(hover);
        btnDelete.addMouseListener(hover);
        btnHistory.addMouseListener(hover);
        btnMoi.addMouseListener(hover);
        btnUpdate.addMouseListener(hover);
        btnExit.addMouseListener(hover);
        btnOpen.addMouseListener(hover);
        btnFind.addMouseListener(hover);
    }
}
