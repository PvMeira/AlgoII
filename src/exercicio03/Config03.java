package exercicio03;

import java.util.Random;

public class Config03 {
	/**
	 * Create the Random Array
	 * 
	 * @return
	 */
	public int[] createRandomArray() {
		int[] result = new int[10];
		result = fillArray(result);
		return result;
	}

	/**
	 * Print the given Array
	 * 
	 * @param r
	 */
	public void printArray(int[] r) {
		for (int i = 0; i < r.length; i++) {
			System.out.println(r[i]);
		}
		System.out.println("Maximum contiguous sum is " + maxSubArraySum(r));
	}

	/**
	 * Get the max sub Array
	 * 
	 * @param a
	 * @return
	 */
	public int maxSubArraySum(int a[]) {
		int size = a.length;
		int result = Integer.MIN_VALUE;
		int currentMaxValue = 0;

		for (int i = 0; i < size; i++) {
			currentMaxValue = currentMaxValue + a[i];
			if (result < currentMaxValue)
				result = currentMaxValue;
			if (currentMaxValue < 0)
				currentMaxValue = 0;
		}
		return result;
	}

	/**
	 * Fill the gicen array with random numbers betwen -10 and 10
	 * 
	 * @param result
	 * @return
	 */
	public int[] fillArray(int[] result) {
		for (int i = 0; i < result.length; i++) {
			result[i] = createRandomNumber();
		}

		return result;
	}

	/**
	 * Create a random number betwen -10 and 10
	 * 
	 * @return
	 */
	public int createRandomNumber() {
		Random r = new Random();
		int Low = -10;
		int High = +10;
		int Result = r.nextInt(High - Low) + Low;
		return Result;
	}
}
