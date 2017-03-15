package exercicio01;

public class Runner01 {

	public static void main(String[] args) {
		Config01 ex = new Config01();
		int[] r = ex.fillTheArray();
		ex.printMaxNumber(r);
		ex.printLowNumber(r);
		// Average result on the iterable array
		ex.printAverageValue(r);
	}
}
