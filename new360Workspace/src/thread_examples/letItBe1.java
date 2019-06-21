package thread_examples;

import java.util.*;

/**
 * This program prints the 1st verse of the Song "Let It Be" 
 * by the Beatles. 
 */

public class letItBe1 extends Thread {

	public void run() {
		
		String line1;
		
		for(int l=1; l<=1; l++) {
			line1 = "When I find myself in times of sorrow, " +
					"Mother Mary comes to me. Speaking words of "  +
					"wisdom: Let It Be. ";
			System.out.println(line1);
			
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException ex) {
				System.out.println(ex);
			}
		}
	}
}