package section14;

public class InputErrorException extends Exception{

	private String messege;
	
	public InputErrorException(String messege) {	// String message = "입력이 잘 못 되었습니다";
		this.messege = messege;
	}
	
	@Override
	public String getMessage() {
		return this.messege;
	}
	
}
