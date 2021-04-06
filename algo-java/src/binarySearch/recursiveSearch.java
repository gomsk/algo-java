package binarySearch;

import java.util.Scanner;

public class recursiveSearch {
	// 시작점과 끝점을 기준으로 중간점을 정하고, 찾으려는 대상과 중간점을
	// 비교해서 범위를 좁혀나간다.
/*
10 7
1 3 5 7 9 11 13 15 17 19
 * */	
	public static int n;
	public static int arr[] = new int[n];
	
	public static int binarySearch(int start, int end) {
		if(start > end) return -1; 
		int mid = (start+end) /2;
		if(arr[mid] == n) return mid; 
		else if(arr[mid] < n) return binarySearch(mid+1,end);
		else  return binarySearch(start, mid-1);
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
	}

}
