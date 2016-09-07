import java.util.Scanner;

/**
 * date : 160906 
 * name : 제곱구하기
 */
public class Main178 {

	static int NUM = 2;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int NUM = 2;
		int result = square(n, NUM);
		System.out.println(result);
	}
	private static int square(int n, int num) {
		return n>1? num*square(n-1, num) : num;
	}


}
