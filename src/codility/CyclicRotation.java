package codility;

import java.util.Arrays;
import java.util.Scanner;

public class CyclicRotation {

	public static void main(String[] args) {
		
		int[] A = {3, 8, 9, 7, 6}; 
		int[] res_A = new int[A.length];
		
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		sc.close();
		
		res_A = swap(A, K);
		
		System.out.println(Arrays.toString(res_A));
	}

	private static int[] swap(int[] a, int k) {
		int[] res_a = new int[a.length];
		if(k == 0){
			return a;
		} else {
			for(int i=0; i<a.length;i++){
				int temp = a[i];
				if(i == a.length-1){
					res_a[0] = temp;
				} else {
					res_a[i+1] = temp;
				}
			}
			for(int i=0; i<a.length; i++){
				a[i] = res_a[i];
			}
		}
		return swap(a, k-1);
	}
}
