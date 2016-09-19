import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class _Main1011 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] count = new int[n];
		
		int Maxnum = sc.nextInt();
		List<Integer> arg = new ArrayList<>();
		
		for(int i=1; i<=Maxnum; i++){
			boolean flagSosu = false;
			int ap = 0;
			for(int j=2; j<=i; j++){
				if(i % j == 0){
					ap++;
				}
			}
			if(ap == 1){
				flagSosu = true;
			}
			System.out.println(flagSosu + " = " + i);

			if((i)%3 == 0 || flagSosu){
				System.out.println("넘어왔따");
				count[(i-1)%n]++;
			}
		}
		System.out.println(Arrays.toString(count));
	}

	private static int sosu(int i) {
		int flagSosu = 0;
		int ap = 0;
		for(int j=1; j<=i; j++){
			if(i % j == 0){
				ap++;
			}
		}
		if(ap == 2){
			flagSosu = 1;
		}
		return flagSosu;
	}
}
