package study_code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class _161212_jumpingOrder {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		
		for(int i=0; i<arr.length; i++){
			//arr[i] = (int)(Math.random()*10)+1;
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		Map<Integer, Integer> al = new HashMap<Integer, Integer>();
		
		for(int i=0; i<arr.length;i++){
			al.put(i, arr[i]);
		}
		
		int count = 0;
		boolean flag = true;
		do{
			int temp = 0;
			for(int i=0; i<arr.length; i++){
				if(al.get(i) != null){
					if(temp <= al.get(i)){
						temp = al.get(i);
						al.remove(i);
					} else {
						continue;
					}
				}
			}
			
			System.out.println("남은것 : " + al.toString());
			count++;
			if(al.isEmpty()){
				flag = false;
			}
		}while(flag);
		
		System.out.println("총횟수 : " + count + " 번 입니다.");
	}
}
