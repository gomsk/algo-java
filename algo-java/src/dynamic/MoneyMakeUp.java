package dynamic;

import java.util.Arrays;
import java.util.Scanner;

public class MoneyMakeUp {
    // 입력받은 금액을 만들기 위한 화폐의 최소 구성
	// 화폐 종류도 입력 받음
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		int d[] = new int[m+1];
		Arrays.fill(d, 10001);
		
		d[0] =0;
		for(int i=0; i<n; i++) {
			for(int j=arr[i]; j<=m; j++) {
				if(d[j-arr[i]] != 10001) d[j] = Math.min(d[j], d[j-arr[i]]+1);
			}
		}
		
		if(d[m] == 10001) {
			System.out.println(-1);
		}else {
			System.out.println(d[m]);
		}		
	}

}
