import java.util.Arrays;
import java.util.Scanner;

/**
 * @name 오류교정(패러티비트)
 * @author Bongki
 *
 */
public class Main1037 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[][] bit = new int[n][n];
		
		for(int i=0;i<n;i++){
			for(int j=0; j<n; j++){
				bit[i][j] = sc.nextInt();
			}
		}
		
		sc.close();
		
		int[] arr_rows = new int[n];
		int[] arr_cols = new int[n];
		
		for(int i=1; i<=n; i++){
			int sumRow = 0;
			int sumCol = 0;
			for(int j=1; j<=n; j++){
				sumRow += bit[i-1][j-1];
				sumCol += bit[j-1][i-1];
			}
			arr_rows[i-1] = sumRow;
			arr_cols[i-1] = sumCol;
		}
		
		//System.out.println(Arrays.toString(arr_rows));
		//System.out.println(Arrays.toString(arr_cols));
		
		for(int i=0; i<n; i++){
			arr_rows[i] = arr_rows[i]%2;
			arr_cols[i] = arr_cols[i]%2;
		}
		//System.out.println(Arrays.toString(arr_rows));
		//System.out.println(Arrays.toString(arr_cols));
		int r = chk(arr_rows);
		int c = chk(arr_cols);
		if(r==0&&c==0){
			System.out.println("OK");
		} else if(r==1&&c==1){
			for(int i=0; i<n; i++){
				if(arr_rows[i] == 1){
					r = i;
				} 
				if(arr_cols[i] == 1){
					c = i;
				}
			}
			System.out.println("Change bit ("+(++r)+","+(++c)+")");
		} else {
			System.out.println("Corrupt");
		}
	}

	private static int chk(int[] arr) {
		int sum = 0;
		for(int i=0; i<arr.length; i++){
			sum += arr[i];
		}
		return sum;
	}
}
