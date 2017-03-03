import java.util.Scanner;


public class Main1761 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[][] arr = new int[N][3];
		
		
		for(int i=0; i<N; i++){
			arr[i][0] = sc.nextInt(); // 부른숫자
		}
		
		sc.close();
		
		fn_equal();
		fn_strike_chk();
		fn_ball_chk();
		for(int i=111; i<=999; i++){
			
		}
	}

	private static void fn_ball_chk() {
		// TODO Auto-generated method stub
		
	}

	private static void fn_strike_chk() {
		// TODO Auto-generated method stub
		
	}

	private static void fn_equal() {
		// TODO Auto-generated method stub
		
	}
}
