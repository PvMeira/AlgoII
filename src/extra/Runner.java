package extra;

import java.util.ArrayList;
import java.util.Scanner;

public class Runner {
	private static final String OPTIONS = "Choose the option";
	private static final String INSERT_BEGINING = "Insert on Begin :";
	private static final String INSERT_END = "Insert on the End :";
	private static final String SEARCH_VALUE = "Search a Value :";
	private static final String LIST = "List all values on the list :";
	private static final String VALUE = "Type a value :";
	private static final String ERROR_EXIST_LIST = "value exist on the list";
	private static final String ERROR_DONT_EXIST_LIST = "Value dosent Exist on the list";
	private static final String INVALID_OPTION = "Invalid option !";

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List list = new List();
		String value = null, resp = null;
		do {
			System.out.println(OPTIONS + "\n1->" + INSERT_BEGINING + "\n2->" + INSERT_END + "\n3->" + SEARCH_VALUE
					+ "\n4->" + LIST);
			resp = sc.next();
			if (resp.equals("1")) {
				System.out.println(VALUE);
				value = sc.next();
				// Insere valore no inicio da lista.
				try {
					list.insertBeginning(value);
				} catch (ExistentValueException e) {
					e.printStackTrace();
				}
			} else if (resp.equals("2")) {
				System.out.println(VALUE);
				value = sc.next();
				// Insere valores no final da lista.
				try {
					list.insertEnd(value);
				} catch (ExistentValueException e) {
					e.printStackTrace();
				}
			} else if (resp.equals("3")) {
				System.out.println(VALUE);
				value = sc.next();
				// Pesquisa por valores na lista.
				if (list.search(value) == true)
					System.out.println(ERROR_EXIST_LIST);
				else
					System.out.println(ERROR_DONT_EXIST_LIST);
			} else if (resp.equals("4")) {
				ArrayList<String> listar = new ArrayList<String>();
				// Recebe os valores da lista em um ArrayList e os imprime.
				try {
					listar = list.list();
				} catch (EmptyListException e) {
					e.printStackTrace();
				}

				for (String elemento : listar) {
					System.out.print(elemento + " ");
				}
				System.out.println();
			} else
				System.out.println(INVALID_OPTION);
		} while (resp != "9");
	}
}