package binarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class findPart_count {
	// n개의 보관중인 부품중에서 m개의 부품이 있는지 확인하시오.
	/*
5
8 3 7 9 2
3
5 7 9 
	 * */
	public static int find(int arr[], int target, int start, int end) {
		while(start <= end) {
			int mid = (start+end) / 2;
			if(arr[mid] == target) return mid;
			else if(arr[mid] < target) start = mid+1;
			else end = mid-1;
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr1[] = new int[n]; 
		int max = 0;
		for(int i=0; i<n; i++){
			arr1[i] = sc.nextInt();
			if(max < arr1[i]) max = arr1[i];
		}
		int check[] = new int[max+1];
		
		int m = sc.nextInt();
		int arr2[] = new int[m];
		for(int i=0; i<m; i++) {
			int num = sc.nextInt();
			arr2[i] = num;
			check[num]++;
		}
		
		for(int i=0; i<m; i++) {
			if(check[arr2[i]] > 0) {
				System.out.println("yes");
			}else {
				System.out.println("no");
			}
		}
		
		sc.close();
	}
}
