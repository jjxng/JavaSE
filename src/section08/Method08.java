package section08;

public class Method08 {

	public static void main(String[] args) {

		// 기본형 변수 8가지 - byte, short, int, long, float, double, boolean, char
		int num = 10;
		valTest(num);
		System.out.println("num : " + num);
		
		int[] values = {1, 2, 3, 4, 5};
		refTest(values);
		System.out.println("values : " + values[1]);
		
	}

	public static void valTest(int num) {
		num = 7;
	}
	
	public static void refTest(int[] values) {
		values[1] = 20;
	}
}
