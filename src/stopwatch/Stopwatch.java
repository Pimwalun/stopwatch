package stopwatch;

/**
 * A Stopwatch that measures elapsed time between a starting time and stopping time, or until the present time.
 * @author Pimwalun Witchawanitchanun
 * @version 1.0 
 */
public class Stopwatch {
	/** constant for converting nanoseconds to seconds. */
	private static final double NANOSECONDS = 1.0E-9;
	/** control */
	private boolean running;
	/** time that the stopwatch was started, in nanoseconds. */
	private long startTime;
	/** time that the stopwatch was stopped, in nanoseconds. */
	private long stopTime;
	
	/** Initialize a new Stopwatch object. */
	public Stopwatch() {
		this.startTime = 0;
		this.stopTime = 0;
	}
	
	/**
	 * The elapsed time in seconds with decimal.
	 * @return the elapsed time in seconds with decimal
	 */
	public double getElapsed() {
		if (isRunning()) {
			return (System.nanoTime() - startTime) * NANOSECONDS;
		}
		return (stopTime - startTime) * NANOSECONDS;
	}
	
	/**
	 * If the stopwatch is running, false if stopwatch is stopped.
	 * @return true if the stopwatch is running, false if stopwatch is stopped
	 */
	public boolean isRunning() {
		return running;
	}
	
	/** reset the stopwatch and start if if stopwatch is not running. If the stopwatch is already running then start does nothing. */
	public void start() {
		if (!isRunning()) {
			running = true;
			startTime = System.nanoTime();
		}
	}

	/** stop the stopwatch. If the stopwatch is already stopped, then stop does nothing. */
	public void stop() {
		if (isRunning()) {
			running = false;
			stopTime = System.nanoTime();
		}
	}
}