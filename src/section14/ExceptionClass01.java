package section14;
/*
 	예외(Exception)
 		자바 프로그램에 구동 중에 나타나는 오류를 말한다.
 		문법적으로 문제 없어 보이지만 실제 운영중에 생기는 오류
 	예외처리 방법 : try ~ catch
 		try {
 			실행코드
 		} catch(익셉션클래스 매개변수명) {
 			예외 발생 시 실행코드
 		}
 		
 */
public class ExceptionClass01 {

	public static void main(String[] args) {
		/*	if문으로 예외처리
		int num1 = 10;
		int num2 = 0;
		
		int result = 0;
		
		if (num2 == 0) {
			System.out.println("에러발생! 관리자에게 문의하세요.");
		} else {
			result = num1 / num2;
			System.out.println("result: " + result);
		}
		*/
		
		int num1 = 10;
		int num2 = 0;
		
		try {
			
			int result = num1 / num2;
			System.out.println("result: " + result);
			
		} catch (Exception e) {
			System.out.println("에러발생! 관리자에게 문의하세요.");
			System.out.println("에러메시지: " + e.getMessage());
			e.printStackTrace();
		}
		
	}

}
