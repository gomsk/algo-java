package ICT.binarySearch;

import java.util.Scanner;

public class IterativeSearch {
	public static int n;
	public static int arr[] = new int[0];
/*
10 7
1 3 5 7 9 11 13 15 17 19
 * */	
	public static int binarySearch(int start, int end) {

		while(true) {
			if(start > end) return -1;
			int mid = (start+end)/2;
			if(arr[mid] == n) return mid;
			else if(arr[mid] < n) start = mid+1;
			else end = mid-1;
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		n = sc.nextInt();
		arr = new int[size];
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		
		int result = binarySearch(0,arr.length-1);
		if(result == -1) {
			System.out.println("찾으려는 결과가 존재하지 않습니다.");
		}else {
			System.out.println(result+1);
		}
		sc.close();
	}
}
