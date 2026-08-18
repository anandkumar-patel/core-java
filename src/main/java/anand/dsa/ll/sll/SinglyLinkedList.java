package anand.dsa.ll.sll;

import java.util.ArrayList;
import java.util.List;

/* Class linkedList */
public class SinglyLinkedList {
	protected Node root;
	protected Node end;
	public int size;

	/* Constructor */
	public SinglyLinkedList() {
		root = null;
		end = null;
		size = 0;
	}

	/* Function to check if list is empty */
	public boolean isEmpty() {
		return root == null;
	}

	/* Function to get size of list */
	public int getSize() {
		return size;
	}

	/* Function to insert an element at beginning */
	public void insertAtStart(int val) {
		Node newNode = new Node(val);
		size++;
		if (root == null) {
			root = newNode;
			end = root;
		} else {
			newNode.setNext(root);
			root = newNode;
		}
	}

	/* Function to insert an element at end */
	public void insertAtEnd(int val) {
		Node newNode = new Node(val);
		size++;
		if (root == null) {
			root = newNode;
			end = root;
		} else {
			end.setNext(newNode);
			end = newNode;
		}
	}

	/* Function to insert an element at position */
	public void insertAtPos(int val, int pos) {
		Node newNode = new Node(val);
		Node ptr = root;
		pos = pos - 1;
		for (int i = 1; i < size; i++) {
			if (i == pos) {
				Node tmp = ptr.getNext();
				ptr.setNext(newNode);
				newNode.setNext(tmp);
				break;
			}
			ptr = ptr.getNext();
		}
		size++;
	}

	/* Function to delete an element at position */
	public void deleteAtPos(int pos) {
		if (pos == 1) {
			root = root.getNext();
			size--;
			return;
		}
		if (pos == size) {
			Node s = root;
			Node t = root;
			while (s != end) {
				t = s;
				s = s.getNext();
			}
			end = t;
			end.setNext(null);
			size--;
			return;
		}
		Node ptr = root;
		pos = pos - 1;
		for (int i = 1; i < size - 1; i++) {
			if (i == pos) {
				Node tmp = ptr.getNext();
				tmp = tmp.getNext();
				ptr.setNext(tmp);
				break;
			}
			ptr = ptr.getNext();
		}
		size--;
	}

	/* Function to display elements */
	public void display() {
		System.out.print("\nSingly Linked List = ");
		if (size == 0) {
			System.out.print("empty\n");
			return;
		}
		if (root.getNext() == null) {
			System.out.println(root.getData());
			return;
		}
		Node ptr = root;
		System.out.print(root.getData() + "->");
		ptr = root.getNext();
		while (ptr.getNext() != null) {
			System.out.print(ptr.getData() + "->");
			ptr = ptr.getNext();
		}
		System.out.print(ptr.getData() + "\n");
	}
	
	public int findTheMiddleNodeData() {
		Node slow = root;
		Node fast = root;
		while(null != fast && null != fast.getNext()) {
			slow = slow.getNext();
			fast = fast.getNext().getNext();
		}
		return slow.getData();
	}
	
	public List<Integer> findTheMiddleNodesData() {
		Node slow = root;
		Node fast = root;
		List<Integer> middles = new ArrayList<>(2);
		
		while(null != fast && null != fast.getNext()) {
			slow = slow.getNext();
			fast = fast.getNext().getNext();
		}
		if(fast == null) {
			middles.add(slow.getData());
			middles.add(slow.getNext().getData());
		} else {
			middles.add(slow.getData());
		}
		return middles;
	}
}
