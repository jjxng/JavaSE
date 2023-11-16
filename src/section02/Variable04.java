package section02;
/*
 	4. 실수형
 		실수를 저장할 수 있는 자료형
 		
 		float (4byte) : 부동소수점 형식으로 소수점 7자리 표현
 		double(8byte) : 부동소수점 형식으로 소수점 15자리 표현
 		
 		리터럴(literal)
 			숫자, 문자 등 프로그램에서 사용되는 값 그대로 나타내는 상수값이나 데이터 표현을 의미
*/
public class Variable04 {

	public static void main(String[] args) {

		// double d 생략 가능
		double marathon = 42.195;
		
		// float 숫자 뒤에 f를 붙여야 한다.
		float halfMarathon = 21.0979f;
		
		System.out.println("마라톤은 " + marathon + "km를 달립니다.");
		System.out.println("하프 마라톤은 " + halfMarathon + "km를 달립니다.");
	}

}
