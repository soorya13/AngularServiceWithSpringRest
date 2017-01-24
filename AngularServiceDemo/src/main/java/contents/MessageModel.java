package contents;

public class MessageModel {
	String message;

	public String getMessage() {
		return "Hello "+message+"! Welcome!!";
	}

	public MessageModel(String message) {
		super();
		this.message=message;
		
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
