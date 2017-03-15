package extra;

@SuppressWarnings("serial")
public class ExistentValueException extends Exception {
	public ExistentValueException() {
		super();
	}

	public ExistentValueException(String msg) {
		super(msg);
	}
}