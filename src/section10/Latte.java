package section10;

public class Latte extends Espresso{

	int water;
	int milk;
	
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("water: " + water);
		System.out.println("milk: " + milk);
	}
}
