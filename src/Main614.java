import java.util.Scanner;

public class Main614 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String school = sc.next();
		int class_no = sc.nextInt();
		
		mem_default();
		mem(school, class_no);
		
	}
	private static void mem_default() {
		String school = "제주초등학교";
		int class_no = 6;
				
		System.out.println(school + " " + class_no + "학년");
	}

	private static void mem(String school, int class_no) {
		System.out.println(school + " " + class_no + "학년");
	}
}
