package section06;

public class Array03 {

	public static void main(String[] args) {

		// new 연산자 사용하지 않고 직접 배열 생성 및 값 대입하기
		String[] poketmon = {"피카츄", "라이츄", "파이리", "꼬부기", "버터틀", "야도란"};
		
		for (int i = 0; i < poketmon.length; i++) {
			System.out.println(poketmon[i]);
		}
		
		System.out.println("===================================");
		
		// 배열 값 수정하기
		poketmon[3] = "잠만보";
		
		for (int i = 0; i < poketmon.length; i++) {
			System.out.println(poketmon[i]);
		}
		
		System.out.println("===================================");
		
		// 향상된 for문
		for (String mon : poketmon) {
			// String mon = poketmon[0]
			// String mon = poketmon[1]
			// String mon = poketmon[2]
			// String mon = poketmon[3]
			// String mon = poketmon[4]
			// String mon = poketmon[5]
			System.out.println(mon);
		}
	}

}
