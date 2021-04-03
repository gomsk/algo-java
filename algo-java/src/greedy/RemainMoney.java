package greedy;

public class RemainMoney {

	public static void main(String[] args) {
		//코인을 가장 적게 받을수 있어야 한다.
		//돈은 항상 10의 배수
		int n = 1260;
		int count = 0;
		int coinType[] = {500, 100, 50, 10};
		
		for(int i=0 ; i < coinType.length; i++) {
			  int coin = coinType[i];
		      count += n / coin;
		      n %= coin;
		}
		System.out.println(count);
	}

}
