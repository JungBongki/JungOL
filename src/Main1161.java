/**  제목 : 하노이의 탑
 *   날짜 : 160910
 */

import java.util.Scanner;

public class Main1161 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.close();
		Hanoi(n, '1', '2', '3');
	}

	private static void Hanoi(int n, char a, char b, char c) {
		
		if(n == 1){
			System.out.println(n + " : " + a + " -> " + c);
		} else {
			Hanoi(n-1, a, c, b);
			System.out.println(n + " : " + a + " -> " + c);
			Hanoi(n-1, b, a, c);
		}
	}
}
