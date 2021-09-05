package unionfindset;

public class UnionFindSet {
	private int[] arr;

	public UnionFindSet(int size) {
		arr = new int[size];
		for (int i = 0; i < arr.length; ++i) {
			arr[i] = -1;
		}
	}

	public void union(int a, int b) {
		int rootA = getRoot(a);
		int rootB = getRoot(b);
		
		if (rootA == rootB) {
			return;
		}
		
		int sizeA = getSetSize(a);
		int sizeB = getSetSize(b);

		if (sizeA > sizeB) {
			arr[rootA] -= sizeB;
			arr[rootB] = rootA;
		} else {
			arr[rootB] -= sizeA;
			arr[rootA] = rootB;
		}
	}

	public boolean isTheSameSet(int a, int b) {
		return getRoot(a) == getRoot(b);
	}

	public int getRoot(int i) {
		if (arr[i] < 0) {
			return i;
		} else {
			return getRoot(arr[i]);
		}
	}

	public int getSetSize(int i) {
		if (arr[i] < 0) {
			return -arr[i];
		} else {
			return getSetSize(getRoot(arr[i]));
		}
	}

	public void printAll() {
		for (int i = 0; i < arr.length; ++i) {
			System.out.println(arr[i]);
		}
	}
}
