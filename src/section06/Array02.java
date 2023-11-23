package section06;

public class Array02 {

	public static void main(String[] args) {

		// 문자열 배열객체 생성하기
		String[] poketmon = new String[6];
		
		// 배duf 값 대입하기
		poketmon[0] = "피카츄";
		poketmon[1] = "라이츄";
		poketmon[2] = "파이리";
		poketmon[3] = "꼬부기";
		poketmon[4] = "버터플";
		poketmon[5] = "야도란";
		
		// 값 가져오기
		System.out.println(poketmon[3]);
		
		// 배열의 길이
		System.out.println(poketmon.length);
		
		// 배열 for문을 사용하여 전체 출력하기
		for (int i = 0; i < poketmon.length; i++) {
			System.out.println(poketmon[i]);
		}
	}

}
