/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Label;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author NARENDER KESWANI
 * @author YARA DIAZ DE CERIO
 */
public class TicTacToe implements ActionListener {


	int ganadasX = 0;
	int ganadasO = 0;

	public TicTacToe() {
		System.out.println("Track games selected");
	}

	private void checkWinner() {
		original();

		if (win) {
			// TRACKGAMES
			if (letter == "O") {
				ganadasO++;

			} else {
				ganadasX++;

			}
			frame.setOWins(ganadasO);
			frame.setXWins(ganadasX);

		} 
	}


}