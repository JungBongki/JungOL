/** 날짜 160901
 *  제목 : 약수구하기 
 */
import java.util.Scanner;

public class Main1402 {
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		
		int yak = sc.nextInt(); 
		int min = sc.nextInt(); 
		
		int[] arr = new int[yak];
		for(int i=0; i<arr.length; i++){
			arr[i] = 0; 
		}
		int result = 0;
		int count = 1; 
		for(int i=yak; i>0; i--){
			if(yak % i == 0){ // ����� ���
				arr[i-1] = yak / i;  // 6���� arr[0] = 1, arr[1] = 3, arr[2] = 2, arr[5] = 1
				if(count==min){
					result = arr[i-1];
				}
				count++;
			}
		}
		System.out.println(result);
	}
}
