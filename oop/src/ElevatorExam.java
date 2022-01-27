import java.util.Scanner;

public class ElevatorExam {

	public static void main(String[] args) throws Exception {
		Elevator ee = new Elevator();
		ee.currFloor = 1;
		ee.floorMax = 4;
		ee.floorMin = 1;
		ee.weight = 550;
		ee.nopsMax = 8;		// 8명
		
		
		Scanner scan = new Scanner(System.in);
		
		int menuNum = 0;
		
		System.out.println("현재 계신 층을 눌러주세요");
		switch (scan.next()) { // next = 한 단어를 받아옴.
		
		case "1상":
			ee.currFloor = 1;
			ee.openDoor();
			System.out.println("올라갑니다.");
			ee.closeDoor();
			break;

		default:
			break;
		}
		
		
		while (true) {
			System.out.println("===메뉴선택===");
			System.out.println("1: 층이동");
			System.out.println("2: 현재층");
			System.out.println("0: 종료");
			menuNum = scan.nextInt();
			switch (menuNum) {
			case 0:
				System.exit(0); // system.exit(int); int 안에 들어갈 것은 숫자면 됨. 아무 숫자.
				break;
			case 1:
				System.out.println("탑승인원은 몇 명입니까?");
				ee.nops += scan.nextInt();
				if (ee.nops > ee.nopsMax) {
					System.out.println("미안합니다. 내리세요.");
				}
				System.out.println("이동할 층을 눌러주세요");
				int finishFloor = scan.nextInt();
				if (finishFloor <= ee.floorMax && finishFloor >=ee.floorMin) {
					System.out.println("현재 층은 " + ee.currFloor);
					System.out.println("이동할 층은 " + finishFloor);
					
					if (ee.currFloor < finishFloor) {
						ee.upFloor(ee.currFloor, finishFloor);
						
					} else if (ee.currFloor > finishFloor){
						ee.downFloor(ee.currFloor, finishFloor);
					}
					ee.currFloor = finishFloor;
				
				} else {
					System.out.println("처음부터 다시 하세요.");
				}
				break;
				
			case 2:
				System.out.println("현재 층은 " + ee.currFloor);
				break;
				

			default:
				break;
			}
			
//			System.out.println("■ 이동할 층을 눌러주세요");
//			int finishFloor = scan.nextInt();
//			System.out.println("이동할 층은 " + finishFloor);
			
			
		}
	}

}
