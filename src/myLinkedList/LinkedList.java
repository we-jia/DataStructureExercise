package myLinkedList;

public class LinkedList<T> {
	private ListNode<T> firstNode;

	public LinkedList() {
	}

	public void add(T ele) {
		ListNode<T> node = new ListNode<>(ele);

		if (firstNode == null) {
			firstNode = node;
		} else {
			ListNode<T> currentNode = firstNode;
			while (currentNode.next != null) {
				currentNode = currentNode.next;
			}
			currentNode.next = node;
		}
	}

	public void add(int index, T ele) {
		ListNode<T> node = new ListNode<>(ele);
		ListNode<T> head = new ListNode<>();
		head.next = firstNode;

		while (index != 0) {
			head = head.next;
			index--;
		}

		if (head.next != null) {
			node.next = head.next.next;
		}
		head.next = node;
	}

	public ListNode<T> get(int index) {
		ListNode<T> currentNode = firstNode;

		while (index != 0) {
			currentNode = currentNode.next;
			if (currentNode == null) {
				return null;
			}
			index--;
		}
		return currentNode;
	}

	public void delete(int index) {
		ListNode<T> head = new ListNode<>();
		head.next = firstNode;

		while (index != 0) {
			head = head.next;
			index--;
		}

		if (head.next != null) {
			head.next = head.next.next;
		}
	}

	public void reverse() {

	}
}
