package study_code;

import java.util.Date;
import java.util.Scanner;

public class DateTest {

	public static void main(String[] args) {
		
		Date date = new Date();
		Date date2 = new Date();
		date2.setDate(10);
		date2.setMonth(5-1); // 4월 10일
		Scanner sc = new Scanner(System.in);
		date.setMonth(sc.nextInt()-1);
		date.setDate(sc.nextInt());
		System.out.println(date.toLocaleString());
		//System.out.println(date.toGMTString());
		//System.out.println(date.toString());
		System.out.println(date2.toLocaleString());
		int comp = date.compareTo(date2);
		if(comp>0){
			System.out.println("앞에께크다");
		} else if(comp<0){
			System.out.println("뒤에께크다");
		} else {
			System.out.println("또같다");
		}
	}
}
