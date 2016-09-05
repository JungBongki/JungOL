package study_code;

import java.util.Scanner;

public class _160903_study {

	public static void main(String[] arg){
	
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		sc.close();
		/*  char형태로 저장하여 이전값(i-1)와 (i)와 비교
		 *  만약 이전값과 현재값이 같으면 count, 아니면 result에 temp + count의 string형태로 저장
		 *  계속진행하여, 만약 i+1값이 input.length와 같을경우(끝났을경우)
		 *  result에 마지막으로 temp + count값을 넣는다.
		 */
		int count = 1;
		String result = "";
		char[] input_char = new char[input.length()];
		char temp = 0;
		
		for(int i=0; i<input.length(); i++){
			input_char[i] = input.charAt(i); // a a a b b 0
		}
		
		for(int i=1; i<input.length(); i++){
			if(input_char[i-1] == input_char[i]){
				count++;
			} else if(input_char[i-1] != input_char[i]){
				temp = input_char[i-1];
				result += String.valueOf(temp) + count;
				count = 1;
			}
			
			if(i==input.length()-1){
				temp = input_char[i];
				result += String.valueOf(temp) + count;
			}
		}
		
		System.out.println(result);
	}
}
