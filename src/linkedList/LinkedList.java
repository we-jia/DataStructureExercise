package linkedList;

public class LinkedList<T> {
	private ListNode<T> firstNode;

	public LinkedList() {
	}

	public void add(T ele) {
		ListNode<T> node = new ListNode<>(ele);
		if (firstNode == null) {
			firstNode = node;
			return;
		}

		ListNode<T> head = new ListNode<>();
		head.next = firstNode;

		while (head.next != null) {
			head = head.next;
		}

		head.next = node;
	}

	public void add(int index, T ele) {
		ListNode<T> node = new ListNode<>(ele);
		ListNode<T> head = new ListNode<>();
		head.next = firstNode;

		if (index == 0) {
			firstNode = node;
		}

		while (index != 0) {
			head = head.next;
			index--;
		}

		node.next = head.next;
		head.next = node;
	}

	public T get(int index) {
		ListNode<T> currentNode = firstNode;

		while (index != 0) {
			currentNode = currentNode.next;
			index--;
		}
		return currentNode.value;
	}

	public void delete(int index) {
		ListNode<T> head = new ListNode<>();
		head.next = firstNode;
		boolean indexIsZero = index == 0;

		while (index != 0) {
			head = head.next;
			index--;
		}

		head.next = head.next.next;

		if (indexIsZero) {
			firstNode = head.next;
		}
	}

	public void reverse() {
		if (firstNode == null || firstNode.next == firstNode) {
			return;
		}

		ListNode<T> previousNode = null;
		ListNode<T> currentNode = firstNode;
		ListNode<T> nextNode = firstNode.next;

		while (currentNode != null) {
			currentNode.next = previousNode;

			previousNode = currentNode;
			currentNode = nextNode;
			if (nextNode != null) {
				nextNode = nextNode.next;
			} else {
				firstNode = previousNode;
			}
		}
	}
}
