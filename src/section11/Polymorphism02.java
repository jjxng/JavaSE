package section11;

import section11.access1.Bus;
import section11.access1.Car;
import section11.access1.SchoolBus;

public class Polymorphism02 {

	public static void main(String[] args) {

		SchoolBus sBus = new SchoolBus();
		SchoolBus sBus2 = new SchoolBus();
		sBus.drive();
		
		System.out.println(System.identityHashCode(sBus));
		System.out.println(System.identityHashCode(sBus2));
		
		Car car = sBus;
		car.drive();
		
		System.out.println(System.identityHashCode(car));
		
		Bus bus = (Bus)car;
		bus.drive();
		
		System.out.println(System.identityHashCode(bus));
		
	}

}
