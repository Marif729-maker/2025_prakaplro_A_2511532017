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

public class OperatorAssignmentGUI_2511532017 extends JFrame {
	private int nilaiBil1; //menyimpan nilai Bil1 yang terus berubah
	private boolean sudahDiset = false; //kondisi bil1 masih bisa diinputkan
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField Bil1txt;
	private JTextField Bil2txt;
	private JTextField OutputHasil;

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
					OperatorAssignmentGUI_2511532017 frame = new OperatorAssignmentGUI_2511532017();
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
	public OperatorAssignmentGUI_2511532017() {
		setResizable(false);
		setTitle("OPERATOR ASSIGNMENT ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("OPERATOR ARITMATIKA");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel.setBounds(142, 10, 194, 29);
		contentPane.add(lblNewLabel);
		
		JLabel Bil1 = new JLabel("Bilangan 1");
		Bil1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Bil1.setBounds(21, 68, 72, 29);
		contentPane.add(Bil1);
		
		JLabel Bil2 = new JLabel("Bilangan 2");
		Bil2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Bil2.setBounds(21, 107, 72, 29);
		contentPane.add(Bil2);
		
		JLabel Operator = new JLabel("Operator");
		Operator.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Operator.setBounds(21, 160, 75, 26);
		contentPane.add(Operator);
		
		JLabel Hasil = new JLabel("Hasil");
		Hasil.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Hasil.setBounds(21, 211, 75, 24);
		contentPane.add(Hasil);
		
		Bil1txt = new JTextField();
		Bil1txt.setBounds(93, 72, 96, 18);
		contentPane.add(Bil1txt);
		Bil1txt.setColumns(10);
		
		Bil2txt = new JTextField();
		Bil2txt.setColumns(10);
		Bil2txt.setBounds(93, 111, 96, 18);
		contentPane.add(Bil2txt);
		
		JComboBox assigmentCMB = new JComboBox();
		assigmentCMB.setFont(new Font("Times New Roman", Font.BOLD, 11));
		assigmentCMB.setModel(new DefaultComboBoxModel(new String[] {"+=", "-=", "*=", "/=", "%="}));
		assigmentCMB.setBounds(93, 162, 57, 20);
		contentPane.add(assigmentCMB);
		
		JButton btnProses = new JButton("proses");
		btnProses.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		     
		        if (!sudahDiset && Bil1txt.getText().trim().isEmpty()) {
		            pesanPeringatan("Silahkan Masukkan Bilangan 1");
		            return;
		        }
		        if (Bil2txt.getText().trim().isEmpty()) {
		            pesanPeringatan("Silahkan Masukkan Bilangan 2");
		            return;
		        }

		        try {
		            int b = Integer.parseInt(Bil2txt.getText());

		            // Ambil nilai awal Bil1 hanya sekali
		            if (!sudahDiset) {
		                nilaiBil1 = Integer.parseInt(Bil1txt.getText());
		                Bil1txt.setEnabled(false); 
		                sudahDiset = true;         // bil1 sudah tidak dapat diubah lagi
		            }

		            // Ambil pilihan operator
		            int op = assigmentCMB.getSelectedIndex();

		            if (op == 0) {
		                nilaiBil1 += b;
		            } else if (op == 1) {
		                nilaiBil1 -= b;
		            } else if (op == 2) {
		                nilaiBil1 *= b;
		            } else if (op == 3) {
		                if (b == 0) {
		                    pesanPeringatan("Bilangan 2 tidak boleh nol untuk pembagian!");
		                    return;
		                }
		                nilaiBil1 /= b;
		            } else if (op == 4) {
		                if (b == 0) {
		                    pesanPeringatan("Bilangan 2 tidak boleh nol untuk modulus!");
		                    return;
		                }
		                nilaiBil1 %= b;
		       
		            }
		            Bil1txt.setText(String.valueOf(nilaiBil1));

		            OutputHasil.setText(String.valueOf(nilaiBil1));

		        } catch (NumberFormatException ex) {
		            pesanEror("Input harus berupa angka bulat!");
		        }
		    }
		});
		btnProses.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnProses.setBounds(180, 162, 84, 20);
		contentPane.add(btnProses);
		
		OutputHasil = new JTextField();
		OutputHasil.setColumns(10);
		OutputHasil.setBounds(93, 213, 57, 18);
		contentPane.add(OutputHasil);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnReset.setBounds(180, 212, 84, 20);
		btnReset.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        // Reset semua
		        Bil1txt.setText("");
		        Bil2txt.setText("");
		        Bil1txt.setEnabled(true); 
		        OutputHasil.setText("");
		        sudahDiset = false;
		        nilaiBil1 = 0;
		        //  kursor Fokus ke Bil1 lagi
		        Bil1txt.requestFocus(); 
		    }
		});
		contentPane.add(btnReset);

	
	}
}
