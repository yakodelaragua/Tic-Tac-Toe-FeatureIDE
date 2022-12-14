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
	int ganadasConsecutivas = 0;
	String lastWinner = "";

	public TicTacToe(Boolean VSC) {
		System.out.println("Consecutive games selected");
	}

	private void checkWinner() {
		original();

		if (win) {
			// Consecutive games
			if (lastWinner == "O" && letter == "O" || lastWinner == "X" && letter == "X") {
				ganadasConsecutivas++;
			} else {
				ganadasConsecutivas = 1;
			}

			lastWinner = letter;
			frame.setConsecutiveGames(ganadasConsecutivas);

		} else if (!win && count == 9) {
			lastWinner = "";

		}
	}

}