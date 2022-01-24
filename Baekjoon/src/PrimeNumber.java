/**
 * 1부터 100 사이 숫자 중 소수를 구하시오.
 * 소수: 1과 자기 자신만으로만 나눠지는 수.
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
		



