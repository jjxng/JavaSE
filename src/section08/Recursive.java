package section08;
/*
 	재귀메서드(Recurive Method)
 		메서드 내에서 자기 자신을 호출하는 프로그래밍 기술
 */
public class Recursive {

	public static void recursivePrintNumber(int n) {
		
		if (n > 0) {
			System.out.println(n);
			recursivePrintNumber(n - 1);
		} 
	}
	
	public static void main(String[] args) {
		
		recursivePrintNumber(10);
		
	}
	
}
