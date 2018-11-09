package Snake;

import java.awt.Container;

import java.awt.Dimension;

import javax.swing.JFrame;

public class Main {

	

	public static void main(String[] args) {
		JFrame frame = new JFrame("Game");
		frame.setContentPane(new GamePanel1());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.pack();
		
		frame.setPreferredSize(new Dimension(GamePanel1.WIDTH, GamePanel1.HEIGHT));
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}
