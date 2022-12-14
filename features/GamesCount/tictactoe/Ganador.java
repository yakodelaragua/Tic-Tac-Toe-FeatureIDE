package tictactoe;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JLabel;

public class Ganador extends JFrame {

	private JPanel contentPane;
	private JPanel panel = new JPanel();
	
	
	public Ganador(String letter) {
		System.out.println("Games count selected");
		countI(letter);
	}
	
	// Game count interface
	public void countI(String letter) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.text);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel.setBackground(new Color(224, 255, 255));
		panel.setBounds(0, 0, 434, 192);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblWinner = new JLabel("Player " + letter + " wins!");
		lblWinner.setBounds(139, 34, 232, 26);
		panel.add(lblWinner);
		lblWinner.setForeground(SystemColor.desktop);
		lblWinner.setHorizontalAlignment(SwingConstants.LEFT);
		lblWinner.setFont(new Font("SansSerif", Font.BOLD, 20));
	}
	

}
