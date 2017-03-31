import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

public class TicTacPanel extends JPanel implements MouseListener{
	ArrayList<Cubes> cubes =new ArrayList<Cubes>();
	int count=0;
	Thread thread;
	GameOn startGame;
	
	TicTacPanel(){
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++)
				cubes.add(new Cubes((i*100),(j*100),100,100,"Cubes.png"));
		}
		addMouseListener(this);
		setFocusable(true);
;	}
	
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		for(Cubes c : cubes)
			c.draw(g, this);		
		
		// to start the game and call update function after every 100ms
		startGame=new GameOn(this);
		thread=new Thread(startGame);
		thread.start();
	}
	
	
	public void update(){
		if(cubes.get(0).flag ==cubes.get(1).flag &&cubes.get(0).flag ==cubes.get(2).flag ){ // 1 col
			if(cubes.get(0).flag ==1){
				JOptionPane.showMessageDialog(null, "Player 1 Wins :) :) ");
				System.exit(0);
			}
			else if(cubes.get(0).flag ==2){
				JOptionPane.showMessageDialog(null, "Player 2 Wins :) :) ");
				System.exit(0);
			}				
		}
		
		if(cubes.get(3).flag ==cubes.get(4).flag &&cubes.get(3).flag ==cubes.get(5).flag ){ // 2 col
			if(cubes.get(3).flag ==1){
				JOptionPane.showMessageDialog(null, "Player 1 Wins :) :) ");
				System.exit(0);
			}
			else if(cubes.get(3).flag ==2){
				JOptionPane.showMessageDialog(null, "Player 2 Wins :) :) ");
				System.exit(0);
			}				
		}
		
		if(cubes.get(6).flag ==cubes.get(7).flag &&cubes.get(6).flag ==cubes.get(8).flag ){ // 3 col
			if(cubes.get(6).flag ==1){
				JOptionPane.showMessageDialog(null, "Player 1 Wins :) :) ");
				System.exit(0);
			}
			else if(cubes.get(6).flag ==2){
				JOptionPane.showMessageDialog(null, "Player 2 Wins :) :) ");
				System.exit(0);
			}				
		}
		
		if(cubes.get(0).flag ==cubes.get(3).flag &&cubes.get(0).flag ==cubes.get(6).flag ){ // 1 row
			if(cubes.get(0).flag ==1){
				JOptionPane.showMessageDialog(null, "Player 1 Wins :) :) ");
				System.exit(0);
			}
			else if(cubes.get(0).flag ==2){
				JOptionPane.showMessageDialog(null, "Player 2 Wins :) :) ");
				System.exit(0);
			}				
		}
		
		if(cubes.get(1).flag ==cubes.get(4).flag &&cubes.get(1).flag ==cubes.get(7).flag ){ // 2 row
			if(cubes.get(1).flag ==1){
				JOptionPane.showMessageDialog(null, "Player 1 Wins :) :) ");
				System.exit(0);
			}
			else if(cubes.get(1).flag ==2){
				JOptionPane.showMessageDialog(null, "Player 2 Wins :) :) ");
				System.exit(0);
			}				
		}
		
		if(cubes.get(2).flag ==cubes.get(5).flag &&cubes.get(2).flag ==cubes.get(8).flag ){ // 3 row
			if(cubes.get(2).flag ==1){
				JOptionPane.showMessageDialog(null, "Player 1 Wins :) :) ");
				System.exit(0);
			}
			else if(cubes.get(2).flag ==2){
				JOptionPane.showMessageDialog(null, "Player 2 Wins :) :) ");
				System.exit(0);
			}				
		}
		
		if(cubes.get(0).flag ==cubes.get(4).flag &&cubes.get(0).flag ==cubes.get(8).flag ){ // 1 diagonal
			if(cubes.get(0).flag ==1){
				JOptionPane.showMessageDialog(null, "Player 1 Wins :) :) ");
				System.exit(0);
			}
			else if(cubes.get(0).flag ==2){
				JOptionPane.showMessageDialog(null, "Player 2 Wins :) :) ");
				System.exit(0);
			}				
		}
		
		if(cubes.get(2).flag ==cubes.get(4).flag &&cubes.get(2).flag ==cubes.get(6).flag ){ // 2 diagonal
			if(cubes.get(2).flag ==1){
				JOptionPane.showMessageDialog(null, "Player 1 Wins :) :) ");
				System.exit(0);
			}
			else if(cubes.get(2).flag ==2){
				JOptionPane.showMessageDialog(null, "Player 2 Wins :) :) ");
				System.exit(0);
			}				
		}
		
		if(count==9){		//to exit when all box are filled and its a draw
			JOptionPane.showMessageDialog(null, " Game Draw ");
			System.exit(0);
		}
	}

	
	@Override				 //to change the box content onclick
	public void mouseClicked(MouseEvent e) {
		
		for(Cubes c : cubes){
			if(count%2==0){ 
					if (c.contains(e.getPoint())&&c.flag==0) {
						c.flag=1;
					    count++;
					}
				}
			else{
					if (c.contains(e.getPoint())&&c.flag==0) {
						c.flag=2;
					    count++;
					}
				}				
		}
		repaint();
	}
	
	
	
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
