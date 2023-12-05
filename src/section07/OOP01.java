package section07;
/*
 	객체지향 프로그래밍(OOP - Object Oriented Programming)
 		프로그램을 작성할 때 데이터와 데이터를 연산하는 메서드를
 		객체(하나의 논리적 단위)로 묶는 방식의 프로그래밍
 	
 	객체(Object)
 		물리적으로 존재하거나, 추상적으로 생각할 수 있는 것
 		식별 가능하고 정의 가능한 것
 		
 	ex) 물리적인 객체 - 컴퓨터, 모니터, 키보드, 마우스 자동차, 사람, 고양이 ...
 		추상적인 객체 - 주문, 게임유닛, 재무제표 ...
 		
 	객체의 구성요소
 		1) 속성 - 변수
 		2) 기능 - 메서드
 		3) 생성자 - 객체 초기화
 		
 		// 클래스
 	ex) 티모 객체
 		// 변수
 		속성 1) hp - 300
 			2) mp - 200
 			3) speed - 5
 			
 		// 메서드
 		기능 1) 실명 - 상대 챔프 침묵 + 독데미지
 			2) 신속한 이동 - 3초간 speed + 2
 		
 	클래스(Class)
 		객체를 생성하기 위한 제작 설명서
 		Class로 작성된 코드를 읽어 인스턴스화(객체화) -> 메모리에 저장 또는 load
 		- 붕어빵 틀, 와플 기계
 		
 	클래스 구조
 		[접근 제한자] class 클래스명 [extends 부모클래스] [implements 인터페이스] {
 		
 			[생성자] 						=> 초기화
 			변수(멤버변수, 인스턴스변수, 필드)	=> 속성
 			메서드(멤버메서드, 인스턴스메서드)	=> 기능
 			
 		}
 		
 	객체화 방법 - new 연산자로 객체화 가능
 		클래스명(타입) 변수명 = new 클래스();
 		
 	가비지 콜렉터(Garbage Collector)
 		자바에서 동적으로 할당된 메모리 중에서 더이상 사용되지 않는 메모리를 해제하는 기능을 수행하는 프로그램
 */
public class OOP01 {

	public static void main(String[] args) {

		Car car1 = new Car();
		Car car2 = new Car();
		
		System.out.println("====car1====");
		System.out.println(car1);
		System.out.println(car1.model);
		System.out.println(car1.price);
		System.out.println(car1.fuel);
		System.out.println(car1.range);
		System.out.println(car1.fuelEffic);
		System.out.println(car1.powerOutput);
		System.out.println(car1.battery);
		
		System.out.println("====car2====");
		car2.price = 4000;
		System.out.println(car2);
		System.out.println(car2.model);
		System.out.println(car2.price);
		System.out.println(car2.fuel);
		System.out.println(car2.range);
		System.out.println(car2.fuelEffic);
		System.out.println(car2.powerOutput);
		System.out.println(car2.battery);
	}

}
