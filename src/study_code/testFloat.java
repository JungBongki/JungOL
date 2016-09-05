package study_code;

public class testFloat {
	
	public static void main(String[] args){
		
		float a = (float) 2.1;
		int b = 3;
		int c = 3;
		
		
		System.out.printf("%f", a);
		System.out.println();
		System.out.printf("%.2f", a);
		System.out.println();
		System.out.printf("%d", b+c);
		System.out.println();
		System.out.printf("%d %d", b=b+c, b=b-c);
		
		///////////////////////////////////////
		int x,y,z;
		x=0;
		y=0;
		z=0;
		
		/*++x||++y&&++z;*/
		System.out.println();
		System.out.printf("%5d %5d %5d", x,y,z);
	}
}
