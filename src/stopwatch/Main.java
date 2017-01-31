package stopwatch;

/**
 * This is main method run the tasks.
 * @author Pimwalun Witchawanitchanun
 */
public class Main {
	/** 
	 * Creates the tasks and pass each task to the TaskTimer to compare the speed of time. 
	 */
	public static void main(String[] args){
		TaskTimer taskTimer = new TaskTimer();
		taskTimer.measureAndPrint(new AppendToString(50000));
		taskTimer.measureAndPrint(new AppendToString(100000));
		taskTimer.measureAndPrint(new AppendToStringBuilder(100000));
		taskTimer.measureAndPrint(new SumDoublePrimitives(1000000000));
		taskTimer.measureAndPrint(new SumDouble(1000000000));
		taskTimer.measureAndPrint(new SumBigDecimal(1000000000));
	}
}
