package Algorism;

import java.util.Scanner;

public class LinkedList {
	static Scanner sc = new Scanner(System.in);

	static Node head;
	
	public LinkedList(Node head) {
		LinkedList.head = head;
	}

	public static void main(String[] args) {
		int choice = 0;
		do{
			System.out.println("LinkedList ** 1: 삽입 ** 2: 삭제 ** 4:출력 ** 9:종료");
			choice = sc.nextInt();
			if(choice == 1){
				insertNode();
			} else if (choice == 2){
				deleteNode();
			} else if(choice == 4){
				printAllNode();
			} else {
			} 
		}while(choice != 9);
	}

	private static void deleteNode() {
		System.out.print("삭제 노드 : ");
		int n = sc.nextInt();
		if(head.data == n){
			head = head.next;
		}
		if(head == null){
			System.out.println("데이터가 없습니다.");
		} else {
			Node node = head;
			boolean flag = false; 
			while(node.next !=null){
				if(node.next.data == n){
					node.next = node.next.next;
					flag = true;
					continue;
				}
				node = node.next; // 다음노드 탐색
			}
			if(flag){
				System.out.println( n + "중복 데이터까지 삭제 성공");
			} else {
				System.out.println("데이터가 존재하지 않습니다.");
			}
		}
	}

	private static void insertNode() {
		System.out.print("데이터 입력 : ");
		int n = sc.nextInt();
		Node node = new Node(n);
		if(head == null){
			head = node;
		} else {
			Node last = head;
			while(last.next != null){
				last = last.next;
			}
			last.next = node;
			System.out.println(last.next);
		}
		System.out.println(node.next);
		System.out.println("성공했습니다.");
	}
	
	private static void printAllNode(){
		Node node = head;
		
		if(node == null){
			System.out.println("노드가 없습니다");
		} else {
			while(node.next != null){
				System.out.print(node.data + " ");
				node = node.next;
			}
			System.out.println(node.data);
		}
	}
}
