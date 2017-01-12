import java.util.Scanner;


public class Main1183 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[6];
		
		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}

		sc.close();
		/*13
		4 5 2 6 3 4*/
		int[] result = new int[arr.length];
		int temp = n;
		int swap = 0;
		for(int i=arr.length-1; i>=0; i--){ // 1의자리부터
			for(int j=0; j<=arr[i]; j++){ // 0~4
				int guess = n - j;
				if(guess%5 == 0){ //3
					temp = n-j;
					if(swap < guess){
						swap = guess;
					}
				}
			}
			result[i] = swap;
		}
		
		
		
	}
}
