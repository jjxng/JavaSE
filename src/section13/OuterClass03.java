package section13;

public class OuterClass03 {

	public static void main(String[] args) {

		MyUtil mu = new MyUtil();
		MyUtil.HelloPrinter hp = mu.new HelloPrinter();
		hp.printHello();
		
		MyUtil.HelloPrinter hp2 = new MyUtil().new HelloPrinter();
		hp2.printHello();
		
		MyUtil.Calaculator calc = new MyUtil.Calaculator();
		calc.calc(10, 20);
		
	}

}
