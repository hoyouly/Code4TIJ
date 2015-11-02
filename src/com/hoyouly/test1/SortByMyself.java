package com.hoyouly.test1;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SortByMyself {

	/**
	 * 插入排序
	 * 
	 * @param array
	 * @return
	 */
	public int[] sortInsert(int[] array) {
		long startTime = System.nanoTime();

		int length = array.length;
		for (int i = 1; i < length - 1; i++) {
			int base = array[i];
			int j = i - 1;
			for (; j >= 0 && array[j] > base; j--) {
				array[j + 1] = array[j];
			}
			array[j + 1] = base;
		}
		System.out.println("插入排序 消耗时间：" + (System.nanoTime() - startTime));

		return array;
	}

	private void swap(int[] array, int i, int j) {
		int temp = array[j];
		array[j] = array[i];
		array[i] = temp;
	}

	/**
	 * 冒泡排序
	 * 
	 * @param array
	 * @return
	 */
	public int[] sortBubble(int[] array) {
		long startTime = System.nanoTime();

		int length = array.length;
		for (int i = 0; i < length; i++) {
			for (int j = length - 1; j > i; j--) {
				if (array[j] < array[j - 1]) {
					swap(array, j, j - 1);
				}
			}
		}
		System.out.println("冒泡排序 消耗时间：" + (System.nanoTime() - startTime));

		return array;
	}

	/**
	 * 选择排序
	 * 
	 * @param array
	 * @return
	 */
	public int[] sortSelect(int[] array) {
		long startTime = System.nanoTime();

		int length = array.length;
		for (int i = 0; i < length; i++) {
			int temp = length - 1;
			for (int j = i + 1; j < length - 1; j++) {
				if (array[j] < array[temp]) {
					temp = j;
				}
			}
			if (array[i] > array[temp]) {
				swap(array, i, temp);
			}
		}
		System.out.println("选择排序 消耗时间：" + (System.nanoTime() - startTime));

		return array;
	}

	public int[] sortQuick(int[] array) {
		long startTime = System.nanoTime();
		array = sortQuick(array, 0, array.length - 1);
		System.out.println("快速排序 消耗时间：" + (System.nanoTime() - startTime));

		return array;
	}
	public int[] sortQuick(int[] array, int low, int high) {
		if (low < high) {
			int midPosition = prosition(array, low, high);
			sortQuick(array, low, midPosition);
			sortQuick(array, midPosition + 1, high);
		}

		return array;
	}

	private int prosition(int[] array, int low, int high) {
		int base = array[low];
		while (low < high) {
			while (low < high && array[high] > base) {
				high--;
			}
			swap(array, low, high);
			while (low < high && array[low] < base) {
				low++;
			}
			swap(array, low, high);
		}
		return low;
	}

	public int[] sortMerge(int[] array) {
		long startTime = System.nanoTime();

		array = sortMerge(array, 0, array.length - 1);
		System.out.println("归并排序 消耗时间：" + (System.nanoTime() - startTime));
		return array;
	}
	public int[] sortMerge(int[] array, int low, int high) {
		if (low < high) {
			int mid = (low + high) / 2;
			sortMerge(array, low, mid);
			sortMerge(array, mid + 1, high);
			merge(array, low, mid, high);
		}

		return array;
	}

	private void merge(int[] array, int low, int mid, int high) {
		int[] temp = new int[high - low + 1];
		int i = low;
		int j = mid + 1;
		int k = 0;

		while (i <= mid && j <= high) {
			if (array[i] < array[j]) {
				temp[k++] = array[i++];
			} else {
				temp[k++] = array[j++];
			}
		}

		while (i <= mid) {
			temp[k++] = array[i++];
		}
		while (j <= high) {
			temp[k++] = array[j++];
		}

		for (int m = 0; m < temp.length; m++) {
			array[low + m] = temp[m];
		}

	}

	public int[] sortShell(int[] array) {
		long startTime = System.nanoTime();
		int length = array.length;
		int step = length / 2;
		while (step >= 1) {
			for (int i = step; i < length; i++) {
				int temp = array[i];
				int j = i - step;
				for (; j >= 0 && array[j] > temp; j -= step) {
					array[j + step] = array[j];
				}
				array[j + step] = temp;
			}
			step /= 2;
		}
		System.out.println("希尔排序 消耗时间：" + (System.nanoTime() - startTime));
		return array;
	}
	
	/**
	 * 随机生成一个不重复的int 类型 数组，长度是10
	 * 
	 * @return
	 */
	public static int[] randomArray() {
		int length = 6000;
		Set<Integer> set = new HashSet<Integer>();
		int i = 0;
		for (; set.size() < length; i++) {
			set.add(new Random().nextInt(length * 2));
		}
		System.out.println("生成随机值，循环的次数：" + i);
		// System.out.println("生成的值是：" + set);
		int[] array = new int[set.size()];
		i = 0;
		for (Integer integer : set) {
			array[i] = integer;
			i++;
		}
		return array;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] afterSort = null;
		SortByMyself sort = new SortByMyself();

		// afterSort=sort.sortInsert(randomArray());
		// afterSort = sort.sortBubble(randomArray());
		// afterSort = sort.sortSelect(randomArray());
		// afterSort = sort.sortQuick(randomArray());
		// afterSort = sort.sortMerge(randomArray());

		afterSort = randomArray();

		// afterSort = sort.sortInsert(afterSort);
		// afterSort = sort.sortShell(afterSort);
		//
		System.out.print("插入 排序后的结果：");
		printfArray(sort.sortInsert(afterSort));

		System.out.print("冒泡 排序后的结果：");
		printfArray(sort.sortBubble(afterSort));
		System.out.print("选择 排序后的结果：");
		printfArray(sort.sortSelect(afterSort));
		System.out.print("快速 排序后的结果：");
		printfArray(sort.sortQuick(afterSort));
		System.out.print("归并排序后的结果：");
		printfArray(sort.sortMerge(afterSort));

		System.out.print("希尔 排序后的结果：");
		printfArray(sort.sortShell(afterSort));

	}

	public static void printfArray(int[] array) {
		for (int i : array) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

}
