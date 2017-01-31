package stopwatch;

/**
 * This class is task 4: add Double objects from an array.
 * @author Pimwalun Witchawanitchanun
 */
public class SumDouble implements Runnable {
	static final int ARRAY_SIZE = 500000;
	private int counter;
	// create array of values to add, before we start the timer
	private Double[] values = new Double[ARRAY_SIZE];
	private Double sum = new Double(0.0);

	/**
	 * Initialize SumDouble object.
	 * @param counter is value for the input
	 */
	public SumDouble(int counter) {
		this.counter = counter;
	}

	/**
	 * Add a number from 1 to ARRAY_SIZE using Double objects from an array.
	 */
	@Override
	public void run() {
		for (int i = 0; i < ARRAY_SIZE; i++) values[i] = new Double(i + 1);
		// count = loop counter, i = array index
		for (int count = 0, i = 0; count < counter; count++, i++) {
			if (i >= values.length) i = 0; // reuse the array when get to last value
			sum = sum + values[i];
		}
	}

	/**
	 * Return that describes the task.
	 * @return that describes the task
	 */
	@Override
	public String toString() {
		return String.format("Sum array of Double objects with count=%,d\n", counter) + "sum = " + sum;
	}
}
