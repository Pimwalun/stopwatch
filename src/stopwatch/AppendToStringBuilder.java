package stopwatch;

/**
 * This class is task 2: append chars to a StringBuilder
 * @author Pimwalun Witchawanitchanun
 *
 */
public class AppendToStringBuilder implements Runnable {
	private int count;
	private String result = "";
	private StringBuilder builder = new StringBuilder();

	/**
	 * Initialize AppendToStringBuilder object.
	 * @param count is value of the input
	 */
	public AppendToStringBuilder(int count) {
		this.count = count;
	}

	/** 
	 * Add Char 'a' to the StringBuilder until the final length of the StringBuilder and print out. 
	 */
	@Override
	public void run() {
		final char CHAR = 'a';
		int k = 0;
		while (k++ < count) {
			builder = builder.append(CHAR);
		}
		// now create a String from the result, to be compatible with task 1.
		result = builder.toString();
	}

	/**
	 * Return that describes the task.
	 * @return that describes the task
	 */
	@Override
	public String toString() {
		return String.format("Append %,d chars to StringBuilder\nfinal string length = %s", count, result.length());
	}
}
