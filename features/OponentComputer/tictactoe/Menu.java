package tictactoe;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;


public class Menu extends JFrame {

	/**
	 * Create the frame.
	 */
	public Menu() {
		System.out.println("VS computer selected");

	}
	
	
	public void startMenu() {
		original();

		JButton btnVSComputer = new JButton("Play versus computer");
		btnVSComputer.setHorizontalAlignment(SwingConstants.LEFT);
		btnVSComputer.setIcon(new ImageIcon("images\\computer100.jpg"));
		btnVSComputer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				@SuppressWarnings("unused")
				TicTacToe ttt = new TicTacToe(true);

			}
		});
		btnVSComputer.setBounds(23, 128, 342, 97);
		contentPane.add(btnVSComputer);
	}

}
