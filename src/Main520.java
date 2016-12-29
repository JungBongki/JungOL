import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


/**
 * @author Bongki
 * @program 전치와 후치
 * @date 2016-12-26
 */
public class Main520 {
	
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		sc.close();
		System.out.println("후치 " + n++);
		System.out.println("전치 " + ++n);
	}

}
