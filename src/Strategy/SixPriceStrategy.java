package Strategy;

public class SixPriceStrategy extends CalePriceStrategy{
	public double calePrice(double price) {
		System.out.println("6折商品折扣");
		return price * 0.6;
	}
}
