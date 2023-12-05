package section09;

public class Coffee {

	public String beans;	// 원두
	public int water;		// 물
	
	public Coffee() {
		
		this.beans = "콜롬비아";
		this.water = 30;
	
		System.out.println("에스프레소");
		
	}
	
	public Coffee(int water) {
		
		this();		// 자기 자신 생성자
		this.water += water;
		
		System.out.println("아메리카노");
		
	}
	
	public Coffee(String beans) {
		
		this.beans = beans;
		this.water = 30;
		System.out.println(beans + "에스프레소");
		
	}
	
	public Coffee(String beans, int water) {
		
		this.beans = beans;
		this.water += water;
		System.out.println(beans + "아메리카노");
		
	}
	
	public void printInfo() {
		
		System.out.println("beans: " + beans);
		System.out.println("water: " + water);
		
	}
	
}
