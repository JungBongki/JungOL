package study_code;

import java.util.Scanner;

public class _160813_study {

	public static void main(String[] args){
		
		String[] mos = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", // a~g
				"....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-",
				".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String result = "";
		
		char[] input_value = new char[str.length()];
		for(int i=0; i<str.length(); i++){
			char split = str.charAt(i);
			input_value[i] = split;
		}
		
		for(int i = 0; i<str.length(); i++){ 
			for(int j = 97; j<=122; j++){ // 아스키 소문자 a ~ z까지
				if(input_value[i] == j){
					result += mos[j-97] + " ";
				} else if (input_value[i] == 32){
					result += " ";
					break;
				}
			}
		}
		
		System.out.println(result);
/*
		String reverse = "";
		char[] reverse_input = new char[str.length()];
		
		for(int i = str.length()-1; i>=0; i--){
			int count = 0;
			reverse_input[count] = input_value[i];
			count++;
		}
		for(int i=0; i<str.length(); i++){
			System.out.print(reverse_input[i]);
		}*/
	}
}
