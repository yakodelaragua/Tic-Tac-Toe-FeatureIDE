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

public   class  Menu  extends JFrame {
	
	private static final long serialVersionUID = 1L;

	

	private JPanel contentPane;

	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
					Image icon = Toolkit.getDefaultToolkit().getImage("images\\Logo.png");
					frame.setIconImage(icon);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	

	/**
	 * Create the frame.
	 */
	public Menu  () {
		System.out.println("Menu interface");
		startMenu();
		
	
		System.out.println("VS computer selected");

	
		System.out.println("Oponent friend selected");

	
		System.out.println("About selected");

	}

	

	 private void  startMenu__wrappee__DiazDeCerio() {
		setTitle("Tic Tac Toe");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 393, 459);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	
		// Label Tic Tac Toe menu
		JLabel lblTicTacToe = new JLabel("Tic Tac Toe");
		lblTicTacToe.setFont(new Font("Yu Gothic Medium", Font.BOLD, 32));
		lblTicTacToe.setForeground(Color.BLACK);
		lblTicTacToe.setHorizontalAlignment(SwingConstants.CENTER);
		lblTicTacToe.setBounds(72, 45, 221, 52);
		contentPane.add(lblTicTacToe);
	}

	
	
	
	 private void  startMenu__wrappee__OponentComputer() {
		startMenu__wrappee__DiazDeCerio();

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

	

	 private void  startMenu__wrappee__OponentFriend() {
		startMenu__wrappee__OponentComputer();

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

	

	public void startMenu() {
		startMenu__wrappee__OponentFriend();
		
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
