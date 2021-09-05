package queue;

public class TestQueue {

	public static void main(String[] args) {
		Queue<String> queue = new Queue<>();

		queue.push("1");
		queue.push("2");
		queue.push("3");

		System.out.println(queue.peek());
		System.out.println(queue.pop());
		System.out.println(queue.peek());
	}

}
