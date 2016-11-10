package codility;

import java.util.HashSet;

public class PermMissingElem {

	public static void main(String[] args) {
		
		HashSet<Integer> hash = new HashSet<>();
		
		int[] A = {2, 3, 1, 5};
		for(int i=0; i<A.length; i++){
			hash.add(A[i]);
		}
		int result = 0;
		
		for(int i=0; i<=A.length+1; i++){
			if(!hash.contains(i)){
				System.out.println(i);
			} else {
				result = i;
			}
		}
		
		System.out.println(result);
	}
}
