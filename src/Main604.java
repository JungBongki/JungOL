import java.util.Scanner;

public class Main604 {
	public static void main(String[] arg){
		int inputData = 10;
		Scanner sc = new Scanner(System.in);
		String[] arr = new String[inputData];
		
		for(int i=0; i<inputData; i++){
			arr[i] = sc.next();
		}
		
		String searchData = sc.next();
		sc.close();
		
		for (int i = 0; i < inputData; i++) {
			String in = arr[i].substring(arr[i].length() - 1, arr[i].length());
			if(searchData.equals(in)){
				System.out.println(arr[i]);
			}
		}
	}
}
