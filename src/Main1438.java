import java.util.Scanner;

/**
 * 날짜 : 160908
 * 제목 : 색종이 접기(초)
 * 설명 : 색종이를 좌표상에 입력하여 색종이의 전체면적을 구한다.
 */
public class Main1438 {

	public static void main(String[] args) {

		int[][] pan = new int[100][100];
		
		for(int i=0;i<pan.length;i++){
			for(int j=0;j<pan[i].length;j++){
				pan[i][j] = 0;
			}
		}
			
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for(int i=0; i<n; i++){
			int x = sc.nextInt();
			int y = sc.nextInt();
			for(int ch_i = x; ch_i<x+10; ch_i++){
				for(int ch_j = y; ch_j<y+10; ch_j++){
					pan[ch_i][ch_j] = 1;
				}
			}
		}
		sc.close();
		
		int count = 0;
		for(int i=0;i<pan.length;i++){
			for(int j=0;j<pan[i].length;j++){
				if(pan[i][j] == 1){
					count++;
				}
			}
		}
		System.out.println(count);
		
	}
}
