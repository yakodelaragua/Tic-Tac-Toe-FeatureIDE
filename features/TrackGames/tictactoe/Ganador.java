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

	int xWins = 0;
	int oWins = 0;
	JLabel lblOGanadas;
	JLabel lblXGanadas;
	/**
	 * Create the frame.
	 */
	public Ganador(String letter) {
		System.out.println("Track games selected");
		
	}
	
	public void setXWins(int x) {
		this.xWins = x;
		lblXGanadas.setText(Integer.toString(x));;
	}
	
	public void setOWins(int o) {
		this.oWins = o;
		lblOGanadas.setText(Integer.toString(o));;
	}
	
	
	public void countI(String letter) {
		original(letter);
		
		//TRACKGAMES
		JLabel lblO = new JLabel("O");
		lblO.setBounds(271, 107, 32, 23);
		panel.add(lblO);
		lblO.setFont(new Font("SansSerif", Font.BOLD, 22));
		
		lblOGanadas = new JLabel();
		lblOGanadas.setBounds(236, 113, 25, 14);
		panel.add(lblOGanadas);
		lblOGanadas.setFont(new Font("SansSerif", Font.PLAIN, 18));
		
		JLabel lblG = new JLabel("-");
		lblG.setBounds(207, 113, 20, 14);
		panel.add(lblG);
		lblG.setFont(new Font("SansSerif", Font.PLAIN, 18));
		
		lblXGanadas = new JLabel();
		lblXGanadas.setBounds(172, 113, 25, 14);
		panel.add(lblXGanadas);
		lblXGanadas.setFont(new Font("SansSerif", Font.PLAIN, 18));
		
		JLabel lblX = new JLabel("X");
		lblX.setBounds(125, 112, 25, 14);
		panel.add(lblX);
		lblX.setFont(new Font("SansSerif", Font.BOLD, 20));
	}
	
	

}
