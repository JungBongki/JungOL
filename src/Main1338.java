import java.util.Scanner;

public class Main1338 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		sc.close();

		char[][] Array = new char[input][input];
		char Alpa = 65;
		int route = 0;
		for(int i=0; i<=input; i++){
			route += i;
		}

		int col = 0;
		int row = input-1;
		int count = 0;
		for(int i=0; i<route; i++){
			Array[col][row] = Alpa;
			col++;
			row--;
			if(col>input-1){
				count++;
				col = 0;
				col += count;
				row = input-1;
			}
			Alpa++;
			if(Alpa>90){
				Alpa =65;
			}
		}
		for(int i=0; i<input; i++){
			for(int j=0; j<input; j++){
				System.out.print(Array[i][j] + " ");
			}
			System.out.println();
		}
	}
}
