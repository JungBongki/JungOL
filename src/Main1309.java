import java.util.Scanner;

/**
 * 날짜 : 160908
 * 제목 : 팩토리얼 계산
 * 설명 : 팩토리얼을 콘솔에 계산식을 쭉 결과를뽑아낸다
 */
public class Main1309 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Long n = sc.nextLong();
		sc.close();
		Long result = factorial(n);
		System.out.println(result);
	}

	private static Long factorial(Long n) {

		String sik = String.valueOf(n) + "! = " + String.valueOf(n) + " * " + String.valueOf(n-1) + "!";
		
		if(n == 1){
			System.out.println(String.valueOf(n) + "! = " + String.valueOf(n));
			return n;
		}
		System.out.println(sik);
		return n * factorial(n-1);
	}

}
