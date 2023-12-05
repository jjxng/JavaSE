package section09;

public class Constructor02 {

	public static void main(String[] args) {

		Tteokbokki tteokbokki = new Tteokbokki("엽떡", "밀떡", "고추장", true, 2);
		
		tteokbokki.printInfo();
		
		System.out.println("=============================");
		
		Tteokbokki tteokbokki2 = new Tteokbokki();
		tteokbokki2.printInfo();
		
	}

}
