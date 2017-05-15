package by.htp.linkedlist;

public class LinkedList {
	private static final int FIRST_INDEX = 0;
	private LinkedListNode first;
	private LinkedListNode end;
	private int size;

	public LinkedListNode getFirst() {
		return first;
	}

	public LinkedListNode getEnd() {
		return end;
	}

	public int getSize() {
		return size;
	}

	public void addElement(int value) {
		LinkedListNode newnode = new LinkedListNode(value);
		if (first == null) {
			first = newnode;
			end = newnode;
		} else {
			end.setNext(newnode);
			end = newnode;
		}
		size++;
	}

	public void addElementbyIndex(int a, int b) {
		LinkedListNode addEl = new LinkedListNode(b);
		if (a == FIRST_INDEX) {
			addEl.setNext(first);
			first = addEl;
		} else {
			LinkedListNode temp = getElementByIndex(a - 1);
			addEl.setNext(temp.getNext());
			temp.setNext(addEl);
		}
		size++;
	}

	public void setElelementByIndex(int a, int b) {
		getElementByIndex(a).setValue(b);
	}

	public void printList() {
		LinkedListNode node = first;
		while (node != null) {
			System.out.println(node.getValue());
			node = node.getNext();
		}
	}

	public LinkedListNode getElementByIndex(int i) {
		LinkedListNode temp = first;
		int b = FIRST_INDEX;
		while (b < i) {
			temp = temp.getNext();
			b++;
		}
		return temp;
	}

	public boolean contains(int value) {
		LinkedListNode temp = first;
		while (temp != null) {
			if (temp.getValue() == value) {
				return true;
			}
			temp = temp.getNext();
		}
		return false;
	}
}