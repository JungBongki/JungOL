import java.util.Scanner;

/**
 * 날짜 : 160924
 * 제목 : 각 자리수의 합 구하기
 */
public class Main2812 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		sc.close();
		
		int result = add(input);
		System.out.println(result);
	}

	private static int add(String input) {
		int add_num = 0;
		for(int i=0; i<input.length();i++){
			int temp = Integer.parseInt(input.substring(i, i+1));
			add_num += temp;
		}
		if(add_num >= 10){
			System.out.println(add_num);
			return add(String.valueOf(add_num));
		}
		return add_num;
	}

}
