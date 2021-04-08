package ICT.shortestPath;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

class priorityNode implements Comparable<priorityNode>{
	private int index;
	private int distance;
	
	public int getIndex() {
		return this.index;
	}
	public int getDistance() {
		return this.distance;
	}
	
	public priorityNode(int index, int distance) {
		this.index = index;
		this.distance = distance;
	}
	
	@Override
	public int compareTo(priorityNode o) {
		if(this.distance < o.distance) return -1;
		return 1;
	}
	
	
	
	
}
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
public class DijkstraPriority {
	public static final int INF = (int)1e9;
	public static int n,m,start;
	public static int[]  d= new int[100001];
	public static ArrayList<ArrayList<priorityNode>> graph = new ArrayList<ArrayList<priorityNode>>();
	
	public static void dijkstra(int start) {
		 PriorityQueue<priorityNode> pq = new PriorityQueue<>();
		 pq.offer(new priorityNode(start,0));
		 d[start] = 0;
		 
		 while(!pq.isEmpty()) {
			 priorityNode node = pq.poll();
			 int now = node.getIndex();
			 int dist = node.getDistance();
			 if(d[now] < dist) continue;
			 
			 for(int j=0; j<graph.get(now).size(); j++) {
				 int cost = dist + graph.get(now).get(j).getDistance();
				 if(cost < d[graph.get(now).get(j).getIndex()]) {
					 d[graph.get(now).get(j).getIndex()] = cost;
					 pq.offer(new priorityNode(graph.get(now).get(j).getIndex(), cost));
				 }
			 }
		 }
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		start = sc.nextInt();
		for(int i=0; i<=n ; i++) {
			graph.add(new ArrayList<priorityNode>());
		}
		
		for(int i=0; i<m ; i++) {
			int source = sc.nextInt();
			int destination = sc.nextInt();
			int distance = sc.nextInt();
			graph.get(source).add(new priorityNode(destination,distance));
		}
		
		Arrays.fill(d, INF);
		dijkstra(start);
		for(int i=1; i<=n; i++) {
			if(d[i] == INF) {
				System.out.println("INFINITY");
			}else {
				System.out.println(d[i]);
			}
		}
	}
}
