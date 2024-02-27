package DSA;

public class LLScratch {
	static Node head;
	
	
	public class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	public void addfirst(int data){
		Node newNode = new Node(data);
		if(head == null) {
			head=newNode;
			return;
		}
		newNode.next=head;
		head=newNode;
	}
	public void addLast(int data) {
		Node newNode = new Node(data);
		if(head==null) {
			head=newNode;
			return;
		}
	    Node temp=head;
	    while(temp.next != null) {
	    	temp=temp.next;
	    }
	    temp.next=newNode;
	    
	}
	public void printList() {
		Node currnode =head;
		while(currnode !=null) {
			System.out.print(currnode.data+ "->");
			currnode=currnode.next;
		}
		System.out.println();
	}
	public void removeFirst() {
		if(head==null) {
			System.out.println("list is empty");
			return;
		}
		head = head.next;
	}
	
	public void removeLast() {
		if(head == null) {
			System.out.println("list is empty");
			return;
		}
		if(head.next==null) {
			head=null;
			return;
		}
		Node secondlast=head;
		Node last =head.next;
		while(last.next!=null) {
			last =last.next;
			secondlast =secondlast.next; 
		}
		secondlast.next =null;
	}
	public static void main(String[] args) {
		LLScratch list = new LLScratch();
		list.addfirst(2);
		list.addfirst(3);
		list.printList();
		list.addLast(4);
		list.printList();
		list.removeFirst();
		list.printList();
		list.addfirst(0);
		list.printList();
		list.removeLast();
	}
}
