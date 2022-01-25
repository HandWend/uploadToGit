
public class SmartPhoneExam {

	public static void main(String[] args) {
		// 객체선언 및 생성
		// smartphone이라는 타입, sp = 객체명 / 인스턴스명
		// new 객체 생성하면 sp(객체)를 인스턴스화한다. 
		SmartPhone sp = new SmartPhone(); 
		
		// 객체초기값
		// 속성 : 객체명.속성
		sp.caseColor="violet";
		sp.modelName="Galaxy A52s";
		
		
		// 객체값출력
		System.out.println("휴대폰색상: " + sp.caseColor);
		System.out.println("모델명: " + sp.modelName);
		System.out.println("전화번호: " + sp.toPhoneNumber);
		
		// 객체메소드호출
		// 객체명.메소드
		sp.takingPictures();
		sp.makeACall("010-9910-0642");
		sp.playApp("카카오톡");
		
		// 가비지컬렉션호출
		sp = null;
		System.gc();

	}

}
