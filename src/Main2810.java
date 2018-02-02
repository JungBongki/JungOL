import java.util.ArrayList;
import java.util.Scanner;


public class Main2810 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int width = sc.nextInt();
		int depth = sc.nextInt();
		ArrayList<Integer> width_arr = new ArrayList<>();
		ArrayList<Integer> depth_arr = new ArrayList<>();
		sc.close();
		
		for(int i=1; i<=width; i++){
			if(width%i==0){
				width_arr.add(i);
			}
		}

		for(int i=1; i<=depth; i++){
			if(depth%i==0){
				depth_arr.add(i);
			}
		}
		//System.out.println(width_arr.toString());
		//System.out.println(depth_arr.toString());
		int max_num = 0;
		for(int i=0; i<width_arr.size(); i++){
			int n = width_arr.get(i);
			if(depth_arr.contains(n)){
				max_num = n;
			}
		}
		
		//System.out.println((width*depth)/(int)Math.pow(max_num, 2));
		System.out.println((width/max_num)*(depth/max_num));
	}
}
