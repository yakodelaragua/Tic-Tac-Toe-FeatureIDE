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
		System.out.println("Icons blue red selected");
	}

	
	private void initUI() {
		original();
		imagenO = new ImageIcon("images\\Icon.O.1.jpg");
		imagenX = new ImageIcon("images\\Icon.X.1.jpg");

	}

	
	private void checkWinner() {
		if (letter == "O") {
			imagenWinner = new ImageIcon("images\\Icon.O.1.finished.jpg");

		} else {
			imagenWinner = new ImageIcon("images\\Icon.X.1.finished.jpg");

		}
		original();		

	}

}