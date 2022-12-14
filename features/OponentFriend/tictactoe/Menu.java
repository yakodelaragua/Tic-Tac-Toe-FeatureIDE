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
		System.out.println("Oponent friend selected");

	}

	public void startMenu() {
		original();

		JButton btnVSFriend = new JButton("Play versus a friend");
		btnVSFriend.setHorizontalAlignment(SwingConstants.LEFT);
		btnVSFriend.setIcon(new ImageIcon("images\\human100.jpg"));
		btnVSFriend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				@SuppressWarnings("unused")
				TicTacToe ttt = new TicTacToe(false);

			}
		});
		btnVSFriend.setBounds(23, 249, 342, 97);
		contentPane.add(btnVSFriend);
	}

}
