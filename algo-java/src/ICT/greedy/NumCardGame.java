package ICT.greedy;

import java.util.Scanner;

public class NumCardGame {
//규칙 : 행에서 가장 작은수 하나만 선택이 가능하다. 가능한 가장 큰수를 출력
/*
2 4
7 3 1 8
3 3 3 4
*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int result = 0;
		//한줄씩 입력받아 확인하기
		for(int i=0; i<n; i++) {
			int minNum = 10001;
			for(int j=0; j<m; j++) {
				int num = sc.nextInt();
				minNum = Math.min(minNum, num);
			}
			result = Math.max(result, minNum);
		}
		sc.close();
		System.out.print(result);
	}
}
