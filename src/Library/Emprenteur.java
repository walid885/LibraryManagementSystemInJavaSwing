package Library;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Emprenteur extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField nomEmprenteur;
	private JTextField codeEmprenteur;
	private JTextField preEmprenteur;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Emprenteur frame = new Emprenteur();
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
	public Emprenteur() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 858, 643);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		nomEmprenteur = new JTextField();
		nomEmprenteur.setBounds(405, 41, 303, 49);
		contentPane.add(nomEmprenteur);
		nomEmprenteur.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nom Emprenteur");
		lblNewLabel.setBounds(140, 41, 122, 49);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1_1 = new JLabel("Code Emprenteur");
		lblNewLabel_1_1.setBounds(140, 314, 170, 49);
		contentPane.add(lblNewLabel_1_1);
		
		codeEmprenteur = new JTextField();
		codeEmprenteur.setColumns(10);
		codeEmprenteur.setBounds(405, 314, 303, 49);
		contentPane.add(codeEmprenteur);
		
		JLabel lblNewLabel_1 = new JLabel("Prenom Emprenteur");
		lblNewLabel_1.setBounds(140, 181, 201, 49);
		contentPane.add(lblNewLabel_1);
		
		preEmprenteur = new JTextField();
		preEmprenteur.setColumns(10);
		preEmprenteur.setBounds(405, 181, 303, 49);
		contentPane.add(preEmprenteur);
		
		JButton Borrow = new JButton("Emprenter");
		Borrow.setBounds(166, 469, 117, 25);
		contentPane.add(Borrow);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(498, 469, 117, 25);
		contentPane.add(btnNewButton_1);
		
		JLabel Resultat = new JLabel("New label");
		Resultat.setBounds(182, 530, 488, 49);
		contentPane.add(Resultat);
	}

}
