import java.util.Arrays;
import java.util.Scanner;

/**
 * 날짜 : 160907
 * 제목 : 숫자의 갯수
 * 설명 : A * B * C 의 값에 포함되어 있는 숫자의 갯수를 구하여라 
 */
public class Main1430 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		sc.close();
		int[] count = new int[10];
		
		long result = a * b * c;  // 10 10 20 

		do{
			long temp = result % 10; // 첫번째자리
			for (int i = 0; i < count.length; i++) {
				if(i == temp){
					count[i]++;
				}
			}
			result = result / 10;
		}while(result>0);
		
		for(int i=0; i<count.length; i++){
			System.out.println(count[i]);
		}
	}
}
