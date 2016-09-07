import java.util.Scanner;

/**
 * 제목 : 큰제곱 - 작은제곱 구하기
 * 작성일 : 160906
 */
public class Main173 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		System.out.println(minus(a,b));
	}

	private static int minus(int a, int b) {
		a = (int) Math.pow(a, 2);
		b = (int) Math.pow(b, 2);
		int result = 0;
		if(a>b){
			result = a-b;
		} else {
			result = b-a;
		}
		return result;
	}
}
