package unionfindset;

public class TestUnionFindSet {
	public static void main(String[] args) {
		UnionFindSet set = new UnionFindSet(4);

		set.union(0, 3);
		set.union(1, 2);

		System.out.println(set.isTheSameSet(1, 2));
		System.out.println(set.isTheSameSet(1, 0));
		
		set.union(1, 2);
		System.out.println(set.isTheSameSet(1, 2));
		
		set.union(1, 3);
		System.out.println(set.isTheSameSet(1, 3));
	}
}
