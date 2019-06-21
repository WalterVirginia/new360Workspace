package thread_examples;

import java.util.concurrent.TimeUnit;

public class letItBeChorus implements Runnable {
	
	private String chorus;
	
	public letItBeChorus(String chorus) {
		this.chorus = chorus;
	}
	
	public void run() {
	
		for (int c = 1; c <= 4; c++) {
			
			System.out.println(this.chorus);
			
			try {
				TimeUnit.MILLISECONDS.sleep(4000);
			}
			catch (InterruptedException ex) {
				System.out.println(ex);
			}
		}
	}

}
