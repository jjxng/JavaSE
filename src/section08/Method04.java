package section08;

public class Method04 {

	public static void main(String[] args) {

		System.out.println("args[0] : " + args[0]);
		System.out.println("args[1] : " + args[1]);
		
		String[] poketmons = {"피카츄", "라이츄", "파이리"};
		printPoketmons(poketmons);
		
	}

	// 4. 매개변수(인자) 배열타입 O, 리턴 X -> 
	public static void printPoketmons(String[] poketmons) {
		
//		for (int i = 0; i < poketmons.length; i++) {
//			System.out.println(poketmons[i]);
//		}
		
		// 향상된 for문
		for (String poketmon : poketmons) {
			System.out.println(poketmon);
		}
		
	}
	
}
