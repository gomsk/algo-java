package dynamic;

import java.util.Scanner;

public class makeOne {
	// 1로 만들기 
	// 5, 3, 2로 나누어 떨어지면 나누거나, 1을 빼는 연산을 사용하여
	// 숫자 1을 만들 때 최소한의 연산횟수를 구하시오.
	public static int[] d = new int[30001];
	
	public static int make(int x) {
		for(int i=2; i<= x; i++) {
			d[i] = d[i-1] +1;
			if(i % 5 == 0) d[i] = Math.min(d[i], d[i/5]+1);
			if(i % 3 == 0) d[i] = Math.min(d[i], d[i/3]+1);
			if(i % 2 == 0) d[i] = Math.min(d[i], d[i/2]+1);
		}
		return d[x];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(make(n));
	}

}
