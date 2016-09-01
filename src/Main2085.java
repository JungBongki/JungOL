import java.util.Scanner;

public class Main2085 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // ���鵵���ִ±���..
		int B = sc.nextInt(); // ����⵵
		int A = sc.nextInt(); // �¾�⵵
		sc.close();
		int count = 0;

		if(B % 4 == 0){ //����⵵�� �����̸� ī��Ʈ�� 1���ͽ���
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
		
		if(B % 4 == 0){ // B�� �����̸� ����ߵǹǷ�
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
