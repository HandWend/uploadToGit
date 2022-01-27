
public class Elevator {
	
	// field
	int currFloor; 	// 현재 층 
	int floorMax;
	int floorMin;
	// int door;
	boolean doorSW; // f: close, t: open
	int lampSW;		// F: close, t: open
	int weight; 	// 무게
	int nops; 		// 현재 탑승인원
	int nopsMax;	// 최대 탑승인원
	
	// method
	void openDoor() throws InterruptedException {
		System.out.println("문이 열립니다.");
		Thread.sleep(2000);
	}
	void closeDoor() throws InterruptedException {
		System.out.println("문이 닫힙니다.");
		Thread.sleep(2000);
	}
	void downFloor(int currFloor, int finishFloor) throws InterruptedException {
		System.out.println("내려갑니다");
		for (int i = currFloor; i >= finishFloor; i--) {
			System.out.println(i);
			Thread.sleep(1000);
		}
		nops = 0;
	}
	
	void upFloor(int currFloor, int finishFloor) throws InterruptedException {
		System.out.println("올라갑니다");
		for (int i = currFloor; i <= finishFloor; i++) {
			System.out.println(i);
			Thread.sleep(1000);
		}
		nops = 0;
	}
	void buttonCtl() {
		System.out.println("버튼 컨트롤");
	}
	
}
