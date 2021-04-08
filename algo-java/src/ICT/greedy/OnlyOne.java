package ICT.greedy;

import java.util.Scanner;

public class OnlyOne {
// 1이 될때까지, 1을 뺴거나, k로 나눈다. 최소한의 횟수를 구하여라
// 25 5	
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		sc.close();
		int count = 0;
		
		
		while(true) {
			int target = (n/k) * k;
			count += (n - target); 
			n = target;
			
			if(n<k) break;
			count += 1;
			n /= k;
		}
		count += (n-1);
		System.out.print(count);
		
//		while(n != 1) {
//			if(n%k == 0) {
//				n /= k;
//				count++;
//			}else {
//				n -= 1;
//				count++;
//			}
//		}
//		System.out.print(count);
	}

}