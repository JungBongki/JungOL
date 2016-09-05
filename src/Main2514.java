

import java.util.Scanner;

public class Main2514 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		sc.close();
		
		int KOI_Count = 0;
		int IOI_Count = 0;
		// IOIOI : 0�� 2��
		for(int i = 3; i <= input.length(); i++){
			String split_input = input.substring(i-3, i);
			if(split_input.equals("IOI"))
				IOI_Count++;
			if(split_input.equals("KOI"))
				KOI_Count++;
		}
		System.out.println(KOI_Count);
		System.out.println(IOI_Count);
	}
}
