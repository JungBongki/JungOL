import java.util.Scanner;

public class Main1341{
	public static void main(String[] args) {
		Scanner sc; // 메서드 내에 세운 변수 :: 지역변수(Local variable), 형태로는 참조타입(Reference Type)
		sc = new Scanner(System.in);
		sc.close();
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int max_num, min_num;
		
		if( a > b ){
			max_num = a;
			min_num = b;
			
			for(int i = max_num; i >= min_num; i--)
			{
				for(int j = 1; j <= 9; j++)
				{
					if(i * j < 10){
						System.out.print(i + " * " + j  + " =  " + i*j + "   ");
					} else {
						System.out.print(i + " * " + j  + " = " + i*j + "   ");
					}
					if(j % 3 == 0)
						System.out.println();
				}
				System.out.println();
			}
			
		} else {
			max_num = b;
			min_num = a;
			
			for(int i = min_num; i <= max_num; i++)
			{
				for(int j = 1; j <= 9; j++)
				{
					if(i * j < 10){
						System.out.print(i + " * " + j  + " =  " + i*j + "   ");
					} else {
						System.out.print(i + " * " + j  + " = " + i*j + "   ");
					}
					if(j % 3 == 0)
						System.out.println();
				}
				System.out.println();
			}
		}
	}
}
