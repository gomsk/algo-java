package sort;


public class Selection {
	
	// 가장 작은 수를 선택해, 앞에 수와 교환 
	public static int arr[] = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};
	
	public static void main(String[] args) {
		
		for(int i=0; i<arr.length; i++) {
			int minIndex = i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j] < arr[minIndex]) {
					minIndex= j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
