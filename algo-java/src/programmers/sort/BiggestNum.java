package programmers.sort;

import java.util.Arrays;
import java.util.Comparator;

public class BiggestNum {
	/*
	  전달받은 배열의 숫자를 이어 붙여 가장 큰 수를 만드시오.
	  */
	public static String solution(int numbers[]) {
		
		String arr[] = new String[numbers.length];
		for(int i=0; i<arr.length; i++) {
			arr[i] = String.valueOf(numbers[i]);
		}
		
		Arrays.sort(arr, new Comparator<String>() {
		@Override
		public int compare(String o1, String o2) {
			return (o2+o1).compareTo(o1+o2);
			}
		});
		
		if(arr[0] == "0") return "0";
		String result = "";
		for(int i=0; i<arr.length; i++) {
			result += arr[i];
		}
		
		return result;
	}

	public static void main(String[] args) {
		int numbers1[] = {6, 10, 2};
		System.out.println(solution(numbers1));
		
		int numbers2[] = {3, 30, 34, 5, 9};
		System.out.println(solution(numbers2));

	}

}
