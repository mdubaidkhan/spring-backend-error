package ubaid.group.onlinebank.exception;

import org.springframework.http.HttpStatus;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class BankAppException extends RuntimeException {
	
	private HttpStatus status;
	private String message;

	public BankAppException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BankAppException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public BankAppException(HttpStatus status, String message) {
		this.status = status;
		this.message = message;
	}
	
	

}
