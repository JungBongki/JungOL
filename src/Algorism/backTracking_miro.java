package Algorism;

import java.util.Arrays;
import java.util.Scanner;

public class backTracking_miro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[][] miro = new int[n][n];

		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				miro[i][j] = sc.nextInt();
			}
		}
		
		sc.close();
		for(int i=0; i<miro.length;i++){
			System.out.println(Arrays.toString(miro[i]));
		}
		
	}
}
