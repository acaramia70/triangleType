package triangletype.triangle;

public class TriangleException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5294479886775513180L;

	public TriangleException (String message, String sides) {
		super(message + ": " + sides);
	}

}
