package extra;

import java.util.ArrayList;
import java.util.Scanner;

public class Runner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List list = new List();
		String value = null, resp = null;
		do {
			System.out.println(
					"Escolha a opção\n1->Inserir no Início:\n2->Inserir no fim:\n3->Pesquisar um valor:\n4->Listar valores da lista:");
			resp = sc.next();
			if (resp.equals("1")) {
				System.out.println("Digite um valor:");
				value = sc.next();
				// Insere valore no inicio da lista.
				try {
					list.insertBeginning(value);
				} catch (ExistentValueException e) {
					e.printStackTrace();
				}
			} else if (resp.equals("2")) {
				System.out.println("Digite um valor:");
				value = sc.next();
				// Insere valores no final da lista.
				try {
					list.insertEnd(value);
				} catch (ExistentValueException e) {
					e.printStackTrace();
				}
			} else if (resp.equals("3")) {
				System.out.println("Digite um valor:");
				value = sc.next();
				// Pesquisa por valores na lista.
				if (list.search(value) == true)
					System.out.println("Valor existe na lista!");
				else
					System.out.println("Valor não existe na lista!");
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
				System.out.println("Opção inválida!");
		} while (resp != "9");
	}
}