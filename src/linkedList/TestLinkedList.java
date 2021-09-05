package linkedList;

public class TestLinkedList {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("1");
		list.add("3");
		list.add(1, "2");
		for (int i = 0; i < 3; ++i) {
			System.out.println(list.get(i));
		}
		
		System.out.println("-----");
		
		list.add(0, "0");
		for (int i = 0; i < 4; ++i) {
			System.out.println(list.get(i));
		}
		
		System.out.println("-----");
		
		list.reverse();
		for (int i = 0; i < 4; ++i) {
			System.out.println(list.get(i));
		}
		
		System.out.println("-----");
		
		list.delete(0);
		for (int i = 0; i < 3; ++i) {
			System.out.println(list.get(i));
		}
	}
}
