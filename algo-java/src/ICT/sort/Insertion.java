package ICT.sort;


public class Insertion {
	
	// 데이터를 하나씩 확인하여, 각 데이터를 적절한 위치에 삽입
	public static int arr[] = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};
	
	public static void main(String[] args) {
		
		for(int i=1; i<arr.length; i++) {
			for(int j=i;j >=1; j--) {
				if(arr[j] < arr[j-1]) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp; 
				}else break;
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
