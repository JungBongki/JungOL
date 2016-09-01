import java.util.Arrays;
import java.util.Scanner;

public class Main192 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int inputData = sc.nextInt();
		String[] arr = new String[inputData];
		
		
		for(int i=0; i<arr.length; i++){
			arr[i] = sc.next();
		}

		sc.close();
		Arrays.sort(arr, String.CASE_INSENSITIVE_ORDER);
		
		/*for(int i=1; i<=inputData; i++){
			for(int j=0; j<i; j++){
				if()
			}
		}*/
		
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
		
		
		
		
	}

}
