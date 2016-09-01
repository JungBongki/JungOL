import java.util.Scanner;

public class Main2085 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 공백도해주는구나..
		int B = sc.nextInt(); // 현재년도
		int A = sc.nextInt(); // 태어난년도
		sc.close();
		int count = 0;

		if(B % 4 == 0){ //현재년도가 윤년이면 카운트가 1부터시작
			count++;
			if(B % 100 == 0){
				count--;
				if(B % 400 == 0){
					count++;
				}
			}
		}
		
		int[] year_4 = {B/4, A/4};
		int[] year_100 = {B/100, A/100};
		int[] year_400 = {B/400, A/400};
		
		int result[] = new int[2];
		for(int i=0; i<year_4.length; i++){
			result[i] = year_4[i] - year_100[i] + year_400[i];
		}
		
		if(B % 4 == 0){ // B가 윤년이면 뺴줘야되므로
			count--;
			if(B % 100 == 0){
				count++;
				if(B % 400 == 0){
					count--;
				}
			}
		}
		
		int yun_count = result[0] - result[1];
		count += yun_count;
		
		
		/*
		for(int i = A+1; i<=B; i++){
			if(i%4==0){
				count++;
			}
			if(i%100==0){
				count--;
			}
			if(i%400==0){
				count++;
			}
		}
		//Time Limit Error*/

		System.out.println(count);
	}
}
