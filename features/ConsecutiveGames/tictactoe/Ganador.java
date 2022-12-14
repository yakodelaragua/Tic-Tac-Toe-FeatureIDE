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
	private static final long serialVersionUID = 1L;

	int consecutiveGames = 0;
	JLabel lblConsecutivas;
	String letterC;

	/**
	 * Create the frame.
	 */
	public Ganador(String letter) {
		System.out.println("Consecutive games selected");
		this.letterC = letter;
	}

	
	public void setConsecutiveGames(int c) {
		this.consecutiveGames = c;
		lblConsecutivas.setText("Player " + letterC + " has won " + consecutiveGames + " consecutive games");
	}
	
	
	public void countI(String letter) {
		original(letter);
		
		//CONSECUTIVAS
		lblConsecutivas = new JLabel();
		lblConsecutivas.setFont(new Font("SansSerif", Font.PLAIN, 18));
		lblConsecutivas.setBounds(54, 205, 332, 45);
		contentPane.add(lblConsecutivas);
	}
	
	

}
