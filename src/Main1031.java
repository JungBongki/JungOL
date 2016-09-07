import java.util.Scanner;

public class Main1031 {
	
	static int ROW = 5;
	static int COL = 5;
	static int[][] correct_pan = new int[ROW][COL];
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[][] bingo = new int[ROW][COL];
		
		int result = 0;
		
		for(int i=0; i<ROW; i++){
			for(int j=0; j<COL; j++){
				bingo[i][j] = sc.nextInt();
			}
		}
		for(int i=0; i<ROW; i++){
			for(int j=0; j<COL; j++){
				correct_pan[i][j] = 0;
			}
		}
		
		for(int count=0; count<ROW*COL; count++){
			int cor = sc.nextInt();
			for(int i=0; i<ROW; i++){
				for(int j=0; j<COL; j++){
					if(cor == bingo[i][j]){
						correct_pan[i][j] = 1;
					}
				}
			}
			int chk = count_pan(correct_pan);
			if(chk >= 3){
				result = count+1;
				break;
			}
		}
		sc.close();
		
		System.out.println(result);
	}

	private static int count_pan(int[][] correct_pan) {
		int dia_L_count=0, dia_R_count=0;
		int chk = 0;
		for(int i=0; i<ROW; i++){
			int row_count=0;
			int col_count=0;
			for(int j=0; j<COL; j++){
				if(correct_pan[i][j]==1){
					row_count++;
				}
				if(correct_pan[j][i]==1){
					col_count++;
				}
				if(row_count==5){
					chk++;
				}
				if(col_count==5){
					chk++;
				}
			}
		} // 가로세로
		
		for(int i=0; i<ROW; i++){
			if(correct_pan[i][i]==1){
				dia_L_count++;
				if(dia_L_count==5){
					chk++;
				}
			}
			if(correct_pan[i][COL-i-1]==1){
				dia_R_count++;
				if(dia_R_count==5){
					chk++;
				}
			}
		} //대각선
		
		return chk;
	}
}
