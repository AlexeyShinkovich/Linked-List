package by.htp.linkedlist;

public class LinkedListNode {
	
	private int value;
	private LinkedListNode next =null;
	
	public LinkedListNode() {
		
	}

	public LinkedListNode(int value) {
		this.value=value;
	}

	public void setValue(int i) {
		this.value = i;
	}
	
	public int getValue() {
		return value;
	}

	public LinkedListNode getNext() {
		return next;
	}

	public void setNext(LinkedListNode next) {
		this.next = next;
	}
}