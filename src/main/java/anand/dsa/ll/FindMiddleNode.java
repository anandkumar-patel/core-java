package anand.dsa.ll;

import java.util.List;

import anand.dsa.ll.sll.SinglyLinkedList;

public class FindMiddleNode {

	public static void main(String[] args) {
		SinglyLinkedList ll = new SinglyLinkedList();
		ll.insertAtEnd(11);
		ll.insertAtEnd(12);
		ll.insertAtEnd(13);
		ll.insertAtEnd(14);
		ll.insertAtEnd(15);
		ll.insertAtEnd(16);
		ll.insertAtEnd(17);
		ll.insertAtEnd(18);
		
		ll.display();
		System.out.println(ll.findTheMiddleNodeData());
		
		List<Integer> output = ll.findTheMiddleNodesData();
		System.out.println(output);
	}

}
