import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 626 : 파일입출력 - 자가진단1 

제한시간: 1000 ms    메모리제한: 0 MB
해결횟수: 538 회    시도횟수: 1082 회    
두 개의 정수를 입력받아 작은 수부터 큰 수까지 모든 정수의 합을 구하여 출력하는 프로그램을 작성하시오.
* 표준입출력방식으로 작성하세요.
 */

public class Main626 {
	public static void main(String[] args) {
		File file = new File("626.txt");
		
		try {
			FileReader fileReader = new FileReader(file);
			int c;
			while(true){
				c = fileReader.read();
				if(c==-1){
					break;
				}
				System.out.println(String.valueOf((char)c));
			}
			fileReader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
