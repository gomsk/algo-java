package programmers.sort;

import java.util.ArrayList;
import java.util.Arrays;

public class Knum {
	/*
	   전달받은 배열을 명령어 기준에 따라 출력하시오.
	   명령어 ( 배열의 시작, 배열의 종료, k번째 수)
	   시작, 종료 인덱스 기준으로 배열을 slice한 뒤, 정렬하고 k번째 수를 출력
	 * */
	  public static int[] solution(int[] array, int[][] commands) {	    
		    ArrayList<Integer> list = new ArrayList<>();
	        for(int i=0; i<commands.length; i++){
	        		int start = commands[i][0];
	        		int end = commands[i][1];
	        		int k = commands[i][2];
	        		int arr[] = Arrays.copyOfRange(array, start-1, end);
	        		Arrays.sort(arr);
	        		list.add(arr[k-1]);
	        }
	        int answer[] = new int[list.size()];
	        for(int i=0; i<list.size(); i++) {
	        	answer[i] = list.get(i);
	        }
	        return answer;
	    }


	public static void main(String[] args) {
		int array[] = {1, 5, 2, 6, 3, 7, 4};	
		int commands[][] = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		int answer[] = solution(array,commands);		
		for(int i=0; i<answer.length; i++) {
			System.out.print(answer[i]+" ");
		}
	}
}
