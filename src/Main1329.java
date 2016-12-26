import java.util.Scanner;

public class Main1329 {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		sc.close();
		if(n%2==0 || n>100 || n<0){
			System.out.println("INPUT ERROR!");
		} else {
			for(int i=0; i<n; i++){
				if(i<=n/2){
					for(int j=0; j<i; j++){
						System.out.print(" ");
					}
					for(int j=0; j<2*i+1; j++){
						System.out.print("*");
					}
				}else{
					for(int j=0; j<n-i-1; j++){
						System.out.print(" ");
					}
					for(int j=0; j<(2*(n-i))-1; j++){
						System.out.print("*");
					}
				}
				System.out.println();
			}
		}
		
	}
}
