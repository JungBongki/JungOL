package study_code;

public class Controll_pratice {

	public static void main(String[] args) {
		int n = 0;
		int count = 0;
		while(count < 3){
			n = n+1;
			/*if(n == 2){
				break; // 아래도 실행안되고 loof문 빠져나옴
			}*/
			if(n==2){
				continue; // loof의 처음상태로 돌아가는다는이야기인데...
			}
			count++;
		}
		System.out.println(count);
		System.out.println(n);
	}

}
