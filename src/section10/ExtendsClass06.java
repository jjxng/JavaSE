package section10;
/*
 	final 메서드
 		메서드에서 final 선언하면 해당 메서드는 서브클래스에서 오버라이드할 수 없다.
 		오버라이드 불가 메서드
 */

class Dog {
	
	public final void bark() {
		System.out.println("멍멍~");
	}
}

class Jindo extends Dog {
	
//	public void bark() {
//		
//	}
	
}
public class ExtendsClass06 {

	public static void main(String[] args) {

	}

}
