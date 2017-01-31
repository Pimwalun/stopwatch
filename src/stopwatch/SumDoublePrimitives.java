package stopwatch;

/**
 * This class is task 3: add double primitives from an array.
 * @author Pimwalun Witchawanitchanun
 */
public class SumDoublePrimitives implements Runnable {
	static final int ARRAY_SIZE = 500000;
	private int counter;
	// create array of values to add before we start the timer
	private double[] values = new double[ARRAY_SIZE];
	private double sum = 0.0;

	/**
	 * Initialize SumDoublePrimitive object.
	 * @param counter is value for the input
	 */
	public SumDoublePrimitives(int counter) {
		this.counter = counter;
	}

	/**
	 * Add a number from 1 to ARRAY_SIZE using double primitives from an array.
	 */
	@Override
	public void run() {
		for (int k = 0; k < ARRAY_SIZE; k++) values[k] = k + 1;
		// count = loop counter, i = array index value
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
		return String.format("Sum array of double primitives with count=%,d\n", counter) + "sum = " + sum;
	}
}
