import java.util.Scanner;


public class Main1719 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int line = sc.nextInt();
		int n = sc.nextInt();
		
		sc.close();
		
		if(line%2==1){
			switch (n) {
			case 1:
				right_triangle(line);
				break;
			case 2:
				left_triangle(line);
				break;
			case 3:
				sandglass(line);
				break;
			case 4:
				lean_sandglass(line);
				break;
			default:
				System.out.println("INPUT ERROR!");
				break;
			};
		} else {
			System.out.println("INPUT ERROR!");
		}
	}

	private static void lean_sandglass(int line) {
		for(int i=0; i<line; i++){
			if(line/2>=i){
				for(int j=0; j<i; j++){
					System.out.print(" ");
				}
				for(int j=line/2-i+1; j>0; j--){
					System.out.print("*");
				}
			} else {
				for(int j=0; j<line/2; j++){
					System.out.print(" ");
				}
				for(int j=0; j<i-(line/2)+1; j++){
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

	private static void sandglass(int line) {
		for(int i=0; i<line; i++){
			if(line/2>=i){
				for(int j=0; j<i; j++){
					System.out.print(" ");
				}
				for(int j=0; j<line-(2*i); j++){
					System.out.print("*");
				}
			} else { // 3 4
				for(int j=0; j<line-i-1; j++){
					System.out.print(" ");
				}
				for(int j=0; j<(2*i)-line+2; j++){ // 3 5 << 1 3
					System.out.print("*");
				}
			}
			
			System.out.println();
		}
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
