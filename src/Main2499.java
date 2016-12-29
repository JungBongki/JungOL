import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;


/**
 * @author Bongki
 * @date 161228
 * @name 저울(잴 수 없는 최소무게)
 */
public class Main2499 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		final int N = sc.nextInt();
		int[] input = new int[N];
		for(int i=0; i<N; i++){
			input[i] = sc.nextInt();
		}
		Arrays.sort(input);
		//System.out.println(possible.toString());
		
		int sum = input[0];
		/*for(int i=1; i<N && sum+1>=input[i]; i++){ // 처음알았따
			sum += input[i];
		}*/
		for(int i=1; i<N; i++){
			if(sum+1 < input[i]){
				break;
			} else {
				sum+= input[i];
			}
		}
		if(input[0]!=1){
			System.out.println("1");
		} else {
			System.out.println(sum+1);
		}
		sc.close();
		
	}
}
