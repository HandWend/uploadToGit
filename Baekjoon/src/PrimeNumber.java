/**
 * 1���� 100 ���� ���� �� �Ҽ��� ���Ͻÿ�.
 * �Ҽ�: 1�� �ڱ� �ڽŸ����θ� �������� ��.
 * @author smart02
 *
 */
public class PrimeNumber {

	public static void main(String[] args) {
		
		for (int i = 2; i <=10; i++) {
			// System.out.printf("%d\t", i);
			for (int j =1; j <=i; j++) {
				if (i / j == 1) {
				} else if (i/j == i) {	
					System.out.println(i);
				}
					
			}
				
					
		}	
			
	}
}
		



