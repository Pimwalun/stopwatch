package stopwatch;

/**
 * This class is task 1 : append chars to a string.
 * @author Pimwalun Witchawanitchanun
 */
public class AppendToString implements Runnable {
	private int count;
	private String result = "";
	
	/**
	 * Initialize AppendToString object.
	 * @param count is value for the input
	 */
	public AppendToString(int count) {
		this.count = count;
	}
	
	/** 
	 * Add Char 'a' to the String until the final length of the String and print out. 
	 */
	@Override
	public void run() {
		final char CHAR = 'a';
		int k = 0;
		while (k++ < count) {
			result = result + CHAR;
		}
	}

	/**
	 * Return that describes the task.
	 * @return that describes the task
	 */
	@Override
	public String toString() {
		return String.format("Append %,d chars to String\nfinal string length = %s", count, result.length());
	}
}
