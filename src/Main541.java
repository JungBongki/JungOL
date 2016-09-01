

import java.util.Scanner;

public class Main541 {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String result = "";
		
		for(int i=0; i<20; i++){
			result += input;
		}
		
		System.out.println(result);
	}
}
