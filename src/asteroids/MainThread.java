package asteroids;

public class MainThread extends Thread {
	TickReceiver tickreceiver;
	boolean running;
	long MS_PER_FRAME=100;

	public MainThread(TickReceiver tickreceiver) {
		this.tickreceiver = tickreceiver;
		running=true;
		
	}
	@Override
	public void run() {
		while(running){
			long start=System.currentTimeMillis();
			tickreceiver.tick();
			long timeToSleep = MS_PER_FRAME-System.currentTimeMillis()-start;
			if (timeToSleep>0){
				try {
					Thread.sleep(timeToSleep);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	}
	public void stopRunning(){
		running=false;
	}
}
