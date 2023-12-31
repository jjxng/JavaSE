package section04;
/*
 	환불 상태코드
 		01 : 환불신청중
 		02 : 환불처리중
 		03 : 환불취소
 		04 : 계좌이체중
 		05 : 환불완료
 		
 		01, 02, 04 상태일 때 환불 불가
 */
public class Conditional05 {

	public static void main(String[] args) {

		String rtCd = "02";
		switch (rtCd) {
		case "01":
		case "02":
		case "04":
			System.out.println("환불불가, 관리자에게 문의하세요.");
			System.out.println("환불상태코드: "+ rtCd);
			break;

		default:
			break;
		}
		
		
		if (rtCd == "01" || rtCd == "02" || rtCd == "04") {
			System.out.println("환불불가, 관리자에게 문의하세요.");
			System.out.println("환불상태코드: "+ rtCd);
		} 
	}

}
