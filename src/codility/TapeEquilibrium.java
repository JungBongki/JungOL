package codility;

import java.util.Arrays;

public class TapeEquilibrium {

	public static void main(String[] args) {
		
		int[] A = {-10, -5, -3, -4, -5};
		
/*		System.out.println(Arrays.toString(B));
		System.out.println(Arrays.toString(A));*/
		
		int def = 0;
		int Addnum = 0;
		for(int i : A){
			Addnum += i;
		}
		int min = Integer.MAX_VALUE;
		for(int P=1; P<A.length; P++){
			def += A[P-1]; 
			Addnum -= A[P-1];
			int abs_key = Math.abs(def-Addnum);
			if(min > abs_key){
				min = abs_key;
			}
		}
		System.out.println(min);
	}
}
