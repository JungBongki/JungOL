import java.util.Scanner;

public class Main1516 {
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		String msg = "";
		msg = sc.nextLine(); // i am boy boy boy
		String[] arr = msg.split(" "); // i . am . boy . boy . boy
		
		String[] sub_arr = new String[arr.length];
		for(int i=0; i<sub_arr.length; i++){
			sub_arr[i] = arr[i].substring(0, 1);
		}
		/*int[] count = new int[arr.length];
		for(int i = 0; i < arr.length; i++){
			count[i] = 1; // 1 . 1 . 1 . 1
		}
		for(int i = 1; i<arr.length; i++){
			for(int j=0; j<i; j++){
				if(arr[i].equals(arr[j])){
					count[i]++;
				}
			}
		}
		
		
		for(int i=0; i<arr.length; i++){
			System.out.println(count[i]);
		}*/
	}
}
