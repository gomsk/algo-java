package binarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class RiceCake {
	//떡의 개수, 요청한 떡의 길이가 주어진다.
	//요청한 떡의길이를 뽑을 수 있도록 하는, 절단기 높이의 최댓값을 구하시오.
	/*
4 6
19 15 10 17 
	 * */
	public static int riceCakeCut(int arr[], int m, int start, int end) {
		int result = 0;
		while(start <= end) {
			int mid = (start+end) /2;
			int sum = 0;
			for(int i=0; i<arr.length; i++) {
				if(arr[i] > mid) sum+= arr[i] - mid;
			}
			if(sum < m) end  = mid-1;
			else {
				result = mid;
				start = mid+1;
			}	
		}
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int arr[] = new int[n];
		int max = 0;
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
			if(arr[i] > max) max = arr[i];
		}
		
		System.out.println(riceCakeCut(arr, m, 0, max));
		sc.close();
	}

}
