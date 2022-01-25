/**
 * 스마트폰 클래스
 * @author smart02
 *
 */
public class SmartPhone {
	
	// 멤버 변수
	// 참조형의 기본값은 null
	String caseColor; 		// 폰케이스 색상
	String cameraPixel; 	// 카메라 화소
	String lcdSize; 		// 화면 크기
	String modelName; 		// 모델명
	String toPhoneNumber; 	// 전화번호
	
	// 멤버 메소드
	// 디폴트 생성자
	public SmartPhone() {
		System.out.println("디폴트생성자야");
	}
	
	
	
	public SmartPhone(String caseColor, String cameraPixel, String lcdSize, String modelName, String toPhoneNumber) {
		super();
		this.caseColor = caseColor;
		this.cameraPixel = cameraPixel;
		this.lcdSize = lcdSize;
		this.modelName = modelName;
		this.toPhoneNumber = toPhoneNumber;
	}



	void takingPictures() {
		System.out.println("찰칵");
	}
	/**
	 * 전화 걸기
	 * @param toPhoneNumber
	 */
	void makeACall (String toPhoneNumber) {
		System.out.println(toPhoneNumber + "번호로 전화를 겁니다.");
	}
	/**
	 * 앱 실행
	 * @param appName
	 */
	void playApp (String appName) {
		System.out.println("실행");
	}
}
