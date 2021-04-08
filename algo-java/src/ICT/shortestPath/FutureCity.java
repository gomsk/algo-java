package ICT.shortestPath;

import java.util.Arrays;
import java.util.Scanner;

public class FutureCity {
	// 1번 회사에서 출발하여 k번 회사를 방문한 뒤, x번 회사로 이동하는 최단경로 횟수
	// 경로 이동은 항상 비용이 1이며, 양방향 이동이 가능
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		final int INF = (int)1e9;
		int graph[][] = new int[n+1][n+1];
	
		for(int i=1; i<=n; i++) {
			Arrays.fill(graph[i], INF);
		}
		
	    // 자기 자신에서 자기 자신으로 가는 비용은 0으로 초기화
        for (int a = 1; a <= n; a++) {
            for (int b = 1; b <= n; b++) {
                if (a == b) graph[a][b] = 0;
            }
        }
		
		for(int i=0; i<m; i++) {
			int source = sc.nextInt();
			int dest = sc.nextInt();
			graph[source][dest] = 1;
			graph[dest][source] = 1;
		}
		
		int x = sc.nextInt();
		int k = sc.nextInt();
		
		for(int c=1; c<=n ; c++) {
			for(int a=1; a<=n ; a++) {
				for(int b=1; b<=n ; b++) {
					graph[a][b] = Math.min(graph[a][b], graph[a][c]+graph[c][b]);
				}
			}
		}
		int result = graph[1][k] + graph[k][x];
		if(result >= INF) System.out.println(-1);
		else System.out.println(result);
		sc.close();

	}

}
