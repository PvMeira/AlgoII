package extra.abstractDoublyLinkedList;

import extra.abstractDoublyLinkedList.model.NodeT;

public class DoublyLinkList<T> {
	private NodeT first = null;
	private NodeT last = null;

	public void addFirst(T data) {
		NodeT newNode = new NodeT(data);

		if (isEmpty()) {
			newNode.setNext(null);
			newNode.setPrev(null);
			first = newNode;
			last = newNode;

		} else {
			first.setPrev(newNode);
			newNode.setNext(first);
			newNode.setPrev(null);
			first = newNode;
		}
	}

	public boolean isEmpty() {
		return (first == null);
	}

	public void displayList() {
		NodeT current = first;
		while (current != null) {
			current.toString();
			current = current.getNext();
			System.out.println(current);
		}
		System.out.println();
	}

	public void removeFirst() {
		if (!isEmpty()) {
			NodeT temp = first;

			if (first.getNext() == null) {
				first = null;
				last = null;
			} else {
				first = first.getNext();
				first.setPrev(null);
			}
			System.out.println(temp.toString() + " is popped from the list");
		}
	}

	public void removeLast() {
		NodeT temp = last;

		if (!isEmpty()) {

			if (first.getNext() == null) {
				first = null;
				last = null;
			} else {
				last = last.getPrev();
				last.setNext(null);
			}
		}
		System.out.println(temp.toString() + " is popped from the list");
	}
}
