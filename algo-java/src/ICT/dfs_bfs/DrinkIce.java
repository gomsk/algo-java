package ICT.dfs_bfs;

import java.util.Scanner;

public class DrinkIce {
	//음료수 채우기
	//음료수를 채울수 있는 영역의 수 반환
	/*
	 
15 14
00000111100000
11111101111110
11011101101110
11011101100000
11011111111111
11011111111100
11000000011111
01111111111111
00000000011111
01111111111000
00011111111000
00000001111000
11111111110011
11100011111111
11100011111111

	 * */
	public static int n, m;
	public static int graph[][] = new int[1000][1000];
	
	public static boolean dfs(int x, int y) {
		
		if (x <= -1 || x >=n || y <= -1 || y >= m) return false;
		
		if(graph[x][y] == 0) {
			graph[x][y] = 1;
			dfs(x-1, y); //상
			dfs(x+1, y); //하
			dfs(x, y-1); //좌
			dfs(x, y+1); //우
			return true;
		}
		return false;
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		sc.nextLine();
		int count = 0;
		
		for(int i=0; i<n; i++) {
			String str = sc.nextLine();
			for(int j=0; j<m; j++) {
				graph[i][j] = str.charAt(j) -'0';
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(dfs(i,j)) count++;
			}
		}
		System.out.println(count);
		sc.close();
	}

}
