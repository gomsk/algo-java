package ICT.dynamic;

import java.util.Scanner;

public class AntWarior {
/*
개미 전사
규칙은 인접해서 연속으로 식량을 털수 없다. 
적어도 1칸 이상은 떨어져야 하며, 최대 털 수 있는 식량 합을 구하시오.
이전에 해결한 작은 문제가, 큰 문제에 대한  부분으로 이루어져 있으므로 다이나믹 프로그래밍 가능.
bottom-Up
4
1 3 1 5
 * */	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n ; i++) {
			arr[i] = sc.nextInt();
		}
		int d[] = new int[n]; 
		
		d[0] = arr[0];
		d[1] = Math.max(arr[0], arr[1]);
		for(int i=2; i<n; i++) {
			d[i] = Math.max(d[i-1], d[i-2]+arr[i]);
		}
		System.out.println(d[n-1]);
		sc.close();
	}

}
