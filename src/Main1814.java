import java.util.Arrays;
import java.util.Scanner;


/**
 * @name 삽입정렬 횟수 세기
 * @author Bongki
 *
 */
public class Main1814 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		
		sc.close(); // 10 90 40
		int count =0;
		for(int i=0; i<n; i++){
			for(int j=0; j<i; j++){
				if(arr[j] > arr[i]){
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
