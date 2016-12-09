import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @name 회의실배정
 * @author Bongki
 * @requirement 최대한 많은 회의실을 배정하라.
 */
public class Main1370 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 총 회의 수
		
		int[][] d = new int[n][3];
		
		for(int i=0; i<n; i++){
			d[i][0] = sc.nextInt(); // 회의번호
			d[i][1] = sc.nextInt(); // 회의시작시간
			d[i][2] = sc.nextInt(); // 회의종료시간
		}
		sc.close();
		Sort(d);
		/*for(int[] room : d){
			System.out.printf("%d %2d %2d\n", room[0], room[1], room[2]); 
		}
		System.out.println();*/
		ArrayList<Integer> answer = Soluation(d, n);
		for(Integer room : answer){
			System.out.print(room + " ");
		}
	}

	private static void Sort(int[][] d) {
		Arrays.sort(d, new Comparator<int[]>() {

			@Override
			public int compare(int[] i, int[] j) { //회의순정렬을 위한 override
				return i[2]>j[2]? 1: -1;
			}
		});
	}

	private static ArrayList<Integer> Soluation(int[][] d, int n) {
		ArrayList<Integer> answer = new ArrayList<Integer>();
		int count = 1;
		int j = 0;
		answer.add(d[0][0]);
		for(int i=0; i<d.length-1; i++){
			if(d[j][2] <= d[i+1][1]){
				answer.add(d[i+1][0]);
				j = i+1;
				count++;
			}
		}
		System.out.println(count);
		return answer;
	}
}
