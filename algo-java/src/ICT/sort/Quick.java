package ICT.sort;

public class Quick {
	//기준 데이터를 설정하고 그 기준보다 큰 데이터와 작은 데이터의 위치를 바꾼다
	public static int arr[] = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};
	
	public static void quickSort(int start, int end) {
		if(start >= end) return;
		int pivot = start;
		int left = start +1;
		int right = end;
		
		while(left <= right) {
			while(left <= end && arr[left] <= arr[pivot]) left += 1;
			while(right > start && arr[right] >= arr[pivot]) right -= 1;
			if(left > right) { //엇갈린 경우
				int temp = arr[right];
				arr[right] = arr[pivot];
				arr[pivot] = temp;
			}else {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
			}
		}
	   quickSort(start, right-1);
	   quickSort(right+1, end);
	}
	
	
	public static void main(String[] args) {
		quickSort(0,arr.length-1);
		for(int i=0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
	}
}
