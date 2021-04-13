package hw0401;

public class P4006 {

	public static void main(String[] args) {
		int[] arr = { 2, 33, 7, 5, 12, 34, 99, 25, 28, 53, 20 };
		bubbleSort(arr);
		printArray(arr);
		reverseBubbleSort(arr);
		printArray(arr);
	}

	private static void bubbleSort(int[] arr) {
		bubbleSort(arr, arr.length - 1);
	}

	private static void bubbleSort(int[] arr, int last) {
		if (last > 0) {
			// 배열의 갯수가 0보다 클 때
			for (int i = 1; i <= last; i++) {
				// 배열을 순회하면서
				if (arr[i - 1] > arr[i]) {
					// 바로 앞 인덱스가 해당 인덱스보다 클 경우
					swap(arr, i - 1, i);
					// 두 인덱스의 순서를 바꾼다
				}
			}
			bubbleSort(arr, last - 1);
			// 이미 정렬이 된 마지막 인덱스를 제외하고 다시 정렬한다
		}
	}

	private static void reverseBubbleSort(int[] arr) {
		reverseBubbleSort(arr, arr.length - 1);
	}

	private static void reverseBubbleSort(int[] arr, int last) {
		if (last > 0) {
			for (int i = 1; i <= last; i++) {
				if (arr[i - 1] < arr[i]) {
					// 바로 앞 인덱스가 해당 인덱스보다 작을 경우
					swap(arr, i - 1, i);
				}
			}
			reverseBubbleSort(arr, last - 1);
		}
	}

	private static void swap(int[] arr, int source, int target) {
		int tmp = arr[source]; // 임시 저장소에 옮겼담는다
		arr[source] = arr[target];
		arr[target] = tmp;
	}

	private static void printArray(int[] arr) {
		for (int data : arr) {
			System.out.print(data + ", ");
		}
		System.out.println();
	}
}
