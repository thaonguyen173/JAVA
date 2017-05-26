package form;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class tinhtien extends JFrame {

	private JPanel contentPane;
	private JTextField txtsoluong;
	private JTextField txtdongia;
	private JTextField txtthanhtien;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tinhtien frame = new tinhtien();
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
	public tinhtien() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTnhGiTr = new JLabel("T\u00CDNH GI\u00C1 TR\u1ECA H\u00D3A \u0110\u01A0N");
		lblTnhGiTr.setForeground(new Color(0, 0, 255));
		lblTnhGiTr.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTnhGiTr.setBounds(128, 22, 180, 14);
		contentPane.add(lblTnhGiTr);
		
		JLabel lblSLng = new JLabel("S\u1ED1 l\u01B0\u1EE3ng:");
		lblSLng.setBounds(79, 56, 57, 14);
		contentPane.add(lblSLng);
		
		JLabel lblnGi = new JLabel("\u0110\u01A1n gi\u00E1:");
		lblnGi.setBounds(79, 92, 57, 14);
		contentPane.add(lblnGi);
		
		JLabel lblThnhTin = new JLabel("Th\u00E0nh ti\u1EC1n:");
		lblThnhTin.setBounds(79, 126, 72, 14);
		contentPane.add(lblThnhTin);
		
		txtsoluong = new JTextField();
		txtsoluong.setBounds(161, 53, 143, 20);
		contentPane.add(txtsoluong);
		txtsoluong.setColumns(10);
		
		txtdongia = new JTextField();
		txtdongia.setColumns(10);
		txtdongia.setBounds(161, 89, 143, 20);
		contentPane.add(txtdongia);
		
		txtthanhtien = new JTextField();
		txtthanhtien.setColumns(10);
		txtthanhtien.setBounds(161, 123, 143, 20);
		contentPane.add(txtthanhtien);
		
		JLabel lblVnd = new JLabel("VN\u0110");
		lblVnd.setBounds(318, 92, 46, 14);
		contentPane.add(lblVnd);
		
		JLabel label = new JLabel("VN\u0110");
		label.setBounds(318, 126, 46, 14);
		contentPane.add(label);
		
		JButton btnthanhtien = new JButton("Th\u00E0nh ti\u1EC1n");
		btnthanhtien.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(txtsoluong.getText());
				int b = Integer.parseInt(txtdongia.getText());
				txtthanhtien.setText(Integer.toString(a*b));
			}
		});
		btnthanhtien.setBounds(165, 173, 116, 23);
		contentPane.add(btnthanhtien);
	}

}
