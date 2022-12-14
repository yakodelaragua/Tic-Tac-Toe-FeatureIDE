package tictactoe; 

import javax.swing.JFrame; 
import javax.swing.JPanel; 
import javax.swing.border.EmptyBorder; 
import javax.swing.JLabel; 
import java.awt.Font; 
import java.awt.Color; 

public  class  About  extends JFrame {
	
	private static final long serialVersionUID = 1L;

	

	private JPanel contentPane;

	

	/**
	 * Create the frame.
	 */
	public About() {
		startAbout();
	}

	

	public void startAbout() {
		// Nombre autores
		setTitle("About");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 452, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblAutorOriginal = new JLabel("Narender Keswani");
		lblAutorOriginal.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblAutorOriginal.setBounds(42, 63, 174, 14);
		contentPane.add(lblAutorOriginal);

		JLabel lblYara = new JLabel("Yara Diaz de Cerio");
		lblYara.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblYara.setBounds(42, 88, 162, 14);
		contentPane.add(lblYara);

		JLabel lblAuthors = new JLabel("AUTHORS");
		lblAuthors.setFont(new Font("SansSerif", Font.BOLD, 20));
		lblAuthors.setBounds(32, 24, 124, 26);
		contentPane.add(lblAuthors);
	}


}
