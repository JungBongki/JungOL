import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/** 날짜 : 160910
 *  제목 : 369게임
 *  설명 : 3의 배수이거나 숫자에 3,6,9가 들어가 있으면 count
 *  
 */

public class _Main2861 {
	
	static int count=0;
	
	public static void main(String[] args){
		long start = System.currentTimeMillis();
		Scanner sc = new Scanner(System.in);
		final int max = 20150523;
		final int clap = 11194726;  // 1~20150523 내에 박수친 숫자
		
		long a = sc.nextLong();
		long b = sc.nextLong();
		
		sc.close();
		
		for(long i=a;i<=b;i++){
			if(i%3==0){
				count++;
			} else {
				pandoc(i);
			}
		}
		
		
		System.out.println(count);
		long end = System.currentTimeMillis();

		System.out.println( "실행 시간 : " + ( end -	 start )/1000.0 ); 

	}

	private static void pandoc(long i) { // 12
		long j = i % 10;
		if(j == 3 || j == 6 || j == 9){
			count++;
		} else if(i>=10) {
			pandoc(i/10);
		}
	}
} // 수행시간 O(n)*/
