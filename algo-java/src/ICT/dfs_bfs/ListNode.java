package ICT.dfs_bfs;

import java.util.ArrayList;

class Node{
	private int index;
	private int distance;
	
	public Node(int index, int distance) {
		this.index = index;
		this.distance = distance;
	}
	public void show() {
		System.out.println("(" + this.index + "," + this.distance + ")");
	}
}

//인접 행렬 방식 : 모든 노드의 정보를 저장하므로 메모리 낭비, 검색이 빠르다.
//인접 리스트 방식: 필요한 노드만 저장하므로 메모리 효율적, 검색 시, 해당 노드의 연결된 데이터를 하나씩 확인해야 하므로 비효율적
public class ListNode {
	
	public static ArrayList<ArrayList<Node>> graph = new ArrayList<ArrayList<Node>>();
	
	public static void main(String[] args) {
		
		for(int i=0; i< 3; i++) {
			graph.add(new ArrayList<Node>());
		}
		
		graph.get(0).add(new Node(1, 7));
		graph.get(0).add(new Node(2, 5));
		
		graph.get(1).add(new Node(0, 7));
		
		graph.get(2).add(new Node(0, 5));
		
		for(int i=0; i< 3; i++) {
			for(int j=0; j< graph.get(i).size(); j++){
				  graph.get(i).get(j).show();
			}
			System.out.println();
		}
	}
}
