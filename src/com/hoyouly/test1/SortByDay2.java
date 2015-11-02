package com.hoyouly.test1;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SortByDay2 {

	/**
	 * 插入排序
	 * 
	 * @param array
	 * @return
	 */
	public int[] sortInsert(int[] array) {
		int length = array.length;
		for (int i = 1; i < length; i++) {
			int temp = array[i];
			int j = i - 1;
			for (; j >= 0 && array[j] > temp; j--) {
				array[j + 1] = array[j];
			}
			array[j + 1] = temp;
		}
		return array;
	}

	/**
	 * 冒泡排序
	 * 
	 * @param array
	 * @return
	 */
	public int[] sortBubble(int[] array) {
		int length = array.length;
		for (int i = 0; i < length; i++) {
			// for (int j = i; j < length; j++) {
			// if (array[i] > array[j]) {
			// swap(array,j,i);
			// }
			// }

			// for (int j = length-1; j >i; j--) {
			// if(array[j]<array[j-1]){
			// swap(array,j,j-1);
			// }
			// }

			for (int j = 0; j < length - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					swap(array, j, j + 1);
				}
			}

		}
		return array;
	}

	private void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	/**
	 * 选择排序
	 * 
	 * @param array
	 * @return
	 */
	public int[] sortSelect(int[] array) {

		int length = array.length;
		for (int i = 0; i < length; i++) {
			int tempIndex = length - 1;
			int j = i + 1;
			for (; j < length - 1; j++) {
				if (array[j] < array[tempIndex]) {
					tempIndex = j;
				}
			}

			if (array[i] > array[tempIndex]) {
				swap(array, i, tempIndex);
			}
		}
		return array;
	}

	/**
	 * 快排
	 * 
	 * @param array
	 * @return
	 */
	public int[] sortQuick(int[] array) {
		array = sortQuick(array, 0, array.length - 1);
		return array;
	}
	public int[] sortQuick(int[] array, int low, int high) {
		if (low < high) {
			int midPosition = protition(array, low, high);
			sortQuick(array, low, midPosition);
			sortQuick(array, midPosition + 1, high);
		}
		return array;
	}

	private int protition(int[] array, int low, int high) {
		while (low < high) {
			int base = array[low];
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

	public int[] sortShell(int[] array) {
		int step = array.length / 2;
		while (step >= 1) {
			for (int i = step; i < array.length; i++) {
				int j = i - step;
				int temp = array[i];
				for (; j >= 0 && array[j] > temp; j -= step) {
					array[j + step] = array[j];
				}
				array[j + step] = temp;
			}
			step /= 2;
		}

		return array;
	}

	public int[] sortMerge(int[] array) {
		array = sortMerge(array, 0, array.length - 1);
		return array;
	}
	public int[] sortMerge(int[] array, int low, int high) {
		if (low < high) {
			int mid = (high + low) / 2;
			sortMerge(array, low, mid);
			sortMerge(array, mid + 1, high);
			merge(array, low, mid, high);

		}

		return array;
	}

	private void merge(int[] array, int low, int mid, int high) {
		int i = low;
		int j = mid + 1;
		int k = 0;
		int[] temp = new int[high - low + 1];

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

		for (int l = 0; l < temp.length; l++) {
			array[low + l] = temp[l];
		}
	}

	/**
	 * 随机生成一个不重复的int 类型 数组，长度是10
	 * 
	 * @return
	 */
	public static int[] randomArray() {
		int length = 10;
		Set<Integer> set = new HashSet<Integer>();
		int i = 0;
		for (; set.size() < length; i++) {
			set.add(new Random().nextInt(length * 2));
		}
		System.out.println("生成随机值，循环的次数：" + i);
		System.out.println("生成的值是：" + set);
		int[] array = new int[set.size()];
		i = 0;
		for (Integer integer : set) {
			array[i] = integer;
			i++;
		}
		return array;
	}

	public static void printfArray(int[] array) {
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SortByDay2 sort = new SortByDay2();

		int[] array = randomArray();

		// printfArray(sort.sortInsert(array));
		// printfArray(sort.sortBubble(array));
		// printfArray(sort.sortSelect(array));
		 printfArray(sort.sortQuick2(array));
		// printfArray(sort.sortShell(array));
//		printfArray(sort.sortMerge(array));

	}

	public int[] sortQuick2(int[] array) {
		array = sortQuick2(array, 0, array.length-1);
		return array;
	}
	public int[] sortQuick2(int[] array, int low, int high) {
		if (low < high) {
			int mid = pratition(array, low, high);
			sortQuick2(array, low, mid);
			sortQuick2(array, mid + 1, high);
		}
		return array;
	}

	private int pratition(int [] array,int low,int high){
		int base=array[low];
		while(low<high){
			while(low<high&&array[high]>base){
				high--;
			}
			swap(array,low,high);
			
			while(low<high&&array[low]<base){
				low++;
			}
			swap(array,low,high);
			
		}
		
		
		return low;
		
		
	}
}
