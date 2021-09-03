package myLinkedList;

public class ListNode<T> {
	public T value;

	public ListNode<T> next;

	public ListNode() {
	};

	public ListNode(T value) {
		this.value = value;
	};

	public ListNode(T value, ListNode<T> next) {
		this.value = value;
		this.next = next;
	};
}
