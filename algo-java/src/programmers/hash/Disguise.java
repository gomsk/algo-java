package programmers.hash;

import java.util.HashMap;

public class Disguise {
	
	public static int solution(String[][] clothes) {
		HashMap<String,Integer> map = new HashMap<>();
		for(int i=0; i< clothes.length; i++) {
			if(map.get(clothes[i][1]) != null) {
				map.put(clothes[i][1], map.get(clothes[i][1]) +1);
			}
		}		
		return 0;
	}

	public static void main(String[] args) {
		

	}

}
