package stopwatch;

/**
 * Runs a task using a Stopwatch and prints the elapsed time.
 * @author Pimwalun Wtichawanitchanun
 */
public class TaskTimer {
	
	/**
	 * Runs a task, measures and prints its running time to the console.
	 * @param runnable it's use call method in Runnable 
	 */
	public static void measureAndPrint(Runnable runnable){
		Stopwatch timer = new Stopwatch();
		timer.start();
		runnable.run();
		timer.stop();
		System.out.println(runnable.toString());
		System.out.printf("Elapsed time %.6f sec\n\n", timer.getElapsed());
	}
}
 