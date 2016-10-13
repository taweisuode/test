package Strategy;

public class Client {
	public static void main(String[] args) {
		EightPriceStrategy eightPriceStrategy = new EightPriceStrategy();
		double nowPrice = eightPriceStrategy.calePrice(300);
		System.out.println(nowPrice);
	}
}
