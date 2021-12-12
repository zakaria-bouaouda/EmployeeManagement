package ma.ginfo.bouaouda.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class RessourcesNotFoundException extends RuntimeException{

	private static final long serialVersionUID=1L;
	public RessourcesNotFoundException(String message) {
		super(message);
	}
}
