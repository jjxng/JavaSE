package section08;

public class Method02 {

	public static void main(String[] args) {

		printName("도라에몽");
		
		String name = "짱구";
		printName(name);
	}

	// 2. 매개변수(인자) O, 리턴 X -> 인자 값을 받아 실행하는 메서드
								// 매개변수 지역변수이다.
	public static void printName(String name) {	// String name = "도라에몽"
		int age = 10;
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
	}
	
}
