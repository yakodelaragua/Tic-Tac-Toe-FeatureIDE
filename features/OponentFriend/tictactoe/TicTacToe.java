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

	public TicTacToe(Boolean VSC) {
		System.out.println("Oponent friend selected");
	}

	
	public void actionPerformed(ActionEvent a) {
		original(a);
		//If oponent friend clicked
		if (!VSC) {
			count++;
			
			if (count == 1 || count == 3 || count == 5 || count == 7 || count == 9) {
				letter = "X";
				imagen = imagenX;

			} else if (count == 2 || count == 4 || count == 6 || count == 8) {
				letter = "O";
				imagen = imagenO;
			}

			if (a.getSource() == btn1) {
				btn1.setIcon(imagen);
				btn1.setText(letter);
				btn1.setEnabled(false);
				btn1.setDisabledIcon(imagen);

			} else if (a.getSource() == btn2) {
				btn2.setIcon(imagen);
				btn2.setText(letter);
				btn2.setEnabled(false);
				btn2.setDisabledIcon(imagen);

			} else if (a.getSource() == btn3) {
				btn3.setIcon(imagen);
				btn3.setText(letter);
				btn3.setEnabled(false);
				btn3.setDisabledIcon(imagen);

			} else if (a.getSource() == btn4) {
				btn4.setIcon(imagen);
				btn4.setEnabled(false);
				btn4.setText(letter);
				btn4.setDisabledIcon(imagen);

			} else if (a.getSource() == btn5) {
				btn5.setIcon(imagen);
				btn5.setText(letter);
				btn5.setEnabled(false);
				btn5.setDisabledIcon(imagen);

			} else if (a.getSource() == btn6) {
				btn6.setIcon(imagen);
				btn6.setText(letter);
				btn6.setEnabled(false);
				btn6.setDisabledIcon(imagen);

			} else if (a.getSource() == btn7) {
				btn7.setIcon(imagen);
				btn7.setEnabled(false);
				btn7.setText(letter);
				btn7.setDisabledIcon(imagen);

			} else if (a.getSource() == btn8) {
				btn8.setIcon(imagen);
				btn8.setEnabled(false);
				btn8.setText(letter);
				btn8.setDisabledIcon(imagen);

			} else if (a.getSource() == btn9) {
				btn9.setIcon(imagen);
				btn9.setText(letter);
				btn9.setEnabled(false);
				btn9.setDisabledIcon(imagen);

			}

			// Calling checkWinner() method for to check who is the winner
			checkWinner();
		}

	}

}