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
 ���ڿ��� ���õ� �޼��带 Ǯ�� ���� ���� �߿��� �Ͱ���. char�� �ذ��ҷ��ٰ� ������ ���������� ��찡 �߻��Ǵ¹ٶ���...		
*/		
		char[] input = new char[str.length()];
		/*
		for(int i=0; i<str.length(); i++){
			char split = str.charAt(i);
			list.add(split);
		} // ���ڿ��� input[i]�� ��Ƴ��´�
		
		*/
		for(int i=0; i<str.length(); i++){
			char split = str.charAt(i);
			input[i] = split;
		}
		
		
		
		
		int i=0;
		int j=0;
		
		while(i<str.length()){
			char temp;
			if(input[i]>=65 && input[i]<=90){ //�빮���ϰ��
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
