import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class Main1221 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String[] arg = new String[n];
		Stack<Integer> stack = new Stack<Integer>();
		Set<String> set = new HashSet<String>();
		
		set_Init(set);
		
		int result = 0;
		for(int i=0; i<arg.length; i++){
			arg[i] = sc.next();
			if(!set.contains(arg[i])){
				stack.push(Integer.parseInt(arg[i]));
			} else {
				int b = stack.pop();
				int a = stack.pop();
				switch (arg[i]) {
				case "+":
					result = a + b;
					break;
				case "-":
					result = a - b;
					break;
				case "*":
					result = a * b;
					break;
				case "/":
					result = a / b;
					break;
				default:
					System.out.println("잘못되었습니다.");
					break;
				}
				stack.push(result);
			}
		}
		System.out.println(stack.pop());
	}

	private static void set_Init(Set<String> set) {
		set.add("+");
		set.add("-");
		set.add("*");
		set.add("/");
	}

}
