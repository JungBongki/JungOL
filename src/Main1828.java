import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main1828 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] cami = new int[n][2];
		
		for(int i=0; i<n; i++){
			cami[i][0] = sc.nextInt();
			cami[i][1] = sc.nextInt();
		}
		sc.close();
		
		Sort(cami);
		
		ArrayList<ARG> arr = new ArrayList<ARG>();
		ARG arg;
		for(int i=0; i<cami.length; i++){
			arg = new ARG();
			arg.setMin_val(cami[i][0]);
			arg.setMax_val(cami[i][1]);
			arr.add(arg);
		}
		//System.out.println(arr.toString());
		Map<Integer, Integer> a1 = new HashMap<Integer, Integer>();
		Map<Integer, Integer> a2 = new HashMap<Integer, Integer>();

		for (int i = 0; i < n; i++) {
			a1.put(i, arr.get(i).getMin_val()); //기준    -15 -10 10 27
			a2.put(i, arr.get(i).getMax_val()); //참고 
		}

		int count = 0;
		int ca = 0;
		boolean flag = true;
		do {
			count++;
			int min = a1.get(ca); // 이전 시약의 최저
			int max = a2.get(ca); // 이전 시약의 최고
			for (int i = 1; i < n; i++) {
				if(a1.get(i)!=null){
					if (a1.get(i) >= min && a1.get(i) <= max) { // 전꺼 최저보다 크고 전거 최고보다 낮을때
						if(max >= a2.get(i)){
							max = a2.get(i);
						}
						a1.remove(i);
					} else {
						a1.remove(ca);
						ca = i;
						break;
					}
				}
			}
			
			//System.out.println("남은것 : " + a1.toString());
			if (a1.isEmpty()) {
				flag = false;
			}
		} while (flag);
		System.out.println(count);
	}
	private static void Sort(int[][] temp){
		Arrays.sort(temp, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[0]>o2[0] ? 1 : -1;
			}
		});
	}
	
}

class ARG{
	private int min_val;
	private int max_val;
	public int getMin_val() {
		return min_val;
	}
	public void setMin_val(int min_val) {
		this.min_val = min_val;
	}
	public int getMax_val() {
		return max_val;
	}
	public void setMax_val(int max_val) {
		this.max_val = max_val;
	}
	@Override
	public String toString() {
		return "val [min_val = "+min_val+" , max_val = " + max_val + "]";
	}
	
}