import java.util.Scanner;

public class Main1307 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int MAXNUM = sc.nextInt();
		sc.close();
		
		char ch = 65;
		char[][] Array = new char[MAXNUM][MAXNUM];
		
		for(int i=MAXNUM-1; i>=0; --i){
			for(int j=MAXNUM-1; j>=0; --j){
				Array[j][i] = ch;
				ch++;
				if(ch>90){
					ch=65;
				}
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
