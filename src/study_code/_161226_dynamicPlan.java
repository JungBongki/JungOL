package study_code;

import java.util.Scanner;

public class _161226_dynamicPlan {
	int[] sp = new int[100000000];
	public static void main(String[] args) {
		
		_161226_dynamicPlan sample = new _161226_dynamicPlan();
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		sc.close();
		
		for(int i=0; i<100000000; i++){
			sample.sp[i]=0;
		}
		
		int fib=sample.fibonacci(n);
		System.out.println(fib);
	}
	private int fibonacci(int n) {
		sp[0] = 1;
		sp[1] = 2;
		sp[2] = 4;
		
		for(int i=3;i<n; i++){
			sp[i] = (sp[i-1]+sp[i-2]+sp[i-3])%1000;
		}
		return sp[n-1];
	}

}
