package study_code;

import java.util.Scanner;

/**
 * @Question Knap sack(보석훔치기)
 * @author Bongki
 * @value size = 30 
 */

public class _161209_study {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int bag = sc.nextInt();
		
		jewE jew[] = new jewE[n+1];
		for(int i=0; i<n; i++){
			jew[i] = new jewE(sc.nextInt(), sc.nextInt());
		}
		int[][] profit_table = new int[n+1][bag+1];
		sc.close();
		
		
		for(int i=1; i<profit_table.length; i++){
			for(int j=1; j<profit_table[i].length; j++){
				if(jew[i].weight > j){
					profit_table[i][j] = profit_table[i-1][j];
				} else {
					profit_table[i][j] = MAX(jew[i].profit+profit_table[i-1][j-jew[i].weight],profit_table[i-1][j]);
				}
			}
		}
		System.out.println(profit_table[n][bag]);
	}
	
	public static int MAX(int a, int b){
		return a>b?a:b;
	}
}


class jewE{
	int weight;
	int profit;
	public jewE(int weight, int profit) {
		this.weight = weight;
		this.profit = profit;
	}
}