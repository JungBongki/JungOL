package study_code;

import java.util.Scanner;

public class _160903_study {

	public static void main(String[] arg){
	
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		sc.close();
		/*  char���·� �����Ͽ� ������(i-1)�� (i)�� ��
		 *  ���� �������� ���簪�� ������ count, �ƴϸ� result�� temp + count�� string���·� ����
		 *  ��������Ͽ�, ���� i+1���� input.length�� �������(���������)
		 *  result�� ���������� temp + count���� �ִ´�.
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
