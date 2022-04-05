package model.exceptions;

public class InvalidPercentageException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public InvalidPercentageException(String message) {
		super(message);
	}
}
