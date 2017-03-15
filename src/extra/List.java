package extra;

import java.util.ArrayList;

public class List {
	private Node first;
	private Node last;

	private static final String EMPTY_LIST = "The List is empty!";

	// Percorre os nós da lista atribuindo os valores de cada nó em um ArrayList
	// enquanto o próximo nó não for nulo.
	public ArrayList<String> list() throws EmptyListException {
		ArrayList<String> lista = new ArrayList<String>();
		if (first == null)
			throw new EmptyListException(EMPTY_LIST);
		else {
			Node aux = getFirst();
			while (aux != null) {
				String vl = aux.getValue();
				lista.add(vl);
				aux = aux.getNext();
			}
			return lista;
		}
	}

	// Percorre os nós da lista comparando os valores de cada nó com o
	// valor passado por parametro enquanto o próximo nó não for nulo.
	public boolean search(String value) {
		Node aux = getFirst();
		while (aux != null) {
			if (value.equals(aux.getValue())) {
				return true;
			}
			aux = aux.getNext();
		}
		return false;
	}

	// Insere valor passado por parametro no inicio da lista, se o valor não
	// existir na lista.
	public void insertBeginning(String value) throws ExistentValueException {
		boolean search = false;
		search = search(value);
		if (search == false) {
			Node newNode = new Node();
			if (first == null) {
				newNode.setValue(value);
				setFirst(newNode);
				setLast(newNode);
			} else {
				first.setBefore(newNode);
				newNode.setValue(value);
				newNode.setNext(newNode);
				setFirst(newNode);
			}
		} else {
			throw new ExistentValueException("Value already exist on the list !");
		}
	}

	// Insere valor passado por parametro no fim da lista, se o valor não
	// existir na lista.
	public void insertEnd(String value) throws ExistentValueException {
		Node newNode = new Node();
		boolean search = false;
		search = search(value);
		if (search == true)
			throw new ExistentValueException(EMPTY_LIST);
		else {
			if (last == null) {
				newNode.setValue(value);
				first = newNode;
				last = newNode;
			} else {
				last.setNext(newNode);
				newNode.setValue(value);
				last = newNode;
			}
		}
	}

	/**
	 * @return the first
	 */
	public Node getFirst() {
		return first;
	}

	/**
	 * @param first
	 *            the first to set
	 */
	public void setFirst(Node first) {
		this.first = first;
	}

	/**
	 * @return the last
	 */
	public Node getLast() {
		return last;
	}

	/**
	 * @param last
	 *            the last to set
	 */
	public void setLast(Node last) {
		this.last = last;
	}

}
