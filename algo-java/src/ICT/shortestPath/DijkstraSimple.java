package ICT.shortestPath;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
/*
6 11
1
1 2 2
1 3 5
1 4 1
2 3 3
2 4 2
3 2 3
3 6 5
4 3 3
4 5 1
5 3 1
5 6 2
 * */
class dijkstraNode{
	private int index;
	private int cost;
	
	public int getIndex() {
		return this.index;
	}
	public int getDistance() {
		return this.cost;
	}
	
	public dijkstraNode(int index, int cost) {
		this.index = index;
		this.cost = cost;
	}
}

public class DijkstraSimple {
	public static int n,m;
	public static int distance[] = new int[0];
	public static boolean visited[] = new boolean[0];
	public static ArrayList<ArrayList<dijkstraNode>> graph = new ArrayList<ArrayList<dijkstraNode>>();
	
	public static int getSmallestNode() {
		int minValue = 99999;
		int now = 0;
		for(int i=1; i<=n; i++) {
			if(!visited[i] && distance[i] < minValue) {
				minValue = distance[i];
				now = i;
			}
		}
		return now;
	}
	
	public static void calPath(int start) {
		Arrays.fill(distance, 99999);
		distance[start] = 0;
		visited[start] = true;
		for(int i=0; i<graph.get(start).size(); i++) {
			dijkstraNode node = graph.get(start).get(i);
			int index = node.getIndex();
			int cost = node.getDistance();
			distance[index] = cost;
		}
		
		for(int i=0; i<n-1; i++) {
			int now = getSmallestNode();
			visited[now] = true;
			for(int j=0; j<graph.get(now).size(); j++) {
				dijkstraNode node = graph.get(now).get(j);
				int cost = distance[now] +node.getDistance();
				int index = node.getIndex();
				if(cost < distance[index]) {
					distance[index] = cost;					
				}
			}
		}
		
		
		
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		int start = sc.nextInt();
		distance = new int[n+1];
		visited = new boolean[n+1];
		 for(int i=0; i<=n; i++) {
			graph.add(new ArrayList<dijkstraNode>());
		 }
		
		for(int i=0; i<m; i++) {
			int source = sc.nextInt();
			int destination = sc.nextInt();
			int cost = sc.nextInt();
			dijkstraNode node = new dijkstraNode(destination, cost);
			graph.get(source).add(node);
		}
		
		calPath(start);
		sc.close();
		for(int i=1; i<=n; i++) {
			System.out.println(distance[i]);
		}

	}

}
