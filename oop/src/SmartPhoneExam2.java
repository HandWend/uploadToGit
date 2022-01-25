
public class SmartPhoneExam2 {

	public static void main(String[] args) {
		// 객체선언 및 생성
		// smartphone이라는 타입, sp = 객체명 / 인스턴스명
		// new 객체 생성하면 sp(객체)를 인스턴스화한다. 
		// 디폴트생성자가 없으면 에러가 난다.
		SmartPhone sp = new SmartPhone(null, null, null, null, "010-9910-0642"); 
		SmartPhone sp2 = new SmartPhone(); 		
		// 객체초기값
		// 속성 : 객체명.속성
		sp.caseColor="violet";
		sp2.caseColor="amond";
		sp.modelName="Galaxy A52s";
		sp2.modelName="iPhone";
		
		// 객체값출력
		System.out.println("SP 휴대폰색상: " + sp.caseColor);
		System.out.println("SP 모델명: " + sp.modelName);
		System.out.println("SP 전화번호: " + sp.toPhoneNumber);
		System.out.println("SP2 휴대폰색상: " + sp2.caseColor);
		System.out.println("SP2 모델명: " + sp2.modelName);
		System.out.println("SP2 전화번호: " + sp2.toPhoneNumber);
		
		// 가비지컬렉션호출
		sp = sp2 = null;
		System.gc();

	}

}
