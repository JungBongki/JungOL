package codility;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class OddOccurrencesInArray {
	public static void main(String[] args) {

		int[] arg = {3, 5, 7, 5, 9, 3, 9};
		int result = 0;
		Set<Integer> set = new TreeSet<>();
		
		for(int i=0; i<arg.length; i++){
			int temp = arg[i];
			if(set.contains(temp)){
				set.remove(temp);
				continue;
			}
			set.add(temp);
		}
		
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()){
			result = it.next();
		}
		System.out.println(result);
	}
}
