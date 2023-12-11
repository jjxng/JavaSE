package section15;
/*
 	StringBuffer	- Thread(작업 단위) Safe O
 	StringBuilder	- Thread Safe X
 		문자열을 동적으로 다우기 위한 클래스
 */
public class JavaLang04 {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer();
		sb.append("abc");
		System.out.println(sb);
		System.out.println(System.identityHashCode(sb));
		sb.append("def");
		System.out.println(sb);
		System.out.println(System.identityHashCode(sb));

		sb.insert(1, "가나다");
		System.out.println(sb);
		
		sb.delete(2, 3);
		System.out.println(sb);

		sb.reverse();
		System.out.println(sb);
		
		StringBuilder sb2 = new StringBuilder();
		sb2.append("Hello,");
		System.out.println(System.identityHashCode(sb2));
		System.out.println(sb2);
		sb2.append(" Java!");
		System.out.println(sb2);
		System.out.println(System.identityHashCode(sb2));
		
	}

}
