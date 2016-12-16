import java.io.IOException;
import java.util.Scanner;
public class Testing {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		try {
	 		System.in.read(); 
	 		String s = sc.nextLine();
	 		
	 		System.out.println(s);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
