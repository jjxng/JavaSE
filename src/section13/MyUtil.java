package section13;

public class MyUtil {

	public String str1 = "일반 멤버변수";
	public static String str2 = "정적 멤버변수";
	
	public class HelloPrinter {
		
		public void printHello() {
			System.out.println("인스턴스 내부클래스 HelloPrinter 입니다.");
			System.out.println(str1);
			System.out.println(str2);
		}
	}
	
	public static class Calaculator {
		
		public void calc(int a, int b) {
			System.out.println("전달 받은 두 정수의 합: " + (a + b));
//			System.out.println(str1);
			System.out.println(str2);
		}
		
	}
}
