package study_code;

import java.util.ArrayList;
import java.util.Scanner;

public class _160813_study_Calmel_Poth {

	public static void main(String[] args) {
		
		ArrayList<Character> list = new ArrayList<Character>();
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		for(int i=0; i<str.length(); i++){
			String parse_str = str.substring(i, i+1);
			
			if(parse_str.equals("")){
				
			}
		}
		
		
		
		
		
		
		
		
		
		
/*		
		for(int i=0; i<str.length(); i++){
			parse_str = str.substring(i, i+1);
			
		}
 문자열에 관련된 메서드를 풀는 것이 가장 중요할 것같다. char로 해결할려다가 굉장히 복잡해지는 경우가 발생되는바람에...		
*/		
		char[] input = new char[str.length()];
		/*
		for(int i=0; i<str.length(); i++){
			char split = str.charAt(i);
			list.add(split);
		} // 문자열을 input[i]에 담아놓는다
		
		*/
		for(int i=0; i<str.length(); i++){
			char split = str.charAt(i);
			input[i] = split;
		}
		
		
		
		
		int i=0;
		int j=0;
		
		while(i<str.length()){
			char temp;
			if(input[i]>=65 && input[i]<=90){ //대문자일경우
				input[i] = (char) (input[i] + 32);
				
				/*for(j=i;j<input.length+1; j++){
					temp = input[i]; 
					input[i] = (char) (input[i] + 32);
					input[i+1] = temp;
				}*/
			}
			i++;
		}
		
/*		for(int i=0; i<str.length(); i++){
			char split = str.charAt(i);
			input[i] = split;
		}
*/		
	}
}
