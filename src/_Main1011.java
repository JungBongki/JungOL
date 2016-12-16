import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _Main1011 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int Maxnum = sc.nextInt();
		int answer = sc.nextInt();
		sc.close();
		boolean[] chk = new boolean[Maxnum+1];
		
		chk[0] = false; // 1은 소수가 아니기 때문에
		
		for(int i=1; i<=Maxnum; i++){
			chk[i] = true;
		}
		
		for(int i=2; i<=Math.sqrt(Maxnum); ++i){
			if(chk[i]){
				for(int j=2*i; j<=Maxnum; j += i){
					chk[i] = false;
				}
			}
		}
		int count=0;
		for(int i=answer+1; i<=Maxnum; i+= n){
			if(chk[i]) count++; 
		}
		System.out.println(count);
	}	
/*		List<Integer> sosu = new ArrayList<Integer>();
		
		sc.close();
		
		sosu = sosu_chk(sosu, Maxnum);
		System.out.println(sosu);
		
		answer = answer+1;
		if(answer == 3) answer = 0;
		int count = sosu.size();
		
		for(int i=0; i<sosu.size(); i++){
			if(sosu.get(i)%n == answer){
				sosu.remove(i);
			}
		}
		
		System.out.println(count - sosu.size());
	}

	private static List<Integer> sosu_chk(List<Integer> sosu, int Maxnum) {
		
		sosu.add(2);
		for(int i=2; i<=Maxnum; i++){
			for(int j=0; j<sosu.size(); j++){
				if(i%sosu.get(j)==0){
					break;
				} 
				if(j+1 == sosu.size()){
					sosu.add(i);
				}
			}
		}
		
		return sosu;
	}*/
}
