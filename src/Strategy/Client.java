package Strategy;

public class Client {
	public static void main(String[] args) {
		Container container = new Container(new EightPriceStrategy());
		double nowPrice = container.getCountPrice(300);
		//EightPriceStrategy eightPriceStrategy = new EightPriceStrategy();
		//double nowPrice = eightPriceStrategy.calePrice(300);
		System.out.println(nowPrice);
	}
}
