package section15;

import java.util.Arrays;

/*
 	String 메서드
 */
public class JavaLang05 {

	public static void main(String[] args) {

		// 문자열 길이 length
		String str1 = "ABCDEFGHIJK";
		System.out.println("length: " + str1.length());
		
		// 문자열이 지정한 문자로 시작하는지 판단
		String str2 = "apple";
		boolean startsWith = str2.startsWith("a");
		System.out.println("startsWith: " + startsWith);
		
		// 문자열 마지막에 지정한 문자가 있는지 판단
		String str3 = "text";
		boolean endsWith = str3.endsWith(str3);
		System.out.println("endsWith: " + endsWith);
		
		// 문자 인덱스 번호 반환
		String str4 = "abcdef";
		int indexOf = str4.indexOf("d");
		System.out.println("indexOf: " + indexOf);
		
		// 문자열에 지정한 문자가 마지막 몇번째 있는지 int로 반환
		String str5 = "AndroidApp";
		int lastIndexOf = str5.lastIndexOf("A");
		System.out.println("lastIndexOf: " + lastIndexOf);
		
		// 문자열 치환
		String str6 = "A*B*C*D";
		String replace = str6.replace("*", "-");
		System.out.println("replace: " + replace);
		
		// 문자열 나누기 배열로 반환
		String str7 = "A:B:C:D:E:F:G:abcdefg";
		String[] splitArr = str7.split(":");
		for (String split : splitArr) {
			System.out.println(split);
		}
		
		System.out.println(Arrays.toString(splitArr));
		
		// 문자열 절삭
		String str8 = "abcDEF";
		String subString = str8.substring(0, 2);
		System.out.println("subString: " + subString);
		
		// 소문자 변환
		String str9 = "abcDEF";
		String toLowerCase = str9.toLowerCase();
		System.out.println("toLowerCase: " + toLowerCase);
		
		// 대문자 변환
		String str10 = "abcDEF";
		String toUpperCase = str10.toUpperCase();
		System.out.println("toUpperCase: " + toUpperCase);
		
		// 공백제거
		String str11 = "	java java java		";
		String trim = str11.trim();
		System.out.println("trim: " + trim);
		
		// 공백제거2
		String str12 = "      java java java     ";
		String replace2 = str12.replace(" ", "");
		System.out.println("relplace2: " + replace2);
		
		// 문자비교
		String str13 = "A";
		String str14 = "B";
		int compareTo = str13.compareTo(str14);
		System.out.println("compareTo: " + compareTo);
		
		// 문자 포함여부
		String str15 = "abcd";
		String str16 = "cd";
		boolean contains = str15.contains(str16);
		System.out.println("contains: " +contains);
	}

}
