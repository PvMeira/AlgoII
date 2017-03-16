package extra.abstractDoublyLinkedList.model;

public class NodeT<T> {

	private T data;
	private NodeT next;
	private NodeT prev;
	
	
	public NodeT(T data) {
		this.data = data;
	}

	/**
	 * @return the data
	 */
	public T getData() {
		return data;
	}

	/**
	 * @param data
	 *            the data to set
	 */
	public void setData(T data) {
		this.data = data;
	}

	/**
	 * @return the next
	 */
	public NodeT getNext() {
		return next;
	}

	/**
	 * @param next
	 *            the next to set
	 */
	public void setNext(NodeT next) {
		this.next = next;
	}

	/**
	 * @return the prev
	 */
	public NodeT getPrev() {
		return prev;
	}

	/**
	 * @param prev
	 *            the prev to set
	 */
	public void setPrev(NodeT prev) {
		this.prev = prev;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Data is :" + data + "";
	}

}
