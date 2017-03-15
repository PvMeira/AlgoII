package extra;

@SuppressWarnings("serial")
public class EmptyListException extends NullPointerException {
	public EmptyListException() {
		super();
	}

	public EmptyListException(String msg) {
		super(msg);
	}
}
