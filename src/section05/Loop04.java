package section05;

public class Loop04 {

	public static void main(String[] args) {
		
		for (int i = 0; i < 7; i++) {
			/*
			 	i = 0, j = 0	print: *
			 */
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
