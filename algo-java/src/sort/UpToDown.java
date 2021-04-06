package sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class UpToDown {
	// 입력받은 숫자를 내림차순으로 출력하시오.
	public static int n =0;
	public static Integer arr[] = new Integer[n];
	public static void sort(int start, int end) {
		if(start >= end) return;
		int pivot = start;
		int left = start+1;
		int right = end;
		
		while(left <= right) {
			while(left <= end && arr[left] <= arr[pivot] ) left++;
			while(right > start && arr[right] >= arr[pivot] ) right--;
			if(left > right) {
				int temp = arr[right];
				arr[right] = arr[pivot];
				arr[pivot] = temp;
			}else {
				int temp = arr[right];
				arr[right] = arr[left];
				arr[left] = temp;
			}
		}
		sort(start, right-1);
		sort(right+1, end);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 n = sc.nextInt();
		arr = new Integer[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
//		sort(0, arr.length-1);
//		
//		for(int i=n-1; i>=0; i--) {
//			System.out.println(arr[i] +" ");
//		}
		
		Arrays.sort(arr, Collections.reverseOrder());
		for(int i=0; i<arr.length; i++) {
		System.out.println(arr[i] +" ");
	  }

	}

}
