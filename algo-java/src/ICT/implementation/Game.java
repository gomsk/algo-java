package ICT.implementation;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		// 1. 현재 위치에서 방향을 기준으로 왼쪽 방향(반시계) 차례로 갈곳을 정한다.
		// 2. 왼쪽 방향에 가보지 않은 곳이 있다면, 회전후 한 칸 전진. 왼쪽 방향에 가보지 않은 칸이 없다면 회전만 수행하고 1단계
		// 3. 만약 네 방향 모두 가본 칸이거나 바다로 되어 있는 칸인 경우, 바라보는 방향을 유지한 채로 한칸 뒤로 가고 1단계 수행,
		//     단 뒤쪽 방향이 바다인 칸이라 뒤로 갈 수 없는 경우에는 움직임을 멈춘다.
/*
4 4
1 1 0
1 1 1 1
1 0 0 1
1 1 0 1
1 1 1 1
 */
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int columns = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int direction = sc.nextInt();
		//북, 동, 남, 서
		int dx[] = {-1, 0, 1,0 };
		int dy[] = {0,1,0,-1};
		int map[][] = new int[rows][columns];
		int d[][] = new int[rows][columns];
		//현재 좌표 방문처리
		d[x][y] = 1;
		int count = 1;
		int turnTime = 0;
		
		
		for(int i =0; i<rows ; i++) {
			for(int j=0; j<columns; j++) {
				 map[i][j] = sc.nextInt();
			}
		}
		
		while(true) {
			// 1. 방향전환
			direction -= 1;
			if(direction == -1) direction =3;
			int nx = x + dx[direction];
			int ny = y + dy[direction];
			if(d[nx][ny] == 0 && map[nx][ny] == 0) {
				d[nx][ny] = 1;
				x = nx;
				y = ny;
				count++;
				turnTime = 0;
				continue;
			}else {
				turnTime++;
			}
				
			if(turnTime == 4) {
				 nx = x - dx[direction];
				 ny = y - dy[direction];
				 if(map[nx][ny] == 0) {
					 x = nx;
					 y = ny;
				 }
				 else break;
				 turnTime = 0;
			}
		}
		System.out.println(count);
		sc.close();
	}
}
