import java.awt.*;

public class Cubes extends Rectangle {
	public Image pic; 
	public int flag=0;
	
	Cubes(int a,int b,int w, int h, String s){
		x=a;
		y=b;
		width=w;
		height=h;
		pic= Toolkit.getDefaultToolkit().getImage(s);		
	}

	public void draw (Graphics g , Component c){
		if(flag==0){
			g.drawImage(pic, x, y, width,height,c);
		}else if(flag==1){
			pic= Toolkit.getDefaultToolkit().getImage("Tic.png");
			g.drawImage(pic, x, y, width,height,c);
		}
		if(flag==2){
			pic= Toolkit.getDefaultToolkit().getImage("Cross.png");
			g.drawImage(pic, x, y, width,height,c);
		}
	}	
}
