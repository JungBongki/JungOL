import java.text.DecimalFormat;
import java.util.Scanner;



public class Main1004 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] price = new int[n];
		float sum = 0;
		float avg = 0;
		/*String sd = "";*/
		String sd = "";
		DecimalFormat format = new DecimalFormat("#.#");
		
		for(int i=0; i<n; i++){
			price[i] = sc.nextInt();
			sum += price[i];
		}
		sc.close();
		
		System.out.println((int)sum);
		avg = sum / n;
		
		if((int)(avg*10%10)==0){
			System.out.println((int)avg);
		} else {
			System.out.println(format.format(avg));
		}
		
		float S = 0;
		for(int i=0; i<n; i++){
			S += (float) Math.pow(price[i]-avg, 2);
		}
		
		S = S/n;
		sd = format.format((float) Math.sqrt(S));
		
		float f_sd = Float.parseFloat(sd);
		
		if((int)(f_sd*10%10)==0){
			System.out.println((int)f_sd);
		} else {
			System.out.println(f_sd);
		}
	}

}
