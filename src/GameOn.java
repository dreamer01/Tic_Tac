
public class GameOn implements Runnable{
	TicTacPanel TTpanel;
	
	GameOn(TicTacPanel pnl){
		TTpanel=pnl;
	}
	public void run(){
		while(true){
			TTpanel.update();
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
