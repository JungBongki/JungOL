import java.util.Scanner;

public class Main616 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	
		double a[] = new double[6];
		double row = 0.0;
		double col = 0.0;
		
		
		for(int i = 0; i < a.length; i++){
			a[i] = sc.nextInt(); 
		}
		sc.close();
		
		row = width(a[0], a[2], a[4]);
		col = width(a[1], a[3], a[5]);
		
	}

	private static double width(double a, double b, double c) {
		double avg = (Math.round((a+b+c)/3*10.0) / 10.0); 
		return avg;
	}
}
