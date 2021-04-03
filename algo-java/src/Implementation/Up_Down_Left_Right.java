package Implementation;

import java.util.Scanner;

public class Up_Down_Left_Right {
// 현재 위치에서 Plan에 따라 이동한 위치의 좌표 출력
/*
5
R R R U D D
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String[] plan= sc.nextLine().split(" ");
		sc.close();
		int x = 1;
		int y = 1;
		int dx[] = { 0, 0, -1, 1};
		int dy[] = { -1, 1, 0, 0};
		String planTxt[] = {"L", "R", "U", "D"};
		
		for(int i=0; i< plan.length; i++) {
			for(int j=0; j<planTxt.length; j++) {
				   if(plan[i].equals(planTxt[j])) {
					    int nx = x + dx[j];
					    int ny = y + dy[j];
					    if(nx <= n && ny <= n && nx > 0 && ny > 0){
					    	x = nx;
					    	y = ny;
					    }
					    break;
				   }
			}
		}
		System.out.println(x +" "+y);
	}

}
