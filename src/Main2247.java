import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/** 
 * @author Bongki
 * @date 161228
 * @name 도서관 시간
 */
public class Main2247 {
	static int max_time = 0;
	static int empty_time = 0;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] time = new int[n][2];
		for(int i=0; i<time.length; i++){
			time[i][0] = sc.nextInt();
			time[i][1] = sc.nextInt();
		}
		
		sc.close();
		
		Sort(time);
		/*for(int i=0; i<time.length; i++)
		System.out.println(Arrays.toString(time[i]));*/
		
		int start = time[0][0]; // 초기 start
		int end = time[0][1]; // 초기end

		for(int i=1; i<time.length; i++){
			int next = time[i][0];
			if(next >= start && next <= end){ // 그 시간대에 사람이 늘어남
				if(end < time[i][1]){
					end = time[i][1];
				}
			} else { // max_time 추출
				Extract_time(start, end, i, time);
			}
			if(i+1 == time.length){ //마지막 종료 시 다시한번 Extract
				Extract_time(start, end, i, time);
			}
		}
		System.out.println(max_time + " " + empty_time);
	}

	private static void Extract_time(int start, int end, int i, int[][] time) {
		int temp = end-start;
		if(temp > max_time){
			max_time = temp;
		}
		int temp2 = time[i][0]-end;
		if(temp2 >= empty_time){
			empty_time = temp2;
		}
		start = time[i][0];
		end = time[i][1];
	}

	private static void Sort(int[][] time) {
		
		Arrays.sort(time, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[0]>=o2[0]? 1 : -1;
			}
		});
		
	}

}
