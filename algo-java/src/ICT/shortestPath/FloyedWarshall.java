package ICT.shortestPath;

import java.util.Arrays;
import java.util.Scanner;

public class FloyedWarshall {
	//모든 노드에서 모든 노드로 가는 최단경로
	//노드는 최대 500개를 넘지 않음(3중 반복문 사용으로 제한시간 초과)
/*
4
7
1 2 4
1 4 6
2 1 3
2 3 7
3 1 5
3 4 4
4 3 2
 * */	
	public static final int INF = (int)1e9;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int graph[][] = new int[501][501];
		for(int i=0; i<501; i++) {
			Arrays.fill(graph[i], INF);
		}
		
		for(int i=0; i<m; i++) {
			int source = sc.nextInt();
			int dest = sc.nextInt();
			int distance = sc.nextInt();
			graph[source][dest] =distance; 
		}
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i == j) graph[i][j] = 0;
			}
		}
		
		for(int i=n; i>=1; i--) {
			for(int j=1; j<=n; j++) {
				for(int k=1; k<=n; k++) {
					graph[j][k] = Math.min(graph[j][k], graph[j][i]+graph[i][k]);
				}	
			}
		}
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(graph[i][j] == INF) {
					System.out.print("INFINITY ");
				}else {
					System.out.print(graph[i][j] + " ");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
