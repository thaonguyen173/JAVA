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

public class sumsonguyen extends JFrame {

	private JPanel contentPane;
	private JTextField txtsonguyenthunhat;
	private JTextField txtsonguyenthuhai;
	private JTextField txtketqua;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sumsonguyen frame = new sumsonguyen();
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
	public sumsonguyen() {
		setTitle("T\u1ED5ng 2 s\u1ED1 nguy\u00EAn");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 281);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTnhTngHai = new JLabel("T\u00EDnh t\u1ED5ng hai s\u1ED1 nguy\u00EAn");
		lblTnhTngHai.setForeground(new Color(0, 0, 255));
		lblTnhTngHai.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTnhTngHai.setBounds(109, 21, 157, 23);
		contentPane.add(lblTnhTngHai);
		
		JLabel lblNewLabel = new JLabel("S\u1ED1 nguy\u00EAn th\u1EE9 nh\u1EA5t:");
		lblNewLabel.setBounds(37, 69, 121, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblSNguynTh = new JLabel("S\u1ED1 nguy\u00EAn th\u1EE9 2:");
		lblSNguynTh.setBounds(37, 102, 121, 14);
		contentPane.add(lblSNguynTh);
		
		JLabel lblKtQu = new JLabel("K\u1EBFt qu\u1EA3:");
		lblKtQu.setBounds(37, 138, 66, 14);
		contentPane.add(lblKtQu);
		
		txtsonguyenthunhat = new JTextField();
		txtsonguyenthunhat.setBounds(168, 66, 147, 20);
		contentPane.add(txtsonguyenthunhat);
		txtsonguyenthunhat.setColumns(10);
		
		txtsonguyenthuhai = new JTextField();
		txtsonguyenthuhai.setColumns(10);
		txtsonguyenthuhai.setBounds(168, 99, 147, 20);
		contentPane.add(txtsonguyenthuhai);
		
		txtketqua = new JTextField();
		txtketqua.setColumns(10);
		txtketqua.setBounds(168, 135, 147, 20);
		contentPane.add(txtketqua);
		
		JButton btntong = new JButton("T\u1ED5ng");
		btntong.addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent arg0) {
				int a = Integer.parseInt(txtsonguyenthunhat.getText());
				int b = Integer.parseInt(txtsonguyenthuhai.getText());
				txtketqua.setText(Integer.toString(a+b));
			}
		});
		btntong.setBounds(137, 184, 89, 23);
		contentPane.add(btntong);
	}
}
