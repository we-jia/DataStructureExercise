package queue;

import linkedList.LinkedList;

public class Queue<T> {
	private LinkedList<T> list = new LinkedList<>();

	public T peek() {
		return list.get(0);
	}

	public T pop() {
		T ele = list.get(0);
		list.delete(0);
		return ele;
	}

	public void push(T ele) {
		list.add(ele);
	}
}
