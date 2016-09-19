import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/** 날짜 : 160910
 *  제목 : 369게임
 *  설명 : 3의 배수이거나 숫자에 3,6,9가 들어가 있으면 count
 *  
 */
public class _Main2861 {
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String A = ""; 
		try {
			A = br.readLine();
		} catch (IOException e) {
			// TODO 자동 생성된 catch 블록
			e.printStackTrace();
		}
		String[] arg = A.split(" ");
	}
}

/*
 * public static void main(String[] args) { Scanner sc = new Scanner(System.in);
 * 
 * 
 * int A = sc.nextInt(); int B = sc.nextInt(); int count = 0; int flag = 0;
 * while(A <= B){ flag = wh(A, 10); if(A%3==0 || flag == 1){ count++; } A++; }
 * 
 * for(int i=A; i<=B; i++){
 * 
 * 
 * boolean flag = Contain369(i); if(i % 3 == 0 || flag){ count++; } }
 * System.out.println(count % 20150523); }
 * 
 * private static int wh(int a, int k) { if(a % k == 3 || a % k == 6 || a % k ==
 * 9){ return 1; } if(a / k >= 1){ return wh(a/10, k); } else { return 0; } }
 */
