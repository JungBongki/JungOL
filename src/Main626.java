import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * 날짜 : 160919
 * 작성자 : 정봉기
 * 제목 : 파일입출력 기본다지기 - 두수 사이에 있는 정수 모두 더하기 (불러와서)
 */
public class Main626 {
	public static void main(String[] args) {
		
		//File file = new File("626.txt");
		try {
			//FileReader fileReader = new FileReader(file);
			BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
			//BufferedReader br = new BufferedReader(fileReader);
			
			String[] input = br2.readLine().split(" ");
			int min = Integer.parseInt(input[0]);
			int max = Integer.parseInt(input[1]);
			int result = 0;
			for(int i=min; i<=max; i++){
				result += i;
			}
			System.out.println(result);
			br2.close();
			//fileReader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 자동 생성된 catch 블록
			e.printStackTrace();
		}
	}
}

/*		
		try {
			FileReader fileReader = new FileReader(file);
			int c;
			while(true){
				c = fileReader.read();
				if(c==-1){
					break;
				}
				System.out.println(c);
			}
			fileReader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
 */		