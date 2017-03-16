package extra.abstractDoublyLinkedList;

public class RunnerT {
	 public static void main(String[] args) {
	        DoublyLinkList newList = new DoublyLinkList();
	        newList.addFirst("arun");
	        newList.addFirst("prakash");
	        newList.addFirst(70);
	        newList.addFirst(80);
	        newList.addFirst(30);
	        newList.displayList();
	        newList.removeFirst();
	        newList.removeFirst();
	        newList.removeFirst();
	        newList.removeLast();

	        newList.displayList();
	    }
}
