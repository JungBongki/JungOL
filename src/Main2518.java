import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main2518 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 바꿔야될 문자의 count
		/*
		String[] old_ch = new String[n];
		String[] new_ch = new String[n];
		*/
		HashMap<String, String> hash = new HashMap<>();
		
		for(int i=0; i<n; i++){
			String old_ch = sc.next();
			String new_ch = sc.next();
			hash.put(old_ch, new_ch);
		/*	old_ch[i] = sc.next();
			new_ch[i] = sc.next();*/
		}
		
		int str_len = sc.nextInt();
		String[] str = new String[str_len]; // 10
		
		for(int i=0; i<str_len; i++){
			str[i] = sc.next();
		}
		//System.out.println(Arrays.toString(old_ch) + " -> " + Arrays.toString(new_ch));

		sc.close();

		for(int i=0; i<str_len; i++){
			if(hash.containsKey(str[i])){
				str[i] = hash.get(str[i]);
			}
			
			/*for(int j=0; j<n; j++){
				if(parsing.equals(old_ch[j])){
					parsing = new_ch[j];
					break;
				}
			} ~~> result에 계속 str을 더해주는게 굉장히 속도가 느려진다에 주의한다.*/
		}
		for(int i=0; i<str.length; i++){
			System.out.print(str[i]);
		}
	}
}

