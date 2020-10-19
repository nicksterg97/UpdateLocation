package location.entities;

public class ApiResponse {

	private int statusCode;
	private String message;
	private User user;
	
	
	public ApiResponse(int statusCode, String message) {
		super();
		this.statusCode = statusCode;
		this.message = message;
	}
	
	public ApiResponse(int statusCode, User user) {
		super();
		this.statusCode = statusCode;
		this.user = user;
	}
	


	public ApiResponse(int statusCode, String message, User user) {
		super();
		this.statusCode = statusCode;
		this.message = message;
		this.user = user;
	}
	

	
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	


	
}
