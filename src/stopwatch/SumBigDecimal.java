package stopwatch;
import java.math.BigDecimal;

/**
 * This class is task 5: add BigDecimal objects from an array.
 * @author Pimwalun Witchawanitchanun
 */
public class SumBigDecimal implements Runnable {
	static final int ARRAY_SIZE = 500000;
	private int counter;
	// create array of values to add, before we start the timer
	private BigDecimal[] values = new BigDecimal[ARRAY_SIZE];
	private BigDecimal sum = new BigDecimal(0.0);

	/**
	 * Initialize SumBigDecimal object.
	 * @param counter is value for the input
	 */
	public SumBigDecimal(int counter) {
		this.counter = counter;
		for (int i = 0; i < ARRAY_SIZE; i++) values[i] = new BigDecimal(i + 1);
	}

	/**
	 * Add a number from 1 to ARRAY_SIZE using BigDecimal objects from an array.
	 */
	@Override
	public void run() {
		// count = loop counter, i = array index value
		for (int count = 0, i = 0; count < counter; count++, i++) {
			if (i >= values.length) i = 0; // reuse the array when get to last value
			sum = sum.add(values[i]);
		}
	}

	/**
	 * Return that describes the task.
	 * @return that describes the task
	 */
	@Override
	public String toString() {
		return String.format("Sum array of BigDecimal with count=%,d\n", counter) + "sum = " + sum;
	}
}
