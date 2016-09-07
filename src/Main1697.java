import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 제목 : 큐(Queue)
 * @author Administrator
 * 비고 : 배열로 작성할 계획임(MaxSize = 100)
 */
public class Main1697 {
 
	private static int front;
	private static int rear;
	private static int maxSize = 100;
	private static Object[] queueArray;
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		createQueue();
		
		try {
			int commend = Integer.parseInt(br.readLine());
			String[] arg = new String[commend];
			for (int i = 0; i < arg.length; i++) {
				arg[i] = br.readLine();
			}
			for (int i = 0; i < arg.length; i++) {
				if (arg[i].substring(0, 1).equals("i")) {
					int inputData = Integer.parseInt(arg[i].substring(2));
					offer(inputData);
				} else if (arg[i].equals("c")) {
					System.out.println(size());
				} else {
					if (isEmpty()) {
						System.out.println("empty");
					} else {
						Object item = pull();
						System.out.println(item);
					}
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void createQueue(){
		front = 0;
		rear = -1;
		queueArray = new Object[maxSize];
	}
	
	public static boolean isEmpty(){
		return (front == rear + 1);
	}
	
	public static boolean isFull() { // 여기서는 활용되지 않는다.
		return (rear == maxSize - 1);
	}
	
	public static int size(){
		int size = 0;
		for(int i=front; i<=rear; i++){
			++size;
		}
		return size;
	}
	
	public static void offer(Object item){
		if(isFull()){
			throw new ArrayIndexOutOfBoundsException();
		} else {
			queueArray[++rear] = item;
		}
	}
	
	public static Object peek(){  
		if(isEmpty()){
			return "empty";
		} else {
			return queueArray[front];
		}
	}
	
	public static Object pull(){
		Object item = peek();
		front++;
		return item;
	}
}
