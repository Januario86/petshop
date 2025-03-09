package exceptions;

public class UsuarioNotFoundException extends RuntimeException {
   
	private static final long serialVersionUID = 1983428351271356200L;

	public UsuarioNotFoundException(String message) {
        super(message);
    }
}