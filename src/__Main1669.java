import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class __Main1669 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] ssg = new int[n][3];
		
		for(int i=0; i<n; i++){
			ssg[i][0] = i;
			ssg[i][1] = sc.nextInt();
			ssg[i][2] = sc.nextInt();
		}
		sc.close();
		
		Arrays.sort(ssg, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[1] >= o2[1]){
					return 1;
				}
				return -1;
			}
		});
		/*for(int i=0; i<n; i++){
			System.out.println(Arrays.toString(ssg[i]));
		}*/
		Map<Integer, Integer> al = new HashMap<Integer, Integer>();

		for (int i = 0; i < ssg.length; i++) {
			al.put(i, ssg[i][2]);
		}
		
		solution(ssg);
	}

	private static void solution(int[][] ssg) {
		/*
		int count = 0;
		boolean flag = true;
		do {
			int temp = 0;
			for (int i = 0; i < ssg.length; i++) {
				if (al.get(i) != null) {
					if (temp <= al.get(i)) {
						temp = al.get(i);
						al.remove(i);
					} else {
						continue;
					}
				}
			}

			//System.out.println(al.toString());
			count++;
			if (al.isEmpty()) {
				flag = false;
			}
		} while (flag);

		System.out.println(count);
		*/
	}
}
/*
	ArrayList<Integer> inner_arr = new ArrayList<Integer>();
	
	int temp = ssg[0][2]; // startpoint
	inner_arr.add(temp);
	int chk = 0; // savepoint
	int sign = 0; // 신호등
	int count = 1;
	do {
		sign = 0;
		for (int i = 1; i <= ssg.length; i++) {
			if (temp <= ssg[i-1][2]) {
				if(!inner_arr.contains(ssg[i-1][2])){
					temp = ssg[i-1][2];
					inner_arr.add(ssg[i-1][2]);
					System.out.println("입력");
				} else {
					System.out.println("이미있음");
				}
			} else if (sign == 0 && temp > ssg[i-1][2]) {
				chk = ssg[i-1][2];
				System.out.println("실패");
				count++;
				sign = 1;
			}
		}
		temp = chk;
	} while (sign==1);
	System.out.println(inner_arr.toString());
	System.out.println(count);
}*/

