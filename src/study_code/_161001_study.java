/**  별찍기 응용  
 * 
 */
package study_code;
import java.util.Scanner;

public class _161001_study {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();  // ex) n=5
		sc.close();
		
		for(int i=n; i>0; i--){ // 총 5회반복이므로  (i는 감소수치)
			for(int j=0; j<i-1; j++){ // 1->4 , 2->3 ... ("O"는 감소수치)
				System.out.print("O");
			}
			for(int j=n; j>i-1; j--){ // 1->1 , 2->2 ... ("X"는 증가수치)
				System.out.print("X"); 
			}
			System.out.println(); // 줄 개행
		}
	}
}
