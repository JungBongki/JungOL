import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * 제목 : 스택(stack)
 * 날짜 : 160906
 */
public class Main1102 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack = new Stack<>();
		
		try {
			int commend = Integer.parseInt(br.readLine());
			String[] arg = new String[commend];
			for (int i = 0; i < commend; i++){
				arg[i] = br.readLine();
			}
			for (int i = 0; i < arg.length; i++) {
				if (arg[i].substring(0, 1).equals("i")) {
					int inputData = Integer.parseInt(arg[i].substring(2));
					stack.push(inputData);
				} else if (arg[i].equals("c")) {
					System.out.println(stack.size());
				} else {
					if (stack.isEmpty()) {
						System.out.println("empty");
					} else {
						int msg = stack.pop();
						System.out.println(msg);
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
/*switch (arg[i]) {
case "c" :
	if(stack.isEmpty()){
		System.out.println("empty");
	} else {
		int msg = stack.pop();
		System.out.println(msg);
	}
	break;
default:
	System.out.println(stack.size());
	break;
}*/