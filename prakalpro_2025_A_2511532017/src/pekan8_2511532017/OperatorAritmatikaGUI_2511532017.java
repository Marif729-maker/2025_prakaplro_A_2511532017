package pekan8_2511532017;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OperatorAritmatikaGUI_2511532017 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtBil1;
	private JTextField txtBil2;
	private JTextField txtHasil;

	private void pesanPeringatan (String pesan) {
		JOptionPane.showMessageDialog(this, pesan, "Peringatan", JOptionPane.WARNING_MESSAGE);
		
	}
	private void pesanEror (String pesan) {
		JOptionPane.showMessageDialog(this, pesan, "error", JOptionPane.ERROR_MESSAGE);
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OperatorAritmatikaGUI_2511532017 frame = new OperatorAritmatikaGUI_2511532017();
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
	public OperatorAritmatikaGUI_2511532017() {
		setResizable(false);
		setTitle("OPERATOR ARITMATIKA ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("OPERATOR ARITMATIKA");
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblNewLabel.setBounds(142, 10, 194, 29);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Bilangan 1");
		lblNewLabel_1.setFont(new Font("Segoe UI Black", Font.BOLD, 10));
		lblNewLabel_1.setBounds(10, 60, 94, 24);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Bilangan 2");
		lblNewLabel_1_1.setFont(new Font("Segoe UI Black", Font.BOLD, 10));
		lblNewLabel_1_1.setBounds(10, 94, 94, 29);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Operator");
		lblNewLabel_1_2.setBounds(10, 142, 75, 26);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Hasil");
		lblNewLabel_1_3.setBounds(10, 178, 75, 24);
		contentPane.add(lblNewLabel_1_3);
		
		txtBil1 = new JTextField();
		txtBil1.setHorizontalAlignment(SwingConstants.CENTER);
		txtBil1.setBounds(92, 66, 40, 18);
		contentPane.add(txtBil1);
		txtBil1.setColumns(10);
		
		txtBil2 = new JTextField();
		txtBil2.setHorizontalAlignment(SwingConstants.CENTER);
		txtBil2.setBounds(92, 94, 40, 18);
		contentPane.add(txtBil2);
		txtBil2.setColumns(10);
		
		JComboBox cbOperator = new JComboBox();
		cbOperator.setModel(new DefaultComboBoxModel(new String[] {"+", "-", "*", "/", "%"}));
		cbOperator.setBounds(95, 145, 37, 20);
		contentPane.add(cbOperator);
		
		txtHasil = new JTextField();
		txtHasil.setHorizontalAlignment(SwingConstants.CENTER);
		txtHasil.setEditable(false);
		txtHasil.setBounds(92, 181, 75, 18);
		contentPane.add(txtHasil);
		txtHasil.setColumns(10);
		
		JButton btnNewButton = new JButton("Proses");
		btnNewButton.addActionListener(new ActionListener() {
			int Hasil ;
			public void actionPerformed(ActionEvent e) {
				if (txtBil1.getText().trim().isEmpty()) {
					pesanPeringatan ("Silahkan Masukkan Bilangan 1");
				} else if (txtBil2.getText().trim().isEmpty()) {
					pesanPeringatan ("Silahkan Masukkan Bilangan 2");
				}else {
					try {
						int a= Integer.parseInt(txtBil1.getText());
						int b= Integer.parseInt(txtBil2.getText());
						int c= cbOperator.getSelectedIndex(); //memilih operator
						if (c==0) {
							Hasil= a+b;
						}if (c==1) {
							Hasil= a-b;
						}if (c==2) {
							Hasil= a*b;
						}if (c==3) {
							Hasil= a/b;
						}if (c==4) {
							Hasil=a%b;
						}
						}catch (NumberFormatException ex) {
							pesanEror ("Bilangan 1 dan Bilangan 2 harus angka");
					}
				}
				txtHasil.setText(String.valueOf(Hasil));
				int a = Integer.parseInt(txtBil1.getText());
					int b = Integer.parseInt(txtBil2.getText());
					int c = cbOperator.getSelectedIndex();
					if (c==0) {
						Hasil = a+b;
					}
					if (c==1) {
						Hasil = a-b;
					}
					if (c==2) {
						Hasil = a * b;
					}
					if (c==3) {
						Hasil = a / b;
					}
					if (c==4) {
						Hasil = a % b;
						
					}
					txtHasil.setText(String.valueOf(Hasil));
					
				}
			
		});
	
		btnNewButton.setBounds(153, 145, 84, 20);
		contentPane.add(btnNewButton);

	}
}
