package tictactoe;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class About extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public About() {
		System.out.println("URL seleccionado");
	}

	public void startAbout() {
		original();
		// Optional url
		JLabel lblUrl = new JLabel("URL");
		lblUrl.setFont(new Font("SansSerif", Font.BOLD, 20));
		lblUrl.setBounds(32, 133, 66, 26);
		contentPane.add(lblUrl);

		JLabel lblUrlR = new JLabel("https://morioh.com/p/2b5d4ce27367");
		lblUrlR.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblUrlR.setBounds(42, 155, 323, 52);
		contentPane.add(lblUrlR);
	}
}