package thread_examples;

import java.util.concurrent.atomic.AtomicInteger;

public class letItBeCount implements Runnable {
	
	private AtomicInteger countLines = new AtomicInteger();
	
	public void run() {
		
		for (int i = 1; i <= 4; i++) {
			
			chorusCount(i);
			
			countLines.incrementAndGet();
			
			System.out.println(i + "Times letting it be. ");
		}
	}
	
	public int getCountLines() {
		return this.countLines.get();
	}
	
	private void chorusCount(int i) {
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException ex) {
			System.out.println(ex);
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
	}

}
