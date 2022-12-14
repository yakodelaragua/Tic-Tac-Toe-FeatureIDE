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
import java.awt.Toolkit;

import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

public class Menu extends JFrame {

	/**
	 * Create the frame.
	 */
	public Menu() {
		System.out.println("About selected");

	}

	public void startMenu() {
		original();
		
		JButton btnAbout = new JButton("About");
		btnAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				About frameAbout = new About();
				frameAbout.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				frameAbout.setVisible(true);
				Image icon = Toolkit.getDefaultToolkit().getImage("images\\Logo.png");
				frameAbout.setIconImage(icon);
				frameAbout.setVisible(true);
			}
		});
		btnAbout.setBounds(135, 386, 89, 23);
		contentPane.add(btnAbout);
	}

}
