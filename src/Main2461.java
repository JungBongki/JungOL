import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class Main2461 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int [][] arr = new int[n][4];
		
		for(int i=0; i<arr.length;i++){
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
			arr[i][2] = sc.nextInt();
			arr[i][3] = sc.nextInt();
		}
		
		Arrays.sort(arr, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				int st_mon = o1[0];
				int st_day = o1[1];
				int ed_mon = o2[0];
				int ed_day = o2[1];
				return o1[0]>=o2[0]? 1: -1;
			}
		});
		for(int i=0; i<arr.length;i++){
			System.out.println(Arrays.toString(arr[i]));
		}
	}
	
}