package ICT.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//성적이 낮은 순으로 출력한다.
/* 
2
홍길동 95
이순신 77
*/
class Student implements Comparable<Student>{
	private String name;
	private int score;
	
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getScore() {
		return this.score;
	}
	
	@Override
	public int compareTo(Student o) {
		if(this.score < o.score) {
			return -1;
		}
		return 1;
	}
	
}


public class StudentSort {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> list = new ArrayList<Student>();
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			String name = sc.next();
			int score = sc.nextInt();
			list.add(new Student(name,score));
		}
		Collections.sort(list);
		
		for(int i=0; i<n; i++) {
			System.out.print(list.get(i).getName()+" ");
		}
		sc.close();
	}
}
