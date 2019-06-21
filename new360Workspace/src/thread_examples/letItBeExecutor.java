package thread_examples;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class letItBeExecutor {
	
	public static void main (String[] args) {
		
		newThreads();
	}
	
	public static void newThreads() {
		
		ExecutorService songLines = Executors.newFixedThreadPool(5);
		
		
			songLines.execute(new letItBe1());
			songLines.execute(new letItBe2());
			
			/**
			 * This needs to be constructed using the arguments
			 * that I defined in the letItBeChorus. The String
			 * must be passed in for the program to run. 
			 */
			songLines.execute(new letItBeChorus("Let It Be. \n"));
			songLines.execute(new letItBeCount());
		
			
		songLines.shutdown();
		
		

	}

}

