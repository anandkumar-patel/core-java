package anand.dsa.ll;

import anand.dsa.ll.sll.Node;

public class ReverseSllMain {

	public static void main(String[] args) {

		
	}
	public Node reverseLinkedList(Node root) {
		Node prev = null;
		while (null != root) {
			Node next = root.getNext();
			root.setNext(prev);
			prev = root;
			root = next;
		}
		return prev;
	}

}
