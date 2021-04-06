package sort;

public class Count {
	//특정한 조건이 부합할 때만 사용할 수 있지만 매우 빠른 정렬 알고리즘
	public static int arr[] = {7, 5, 9, 0, 3, 1, 6, 2, 9, 1, 4, 8, 0, 5, 2};
	public static int count[] = new int[10];
	
	public static void main(String[] args) {
		for(int i=0; i<arr.length; i++) {
			count[arr[i]]++; 
		}
		for(int i=0; i<count.length; i++) {
			for(int j=0; j<count[i]; j++) {
				System.out.print(i + " ");
			}
		}
	}
}
