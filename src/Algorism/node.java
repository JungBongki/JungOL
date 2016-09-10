package Algorism;

class Node {
	int data;
	Node next;

	public Node(int d) {
		this.data = d;
	}

	public Node() {
		super();
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
}
