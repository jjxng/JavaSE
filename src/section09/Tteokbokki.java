package section09;

public class Tteokbokki {

	// 속성
	public String brand;
	public String riceCake;
	public String sauce;
	public boolean isCheese;
	public int spicyLv;

	public Tteokbokki() {
		this.brand = "죠스";
		this.riceCake = "쌀";
		this.sauce = "고추장";
		this.isCheese = false;
		this.spicyLv = 1;
	}
	
	// 오버로딩
	public Tteokbokki(String brand, String riceCake, String soauce,
						boolean isCheese, int spicyLv) {
		this.brand = brand;
		this.riceCake = riceCake;
		this.sauce = soauce;
		this.isCheese = isCheese;
		this.spicyLv = spicyLv;
	}
	
	public void printInfo() {
		System.out.println("brand: " + brand);
		System.out.println("riceCake: " + riceCake);
		System.out.println("soauce: " + sauce);
		System.out.println("isCheese: " + isCheese);
		System.out.println("spicyLv: " + spicyLv);
	}
}
