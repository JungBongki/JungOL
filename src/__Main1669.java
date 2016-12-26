import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
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
		
		int[] height_best = sort_arr(ssg, 1);
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i=0; i<height_best.length;i++){
			arr.add(height_best[i]); // 4 1 5 9 2
		}
		HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
		for(int i=0; i<arr.size(); i++){
			hash.put(i, arr.get(i));
		}
		
		
		int temp = arr.get(0);
		for(int i=1; i<arr.size(); i++){
			if(arr.get(i) >= temp){
				System.out.println(temp + " 지워짐");
				arr.remove(arr.indexOf(temp));
				i--;
				temp = arr.get(i);
			}
			System.out.println(arr.toString());
		}
		
		
		System.out.println(arr.toString());
	}

	private static int[] sort_arr(int[][] ssg, int code) {
		final int num = code;
		
		Arrays.sort(ssg, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[num] >= o2[num]){
					return 1;
				}
				return -1;
			}
		});
		if(code == 2){
			code = 1;
		} else if(code==1) {
			code = 2;
		}
		int[] result = new int[ssg.length];
		for(int i=0; i<ssg.length; i++){
			result[i] = ssg[i][code];
		}
		return result;
	}
}

