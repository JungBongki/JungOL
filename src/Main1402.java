import java.util.Scanner;

public class Main1402 {
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		
		int yak = sc.nextInt(); // 약수구할거
		int min = sc.nextInt(); // min번째 값 추출
		
		int[] arr = new int[yak];
		for(int i=0; i<arr.length; i++){
			arr[i] = 0; // 0으로 초기화
		}
		int result = 0;
		int count = 1; // 첫번째기준
		for(int i=yak; i>0; i--){
			if(yak % i == 0){ // 약수일 경우
				arr[i-1] = yak / i;  // 6기준 arr[0] = 1, arr[1] = 3, arr[2] = 2, arr[5] = 1
				if(count==min){
					result = arr[i-1];
				}
				count++;
			}
		}
		System.out.println(result);
	}
}
