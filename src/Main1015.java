import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 * @name 브라우저
 * @author Bongki
 *
 */
public class Main1015 {

	public static void main(String[] args) {
		
		Stack<String> forward = new Stack<String>();
		Stack<String> backward = new Stack<String>();
		String URL = "";
		String mainURL = "http://www.acm.org/";
		
		Queue<String> arg = new LinkedList<String>();
		Scanner sc = new Scanner(System.in);
		try {
			int s = System.in.read();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		do{
			URL = sc.nextLine();
			arg.offer(URL);
			URL = arg.poll();
			int n = URL.indexOf(" ");
			String delete_URL = "";
			String chk_URL = URL.substring(0, 4);
			
			if(chk_URL.equals("VISI")||chk_URL.equals("ISIT")){
				backward.push(mainURL);
				delete_URL = URL.substring(n+1);
				mainURL = delete_URL;
				forward.clear();
				System.out.println(mainURL);
			} else {
				switch (chk_URL) {
				case "BACK":
					if(backward.isEmpty()){
						System.out.println("Ignored");
					} else {
						forward.push(mainURL);
						mainURL = backward.pop();
						System.out.println(mainURL);
					}
					break;
					
				case "FORW":
					if(forward.isEmpty()){
						System.out.println("Ignored");
					} else {
						backward.push(mainURL);
						mainURL = forward.pop();
						System.out.println(mainURL);
					}
					break;
				default:
					break;
				}
			}
		}while(!URL.substring(0,4).equals("QUIT"));
		sc.close();
		forward.clear();
		backward.clear();
	}
}
