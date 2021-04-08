package ICT.implementation;

import java.util.Scanner;

public class Knight {

	//8*8 평면 위에 현재 위치한 나이트의 위치에서, 이동할 수 있는 경우의 수를 출력 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int area = 8;
		String location = sc.nextLine();
		sc.close();
		int x = location.charAt(0) - 'a' + 1;
		int result =0;
		int y = location.charAt(1) - '0';
		
		// 수평으로 2칸 이동후, 수직으로 1칸 이동
		// 수직으로 2칸 이동후, 수평으로 1칸 이동
		int dx[] = {-2, -1, 1, 2, 2, 1, -1, -2};
		int dy[] = { 1,  2, 2, -1, 1, -2, -2, -1 };
		
		for(int i = 0; i < area; i++) {
			   int nx = x + dx[i];
			   int ny = y + dy[i];
			   if(nx <= 0 || ny <= 0 || nx > area || ny > area) continue;
			   else result++;
		}
		System.out.println(result);

	}

}
