import java.util.Scanner;

public class Main2074 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int MAXNUM = sc.nextInt();
		sc.close();
		
		int[][] Array = new int[MAXNUM][MAXNUM];
		for(int i=0; i<MAXNUM;i++){
			for(int j=0; j<MAXNUM; j++){
				Array[i][j] = 0;
			}
		}
		int col = 0;  // 3기준으로  [01]
		int row = MAXNUM/2;
		for(int i = 1; i<=MAXNUM*MAXNUM; i++){
			Array[col][row] = i;
			if(i%MAXNUM == 0){
				col++;
				if(col>MAXNUM-1){
					col = 0;
				}
			} else {
				col--;
				row--;
				if(col<0)
					col = MAXNUM -1;
				if(row<0)
					row = MAXNUM -1;
			}
		}
		for(int i=0; i<MAXNUM;i++){
			for(int j=0; j<MAXNUM; j++){
				System.out.print(Array[i][j] + " ");
			}
			System.out.println();
		}
	}
}
