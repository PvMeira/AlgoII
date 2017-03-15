package exercicio03;

import java.util.Random;

public class Config03 {
	public int[] createRandomArray() {
		int[] result = new int[10];
		result = fillArray(result);
		return result;
	}

	public void printArray(int[] r) {
		for (int i = 0; i < r.length; i++) {
			System.out.println(r[i]);
		}
	}

	public int[] fillArray(int[] result) {
		for (int i = 0; i < result.length; i++) {
			result[i] = createRandomNumber();
		}

		return result;
	}

	public int createRandomNumber() {
		Random r = new Random();
		int Low = -10;
		int High = +10;
		int Result = r.nextInt(High - Low) + Low;
		return Result;
	}
}
