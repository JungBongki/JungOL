import java.util.ArrayList;
import java.util.Scanner;

public class Main1133 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		ArrayList<String> arr = new ArrayList<String>();
		
		for(int i=0; i<n; i++){
			String input = sc.next();
			arr.add(input);
		}
		sc.close();
		
		String temp = "";
		String output = "";
		ArrayList<String> name = new ArrayList<String>();
		for(int i=0; i<arr.size(); i++){
			output = arr.get(i);
			if(temp.equals("")){
				temp = output;
				name.add(temp);
				continue;
			}
			if (!temp.equals(output)){
				if(!name.contains(output)){
					name.add(output);
				} 
			}
		}
		ArrayList<Integer> num;
		ListST st = new ListST();
		int count=0;
		for(int j=0; j<name.size(); j++){
			num = new ArrayList<Integer>();
			String str = name.get(j);
			for(int i=0; i<arr.size(); i++){
				if(arr.get(i).equals(str)){
					num.add(i+1);
				}
			}
			st.setList(num);
			if(st.getList().size()!=1){
				System.out.println(name.get(j) + " " + st.toString());
			} else {
				count++;
				if(count==name.size()-1){
					System.out.println("unique");
				}
			}
		}
		
		/*for(int i=0; i<name.size(); i++){
			if(st.get(i).size()!=1)
			System.out.println(name.get(i) + " " + list.get(i).toString());
		}*/
	}
}

class ListST{
	
	private ArrayList<Integer> list = new ArrayList<Integer>();

	public ArrayList<Integer> getList() {
		return list;
	}

	public void setList(ArrayList<Integer> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		String arg = "";
		for(int i=0; i<list.size(); i++){
			arg += list.get(i) + " ";
		}
		return arg;
	}

}