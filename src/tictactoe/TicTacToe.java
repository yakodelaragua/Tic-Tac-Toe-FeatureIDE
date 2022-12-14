/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe; 

import java.awt.BorderLayout; 
import java.awt.Color; 
import java.awt.FlowLayout; 
import java.awt.Font; 
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
import javax.swing.UIManager; 

/**
 *
 * @author NARENDER KESWANI
 * @author YARA DIAZ DE CERIO
 */
public   class  TicTacToe  implements ActionListener {
	
	// Creating Frame
	JFrame f = new JFrame("Tic Tac Toe");

	

	// Creating Label for printing who is the winner.
	Label lbl = new Label("");

	

	// Setting up the icon for app
	Image icon = Toolkit.getDefaultToolkit().getImage("images\\Logo.png");

	

	// Creating button for game board
	JButton btn1 = new JButton("");

	
	JButton btn2 = new JButton("");

	
	JButton btn3 = new JButton("");

	
	JButton btn4 = new JButton("");

	
	JButton btn5 = new JButton("");

	
	JButton btn6 = new JButton("");

	
	JButton btn7 = new JButton("");

	
	JButton btn8 = new JButton("");

	
	JButton btn9 = new JButton("");

	
	JButton btn10 = new JButton("");

	

	// Creating panels
	JPanel board = new JPanel();

	
	JPanel panel = new JPanel();

	
	// Panel results
	JPanel panel_1 = new JPanel();

	

	String letter = "";

	
	int count = 0;

	

	// Images
	ImageIcon imagen;

	
	ImageIcon imagenWinner;

	
	ImageIcon imagenO;

	
	ImageIcon imagenX;

	

	// Creating flag for winner
	boolean win = false;

	

	// True if VS Computer clicked
	Boolean VSC;

	

	public TicTacToe  (Boolean VSC) {
		// Calling initUI() method to initiliaze UI
		initUI();
		addActionEvents();
		this.VSC = VSC;
	
		System.out.println("Icons hand selected");
	
		System.out.println("VS computer selected");
	
		System.out.println("Oponent friend selected");
	}

	

	 private void  actionPerformed__wrappee__DiazDeCerio  (ActionEvent a) {
		// RESET
		if (a.getSource() == btn10) {

			letter = "";
			count = -1;

			btn1.setEnabled(true);
			btn2.setEnabled(true);
			btn3.setEnabled(true);
			btn4.setEnabled(true);
			btn5.setEnabled(true);
			btn6.setEnabled(true);
			btn7.setEnabled(true);
			btn8.setEnabled(true);
			btn9.setEnabled(true);

			btn1.setText("");
			btn2.setText("");
			btn3.setText("");
			btn4.setText("");
			btn5.setText("");
			btn6.setText("");
			btn7.setText("");
			btn8.setText("");
			btn9.setText("");
			btn9.setText("");

			// Delete image
			btn1.setIcon(null);
			btn2.setIcon(null);
			btn3.setIcon(null);
			btn4.setIcon(null);
			btn5.setIcon(null);
			btn6.setIcon(null);
			btn7.setIcon(null);
			btn8.setIcon(null);
			btn9.setIcon(null);

			lbl.setText("");

			win = false;

		}
	}

	


	 private void  actionPerformed__wrappee__OponentComputer  (ActionEvent a) {
		actionPerformed__wrappee__DiazDeCerio(a);
		//Vs computer clicked
		if (VSC) {
			letter = "X";
			imagen = imagenX;
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

			checkWinner();
			
			// Computer turn, O
			if (win == false && a.getSource() != btn10) {
				letter = "O";
				imagen = imagenO;

				if (btn5.getText() == "") {
					btn5.setIcon(imagen);
					btn5.setText(letter);
					btn5.setEnabled(false);
					btn5.setDisabledIcon(imagen);

				} else if (btn9.getText() == "") {
					btn9.setIcon(imagen);
					btn9.setText(letter);
					btn9.setEnabled(false);
					btn9.setDisabledIcon(imagen);
				} else if (btn1.getText() == "") {
					btn1.setIcon(imagen);
					btn1.setText(letter);
					btn1.setEnabled(false);
					btn1.setDisabledIcon(imagen);

				} else if (btn7.getText() == "") {
					btn7.setIcon(imagen);
					btn7.setText(letter);
					btn7.setEnabled(false);
					btn7.setDisabledIcon(imagen);

				} else if (btn8.getText() == "") {
					btn8.setIcon(imagen);
					btn8.setText(letter);
					btn8.setEnabled(false);
					btn8.setDisabledIcon(imagen);

				} else if (btn6.getText() == "") {
					btn6.setIcon(imagen);
					btn6.setText(letter);
					btn6.setEnabled(false);
					btn6.setDisabledIcon(imagen);

				} else if (btn2.getText() == "") {
					btn2.setIcon(imagen);
					btn2.setText(letter);
					btn2.setEnabled(false);
					btn2.setDisabledIcon(imagen);

				} else if (btn3.getText() == "") {
					btn3.setIcon(imagen);
					btn3.setText(letter);
					btn3.setEnabled(false);
					btn3.setDisabledIcon(imagen);

				} else if (btn4.getText() == "") {
					btn4.setIcon(imagen);
					btn4.setText(letter);
					btn4.setEnabled(false);
					btn4.setDisabledIcon(imagen);

				}
				checkWinner();

			}
		}

	}

	

	
	public void actionPerformed(ActionEvent a) {
		actionPerformed__wrappee__OponentComputer(a);
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

	

	 private void  initUI__wrappee__DiazDeCerio  () {

		// Setting up panels layout
		// Creating 3*3=9 grid for game
		board.setLayout(new GridLayout(3, 3));
		// panel layout for printing winner of game
		panel.setLayout(new FlowLayout());

		// Setting up buttons background color
		btn1.setBackground(new Color(255, 255, 255));
		btn2.setBackground(new Color(255, 255, 255));
		btn3.setBackground(new Color(255, 255, 255));
		btn4.setBackground(new Color(255, 255, 255));
		btn5.setBackground(new Color(255, 255, 255));
		btn6.setBackground(new Color(255, 255, 255));
		btn7.setBackground(new Color(255, 255, 255));
		btn8.setBackground(new Color(255, 255, 255));
		btn9.setBackground(new Color(255, 255, 255));
		btn10.setIcon(new ImageIcon("images\\reset100.jpg"));
		btn10.setBackground(new Color(255, 255, 255));

		// Setting up panel background color
		panel.setBackground(new Color(255, 255, 255));

		// Setting up buttons border
		btn1.setBorder(BorderFactory.createLineBorder(Color.decode("#2C6791")));
		btn2.setBorder(BorderFactory.createLineBorder(Color.decode("#2C6791")));
		btn3.setBorder(BorderFactory.createLineBorder(Color.decode("#2C6791")));
		btn4.setBorder(BorderFactory.createLineBorder(Color.decode("#2C6791")));
		btn5.setBorder(BorderFactory.createLineBorder(Color.decode("#2C6791")));
		btn6.setBorder(BorderFactory.createLineBorder(Color.decode("#2C6791")));
		btn7.setBorder(BorderFactory.createLineBorder(Color.decode("#2C6791")));
		btn8.setBorder(BorderFactory.createLineBorder(Color.decode("#2C6791")));
		btn9.setBorder(BorderFactory.createLineBorder(Color.decode("#2C6791")));

		// Adding all buttons in board layout
		board.add(btn1);
		board.add(btn2);
		board.add(btn3);
		board.add(btn4);
		board.add(btn5);
		board.add(btn6);
		board.add(btn7);
		board.add(btn8);
		board.add(btn9);

		panel.add(btn10);

		// Result label
		lbl.setFont(new Font("SansSerif", Font.BOLD, 20));
		panel_1.add(lbl);
		panel_1.setBackground(new Color(255, 255, 255));
		f.getContentPane().add(panel_1, BorderLayout.NORTH);

		// Frame is parent of all every panel
		// panels are added in frame
		f.getContentPane().add(board, BorderLayout.CENTER);
		f.getContentPane().add(panel, BorderLayout.SOUTH);

		// Setting up icon for frame
		f.setIconImage(icon);

		f.setVisible(true);
		f.setSize(329, 491);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// White for disable buttons text
		UIManager.getDefaults().put("Button.disabledText", Color.WHITE);

	}

	

	
	private void initUI() {
		initUI__wrappee__DiazDeCerio();
		imagenO = new ImageIcon("images\\Icon.O.2.jpg");
		imagenX = new ImageIcon("images\\Icon.X.2.jpg");

	}

	

	public void addActionEvents() {
		// registering action listener to buttons
		// Adding action listener for what will happen when player clicks on buttons
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		btn5.addActionListener(this);
		btn6.addActionListener(this);
		btn7.addActionListener(this);
		btn8.addActionListener(this);
		btn9.addActionListener(this);
		btn10.addActionListener(this);

	}

	

	 private void  checkWinner__wrappee__DiazDeCerio  () {

		// Check Horizontally and change images
		if (btn1.getText() == btn2.getText() && btn2.getText() == btn3.getText() && btn1.getText() != ""
				&& btn2.getText() != "" && btn3.getText() != "") {
			win = true;
			btn1.setIcon(imagenWinner);
			btn1.setDisabledIcon(imagenWinner);
			btn2.setIcon(imagenWinner);
			btn2.setDisabledIcon(imagenWinner);
			btn3.setIcon(imagenWinner);
			btn3.setDisabledIcon(imagenWinner);
		}

		// Check Horizontally and change images
		else if (btn4.getText() == btn5.getText() && btn5.getText() == btn6.getText() && btn4.getText() != ""
				&& btn5.getText() != "" && btn6.getText() != "") {
			win = true;
			btn4.setIcon(imagenWinner);
			btn4.setDisabledIcon(imagenWinner);
			btn5.setIcon(imagenWinner);
			btn5.setDisabledIcon(imagenWinner);
			btn6.setIcon(imagenWinner);
			btn6.setDisabledIcon(imagenWinner);
		}

		// Check Horizontally and change images
		else if (btn7.getText() == btn8.getText() && btn8.getText() == btn9.getText() && btn7.getText() != ""
				&& btn8.getText() != "" && btn9.getText() != "") {
			win = true;
			btn7.setIcon(imagenWinner);
			btn7.setDisabledIcon(imagenWinner);
			btn8.setIcon(imagenWinner);
			btn8.setDisabledIcon(imagenWinner);
			btn9.setIcon(imagenWinner);
			btn9.setDisabledIcon(imagenWinner);
		}

		// Check Vertically and change images
		else if (btn1.getText() == btn4.getText() && btn4.getText() == btn7.getText() && btn1.getText() != ""
				&& btn4.getText() != "" && btn7.getText() != "") {
			win = true;
			btn1.setIcon(imagenWinner);
			btn1.setDisabledIcon(imagenWinner);
			btn4.setIcon(imagenWinner);
			btn4.setDisabledIcon(imagenWinner);
			btn7.setIcon(imagenWinner);
			btn7.setDisabledIcon(imagenWinner);
		}

		// Check Vertically and change images
		else if (btn2.getText() == btn5.getText() && btn5.getText() == btn8.getText() && btn2.getText() != ""
				&& btn5.getText() != "" && btn8.getText() != "") {
			win = true;
			btn2.setIcon(imagenWinner);
			btn2.setDisabledIcon(imagenWinner);
			btn5.setIcon(imagenWinner);
			btn5.setDisabledIcon(imagenWinner);
			btn8.setIcon(imagenWinner);
			btn8.setDisabledIcon(imagenWinner);
		}

		// Check Vertically and change images
		else if (btn3.getText() == btn6.getText() && btn6.getText() == btn9.getText() && btn3.getText() != ""
				&& btn6.getText() != "" && btn9.getText() != "") {
			win = true;
			btn3.setIcon(imagenWinner);
			btn3.setDisabledIcon(imagenWinner);
			btn6.setIcon(imagenWinner);
			btn6.setDisabledIcon(imagenWinner);
			btn9.setIcon(imagenWinner);
			btn9.setDisabledIcon(imagenWinner);
		}

		// Check Diagonally and change images
		else if (btn1.getText() == btn5.getText() && btn5.getText() == btn9.getText() && btn1.getText() != ""
				&& btn5.getText() != "" && btn9.getText() != "") {
			win = true;
			btn1.setIcon(imagenWinner);
			btn1.setDisabledIcon(imagenWinner);
			btn5.setIcon(imagenWinner);
			btn5.setDisabledIcon(imagenWinner);
			btn9.setIcon(imagenWinner);
			btn9.setDisabledIcon(imagenWinner);
		}

		// Check Diagonally
		else if (btn3.getText() == btn5.getText() && btn5.getText() == btn7.getText() && btn3.getText() != ""
				&& btn5.getText() != "" && btn7.getText() != "") {
			win = true;
			btn3.setIcon(imagenWinner);
			btn3.setDisabledIcon(imagenWinner);
			btn5.setIcon(imagenWinner);
			btn5.setDisabledIcon(imagenWinner);
			btn7.setIcon(imagenWinner);
			btn7.setDisabledIcon(imagenWinner);
		}

		else {
			win = false;
		}

		if (win) {
			lbl.setText("Hurray! Player " + letter + " wins!");

			btn1.setEnabled(false);
			btn2.setEnabled(false);
			btn3.setEnabled(false);
			btn4.setEnabled(false);
			btn5.setEnabled(false);
			btn6.setEnabled(false);
			btn7.setEnabled(false);
			btn8.setEnabled(false);
			btn9.setEnabled(false);

		} else if (!win && count == 9) {
			lbl.setText("The game ended in a tie.");

			btn1.setEnabled(false);
			btn2.setEnabled(false);
			btn3.setEnabled(false);
			btn4.setEnabled(false);
			btn5.setEnabled(false);
			btn6.setEnabled(false);
			btn7.setEnabled(false);
			btn8.setEnabled(false);
			btn9.setEnabled(false);

		}
	}

	

	
	private void checkWinner() {
		if (letter == "O") {
			imagenWinner = new ImageIcon("images\\Icon.O.2.finished.jpg");

		} else {
			imagenWinner = new ImageIcon("images\\Icon.X.2.finished.jpg");

		}
		checkWinner__wrappee__DiazDeCerio();		

	}


}
