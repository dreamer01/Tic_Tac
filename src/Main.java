import javax.swing.*;
public class Main {
	public static void main (String [] args){
		 JFrame frame=new JFrame("Tic Tac");
		 
		 TicTacPanel panel =new TicTacPanel();
		 frame.setVisible(true);
		 frame.getContentPane().add(panel);
		 
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 frame.setVisible(true);
		 frame.setSize(305, 329);
		 frame.setResizable(false);
		 
	}

}
