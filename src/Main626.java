import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 626 : ��������� - �ڰ�����1 

���ѽð�: 1000 ms    �޸�����: 0 MB
�ذ�Ƚ��: 538 ȸ    �õ�Ƚ��: 1082 ȸ    
�� ���� ������ �Է¹޾� ���� ������ ū ������ ��� ������ ���� ���Ͽ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
* ǥ������¹������ �ۼ��ϼ���.
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
