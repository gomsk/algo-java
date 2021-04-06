package sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class exchangeElement {
	// a, b 두 배열에서 최대 k번 원소를 교환을 해서, 
	// a 배열 원소의 합이 최대로 나올수 있게 출력하시오.
	/*
5 3
1 2 5 4 3
5 5 6 6 5
	 * */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		Integer arrA[] = new Integer[n];
		Integer arrB[] = new Integer[n];
		for(int i=0; i<arrA.length; i++) {
			arrA[i] = sc.nextInt();
		}
		for(int i=0; i<arrB.length; i++) {
			arrB[i] = sc.nextInt();
		}
		
		Arrays.sort(arrA);
		Arrays.sort(arrB, Collections.reverseOrder());
		
		for(int i=0; i<k; i++) {
			if(arrA[i] < arrB[i]) {
				int temp = arrB[i];
				arrB[i] = arrA[i];
				arrA[i] = temp;
			}else break;
		}
		int result =0;
		for(int i=0; i<n; i++) {
			result += arrA[i];
		}
		System.out.println(result);
	}
}
