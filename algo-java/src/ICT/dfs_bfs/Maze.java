package ICT.dfs_bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class MazeNode{
	private int x;
	private int y;
	
	public MazeNode(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
}

public class Maze {
// 미로 탈출
// 괴물을 있는 부분 0을 피해서 미로를 탈출하는 최소 이동칸의 수 
/*
5 6
101010
111111
000001
111111
111111
*/
	public static int n,m;
	public static int graph[][] = new int[201][201];
	
	public static int bfs(int x, int y) {
		Queue<MazeNode> q = new LinkedList<>();
		q.offer(new MazeNode(x,y));
		int dx[] = {-1, 1, 0, 0};
		int dy[] = {0,0,-1,1};
		
		while(!q.isEmpty()) {
			MazeNode node = q.poll();
			 x = node.getX();
			 y = node.getY();
			
			for(int i=0; i<4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				if(nx < 0 || ny < 0 || nx  >=  n || ny  >= m) continue;
				if(graph[nx][ny] == 0) continue;
				if(graph[nx][ny] == 1) {
					graph[nx][ny] = graph[x][y] + 1;
					q.offer(new MazeNode(nx,ny));
				}
			}
		}
		return graph[n-1][m-1];
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		sc.nextLine();
		for(int i=0; i<n; i++) {
			String str = sc.nextLine();
			for(int j=0; j<m; j++) {
				graph[i][j] = str.charAt(j) -'0';
			}
		}
		System.out.println(bfs(0,0));
		sc.close();
	}
}
