package exercicio02;

import java.util.Arrays;
import java.util.Random;

public class Config02 {
	Random r = new Random();

	/**
	 * Print the multi array
	 */
	public void create2DArray() {
		int[][] multi = new int[8][10];
		int[][] result = insertDataOn2DArray(multi);
		System.out.println(Arrays.deepToString(result));
	}

	/**
	 * Fill the multi[][] with number betwen 0 and 1
	 * 
	 * @param multi
	 * @return
	 */
	public int[][] insertDataOn2DArray(int[][] multi) {
		for (int i = 0; i < multi.length; i++) {
			for (int j = 0; j < multi[i].length; j++) {
				multi[i][j] = (int) (r.nextInt(2));
			}
		}
		return multi;
	}

}
