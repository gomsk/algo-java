package dfs_bfs;

import java.util.ArrayList;


//1. 스택에 노드 쌓고, 방문처리한다.
// 2. 스택의 최상단에 있는 노드와 가장 인접한 노드를 방문 처리하고 스택에 쌓는다. ( 주로 번호가 낮은 노드 우선 탐색)
// 3. 방문할 노드가 없는 경우, 스택을 날리고 2 반복.

public class dfs {
	public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
	public static boolean visited[] = new boolean[9];
	
	public static void dfsFunc(int x) {
		visited[x] = true;
		System.out.print(x +" ");
		
		for(int i=0; i< graph.get(x).size(); i++) {
			int y = graph.get(x).get(i);
			if(!visited[y]) {
				dfsFunc(y); 
			}
		}
	}
	
	public static void main(String[] args) {
			for(int i=0; i <9; i++) {
				graph.add(new ArrayList<Integer>());
			}
			// 노드 1에 연결된 노드 정보 저장 
	        graph.get(1).add(2);
	        graph.get(1).add(3);
	        graph.get(1).add(8);
	        
	        // 노드 2에 연결된 노드 정보 저장 
	        graph.get(2).add(1);
	        graph.get(2).add(7);
	        
	        // 노드 3에 연결된 노드 정보 저장 
	        graph.get(3).add(1);
	        graph.get(3).add(4);
	        graph.get(3).add(5);
	        
	        // 노드 4에 연결된 노드 정보 저장 
	        graph.get(4).add(3);
	        graph.get(4).add(5);
	        
	        // 노드 5에 연결된 노드 정보 저장 
	        graph.get(5).add(3);
	        graph.get(5).add(4);
	        
	        // 노드 6에 연결된 노드 정보 저장 
	        graph.get(6).add(7);
	        
	        // 노드 7에 연결된 노드 정보 저장 
	        graph.get(7).add(2);
	        graph.get(7).add(6);
	        graph.get(7).add(8);
	        
	        // 노드 8에 연결된 노드 정보 저장 
	        graph.get(8).add(1);
	        graph.get(8).add(7);
	        
	        dfsFunc(1);
	}
}
