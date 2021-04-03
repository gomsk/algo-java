package Implementation;

import java.util.Scanner;

public class Time {
	 // 특정한 시각 안에 '3'이 포함되어 있는지의 여부
    public static boolean check(int h, int m, int s) {
        if (h % 10 == 3 || m / 10 == 3 || m % 10 == 3 || s / 10 == 3 || s % 10 == 3)
            return true;
        return false;
    }
    
// N시 59분 59초까지 3이 나타나는 횟수
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int result = 0;
		for(int i=0; i <= n; i++) {
			for(int j=0; j<60; j++) {
				for(int k=0; k<60; k++) {
//					String s = i+""+j+""+k;
//					if(s.contains("3")) result ++;
					if(check(i,j,k)) result++;
				}
			}
		}
		System.out.println(result);
	}

}
