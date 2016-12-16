import java.util.Scanner;


public class Main1719 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int line = sc.nextInt();
		int n = sc.nextInt();
		
		sc.close();

		switch (n) {
		case 1:
			right_triangle(line);
			break;
		case 2:
			left_triangle(line);
			break;
		default:
			System.out.println("INPUT ERROR!");
			break;
		};
	}

	private static void left_triangle(int line) {
		for(int i=0; i<line; i++){ //0~4
			if(line/2 >= i){ //20 21 22
				for(int j=0; j<line/2-i; j++){
					System.out.print(" ");
				}
				for(int j=0; j<=i; j++){
					System.out.print("*");
				}
			} else { //23 24
				for(int j=0; j<i-line/2; j++){
					System.out.print(" ");
				}
				for(int j=0; j<line-i; j++){
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

	private static void right_triangle(int line) { // 5
		for(int i=0; i<line; i++){ //1~5
			if(line/2 >= i){ //20 21 22 
				for(int j=0; j<=i; j++){
					System.out.print("*");
				}
			} else { //23 24
				for(int j=0; j<line-i; j++){
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
