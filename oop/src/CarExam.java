
public class CarExam {

	public static void main(String[] args) {
		// Car 클래스 객체 car를 생성하시오.
		
		Car car = new Car();
		
		// setXX를 이용하여 값을 설정하시오.
		car.setModelName("세라토");
		car.setSpeed(300);
		// getXX를 이용하여 값을 출력하시오.
		System.out.println("차량은 " + car.getModelName());
		System.out.println("차의 시속은 " + car.getSpeed());
	}

}
