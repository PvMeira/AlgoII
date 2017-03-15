package extra;

public class Node {
	private Node before;
	private Node next;
	private String value;
	/**
	 * @return the before
	 */
	public Node getBefore() {
		return before;
	}
	/**
	 * @param before the before to set
	 */
	public void setBefore(Node before) {
		this.before = before;
	}
	/**
	 * @return the next
	 */
	public Node getNext() {
		return next;
	}
	/**
	 * @param next the next to set
	 */
	public void setNext(Node next) {
		this.next = next;
	}
	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}
	
	
}
