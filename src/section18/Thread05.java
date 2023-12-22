package section18;

public class Thread05 {

	public static void main(String[] args) {

		System.out.println("메인 스레드 시작!");
		
//		new Thread( new Runnable() {
//			
//			@Override
//			public void run() {
//				System.out.println("익명 클래스 스레드");
//			}
//			
//		}).start();
		
		new Thread(() -> {
			
			System.out.println("익명 클래스 스레드");
			
		}).start();
		
		System.out.println("메인 스레드 종료!");
		
	}

}
