package study_code;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Diff_Absolute_Canonical {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String source = sc.nextLine();
		sc.close();
		subDirList(source);
	}

	private static void subDirList(String source) throws IOException {
		File dir = new File(source);
		File[] fileList = dir.listFiles();
		
		for(int i=0; i<fileList.length; i++){
			File file = fileList[i];
			if(file.isFile()){
				System.out.println("\t 파일 이름 = " + file.getName());
			} else if(file.isDirectory()) {
				System.out.println("디렉토리 이름 = " + file.getName());
				subDirList(file.getAbsolutePath().toString()); 
			}
		}
	}
}
/* getAbsolutePath
 * C:\Users\june\Documents\Overwatch 디렉토리 이름 = Logs 디렉토리 이름 = Overwatch 파일 이름 =
 * Overwatch.log 디렉토리 이름 = Settings 디렉토리 이름 = Overwatch 파일 이름 = Settings_v0.ini
 * 파일 이름 = Settings_v0.ini 디렉토리 이름 = 오버워치 파일 이름 = Settings_v0.ini
 * 
 */
/* getCanonicalPath
 * C:\Users\june\Documents\Overwatch 디렉토리 이름 = Logs 디렉토리 이름 = Overwatch 파일 이름 =
 * Overwatch.log 디렉토리 이름 = Settings 디렉토리 이름 = Overwatch 파일 이름 = Settings_v0.ini
 * 파일 이름 = Settings_v0.ini 디렉토리 이름 = 오버워치 파일 이름 = Settings_v0.ini
 */