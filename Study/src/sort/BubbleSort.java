package sort;

import java.util.ArrayList;

public class BubbleSort {

	public void sort() {
		ArrayList<Integer> array = SortUtil.prepareArray();
		boolean needNextPass = true;

		for (int i = 0; i < array.size() && needNextPass; i++) {
			needNextPass = false;
			for (int j = 0; j < array.size() - i - 1; j++) {
				if (array.get(j) > array.get(j + 1)) {
					int temp = array.get(j);
					array.set(j, array.get(j + 1));
					array.set(j + 1, temp);
					needNextPass = true;
					System.out.println("this is blueLearn branch");
				}
			}
		}
		System.out.println("hey from home");
		System.out.println(array);
	}

	public static void main(String[] args) {
		BubbleSort bubble = new BubbleSort();
		bubble.sort();
	}

}
