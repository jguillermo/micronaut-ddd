package example.micronaut.shared.exception;

public class NotFoundRequestException extends LclException {
	private static final long serialVersionUID = 1L;

	public NotFoundRequestException(String message) {
		super(404, 4, message, new Object());
	}

	public NotFoundRequestException(String message, Object data) {
		super(404, 4, message, data);
	}

	public NotFoundRequestException(String message, Object data, int code) {
		super(404, code, message, data);
	}

	public NotFoundRequestException(String message, int code) {
		super(404, code, message, new Object());
	}
}