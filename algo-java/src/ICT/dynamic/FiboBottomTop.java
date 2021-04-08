package ICT.dynamic;

public class FiboBottomTop {
	
	public static long[] d = new long[100];
	
	public static long fibo(int x) {
		d[1] = 1;
		d[2] = 1;
		for(int i=3; i<=x; i++) {
			d[i] = d[i-1] + d[i-2] ;
		}
		return d[x];
	}

	public static void main(String[] args) {
		System.out.println(fibo(50));
	}
}
