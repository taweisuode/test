package Strategy;

public class EightPriceStrategy extends CalePriceStrategy {

	@Override
	public double calePrice(double price) {
		System.out.println("8折商品折扣");
		return price * 0.8;
	}
	
}
