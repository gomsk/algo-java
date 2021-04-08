package ICT.greedy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class RuleOfBigNum {
/*
input
5 8 3
2 4 5 4 6

 * */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();  //입력받는 숫자수
		int m = sc.nextInt(); // 최댓값을 만들기 위해 더하는수
		int k = sc.nextInt(); //같은 숫자를 연속해서 더할수 있는 수
		int resultNum = 0;
		Integer numArray[] = new Integer[n];
		
		for(int i=0; i < n; i++) {
		    int num = sc.nextInt();
		    numArray[i] = num;
		}
		sc.close();
		
		Arrays.sort(numArray, Collections.reverseOrder()); //객체형만 revierseOrder 가능?
		int firstNum = numArray[0];
		int sencondNum = numArray[1];
		
		
//		while(m > 0) {
//			for(int j=0; j<k; j++) {
//				 resultNum += firstNum; 
//				 m--;
//			}
//			resultNum += sencondNum;
//			m--;
//		}
		
		//가장 큰 수가 더해지는 횟수 계산
		int count = m / (k+1) * k;
		//나누어 떨어지지 않는 경우, 나머지만큼 가장큰수가 더해진다.
		count += m % (k+1); 
		
		resultNum += count * firstNum;
		resultNum += (m - count) * sencondNum;
		
		System.out.print(resultNum);
	}

}
